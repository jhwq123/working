package chapter03_test;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int n = scanner.nextInt();
		
		if (n/50000 != 0) {
			System.out.println("오만원권 "+n/50000+"매");
			n %= 50000;
		}
		if (n/10000 != 0) {
			System.out.println("만원권 "+n/10000+"매");
			n %= 10000;
		}
		if (n/1000 != 0) {
			System.out.println("천원권 "+n/1000+"매");
			n %= 1000;
		}
		if (n/100 != 0) {
			System.out.println("백원 "+n/100+"개");
			n %= 100;
		}
		if (n/50 != 0) {
			System.out.println("오십원 "+n/50+"개");
			n %= 50;
		}
		if (n/10 != 0) {
			System.out.println("십원 "+n/10+"개");
			n %= 10;
		}
		if (n != 0) {
			System.out.println("일원 "+n%10+"개");
		}
		scanner.close();
		
	}
}