package chapter03_test;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		int score = 0, avg = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하세요(0~100): ");
		score = scanner.nextInt();
		
		System.out.print("학년을 입력하세요(1~4): ");
		avg = scanner.nextInt();

		if (score >= 60 && avg >= 1 && avg <= 3) {
			System.out.println("합격!");
		} else if (score >= 70 && avg == 4) {
			System.out.println("합격!");			
		} else {
			System.out.println("불합격!");			
		}
	
		scanner.close();
	}
}