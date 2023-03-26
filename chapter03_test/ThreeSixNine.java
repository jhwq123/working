package chapter03_test;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		
		int count=0, a=0, b=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("10~99 사이의 정수를 입력하시오>>");
		int n = scanner.nextInt();

		a = n/10;
		b = n%10;
			
//		3, 6, 9 (10의 자리)
		if (a%3 == 0) {
			count++;
		}
//		3, 6, 9일때 (1의 자리는 0이 되면 안됨.)
		if (b%3 == 0 && b != 0) {
			count++;
		}
		
		if (count == 2) {
			System.out.println("박수짝짝");
		} else if (count == 1) {
			System.out.println("박수짝");
		} else {
			System.out.println("박수없음");
		}
		
		scanner.close();
	}
}