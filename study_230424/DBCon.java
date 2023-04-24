package study_230424;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
	public static Connection getConnection() throws Exception {

		final String url = "jdbc:mariadb://localhost:3306/sql5_test";
		final String uid = "root";
		final String upw = "1234";
		final String driverName = "org.mariadb.jdbc.Driver";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url, uid, upw);

		return con;
	}
}
