package study_230412;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest_Insert {
	public static void main(String[] args) throws Exception {

		// driver명, db주소, id, pw 준비
		Scanner sc = new Scanner(System.in);
		final String driverName = "org.mariadb.jdbc.Driver";
		final String url = "jdbc:mariadb://localhost:3306/green01";
		final String uid = "root";
		final String upw = "1234";
		Class.forName(driverName);

		// 접속 객체 생성 (Connection)
		Connection conn = null;
		conn = DriverManager.getConnection(url, uid, upw);

		// 쿼리 실행 객체 생성(Statement)
		Statement stmt = null;
		stmt = conn.createStatement();

		System.out.print("번호를 입력하세요>>");
		int mno = sc.nextInt();
		System.out.print("이름을 입력하세요>>");
		String name = sc.next();
		System.out.print("휴대폰 번호를 입력하세요>>");
		String phone = sc.next();
		System.out.print("id를 입력하세요>>");
		String id = sc.next();
		System.out.print("pw를 입력하세요>>");
		String pw = sc.next();

		String query = "INSERT INTO member (mno, name, phone, id, pw) VALUES (" + mno + ", '" + name + "', '" + phone
				+ "', '" + id + "', '" + pw + "')";

		// 쿼리 실행(executeUpdate())
		stmt.executeUpdate(query);

		sc.close();
	}
}
