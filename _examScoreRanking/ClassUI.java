package _examScoreRanking;

import java.util.Scanner;

public class ClassUI {
	Scanner sc = new Scanner(System.in);

	void intro() {
		System.out.println("==== 학생 시험 관리 프로그램 ===");
	}

	void login() {
		System.out.println("\n로그인을 진행합니다.");
	}

	void loginFail() {
		System.out.println("로그인에 실패했습니다.");
		System.out.println("처음부터 다시 시도하세요.");
	}

	void hello(String name) {
		System.out.println();
		System.out.println(name + "님, 환영합니다.");
	}

	int userInputI() {
		int result = sc.nextInt();
		return result;
	}

	void error() {
		System.out.println("error가 발생.");
	}

	String userInput(String key) {
		System.out.print(key + "값 을 입력하세요>>");
		String result = sc.next();
		return result;
	}

	String userInputS() {
		String result = sc.nextLine();
		result = sc.nextLine();
		return result;
	}

	int examStart() {
		System.out.println("시험이 필요합니다!");
		System.out.println("시험을 치겠습니까?");
		System.out.println("1.지금바로. / 2.나중에...");
		int sel = sc.nextInt();
		return sel;
	}

	int exam1() { // 1
		System.out.println("\n1. 다음 중 발음이 바르지 '않은' 것은? [10점]");
		System.out.println("");
		System.out.println("(1) 낮[낟]");
		System.out.println("(2) 않다[안따]");
		System.out.println("(3) 맑고[말꼬]");
		System.out.println("(4) 부엌[부억]");
		System.out.println("(5) 밥물[밤물]");
		System.out.println("");
		System.out.print("정답 입력:>> ");
		try {
			int sel = sc.nextInt();
			return sel;
		} catch (Exception e) {
			System.out.println("올바른 값을 입력하세요.");
		}
		return -1;
	}

	int exam2() { // 13
		System.out.println("\n2. 다음 문제에 알맞는 값을 써넣으시오. [30점]");
		System.out.println("");
		System.out.println("원숭이는 삼각자를 가지고 놀고있었다.");
		System.out.println("삼각자의 밑면은 12, 높이는 5의 길이를 가진다.");
		System.out.println("원숭이는 갑자기 빗면의 길이가 궁금해졌다.");
		System.out.println("원숭이는 ChatGPT에게 방법을 물어보았다.");
		System.out.println("원숭이는 피타고라스의 원리에 의한 c^2 = a^2 + b^2를 이해했다.");
		System.out.println("따라서 원숭이는 빗면의 길이를 구할 수 있었다.");
		System.out.println("");
		System.out.println("[문제: 원숭이가 구한 삼각자의 빗면의 길이를 구하시오.]");
		System.out.println("");
		System.out.print("정답 입력:>> ");
		try {
			int sel = sc.nextInt();
			return sel;
		} catch (Exception e) {
			System.out.println("올바른 값을 입력하세요.");
		}
		return -1;
	}

	int exam3() { // 5
		System.out.println("\n3. 서로 친한 사이로 지내는 두 학생의 대화에서,");
		System.out.println("답변으로 가장 바람직한 것은? [20점]");
		System.out.println("");
		System.out.println("영희 : 철수야, 너 미용실 다녀왔니?");
		System.out.println("머리모양이 아주 멋지다. 넌 정말");
		System.out.println("멋진 남자친구야.");
		System.out.println("");
		System.out.println("철수: ");
		System.out.println("(1) 응, 너도 있는 그대로의 모습이 정말 예뻐");
		System.out.println("");
		System.out.println("(2) 그래? 내가 너같이 촌스러운 스타일은 아니지.");
		System.out.println("");
		System.out.println("(3) 너도 머리모양을 바꿔보는 게 어때?");
		System.out.println("    나는 긴 생머리를 좋아하거든.");
		System.out.println("");
		System.out.println("(4) 응. 내가 좀 멋지지.");
		System.out.println("나같이 멋진 사람이 너 만나주는거 고맙게 생각해.");
		System.out.println("");
		System.out.println("(5) 그런데 너 꽂은 머리핀이 별로 맘에 안 든다.");
		System.out.println("    내가 새 머리핀 사줄게. 상점에 가자.");
		System.out.println("");
		System.out.print("정답 입력:>> ");
		try {
			int sel = sc.nextInt();
			return sel;
		} catch (Exception e) {
			System.out.println("올바른 값을 입력하세요.");
		}
		return -1;
	}

	int exam4() { // 2
		System.out.println("\n4. 다음 항목의 맞는 항목만큼 체크하시오. [20점]");
		System.out.println("");
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│ㄱ. 지구는 자전을 하면서 공전할 수 없다.         │");
		System.out.println("│ㄴ. 지구는 태양을 중심으로 1년에 한바퀴씩 자전한다. │");
		System.out.println("│ㄷ. 지구는 자전과 공전방향이 같다.             │");
		System.out.println("│ㄹ. 하루 동안 달의 위치는 변하지 않고 그대로 떠있다.│");
		System.out.println("└──────────────────────────────────────┘");
		System.out.println("");
		System.out.println("(1) ㄱ, ㄴ");
		System.out.println("(2) ㄱ, ㄷ");
		System.out.println("(3) ㄴ, ㄹ");
		System.out.println("(4) ㄴ, ㄷ, ㄹ");
		System.out.println("(5) ㄱ, ㄴ, ㄷ, ㄹ");
		System.out.println();
		System.out.print("정답 입력:>> ");
		try {
			int sel = sc.nextInt();
			return sel;
		} catch (Exception e) {
			System.out.println("올바른 값을 입력하세요.");
		}
		return -1;
	}

	int exam5() { // 2
		System.out.println("\n5. 다음 문제에 맞는 답을 입력하시오. [20점]");
		System.out.println("");
		System.out.println("부부가 산에 올라가면?");
		System.out.println("");
		System.out.println("(1) 부부젤라");
		System.out.println("(2) 쁏");
		System.out.println("(3) 파혼");
		System.out.println("(4) 장수비결");
		System.out.println("(5) 산악회");
		System.out.println();
		System.out.print("정답 입력:>> ");
		try {
			int sel = sc.nextInt();
			return sel;
		} catch (Exception e) {
			System.out.println("올바른 값을 입력하세요.");
		}
		return -1;
	}

}
