package chapter05;

import java.util.Scanner;

public class MethodTest2 {
	// 함수 테스트2
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sel = 0;
		
		showMenu();
		
		sel = scanner.nextInt();
		
		switch(sel) {
		case 1:
			// 메뉴 1 실행 : 1~10까지 숫자를 출력하는 기능
			menu1();
			break;
		case 2:
			// 메뉴 2 실행 : 1~10까지 수중에 홀수만 출력하는 기능
			menu2();
			break;
		default:
			break;
		}
		
		scanner.close();
	}
	
	static void showMenu() {
		System.out.println("----함수연습 프로그램----");
		System.out.println("1. 메뉴1 / 2. 메뉴2");
		System.out.print("선택 >> ");
	}

	static void menu1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);				
		}
	}
	
	static void menu2() {
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);				
		}
	}
}
