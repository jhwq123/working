package chapter03_test;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		
//		상수로 100달러 원화 계산
//		final int hundred = 120000;
//		final int ten = 12000;
//		int res, money, num;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("가구수를 입력하시오>>");
//		num = scanner.nextInt();
//
//		if (num == 1) {
//			money = 400000;
//		} else if (num == 2) {
//			money = 600000;
//		} else if (num == 3) {
//			money = 800000;
//		} else {
//			money = 1000000;	
//		}
//		
//		res = money/hundred;
//		
//		if (res > 0) {
//			System.out.println("100달러짜리"+res+"매");
//		}
//		
//		money = money%hundred;
//		res = money/ten;
//		if (res > 0) {
//			System.out.println("10달러짜리"+res+"매");
//		}
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가구수를 입력하시오>>");
		int people = scanner.nextInt();
		int res = 200000;
		int rate = 1200;
		int money = 0;
		
		if (people >= 4) {
			money = 1000000;
		} else {
			money = people*res + 200000;
		}

		int dollar = money/rate;
		
		if (dollar/100 != 0) {
			System.out.println("100달러짜리 "+dollar/100+"매");
		}
		
		dollar %=100;
		
		if (dollar/10 != 0) {
			System.out.println("10달러짜리 "+dollar/10+"매");
		}
		
		scanner.close();

	}
}