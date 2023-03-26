package chapter02_test;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int result = 0;
		
		// 가능한 경우의 수 6가지로 섞음
		
		if ((b>a&&a>c) || (c>a&&a>b)) {
			result = a;
		} else if ((a>b&&b>c) || (c>b&&b>a)) {
			result = b;
		} else if ((a>c&&c>b) || (b>c&&c>a)) {
			result = c;
		}

		System.out.println("중간 값은  "+result);
		
		scanner.close();
		
	}
}