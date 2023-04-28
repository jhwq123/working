package KHW;

public class ClassService {

	ClassUI ui = new ClassUI();

	Object login() throws Exception {

		SqlDAO db = new SqlDAO("classTest");
		TeacherVO t = new TeacherVO();
		StudentVO s = new StudentVO();

		ui.login();
		String id = ui.userInput("아이디");
		String pw = ui.userInput("패스워드");
		// 암호화 나중에 넣기
		if (db.login("teachDB", t, id, pw) == 1) {
			t = db.readTeacher("teachDB", t, "id", id);
			return t;
		} else if (db.login("stuDB", s, id, pw) == 1) {
			s = db.readStudent("stuDB", s, "id", id);
			return s;
		} else {
			return null;
		}

	}

	public int solveExam() {

		System.out.println("시험을 시작합니다.");

		int score = 0;
		int[] userSols = new int[5];
		int[] answers = { 1, 13, 5, 2, 2 };
		int[] points = { 10, 30, 20, 20, 20 };

		userSols[0] = ui.exam1();
		userSols[1] = ui.exam2();
		userSols[2] = ui.exam3();
		userSols[3] = ui.exam4();
		userSols[4] = ui.exam5();

		for (int i = 0; i < 5; i++) {
			if (userSols[i] == answers[i]) {
				score += points[i];
			}
		}

		return score;

	}

	public void makeComent() throws Exception {

		SqlDAO db = new SqlDAO("classTest");
		StudentVO s = new StudentVO();
		System.out.println("코멘트를 남기시겠습니까?");
		System.out.print("1. 네 / 2. 아니오 >>");
		int sel = ui.userInputI();
		if (sel == 1) {
			String detail = "";
			System.out.print("어떤 번호의 학생에게 코멘트를씁니까?");
			int sno = ui.userInputI();
			System.out.print("내용>>");
			detail = ui.userInputS();
			db.updateComent("stuDB", s, sno, detail);
			System.out.println("코멘트 작성이 완료되었습니다.");
		} else if (sel == 2) {
			System.out.println("수고하셧습니다.");
		} else {
			ui.error();
		}

	}

}
