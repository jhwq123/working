package study_230424;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ContentService {

	ArrayList<ContentVO> cList = new ArrayList<>();

	void select() throws Exception {

		String query = "SELECT * FROM conTbl";
		Statement stmt = DBCon.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			int cno = rs.getInt("cno");
			String name = rs.getString("cname");
			String writer = rs.getString("writer");
			ContentVO c = new ContentVO(cno, name, writer);
			String detail = rs.getString("detail");
			c.setDetail(detail);
			String isDate = rs.getString("isDate");
			c.setIsDate(isDate);
			String moDate = rs.getString("moDate");
			c.setMoDate(moDate);
			cList.add(c);
		}
		for (ContentVO c : cList) {
			System.out.println(c);
		}

	}

	void update() throws Exception {

		String newWriter = "깜찍이";

		String query1 = "INSERT INTO conTblUpdate VALUES (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt1 = DBCon.getConnection().prepareStatement(query1);

		ContentVO c = cList.get(2);
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		String formatedNow = formatter.format(now);

		stmt1.setInt(1, c.getCno());
		stmt1.setString(2, c.getName());
		stmt1.setString(3, c.getDetail());
		stmt1.setString(4, c.getWriter());
		stmt1.setString(5, c.getIsDate());
		stmt1.setString(6, formatedNow);
		stmt1.setString(7, newWriter);

		stmt1.executeUpdate();

		String query2 = "UPDATE conTbl SET writer = '" + newWriter + "' WHERE cno = 3";
		Statement stmt2 = DBCon.getConnection().createStatement();
		stmt2.executeUpdate(query2);
	};

	void delete() throws Exception {

		String query1 = "INSERT INTO conTblDelete VALUES (?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt1 = DBCon.getConnection().prepareStatement(query1);

		ContentVO c = cList.get(3);
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		String formatedNow = formatter.format(now);

		stmt1.setInt(1, c.getCno());
		stmt1.setString(2, c.getName());
		stmt1.setString(3, c.getDetail());
		stmt1.setString(4, c.getWriter());
		stmt1.setString(5, c.getIsDate());
		stmt1.setString(6, formatedNow);

		stmt1.executeUpdate();

		String query2 = "DELETE FROM conTbl WHERE cname = '작성물4'";
		Statement stmt2 = DBCon.getConnection().createStatement();
		stmt2.executeUpdate(query2);
	};
}
