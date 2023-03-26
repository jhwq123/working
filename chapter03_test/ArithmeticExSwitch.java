package chapter03_test;

import java.util.Scanner;

public class ArithmeticExSwitch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int value = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();

		switch(op) {
			case "+": {
				value = a+b;
				break;
			}
			case "-": {
				value = a-b;
				break;
			}
			case "*": {
				value = a*b;
				break;
			}
			case "/": {
				if (b == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					return;
				} else {
					value = a/b;
					break;
				}
			}
			default: {
				System.out.println("잘못된 연산자 입력.");
				return;
			}
		}
		
		System.out.println(a+op+b+"의 계산 결과는 "+value);
		
		scanner.close();
	}
}