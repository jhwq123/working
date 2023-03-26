package chapter04;

import java.util.Random;

public class Dice100 {
	public static void main(String[] args) {
		// 1~6 까지 주사위 숫자 100번 받아서,
		// 각 숫자가 몇번 나왔는지 확인하기.

		// 주사위 던지기 -> 숫자 나온 값 확인 -> 나온 숫자에 해당하는
		// 상자에 기록한다 -> 이 상황을 100번 반복 후, 나타낸다.

		// import java.util.Random; import 잊지말기.

		int[] hist = new int [6];
		int num = 0;
		Random rd = new Random();
		
		// hist 0 1 2 3 4 5
		// num  1 2 3 4 5 6
			
		for (int i = 0; i < 100; i++) {
			num = rd.nextInt(6)+1;
			hist[num-1]++;
		}
			
		for (int i = 0; i < 6; i++) {
			System.out.println((i+1)+"의 개수: "+hist[i]);
		}
	}
}
