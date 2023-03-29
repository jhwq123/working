package chapter06_3;

import java.util.Scanner;

public class SampleTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int value;
		
		System.out.println("샘플 객체의 n변수에 값을 부여하세요.");
		System.out.print("값 입력>> ");
		value = scanner.nextInt();
		Sample s = new Sample(value);
		
		System.out.println("pw를 설정하세요.");
		System.out.print("pw 설정 : ");
		value = scanner.nextInt();
		s.setSample(value);
		
		System.out.println("값이 저장되었어요!!");
		System.out.println("샘플 객체의 n 변수의 값을 보겠습니까? (1:본다/0:안본다)");
		value = scanner.nextInt();
		if(value == 1) {
			System.out.print("패스워드를 입력하세요>> ");
			value = scanner.nextInt();
			System.out.println(s.comparSample(value));
		}
		
		
		scanner.close();
	}
}
