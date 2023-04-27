package _sqlPkg;

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

	// 테이블 생성 코드 + 예외처리 이용한 테이블 자동생성 가능해 보임
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
			System.out.println("Create Is Completed.");
		} catch (Exception e) {
			System.out.println("This is an incorrect attempt.");
			System.out.println("Create Is Fail.");
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

	// id, pw가 있는 table에 대해 해당 메소드를 사용해 검증할 수 있습니다!
	int login(String table, Object obj, String id, String pw) throws Exception {
		String queryLogin = "SELECT COUNT(*) AS flag FROM " + table;
		queryLogin += "WHERE id = '" + id + "' ";
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

		String queryU = "UPDATE " + table + " ";
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

	// DELETE FROM *table* WHERE pno = 3;
	void delete(String table, Object obj) throws Exception {
		read(table, obj);

		String selKey = ui.userInput("삭제할 요소");
		String temp = selKey + "의 삭제할";
		String selValue = ui.userInputS(temp);

		String queryD = "DELETE FROM " + table + " ";
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
