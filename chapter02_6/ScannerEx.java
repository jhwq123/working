package chapter02_6;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈찬으로 분리하여 입력하세요.");
//		new Scanner(System.in); : 객체 생성
//		System.in : 매개변수(인자, 파라미터)
//		System.in : 바이트 표준입력 스트림		
//		System 객체를 생성하고, Scanner 클래스 타입의 scanner 참조변수가 가리킴	
		Scanner scanner = new Scanner(System.in);
		
		// next() : 입력 단위로 받음.
		String name = scanner.next();
		System.out.println("이름은 "+name);
		
		// 입력 받을 때 스페이스나 탭으로 구분해서 토큰단위로 받음
		String city = scanner.next();
		System.out.println("도시는 "+city);
		
		int age = scanner.nextInt();
		System.out.println("나이는 "+age);
		
		double weight = scanner.nextDouble();
		System.out.println("체중은 "+weight);
		// Boolean은 true와 false로 구분함 (1/0 아님)
		boolean single = scanner.nextBoolean();
		System.out.println("독신여부는 "+single);
		
		System.out.println("이름: "+name+"// 도시: "+city+"// 나이: "+age+"// 체중: "+weight+"// 독신: "+single);
		
		scanner.close();
	}
}