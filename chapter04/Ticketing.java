package chapter04;

import java.util.Scanner;

	//1. 좌석이 10 준비되어 있다.
	// 2. 사용자가 좌석을 선택한다.
	// 3. 사용자가 선택한 좌석에 1이 표시된다.

	// seats 배열, 예약좌석 선택, 예약현황 보여주기
	// 계속? (0:No / 1:Yes)
	// 끝나는 경우: 1. No로 빠져나올경우, 2. 모든 방이 다 찰경우
	// 만석입니다. 채팅 이후 나가기.

public class Ticketing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int[] seats = new int[10];
		int select = 0;
		int full_cnt = 0;
		
		while(true) {
			
			// 1. 좌석이 10 준비되어 있다.
			System.out.println("\n\n ==================좌석명단=================");
			System.out.print(" | ");
			for (int i = 0; i < seats.length; i++) {
				System.out.print(seats[i]);
				System.out.print(" | ");
				if (seats[i] == 1) {
					full_cnt++;
				}
			}
			System.out.println("\n ==1===2===3===4===5===6===7===8===9===10=");
			
			if (full_cnt >= 10) {
				System.out.println("\t\t만석입니다.");
				break;
			} else {
				System.out.println("\t\t남은 좌석: "+(10-full_cnt));
			}
			full_cnt = 0;
			
			
			// 2. 사용자가 좌석을 선택한다.
			System.out.print("\n예약할 좌석을 선택하세요(1~10)>> ");
			select = scanner.nextInt();
			select -= 1;
			
			
			// 3. 사용자가 선택한 좌석을 판별한다.
			if (seats[select] == 0) {
				seats[select] = 1;
				System.out.println("예약을 성공했습니다.");
			} else {
				System.out.println("이미 자리가 있습니다.");
			}
			
			System.out.println("\n계속 하시겠습니까? (0: No /1: Yes)");
			select = scanner.nextInt();
			
			if (select == 0) {
				System.out.println("종료합니다.");
				break;
			} else if (select != 1) {
				System.out.println("잘못된 입력입니다, 종료합니다.");
				break;
			}
		}
		scanner.close();
	}
	
}
