package _rpgGame;

import java.sql.Connection;
import java.sql.DriverManager;

public class RpgServer {

	public static Connection getConnection() throws Exception {

		// 1. 접속 객체 생성 : db주소, db접속id, db접속pw

		final String url = "jdbc:mariadb://localhost:3306/green01";
		final String uid = "root";
		final String upw = "1234";
		final String driverName = "org.mariadb.jdbc.Driver";
		Class.forName(driverName);

		// 2. 접속 객체 생성 (Connection)
		Connection con = DriverManager.getConnection(url, uid, upw);
		return con;

	}
}
