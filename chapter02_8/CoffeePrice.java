package chapter02_8;

import java.util.Scanner;

/*
 * 커피 주문을 받아서 커피명과 가격을 출력
 */

public class CoffeePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("무슨 커피를 드릴까요?");
		System.out.println("밀크커피/프림커피/설탕커피/아메리카노");
//		next() : 문자열 입력받는 메소드
		String order = scanner.next();
//		커피가격 변수 초기화		
		int price = 0;
		
		switch (order) {
		case "밀크커피":
		case "프림커피":
		case "설탕커피":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다.");
			break;
		}
		if (price != 0)
			System.out.println(order+"는"+price+"원입니다.");
		scanner.close();
	}
}