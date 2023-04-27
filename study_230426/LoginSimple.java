package study_230426;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 	회원 테이블에서 아이디, 로그인을 추출해서 map으로 만들어서
 *	넣은다음 로그인할때, map 자료구조 써서 로그인 하는거 만들어보기.
 */
public class LoginSimple {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		Map<String, String> loginMap = new HashMap<>();

		String query = "SELECT * FROM loginInfo";
		Statement stmt = DBcon.getConnection().createStatement();
		ResultSet rs1 = stmt.executeQuery(query);
		while (rs1.next()) {
			String id = rs1.getString("id");
			String pw = rs1.getString("pw");
			loginMap.put(id, pw);
		}
		// test
		System.out.println(loginMap);

		System.out.println("로그인 시도 중...");
		System.out.print("ID >>");
		String uid = sc.nextLine();
		System.out.print("PW >>");
		String upw = sc.nextLine();

		String loginQuery = "SELECT COUNT(*) AS flag FROM loginInfo WHERE id = ? && pw = ?";
		PreparedStatement pstmt = DBcon.getConnection().prepareStatement(loginQuery);
		pstmt.setString(1, uid);
		pstmt.setString(2, upw);
		ResultSet rs2 = pstmt.executeQuery();
		rs2.next();
		int loginFlag = rs2.getInt("flag");

		if (loginFlag == 1) {
			System.out.println("로그인 성공");
		} else if (loginFlag == 0) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("뭔가 잘못됨.");
		}

		sc.close();
	}
}
