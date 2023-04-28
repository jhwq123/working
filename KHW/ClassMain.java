package KHW;

public class ClassMain {
	public static void main(String[] args) throws Exception {

		ClassService service = new ClassService();
		SqlDAO db = new SqlDAO("classTest");
		ClassUI ui = new ClassUI();
		RankVO r = new RankVO();
		Object o;

		ui.intro();
		o = service.login();

		if (o == null) {
			ui.loginFail();
		} else if (o.getClass() == TeacherVO.class) {
			TeacherVO t = (TeacherVO) o;
			ui.hello(t.getTname());
			if (db.readRank("rankdb", r) == 1) {
				service.makeComent();
			}
		} else if (o.getClass() == StudentVO.class) {

			StudentVO s = (StudentVO) o;
			ui.hello(s.getSname());

			if (s.getScore() == -1) {

				if (ui.examStart() == 1) {

					s.setScore(service.solveExam());
					db.updateScore("studb", s, s.getSno(), s.getScore());
					r.setRno(s.getSno());
					r.setSno(s.getSno());
					r.setTname(s.getSname());
					r.setScore(s.getScore());
					if (s.getScore() >= 60) {
						r.setPass("PASS");
					} else {
						r.setPass("FAIL");
					}
					db.updateScore("rankdb", r, r.getSno(), s.getScore());
					db.updatePass("rankdb", r, r.getSno(), r.getPass());
				} else {
					System.out.println("컨디션이 좋을때 시도하세요~");
				}

			} else {
				System.out.println(s.getScore() + "점 이네요.");
				if (s.getScore() >= 60) {
					System.out.println("PASS 입니다!");
				} else {
					System.out.println("FAIL 입니다.");
				}
				if (s.getComent() != null) {
					System.out.println("쌤의 코멘트: " + s.getComent());
				}
			}
		} else {
			ui.loginFail();
		}
	}
}
