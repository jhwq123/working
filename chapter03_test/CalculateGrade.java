package chapter03_test;

import java.util.Scanner;

public class CalculateGrade {
	public static void main(String[] args) {
		
		boolean cheating = false;
		int attendrate=0, totalscore=0;
		char grade='0';
		Scanner scanner = new Scanner(System.in);

		System.out.print("부정행위 여부(true 혹은 false): ");
		cheating = scanner.nextBoolean();
		System.out.print("출석률(0~100사이의 정수값): ");
		attendrate = scanner.nextInt();
		System.out.print("총점(0~100사이의 정수값): ");
		totalscore = scanner.nextInt();
		 
		
		if (cheating || attendrate < 80) {
			grade = 'F';
		} else if (totalscore >= 90) {
			grade = 'A';
		} else if (totalscore >= 80) {
			grade = 'B';
		} else if (totalscore >= 70) {
			grade = 'C';
		} else if (totalscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		
		System.out.println("학점 = "+grade);
		scanner.close();
	}
}