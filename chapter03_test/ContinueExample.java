package chapter03_test;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int n = 0, sum = 0;
		System.out.println("정수를 5개 입력하세요.");
		
		for (int i = 0; i < 5; i++) {
			n = scanner.nextInt();
			if (n <= 0) continue;
			sum += n;
		}
		
		System.out.println("양수의 합은 "+sum);
		scanner.close();
	}
}