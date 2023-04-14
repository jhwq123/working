package _DBPKG;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {
	public static Connection getConnection() throws Exception {
		// DB에 담는 기능을 함

		final String url = "jdbc:mariadb://localhost:3306/green01";
		final String uid = "root";
		final String upw = "1234";
		final String driverName = "org.mariadb.jdbc.Driver";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url, uid, upw);

		return con;
	}
}
