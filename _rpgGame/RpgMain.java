package _rpgGame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RpgMain {

	static int chance = 0;
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();
	static String[] rpgTable = { "가위", "바위", "보" };
	static String[] monkeyAction = { "원숭이가 손을 꼬고 안을 들여다봅니다.", "원숭이가 무슨 생각이 난듯 해 보입니다.", "원숭이가 바닥을 내리칩니다.\n화가 난듯 보입니다.",
			"원숭이가 당신을 물끄러미 쳐다보고 있습니다.\n무언가를 떠올린듯 합니다.", "원숭이가 귀찮아 보입니다." };

	public static void main(String[] args) {

		// RPG 게임 틀을 만듭시다

		System.out.println("\n\n\n=====================");
		System.out.println("== Rock Paper Game ==");
		System.out.println("=====================");

		System.out.println("\n=== 설명 ===");
		System.out.println("10번의 기회가 주어집니다");
		System.out.println("잔망스런 원숭이와 가위바위보를 하여");
		System.out.println("이기면 +10점, 지면 -10점을 획득합니다.");
		System.out.println("비길경우 점수는 없지만 기회가 추가됩니다.");
		System.out.println("초기 점수는 50점을 가지고 시작합니다.");

		PlayGame();
	}

	static void PlayGame() {
		System.out.print("\n플레이어 이름을 입력하세요>>");
		String name = sc.nextLine();
		PlayerVO plr = new PlayerVO(name, 50);
		chance = 10;

		System.out.println("게임을 시작합니다.");
		System.out.println("현재 기회: " + chance);
		System.out.println("현재 점수: " + plr.getScore());
		int action = 0;
		int monkeyPic = 0;

		while (chance > 0) {
			action = rd.nextInt(5);
			System.out.println(monkeyAction[action]);
			monkeyPic = rd.nextInt(3);
			System.out.println("원숭이가 선택했습니다.\n");

			System.out.println("낼 무기를 선택하세요.");
			System.out.println("= 1.가위 / 2.바위 / 3.보 =");
			int yourChoice = sc.nextInt() - 1;

			PlayOneSet(monkeyPic, yourChoice, plr);
		}

		System.out.println("\n게임이 끝났습니다. 결과를 확인합니다.");
		System.out.println("최종 점수: " + plr.getScore());
		// 점수를 서버에 넘겨서, 등수를 매긴거를 반환해서 보여주는걸로 합시다.
		try {
			passToServer(plr);
		} catch (Exception e) {
			System.out.println("에러 발생!");
			e.printStackTrace();
		}

	}

	// 0 1 2 "가위", "바위", "보" _ 1 2 3
	static void PlayOneSet(int computer, int player, PlayerVO plr) {

		System.out.println("<대결 결과>");
		System.out.println("원숭이의 수: " + rpgTable[computer]);
		System.out.println(plr.getName() + "의 수: " + rpgTable[player]);

		if (computer == player) {
			System.out.println("비겼습니다.");
			chance++;
		} else if (computer == player + 1) {
			System.out.println("원숭이가 이겼습니다.");
			plr.setScore(plr.getScore() - 10);
		} else if (player == computer + 1) {
			System.out.println("플레이어가 이겼습니다.");
			plr.setScore(plr.getScore() + 10);
		} else if (computer == player + 2) {
			System.out.println("플레이어가 이겼습니다.");
			plr.setScore(plr.getScore() + 10);
		} else if (player == computer + 2) {
			System.out.println("원숭이가 이겼습니다.");
			plr.setScore(plr.getScore() - 10);
		}
		chance--;
		System.out.println("남은 횟수: " + chance);
		System.out.println("현재 점수: " + plr.getScore());
	}

	static void passToServer(PlayerVO plr) throws Exception {

		String table = "rpgrank";
		int rankCnt = 1;
		ArrayList<PlayerVO> plist = new ArrayList<>();

		// 3. 쿼리 실행 객체 생성 (Statement)
		String query = "INSERT INTO " + table + " (name, score) VALUES (?, ?)";
		PreparedStatement stmt = RpgServer.getConnection().prepareStatement(query);
		stmt.setString(1, plr.getName());
		stmt.setInt(2, plr.getScore());

		// 4. 쿼리 실행(execute)
		stmt.executeUpdate();

		Statement rankStmt = RpgServer.getConnection().createStatement();
		String queryRank = "SELECT * FROM " + table + " ORDER BY score DESC, rank DESC LIMIT 0, 5";
		ResultSet rs = rankStmt.executeQuery(queryRank);

		System.out.println("\n\n");
		System.out.println("rank | " + "name | " + "score |");
		System.out.println("===============================");
		while (rs.next()) {

			int rank = rankCnt;
			rankCnt++;
			String name = rs.getString("name");
			int score = rs.getInt("score");

			System.out.println(rank + " | " + name + " | " + score + " | ");
		}
	}

	static void error() {
		System.out.println("정상적인 값 접근이 아닙니다.");
	}
}
