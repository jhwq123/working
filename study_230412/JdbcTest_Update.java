package study_230412;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class JdbcTest_Update {
	public static void main(String[] args) throws Exception {

		// driver명, db주소, id, pw 준비
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> mlist = new ArrayList<>();
		final String driverName = "org.mariadb.jdbc.Driver";
		final String url = "jdbc:mariadb://localhost:3306/green01";
		final String uid = "root";
		final String upw = "1234";
		Class.forName(driverName);
		String target = "";
		String value = "";
		String cdtion = "";
		String set = "";

		// 접속 객체 생성 (Connection)
		Connection conn = null;
		conn = DriverManager.getConnection(url, uid, upw);

		// 쿼리 실행 객체 생성(Statement)
		Statement stmt = null;
		stmt = conn.createStatement();

		System.out.println("sno, name, phone, id, pw");
		System.out.println("수정을 원하는 index를 선택하세요");
		target = sc.next();
		System.out.println("원하는 값을 선언하세요");
		value = sc.next();

		String query = "UPDATE member SET " + target + " = " + value + " WHERE " + cdtion + " = " + set;

		// 쿼리 실행(executeUpdate())
		stmt.executeUpdate(query);

	}
}
