package _exam6;

import java.util.ArrayList;

public class AcademyServiceB implements AcademyService {

	AcademyUI ui = new AcademyUI();
	ArrayList<StudentB> blist = new ArrayList<>();

	private String id = "adminB";
	private String pw = "b456";

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
		int htmlScore = ui.inSubject("html");
		int cssScore = ui.inSubject("css");
		int jsScore = ui.inSubject("js");

		StudentB b = new StudentB();
		b.setSno(sno);
		b.setSname(sname);
		b.sub.put("htmlScore", htmlScore);
		b.sub.put("cssScore", cssScore);
		b.sub.put("jsScore", jsScore);
		blist.add(b);
	}

	@Override
	public void select(int sno) {
		int flag = 0;
		for (StudentB b : blist) {
			if (b.getSno() == sno) {
				System.out.println(b.getScore());
				System.out.println("결과: " + b.getPass());
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("값을 찾지 못했습니다.");
		}
	}

	@Override
	public void selectAll() {
		for (StudentB b : blist) {
			System.out.println(b);
		}
	}

}
