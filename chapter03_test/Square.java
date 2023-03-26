package chapter03_test;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("n 값을 입력하세요: ");
		int n = scanner.nextInt();
		
		System.out.print("[");

		for (int i = 1; i < n+1; i++) {
			System.out.print(i*i);
			if (i != n) {
				System.out.print(", "); // 마지막 숫자 아니면 쉼표
			}
		}
		
		System.out.print("]");
		
		scanner.close();
	}
}