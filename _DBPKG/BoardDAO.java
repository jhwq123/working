package _DBPKG;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoardDAO {

	Scanner sc = new Scanner(System.in);
	String table = "notice";
	String query = "";
	int pageIdx = 0;
	int pageCnt = 1;
	int pageTotal = 0;
	ArrayList<BoardVO> blist = new ArrayList<>();

	// CRUD

	void mainDB() throws Exception {
		System.out.println("\n1.게시글쓰기 / 2.게시글보기 / 3.게시글수정 / 4.게시글지우기 / 8.다음페이지 / 9. 이전페이지");
		System.out.print("실행할 명령을 입력하세요>>");
		int sel = sc.nextInt();
		switch (sel) {
		case 1:
			insert();
			break;
		case 2:
			System.out.print("몇번 게시글을 볼까요?>>");
			int bno = sc.nextInt();
			selectInfo(bno);
			break;
		case 3:
			System.out.print("몇번 게시글을 수정할까요?>>");
			bno = sc.nextInt();
			update(bno);
			break;
		case 4:
			delete();
			break;
		case 8:
			if (pageCnt < pageTotal) {
				pageIdx += 10;
				pageCnt++;
			} else {
				System.out.println("마지막 페이지입니다.");
			}
			break;
		case 9:
			if (pageCnt > 1) {
				pageIdx -= 10;
				pageCnt--;
			} else {
				System.out.println("첫 페이지입니다.");
			}
			break;
		}
	}

	void insert() throws Exception {
		System.out.println("\n게시글을 추가합니다.");
		String query = "INSERT INTO " + table + " (title, content, writer, regDate) VALUES (?, ?, ?, ?)";
		PreparedStatement stmt = DBcon.getConnection().prepareStatement(query);

		System.out.print("제목 입력>> ");
		String title = sc.nextLine();
		title = sc.nextLine();

		System.out.print("내용 입력>> ");
		String content = sc.nextLine();

		System.out.print("작성자 입력>> ");
		String writer = sc.nextLine();

		// Date 클래스를 활용해 현재 시간값을 받아보자
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String regDate = format.format(today);

		stmt.setString(1, title);
		stmt.setString(2, content);
		stmt.setString(3, writer);
		stmt.setString(4, regDate);

		stmt.executeUpdate();

		System.out.println("추가가 완료되었습니다.");
	}

	void select() throws Exception {

		String autoQuery1 = "ALTER TABLE notice AUTO_INCREMENT = 1";
		String autoQuery2 = "SET @COUNT = 0";
		String autoQuery3 = "UPDATE notice SET bno = @COUNT:=@COUNT+1;";
		Statement autoStmt = DBcon.getConnection().createStatement();
		autoStmt.executeUpdate(autoQuery1);
		autoStmt.executeUpdate(autoQuery2);
		autoStmt.executeUpdate(autoQuery3);

		String query1 = "SELECT COUNT (bno) AS CntBno FROM " + table;
		PreparedStatement stmt1 = DBcon.getConnection().prepareStatement(query1);
		ResultSet rs1 = stmt1.executeQuery();
		rs1.next();
		int temp = rs1.getInt(1);
		if (temp % 10 == 0 && temp != 0) {
			pageTotal = (rs1.getInt(1) / 10);
		} else {
			pageTotal = (rs1.getInt(1) / 10) + 1;
		}

		String query2 = "SELECT bno, title, writer, regDate FROM " + table + " LIMIT " + pageIdx + ", 10";
		PreparedStatement stmt = DBcon.getConnection().prepareStatement(query2);
		ResultSet rs = stmt.executeQuery();

		System.out.println("\n\n\n\n\n");
		System.out.println("bno | " + "title | " + "writer | " + "regDate | ");
		System.out.println("=================================");
		while (rs.next()) {
			int bno = rs.getInt("bno");
			String title = rs.getString("title");
			BoardVO b = new BoardVO(bno, title);
			String writer = rs.getString("writer");
			b.setWriter(writer);
			String regDate = rs.getString("regDate");
			b.setRegDate(regDate);
			blist.add(b);

			System.out.println(bno + " | " + title + " | " + writer + " | " + regDate + " | ");
		}
		System.out.println("=============== " + pageCnt + "/" + pageTotal + "pages ==================");
	}

	void selectInfo(int bno) throws Exception {

		String query = "SELECT * FROM " + table + " WHERE bno = ?";
		PreparedStatement stmt = DBcon.getConnection().prepareStatement(query);
		stmt.setInt(1, bno);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int bnoN = rs.getInt("bno");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs.getString("writer");
			String regDate = rs.getString("regDate");
			String modifyDate = rs.getString("modifyDate");

			System.out.println("\n-----------------------");
			System.out.println("no." + bnoN);
			System.out.println("제목 : " + title);
			System.out.println("\n" + content);
			System.out.println("\n작성자 : " + writer);
			System.out.println("작성일자 : " + regDate);
			System.out.println("수정일자 : " + modifyDate);
			System.out.println("-----------------------");
		}

	}

	void update(int bno) throws Exception {
		System.out.println("\n게시글의 내용을 수정합니다.");
		String query = "UPDATE " + table + " SET content = ? WHERE bno = " + bno;
		PreparedStatement stmt = DBcon.getConnection().prepareStatement(query);

		System.out.print("수정내용을 입력해주세요>> ");
		String content = sc.nextLine();
		content = sc.nextLine();

		stmt.setString(1, content);

		stmt.executeUpdate();

		Date today2 = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String regDate2 = format.format(today2);
		String query2 = "UPDATE " + table + " SET modifyDate = '" + regDate2 + "' WHERE bno = " + bno;
		Statement stmt2 = DBcon.getConnection().createStatement();
		stmt2.executeUpdate(query2);

		System.out.println("수정이 완료되었습니다.");
	}

	void delete() throws Exception {
		System.out.println("\n게시글을 삭제합니다.");
		String query = "DELETE FROM " + table + " WHERE bno = ?";
		PreparedStatement stmt = DBcon.getConnection().prepareStatement(query);

		System.out.print("수정할 게시글의 번호를 입력해주세요>> ");
		String value = sc.nextLine();
		value = sc.nextLine();

		stmt.setString(1, value);

		stmt.executeUpdate();

		System.out.println("삭제가 완료되었습니다.");
	}
}
