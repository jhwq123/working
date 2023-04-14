package study_230412;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcTest_Delete {
	public static void main(String[] args) throws Exception {

		// driver명, db주소, id, pw 준비
		Scanner sc = new Scanner(System.in);
		final String driverName = "org.mariadb.jdbc.Driver";
		final String url = "jdbc:mariadb://localhost:3306/green01";
		final String uid = "root";
		final String upw = "1234";

		Class.forName(driverName);

		String target = "";
		String value = "";

		// 접속 객체 생성 (Connection)
		Connection conn = null;
		conn = DriverManager.getConnection(url, uid, upw);

		// 쿼리 실행 객체 생성(Statement)
		Statement stmt = null;
		stmt = conn.createStatement();

		System.out.println("삭제를 진행합니다");
		System.out.println("member[sno, name, phone, id, pw]");
		System.out.println("원하는 index를 선택하세요");
		target = sc.next();
		System.out.println("조건 값을 선언하세요");
		value = sc.next();

		String query = "DELETE FROM member WHERE " + target + " = '" + value + "'";

		// 쿼리 실행(executeUpdate())
		stmt.executeUpdate(query);

		sc.close();
	}

}
