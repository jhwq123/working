package chapter03_test;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		int h=0, m=0, s=0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int n = scanner.nextInt();
		
//		ex>5000 = 5000/3600 = 1
		h = n/(60*60); // 1시간
		m = (n/60)%60; // 분
		s = n%60; // 초
		
		System.out.println(n+"초는 "+h+"시간, "+m+"분, "+s+"초입니다.");
		
		scanner.close();
	}
}