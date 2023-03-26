package chapter04;

import java.util.Random;
import java.util.Scanner;

	// 가위바위보
	// 1. 가위바위보 배열 생성
	// 2. 랜덤 값 입력받기
	// 3. 내가 낸 수와 상대가 낸 수 확인
	// 4. 조건문으로 생성값과 사용자값 판단하기
	// 5. 시도횟수 + 반복 해보기

public class PaperRockGame {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String[] maps = {"가위", "바위", "보"};
		int num = 0;
		int cnt = 0;
		int result = 0;
		System.out.println("<가위바위보 게임>");
		
		while(true) {
			result = random.nextInt(3); // 0~2까지 중 하나 생성
			System.out.println("상대가 정했습니다.");
			System.out.print("값을 입력하세요(0:가위/1:바위/2:보)>> ");
			num = scanner.nextInt();
			cnt++;
			
			if (num < 0 || num > 2) {
				System.out.println("맞는 범위의 수를 입력하세요.");
				break;
			}
			
			System.out.println("내가낸 수: "+maps[num]);
			System.out.println("상대의 수: "+maps[result]);
			
			if (num == result) {
				System.out.println("비겼습니다...");
			} else if (result == 0) {
				switch(num) {
				case 1: { System.out.println("이겼습니다!"); break; }
				case 2: { System.out.println("졌습니다."); break; }
				}
			} else if (result == 1) {
				switch(num) {
				case 0: { System.out.println("졌습니다."); break; }
				case 2: { System.out.println("이겼습니다!"); break; }
				}
			} else if (result == 2) {
				switch(num) {
				case 0: { System.out.println("이겼습니다!"); break; }
				case 1: { System.out.println("졌습니다."); break; }
			} 
			}
			System.out.println("시도 횟수: "+cnt+"\n");
		}
		scanner.close();
	}
}
