package exam6;

import java.util.Scanner;

public class AcademyUI {

	Scanner sc = new Scanner(System.in);

	public int inSno() {
		System.out.print("번호를 입력하세요>>");
		int sno = sc.nextInt();
		return sno;
	}

	public String inSname() {
		System.out.print("이름을 입력하세요>>");
		String sname = sc.next();
		return sname;
	}

	public int inSubject(String subject) {
		System.out.print(subject + " 성적을 입력하세요>>");
		int sub = sc.nextInt();
		return sub;
	}

	public String inData(String key) {
		System.out.print(key + " 를 입력하세요>>");
		String value = sc.next();
		return value;
	}

	public void title() {
		System.out.println("\n= 학생 성적 관리 프로그램 =");
		System.out.println("로그인을 해주세요.");
	}

	public int subTitle(String cls) {
		System.out.println("\n= " + cls + "반 성적 관리 프로그램 =");
		System.out.println("1.성적 추가 / 2.한명 성적 조회 / 3.전체 성적 조회");
		System.out.println("작업을 선택해 주세요>>");
		int sel = sc.nextInt();
		return sel;
	}

}
