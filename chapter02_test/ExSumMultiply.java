package chapter02_test;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("3자리수 정수 입력(100~990)>>");
		int n = scanner.nextInt();

//		100자리수: 나누기 100의 몫
//		10자리수: 나누기 100의 나머지를 10으로 나눈 몫
//		1자리수: 나누기 100의 나머지를 10을 나눈 나머지
		int num100 = n/100;
		int num10 = (n%100)/10;
		int num1 = n%10;
		
		System.out.println("100의 자리와 10의 자리의 합은 "+(num100+num10));
		System.out.println("10의 자리와 1의 자리의 곱은 "+num10*num1);
		
		scanner.close();
	}
}