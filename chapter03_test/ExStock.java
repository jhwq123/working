package chapter03_test;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		int kos = 0, rate = 0; 
		Scanner scanner = new Scanner(System.in);

		System.out.print("코스피 지수를 입력하세요(1800~2500): ");
		kos = scanner.nextInt();
		
		System.out.print("환율을 입력하세요(1100~1200): ");
		rate = scanner.nextInt();
		
		if (rate >= 1150 ) {
			if (kos >= 2200) {
				System.out.println("상승장");
			} else if (kos >= 2000) {
				System.out.println("횡보장");
			} else {
				System.out.println("하락장");
			}
		} else {
			if (kos >= 2300) {
				System.out.println("상승장");
			} else if (kos >= 2000) {
				System.out.println("횡보장");
			} else {
				System.out.println("하락장");
			}
		}
		
		scanner.close();

	}
}