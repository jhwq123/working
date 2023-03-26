package chapter03_test;

import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int cnt = 1;
		
		System.out.print("수를 입력하세요: ");
		int n = scanner.nextInt();
		
		if(n < 0 || n > 999) {
			System.out.print("오류! ");
		}
		System.out.print(n);
		
		while (n/10 != 0) {
			cnt++;
			n /= 10;
		}
		
		System.out.print(" 은(는) ");
		switch(cnt) {
		case 1: System.out.println("한 자리 숫자이다."); break;
		case 2: System.out.println("두 자리 숫자이다."); break;
		case 3: System.out.println("세 자리 숫자이다."); break;
		default: System.out.println("범위(0~999) 이외의 숫자이다.");
		}
		
//		if (n >= 0 && n <= 9) {
//			System.out.println("한 자리");
//		} else if (n >= 10 && n <= 99) {
//			System.out.println("두 자리");
//		} else if (n >= 100 && n <= 999) {
//			System.out.println("세자리");
//		} else {
//			System.out.println("범위 오류");
//		}
		
		scanner.close();
	}
}