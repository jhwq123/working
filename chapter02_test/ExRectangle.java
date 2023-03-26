package chapter02_test;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로, 세로 길이를 입력하세요>>");
		
//		첫번재 정수를 가로 변수로 입력 받음
		int a = scanner.nextInt();
//		두번째 정수를 세로 변수로 입력 받음
		int b = scanner.nextInt();
		
		int result = a* b;
		
		System.out.println("사각형의 면적은 "+result+"입니다.");
		scanner.close();
		
	}
}