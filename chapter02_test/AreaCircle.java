package chapter02_test;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		System.out.print("반지름을 입력하세요>>");
		
		Scanner scanner = new Scanner(System.in);
		
		int r = scanner.nextInt();
		
		double result = r * r * PI;
		
		System.out.println("원의 면적은"+result+"입니다.");
		
		scanner.close();
	}
}