package chapter05;

import java.util.Scanner;

	/*	
	<10진수 to 2진수 변환>
	1. 자릿수가 4번 나오기 때문에, 4번 시행이 필요
	2-1. 입력값에 2를 나누고 나온 나머지를 저장
	2-2. 입력값에 2를 나눈 값을 다음 계산값에 저장
	3. (2-1 ~ 2-2)의 작업을 4번 시행
	4. 작업을 시행하며 나온 나머지 저장값을 역순으로 배열
	5. 역순 배열값을 출력 
	*/

public class TenToTwo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] two = new int[8];
		int cnt = 0;
				
		System.out.print("변환 하려는 10진수 입력(1~255)>> ");
		int ten = scanner.nextInt();
				
		while (ten > 0) {
			two[cnt] = ten%2;
			ten = ten/2;
			cnt++;
		}
				
		for (int i = 0; i < cnt; i++) {
			System.out.print(two[cnt-i-1]);
		}
				
		scanner.close();
	}
}
