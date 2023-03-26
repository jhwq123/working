package chapter02_8;

import java.util.Scanner;

/*
 * 점수를 입력받아서 학점 출력
 */
public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		A,B,C,D,F
		char grade;
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		
		/*
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else
			grade = 'F';
		*/
		
		switch(score/10) {
		case 10: // 100점, 어짜피 해당조건에 맞으면 자동실행.
		case 9: // 90~99점
			grade='A';
			break;
		case 8: // 80~89점
			grade='B';
			break;
		case 7: // 70~79점
			grade='C';
			break;
		case 6: // 60~69점
			grade='D';
			break;
		default: // 0~59점
			grade='F';
			break;
		}
		
		System.out.println("학점은 "+grade+"입니다.");
		
		scanner.close();
	}
}