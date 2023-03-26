package chapter04;

import java.util.Random;
import java.util.Scanner;

	// 숫자맞추기 -> 1~100 (High / Low)
	// 1. scanner, random 선언하기
	// 2. 1~100까지 범위 생성하기
	// 3. 사용자 값 받아오기
	// 4. 조건문으로 생성값과 사용자값 판단하기

public class GuessNumberGame {
	public static void main(String[] args) {
		// 5. 시도횟수 + 반복 해보기

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int cnt = 0;
		
		System.out.println("<숫자맞추기 게임>");
		int result = random.nextInt(100)+1; // 1~100까지 중 하나 생성
		System.out.println("랜덤 숫자가 뽑혔습니다.");
		System.out.println("1~100까지 범위입니다.");
		
		while(true) {

			System.out.print("\n값을 입력하세요>> ");
			num = scanner.nextInt();
			cnt++;
			
			if (num == result) {
				System.out.println("정답입니다!");
				System.out.println("정답까지 시도 횟수: "+cnt);			
				break;
			} else if (num < result) {
				System.out.println("해당 값보다 숫자가 큽니다.");
			} else if (num > result) {
				System.out.println("해당 값보다 숫자가 작습니다.");
			}
			
			System.out.println("시도 횟수: "+cnt);
		}
		scanner.close();
	}
}
