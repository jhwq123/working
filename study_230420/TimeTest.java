package study_230420;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import _DBPKG.DBcon;

public class TimeTest {
	public static void main(String[] args) throws Exception {
		Connection conn = DBcon.getConnection();

//		String sql = "INSERT INTO temp2 (c1, c2) VALUES(3, 'ccc')";
		String sql = "SELECT * FROM temp2";
		PreparedStatement stmt = conn.prepareStatement(sql);
//		int result = stmt.executeUpdate();

		ResultSet rs = stmt.executeQuery();
		ArrayList<Temp> list = new ArrayList<>();

		while (rs.next()) {
			int c1 = rs.getInt("c1");
			String c2 = rs.getString("c2");
			Timestamp c3 = rs.getTimestamp("c3");
			Timestamp c4 = rs.getTimestamp("c4");
			Temp temp = new Temp(c1, c2, c3, c4);
			list.add(temp);
		}
		for (Temp t : list) {
			System.out.println(t);
		}

	}
}
