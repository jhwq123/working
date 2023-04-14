package study_230413;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JdbcTest_total {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// 1. 접속 객체 생성 : db 주소, db 접속 id, db 접속 pw

		String url = "jdbc:mariadb://localhost:3306/green01";
		String uid = "root";
		String upw = "1234";
		String driverName = "org.mariadb.jdbc.Driver";
		Class.forName(driverName);

		String table = "member";

		// 접속 객체 생성 (Connection)
		Connection conn = DriverManager.getConnection(url, uid, upw);

		// 쿼리 실행 객체 생성(Statement)
		System.out.println("1.SELECT / 2.INSERT / 3.UPDATE / 4.DELETE");
		System.out.print("실행할 명령을 입력하세요>>");
		int sel = sc.nextInt();
		String query = "";

		switch (sel) {
		case 1:
			query = selectQuery(table);
			break;
		case 2:
			query = insertQuery(table);
			break;
		case 3:
			query = updateQuery(table);
			break;
		case 4:
			query = deleteQuery(table);
			break;
		}

		// 객체 생성 전에 query를 미리 받고 시작함.
		PreparedStatement stmt = conn.prepareStatement(query);

		switch (sel) {
		case 1:
			System.out.println("\n선택을 실행합니다.");
			stmt = selectSet(stmt);
			// 쿼리 실행(executeUpdate())
			ResultSet rs = stmt.executeQuery();
			System.out.println("mno | " + "name | " + "phone | " + "id | " + "pw | ");
			while (rs.next()) {
				int mno = rs.getInt("mno");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				System.out.println(mno + " | " + name + " | " + phone + " | " + id + " | " + pw + " | ");
			}
			break;
		case 2:
			System.out.println("\n추가를 실행합니다.");
			stmt = insertSet(stmt);
			stmt.executeUpdate();
			System.out.println("\n추가가 완료되었습니다.");
			break;
		case 3:
			System.out.println("\n수정을 실행합니다.");
			stmt = updateSet(stmt);
			stmt.executeUpdate();
			System.out.println("\n수정이 완료되었습니다.");
			break;
		case 4:
			System.out.println("\n삭제를 실행합니다.");
			stmt = deleteSet(stmt);
			stmt.executeUpdate();
			System.out.println("\n삭제가 완료되었습니다.");
			break;
		}

	}

	static String selectQuery(String table) {
		System.out.println("member[sno, name, phone, id, pw]");
		System.out.print("선택조건1의 index를 선택하세요>>");
		String target1 = sc.nextLine();
		target1 = sc.nextLine();
		System.out.print("선택조건2의 index를 선언하세요>>");
		String target2 = sc.nextLine();
		String query = "SELECT * FROM " + table + " WHERE " + target1 + " LIKE ? AND " + target2 + " LIKE ?";

		return query;
	}

	static PreparedStatement selectSet(PreparedStatement stmt) throws Exception {
		System.out.print("선택조건1 값을 입력하세요>>");
		String keyword1 = sc.nextLine();
		System.out.print("선택조건2 값을 입력하세요>>");
		String keyword2 = sc.nextLine();
		stmt.setString(1, keyword1);
		stmt.setString(2, keyword2);

		return stmt;
	}

	static String insertQuery(String table) {
		String query = "INSERT INTO " + table + " (mno, name, phone, id, pw) VALUES (?, ?, ?, ?, ?)";

		return query;
	}

	static PreparedStatement insertSet(PreparedStatement stmt) throws Exception {
		System.out.print("번호 입력>> ");
		int mno = sc.nextInt();
		String mnoS = mno + "";
		System.out.print("이름 입력>> ");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("폰번호 입력>> ");
		String phone = sc.nextLine();
		System.out.print("아이디 입력>> ");
		String id = sc.nextLine();
		System.out.print("패스워드 입력>> ");
		String pw = sc.nextLine();
		stmt.setString(1, mnoS);
		stmt.setString(2, name);
		stmt.setString(3, phone);
		stmt.setString(4, id);
		stmt.setString(5, pw);

		return stmt;
	}

	static String updateQuery(String table) {
		System.out.print("수정을 원하는 index를 선택하세요>>");
		String target = sc.nextLine();
		target = sc.nextLine();
		System.out.print("조건 index를 선언하세요>>");
		String cdtion = sc.nextLine();
		String query = "UPDATE " + table + " SET " + target + " = ? WHERE " + cdtion + " LIKE ?";

		return query;
	}

	static PreparedStatement updateSet(PreparedStatement stmt) throws Exception {

		System.out.print("원하는 값을 선언하세요>>");
		String value = sc.nextLine();
		System.out.print("원하는 조건값을 선언하세요>>");
		String set = sc.nextLine();
		stmt.setString(1, value);
		stmt.setString(2, set);

		return stmt;
	}

	static String deleteQuery(String table) {
		System.out.println("member[sno, name, phone, id, pw]");
		System.out.print("원하는 index를 선택하세요>>");
		String keyword1 = sc.nextLine();
		String query = "DELETE FROM " + table + " WHERE " + keyword1 + " = ?";

		return query;
	}

	static PreparedStatement deleteSet(PreparedStatement stmt) throws Exception {

		System.out.print("조건 값을 선언하세요>>");
		String keyword2 = sc.nextLine();
		stmt.setString(1, keyword2);

		return stmt;
	}
}
