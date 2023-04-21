package study_230421;

import java.util.Scanner;

// 사용자로부터 두 개의 정수를 입력 받아 
// 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성

public class OperatorTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수a 입력>>");
		int a = sc.nextInt();
		System.out.print("정수b 입력>>");
		int b = sc.nextInt();

		if (a < b) {
			int temp = b;
			b = a;
			a = temp;
		}

		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));

		sc.close();
	}
}
