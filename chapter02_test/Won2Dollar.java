package chapter02_test;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// 한번 고정되고 바뀌지 않으므로 final 해주기.
		// 그리고 소숫점 이하로 나오게하기위해, int/double해주기 위함.
		final double rate = 1100.0;
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scanner.nextInt();
		
		double dollar = won / rate;
		
		System.out.println(won+"원은 $"+dollar+"입니다.");
		
		scanner.close();
		
	}
}