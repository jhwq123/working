package exam6;

public class AcademyTest {
	public static void main(String[] args) {

		AcademyServiceA serviceA = new AcademyServiceA();
		AcademyServiceB serviceB = new AcademyServiceB();
		AcademyUI ui = new AcademyUI();
		boolean runFlag = true;

		// A값 세팅용
		StudentA a1 = new StudentA();
		a1.setSno(1);
		a1.setSname("가가가");
		a1.sub.put("javaScore", 80);
		a1.sub.put("sqlScore", 70);
		serviceA.alist.add(a1);
		StudentA a2 = new StudentA();
		a2.setSno(2);
		a2.setSname("나나나");
		a2.sub.put("javaScore", 65);
		a2.sub.put("sqlScore", 90);
		serviceA.alist.add(a2);
		StudentA a3 = new StudentA();
		a3.setSno(3);
		a3.setSname("다다다");
		a3.sub.put("javaScore", 50);
		a3.sub.put("sqlScore", 60);
		serviceA.alist.add(a3);

		// B값 세팅용
		StudentB b1 = new StudentB();
		b1.setSno(1);
		b1.setSname("라라라");
		b1.sub.put("htmlScore", 76);
		b1.sub.put("cssScore", 90);
		b1.sub.put("jsScore", 84);
		serviceB.blist.add(b1);
		StudentB b2 = new StudentB();
		b2.setSno(2);
		b2.setSname("마마마");
		b2.sub.put("htmlScore", 87);
		b2.sub.put("cssScore", 20);
		b2.sub.put("jsScore", 90);
		serviceB.blist.add(b2);
		StudentB b3 = new StudentB();
		b3.setSno(3);
		b3.setSname("바바바");
		b3.sub.put("htmlScore", 56);
		b3.sub.put("cssScore", 95);
		b3.sub.put("jsScore", 70);
		serviceB.blist.add(b3);

		ui.title();
		String id = ui.inData("id");
		String pw = ui.inData("pw");
		// pw
		if (serviceA.login(id, pw) == 1) {
			while (runFlag) {
				int sel = ui.subTitle("A");

				switch (sel) {
				case 1:
					serviceA.insert();
					break;
				case 2:
					int sno = ui.inSno();
					serviceA.select(sno);
					break;
				case 3:
					serviceA.selectAll();
					break;
				default:
					// 잘못된 값
					break;
				}
			}
		} else if (serviceB.login(id, pw) == 1) {
			while (runFlag) {
				int sel = ui.subTitle("B");
				switch (sel) {
				case 1:
					serviceB.insert();
					break;
				case 2:
					int sno = ui.inSno();
					serviceB.select(sno);
					break;
				case 3:
					serviceB.selectAll();
					break;
				default:
					// 잘못된 값
					break;
				}
			}
		} else {
			// 잘못된 값
		}

	}
}
