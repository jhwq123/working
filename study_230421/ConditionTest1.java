package study_230421;

import java.util.Scanner;

/*
 * 코리아 초등학교에서 1학년부터 4학년까지 중간고사 시험을 보았다.
 * 4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다.
 * 이를 판단하는 프로그램을 작성해보자. 점수가 0미만 100초과이면 경고문구 출력!
 * 테스트 값 -> -10 / 50.3 / 60.3 / 60.4 / 70.4 / 100.4 / 110
 */

public class ConditionTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score_cut = 60;

		System.out.println("코리아 초딩 고사시험 점수입력>>");
		int score = sc.nextInt();
		if (score >= 0 && score <= 100) {
			System.out.println("학년 점수입력>>");
			int average = sc.nextInt();
			if (average == 4) {
				score_cut += 10;
			}

			if (score >= score_cut) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} else {
			System.out.println("경고! 점수범위에서 벗어납니다.");
		}

		sc.close();
	}
}
