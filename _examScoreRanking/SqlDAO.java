package _examScoreRanking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

// 어떤 데이터라도 받아서 자동으로 생성가능하게 DB를 짜보자
public class SqlDAO {

	SqlUI ui = new SqlUI();
	private String url = "jdbc:mariadb://localhost:3306/";
	private final String uid = "root";
	private final String upw = "1234";
	private final String driverName = "org.mariadb.jdbc.Driver";
	private Connection con;
	private int dataCnt;

	SqlDAO(String db) throws Exception {
		url = url + db;
		Class.forName(driverName);
		con = DriverManager.getConnection(url, uid, upw);
	}

	void create(String table, Object obj) throws Exception {

		String[] data = conElements(obj);

		String queryI = "INSERT INTO " + table + " VALUES (";
		for (int i = 1; i <= dataCnt; i++) {
			queryI += "?";
			if (i != dataCnt) {
				queryI += ", ";
			}
		}
		queryI += ")";

		PreparedStatement stmt = con.prepareStatement(queryI);
		for (int i = 0; i < data.length; i++) {
			stmt.setString(i + 1, data[i]);
		}

		try {
			stmt.executeUpdate();
			System.out.println("학생 정보가 석차에 등록되었습니다.");
		} catch (Exception e) {
			System.out.println("올바르지않은 접근입니다.");
			System.out.println("서버create에 실패했습니다.");
		}

	}

	// SELECT * FROM *table*
	void read(String table, Object obj) throws Exception {
		String[] data = conKeys(obj);
		String queryVerif = "SELECT COUNT(*) AS cnt FROM " + table;
		String queryS = "SELECT * FROM " + table;
		Statement stmt = con.createStatement();
		ResultSet rsVer = stmt.executeQuery(queryVerif);
		rsVer.next();
		if (rsVer.getInt("cnt") == 0) {
			System.out.println("Table Is Empty.");
		} else {
			ResultSet rs = stmt.executeQuery(queryS);

			ui.topGrid(dataCnt);
			ui.titleGrid(data);
			ui.betweenGrid(dataCnt);
			while (rs.next()) {
				for (int i = 0; i < data.length; i++) {
					System.out.print("│" + rs.getString(data[i]) + "\t");
				}
				System.out.println("│");
			}
			ui.bottomGrid(dataCnt);
		}
	}

	// SELECT * FROM *table*
	// 안에 테이블에 값을 검증 후 if / else 분기 반환
	int readRank(String table, Object obj) throws Exception {
		String[] data = conKeys(obj);
		String queryVerif = "SELECT COUNT(pass) AS cnt FROM " + table;
		Statement stmt = con.createStatement();
		ResultSet rsVer = stmt.executeQuery(queryVerif);
		rsVer.next();
		if (rsVer.getInt("cnt") < 5) {
			// 미응시자와 응시자 조회가 되도록 한다.
			System.out.println("아직 응시하지 않은 학생이 있는 것 같습니다.\n");
			String query = "SELECT * FROM " + table;

			System.out.println("<응시자>");
			String queryOK = query + " WHERE score != -1";
			ResultSet rs = stmt.executeQuery(queryOK);

			ui.topGrid(dataCnt);
			ui.titleGrid(data);
			ui.betweenGrid(dataCnt);
			while (rs.next()) {
				for (int i = 0; i < data.length; i++) {
					System.out.print("│" + rs.getString(data[i]) + "\t");
				}
				System.out.println("│");
			}
			ui.bottomGrid(dataCnt);

			System.out.println("\n<미응시자>");
			String queryNO = query + " WHERE score = -1";
			rs = stmt.executeQuery(queryNO);

			ui.topGrid(dataCnt);
			ui.titleGrid(data);
			ui.betweenGrid(dataCnt);
			while (rs.next()) {
				for (int i = 0; i < data.length; i++) {
					System.out.print("│" + rs.getString(data[i]) + "\t");
				}
				System.out.println("│");
			}
			ui.bottomGrid(dataCnt);
			return 0;

		} else {
			// 테이블을 보여준다.
			System.out.println("모든 학생들이 응시에 완료했습니다.");
			System.out.println("<응시 학생 정보>");
			String queryS = "SELECT * FROM " + table;
			queryS += " ORDER BY score DESC";
			ResultSet rs = stmt.executeQuery(queryS);
			ui.topGrid(dataCnt);
			ui.titleGrid(data);
			ui.betweenGrid(dataCnt);
			int cnt = 1;
			while (rs.next()) {
				for (int i = 0; i < data.length; i++) {
					if (i == 0) {
						System.out.print("│" + cnt + "\t");
						cnt++;
					} else {
						System.out.print("│" + rs.getString(data[i]) + "\t");
					}
				}
				System.out.println("│");
			}
			ui.bottomGrid(dataCnt);
			return 1;
		}
	}

	// SELECT * FROM *table* WHERE id = ?
	public TeacherVO readTeacher(String table, Object obj, String key, String value) throws Exception {
		String[] data = conKeys(obj);
		String query = "SELECT * FROM " + table + " WHERE " + key + " = '" + value + "'";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		rs.next();
		TeacherVO t = (TeacherVO) obj;
		t.setTno(rs.getInt(data[0]));
		t.setTname(rs.getString(data[1]));
		t.setId(rs.getString(data[2]));
		t.setPw(rs.getString(data[3]));
		return t;
	}

	public StudentVO readStudent(String table, Object obj, String key, String value) throws Exception {
		String[] data = conKeys(obj);
		String query = "SELECT * FROM " + table + " WHERE " + key + " = '" + value + "'";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		rs.next();
		StudentVO s = (StudentVO) obj;
		s.setSno(rs.getInt(data[0]));
		s.setSname(rs.getString(data[1]));
		s.setId(rs.getString(data[2]));
		s.setPw(rs.getString(data[3]));
		s.setScore(rs.getInt(data[4]));
		s.setComent(rs.getString(data[5]));
		return s;
	}

	// id, pw가 있는 table에 대해 해당 메소드를 사용해 검증할 수 있습니다!
	int login(String table, Object obj, String id, String pw) throws Exception {
		String queryLogin = "SELECT COUNT(*) AS flag FROM " + table;
		queryLogin += " WHERE id = '" + id + "' ";
		queryLogin += "AND pw = '" + pw + "'";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(queryLogin);
		rs.next();
		int flag = rs.getInt("flag");
		return flag;
	}

	// UPDATE *table* SET pno = 3 WHERE pname = "홍길동"
	void update(String table, Object obj) throws Exception {
		read(table, obj);

		String selKey = ui.userInput("선택할 요소");
		String temp1 = selKey + "의 선택할 ";
		String selValue = ui.userInputS(temp1);
		String chgKey = ui.userInput("바꿀 요소");
		String temp2 = chgKey + "의 바꿀 ";
		String chgValue = ui.userInputS(temp2);

		String queryU = "UPDATE " + table + "";
		queryU += "SET " + chgKey + " = '" + chgValue + "' ";
		queryU += "WHERE " + selKey + " = '" + selValue + "'";

		Statement stmt = con.createStatement();

		try {
			stmt.executeUpdate(queryU);
			System.out.println("Update Is Completed.");
		} catch (Exception e) {
			System.out.println("This is an incorrect attempt.");
			System.out.println("Updete Is Fail.");
		}

	}

	void updateScore(String table, Object obj, int sno, int score) throws Exception {

		String queryU = "UPDATE " + table;
		queryU += " SET score = " + score;
		queryU += " WHERE sno = " + sno;

		Statement stmt = con.createStatement();

		try {
			stmt.executeUpdate(queryU);
			System.out.println("학생 성적이 " + table + "서버에 등록되었습니다.");
		} catch (Exception e) {
			System.out.println("올바르지않은 접근입니다.");
			System.out.println("서버update에 실패했습니다.");
		}

	}

	void updatePass(String table, Object obj, int sno, String pass) throws Exception {

		String queryU = "UPDATE " + table;
		queryU += " SET pass = '" + pass + "'";
		queryU += " WHERE sno = " + sno;

		Statement stmt = con.createStatement();

		try {
			stmt.executeUpdate(queryU);
		} catch (Exception e) {
			System.out.println("올바르지않은 접근입니다.");
			System.out.println("서버updatePass에 실패했습니다.");
		}

	}

	void updateComent(String table, Object obj, int sno, String coment) throws Exception {

		String queryU = "UPDATE " + table;
		queryU += " SET coment = '" + coment + "'";
		queryU += " WHERE sno = " + sno;

		Statement stmt = con.createStatement();

		try {
			stmt.executeUpdate(queryU);
		} catch (Exception e) {
			System.out.println("올바르지않은 접근입니다.");
			System.out.println("서버updateComent에 실패했습니다.");
		}

	}

	// DELETE FROM *table* WHERE pno = 3;
	void delete(String table, Object obj) throws Exception {
		read(table, obj);

		String selKey = ui.userInput("삭제할 요소");
		String temp = selKey + "의 삭제할";
		String selValue = ui.userInputS(temp);

		String queryD = "DELETE FROM " + table + "";
		queryD += "WHERE " + selKey + " = '" + selValue + "'";

		Statement stmt = con.createStatement();

		try {
			stmt.executeUpdate(queryD);
			System.out.println("Delete Is Completed.");
		} catch (Exception e) {
			System.out.println("This is an incorrect attempt.");
			System.out.println("Delete Is Fail.");
		}
	}

	int numElements(Object o) {
		int cnt = 0;
		for (int i = 0; i < o.toString().length(); i++) {
			if (o.toString().charAt(i) == ',') {
				cnt++;
			}
		}
		cnt++;
		return cnt;
	}

	String[] conKeys(Object o) {
		dataCnt = numElements(o);
		String detail = o.toString();
		String[] ka = new String[dataCnt];
		int length = detail.length();
		boolean keyFlag = false;
		String temp = "";

		for (int i = 0, j = 0; i < length; i++) {
			if (detail.charAt(i) == '=') {
				keyFlag = false;
				ka[j] = temp;
				j++;
				temp = "";
			}
			if (keyFlag) {
				temp += detail.charAt(i) + "";
			}
			if (detail.charAt(i) == ' ' || detail.charAt(i) == '(') {
				keyFlag = true;
			}
		}
		return ka;
	}

	String[] conElements(Object o) {
		dataCnt = numElements(o);
		String detail = o.toString();
		String[] va = new String[dataCnt];
		int length = detail.length();
		boolean valFlag = false;
		String temp = "";

		for (int i = 0, j = 0; i < length; i++) {
			if (detail.charAt(i) == ',' || detail.charAt(i) == ')') {
				valFlag = false;
				va[j] = temp;
				j++;
				temp = "";
			}

			if (valFlag) {
				temp += detail.charAt(i) + "";
			}

			if (detail.charAt(i) == '=') {
				valFlag = true;
			}
		}
		return va;
	}
}
