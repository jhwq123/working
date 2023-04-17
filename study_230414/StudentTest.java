package study_230414;

import java.util.Random;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int stdLength = 20;
		Student[] slist = new Student[stdLength];
		int[] scoreData = new int[stdLength];
		int pwNum = 65;
		char pwC1, pwC2;
		String pw = "";

		for (int i = 0; i < stdLength; i++) {

			int score = (rd.nextInt(10) + 1) * 10;
			scoreData[i] = score;

			pwC1 = (char) pwNum;
			pwNum++;
			pwC2 = (char) pwNum;
			pw += (pwC1 + "") + (pwC2 + "");

			Student s = new Student(score, pw);
			slist[i] = s;
			pw = "";
		}

		System.out.print("{");
		for (int i = 0; i < stdLength; i++) {
			System.out.print(slist[i].getScore());
			if (i != stdLength - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");

		System.out.print("{");
		for (int i = 0; i < stdLength; i++) {
			System.out.print("\"" + slist[i].getPw() + "\"");
			if (i != stdLength - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");

		System.out.println("\n======================");
		System.out.println("===== 학생 점수 찾기 =====");
		System.out.println("======================\n");

		while (true) {

			System.out.print("\n번호를 입력하세요>>");
			int num = sc.nextInt();
			if (num < 0 || num >= stdLength) {
				System.out.print("범위 초과입니다. 다시 시도하세요");
			} else {
				System.out.print("패스워드를 입력하세요>>");
				pw = sc.next();

				if (slist[num - 1].getPw().equals(pw)) {
					System.out.println("점수는 " + slist[num - 1].getScore() + "점 입니다.");
				} else {
					System.out.println("비밀번호가 다릅니다. 처음부터 다시 시도하세요.");
				}
			}
		}
	}
}
