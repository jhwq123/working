package chapter02_test;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double result = 0;
		
		if (c == 0) { //삼각형
			result = a * b / 2;
			System.out.println("삼각형의 넓이는 "+result);
		} else {
			result = (a + b) * c / 2;
			System.out.println("사다리꼴의 넓이는 "+result);
		}
		
		scanner.close();
	}
}