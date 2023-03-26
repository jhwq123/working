package chapter03_test;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		int purchase = 0, sale = 0;
		double tax = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("매수금액을 입력하세요: ");
		purchase = scanner.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		sale = scanner.nextInt();
		
		if (purchase < sale) {
			tax = (sale - purchase)*22/100;
		} else {
			tax = 0;
		}
		
		System.out.println("양도세 = "+tax);
		
		scanner.close();
	}
}