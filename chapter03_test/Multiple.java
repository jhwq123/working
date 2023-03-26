package chapter03_test;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		
//		if else if 혹은 if else 가 만능은 아니다.
		
		boolean Multiple = false;
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int number = scanner.nextInt();
		
		for (int i = 3, j = 0; i < 9; i+=2, j++) {
			if (number%i == 0 && number != 0) {
				System.out.println(i+"의 배수이다.");
				Multiple = true;
			}
			i = i + j;
		}
		
		if (!Multiple) {
			System.out.println("어느 배수도 아니다");
		}
		
		scanner.close();

	}
}