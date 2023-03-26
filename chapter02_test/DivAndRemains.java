package chapter02_test;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int i = scanner.nextInt();
		
		int share = (i-(i%10))/10; 
		int remain = i%10;
		
		if ((i>=10)&&(i<=99)) {
			if (share == remain) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			} else {
				System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");			
			}
		} else {
			System.out.println("정수 범위가 맞지 않습니다. 다시 시도해주세요.");
		}
		scanner.close();
	}
}