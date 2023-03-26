package chapter03_test;

import java.util.Scanner;

public class CountString {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
//		한 행 모두 입력처리 시킴
		String s = scanner.nextLine();
		
		System.out.println("문자열의 개수 : "+s.length());
		System.out.print("문자열의 개수는 ");
		
		if (s.length()%2 == 0) { // 짝수
			System.out.println("짝수이다.");
		} else {
			System.out.println("홀수이다.");
		}		
		
		scanner.close();		
	}
}