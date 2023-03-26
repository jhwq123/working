package chapter03_test;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("매수 수량을 입력하시오>>");
		int n = scanner.nextInt();
		int res = 520;
		int total = n*res;
		
		int d100 = total/100;
		int d10 = (total%100)/10;
		if (n > 0) {
			if (d100 != 0) {
				System.out.println("100달러짜리 "+d100+"매");			
			}
			if (d10 != 0) {
				System.out.println("10달러짜리 "+d10+"매");
			}
		} else {
			System.out.println("매수 수량이 없으므로 0입니다.");
		}
		
		scanner.close();
	}
}