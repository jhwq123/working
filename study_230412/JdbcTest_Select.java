package study_230412;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcTest_Select {
	public static void main(String[] args) throws Exception {

		ArrayList<Member> mlist = new ArrayList<>();
		final String driverName = "org.mariadb.jdbc.Driver";
		final String url = "jdbc:mariadb://localhost:3306/green01";
		final String uid = "root";
		final String upw = "1234";

		Class.forName(driverName);

		// 1. 접속 객체 생성 : db 주소, db 접속 id, db 접속 pw
		Connection conn = null;
		conn = DriverManager.getConnection(url, uid, upw);

		// 2. 쿼리(질문)를 날린다.
		// 2-1. 쿼리를 실행할 준비를 한다.
		// 쿼리 실행 객체를 준비한다.
		Statement stmt = null;
		stmt = conn.createStatement();
		String query = "SELECT * FROM member";
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			Member member = new Member();
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			member.setMno(mno);
			member.setName(name);
			member.setPhone(phone);
			member.setId(id);
			member.setPw(pw);
			// System.out.println(member);
			mlist.add(member);
		}

		System.out.println("리스트에 저장된 Member객체 수 : " + mlist.size());
		for (Member m : mlist) {
			System.out.println(m);
		}
	}
}
