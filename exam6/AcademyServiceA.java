package exam6;

import java.util.ArrayList;

public class AcademyServiceA implements AcademyService {

	AcademyUI ui = new AcademyUI();
	ArrayList<StudentA> alist = new ArrayList<>();

	private String id = "adminA";
	private String pw = "a123";

	@Override
	public int login(String id, String pw) {
		if (this.id.equals(id) && this.pw.equals(pw)) {
			return 1;
		}
		return 0;
	};

	@Override
	public void insert() {
		int sno = ui.inSno();
		String sname = ui.inSname();
		int javaScore = ui.inSubject("java");
		int sqlScore = ui.inSubject("SQL");

		StudentA a = new StudentA();
		a.setSno(sno);
		a.setSname(sname);
		a.sub.put("javaScore", javaScore);
		a.sub.put("sqlScore", sqlScore);
		alist.add(a);
	}

	@Override
	public void select(int sno) {
		int flag = 0;
		for (StudentA a : alist) {
			if (a.getSno() == sno) {
				System.out.println(a.getScore());
				System.out.println("결과: " + a.getPass());
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("값을 찾지 못했습니다.");
		}
	}

	@Override
	public void selectAll() {
		for (StudentA a : alist) {
			System.out.println(a);
		}
	}
}
