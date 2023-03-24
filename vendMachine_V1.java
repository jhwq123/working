package working;

import java.util.Scanner;

public class vendMachine_V1 {
	public static void main(String[] args) {
		
		// 1. 커피, 콜라, 쥬스 출력
		// 2. 300, 500, 1000 출력
		// 3. 돈 >> 600
		// 메뉴 선택 >> 2
		// 계속? 더 구매 안되면 끗
		// 거스름돈은 100원 입니다.
		// * 구입 가능하면 불이 들어가도록?
		// ** 영수증이 출력이 되나?
		
		
		// 1) 커피, 콜라, 쥬스의 변수가 담길 값들을 정리한다.
		// 2) 300, 500, 1000 가격이 담길 값들을 정리한다.
		// 3) 돈을 받아와야 하므로 scanner가 필요하다.
		//    scanner로 돈 값을 받아온다.
		// 4) 메뉴 선택이 필요하여 선택값을 받아온다. 새 변수
		// 5) 메뉴를 선택하려면 메뉴값이 뭐가있는지 보고 뽑아야하므로
		//    system out으로 보여줘야 한다.
		// 6) if문 하나 넣어서 구매가 가능한지 확인,
		//    (돈 > 메뉴 가격) 인지 확인하면 좋을 것 같다.
		//    2개 if문 필요할 듯 (menu가 1,2,3인지 , money > coffee, cola, juicy인지)
		
		
		Scanner scanner = new Scanner(System.in);
		
		String coffee = "커피";
		String cola = "콜라";
		String juicy = "쥬스";
		int coffeeMoney = 300;
		int colaMoney = 500;
		int juicyMoney = 1000;
		
		System.out.println("=====================");
		System.out.println("1번\t2번\t3번");
		System.out.println("커피\t콜라\t쥬스");
		System.out.println("300\t500\t1000");
		System.out.println("=====================");
		
		
		System.out.print("돈>> ");
		int money = scanner.nextInt();
		
		System.out.print("메뉴 선택>> ");
		int menu = scanner.nextInt();
		
		if (menu == 1) { // 커피
			if(money >= coffeeMoney) {
				money = money - coffeeMoney;
				System.out.println(coffee+"를 뽑았습니다.");
				System.out.println("잔액은 "+money+"입니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if (menu == 2) { // 콜라
			if(money >= colaMoney) {
				money = money - colaMoney;
				System.out.println(cola+"를 뽑았습니다.");
				System.out.println("잔액은 "+money+"입니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if (menu == 3) { // 쥬스
			if(money >= juicyMoney) {
				money = money - juicyMoney;
				System.out.println(juicy+"를 뽑았습니다.");
				System.out.println("잔액은 "+money+"입니다.");
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		}
		
		scanner.close();
		
	}
}
