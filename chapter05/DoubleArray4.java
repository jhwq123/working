package chapter05;

import java.util.Random;
import java.util.Scanner;

public class DoubleArray4 {
	public static void main(String[] args) {
		// 2차 배열 test1

		int[] A = new int[5];
				
		Random rd = new Random();
		int idx = rd.nextInt(5); // 0~4
				
		A[idx] = 7;
				
		System.out.println("7이 어디에?");
		//사용자 입력을 받아서...7, 0, 1, 2, 3, 4
				
		Scanner sc = new Scanner(System.in);
				
		int sel = sc.nextInt();
				
		for(int i = 0; i < 5; i++) {
			if(A[sel] == 7) {
				System.out.println("Good!!");
			} else {
				System.out.println("T.T");
			}			
		}
				
		sc.close();
	}
}
