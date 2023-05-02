package study_230501;

import java.util.Scanner;

public class AcademyTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IScoreManager sm = null;

		String id1 = "a_admin";
		String pw1 = "a1234";

		String id2 = "b_admin";
		String pw2 = "b1234";

		// 로그인
		System.out.print("아이디를 입력하세요 >> ");
		String input_id = sc.nextLine();
		System.out.print("패스워드를 입력하세요 >> ");
		String input_pw = sc.nextLine();

		// A학원 관리자로 로그인하면.
		if (input_id.equals(id1) && input_pw.equals(pw1)) {
			sm = new AcademyA();
		} else if (input_id.equals(id2) && input_pw.equals(pw2)) {
			sm = new AcademyB();
		}

		StudentVO student = new StudentVO();

		sm.regist(student);
		int total = sm.getTotal(student);
		System.out.println("총점 : " + total);
		double avg = sm.getAvg(total, student.getSubjects().length);
		System.out.println("평균 : " + avg);
		String msg = sm.passOrFail(student);
		System.out.println(msg);

	}
}
