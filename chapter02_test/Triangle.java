package chapter02_test;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		int a, b, c = 0; // 초기화
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		if ((a+b)<=c || (a+c)<=b || (b+c)<=a) {
			System.out.println("삼각형이 안됩니다.");
		} else {
			System.out.println("삼각형이 됩니다.");			
		}
		
		scanner.close();
	}
}