package working;

import java.util.Scanner;

public class tenToTwo {
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