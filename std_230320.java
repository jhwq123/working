package working;

import java.util.Random;

public class std_230320 {
	public static void main(String[] args) {
		
		int[] hist = new int [6];
		int num = 0, sum = 0;
		Random rd = new Random();
		
		// hist 0 1 2 3 4 5
		// num  1 2 3 4 5 6
		
		for (int i = 0; i < 100; i++) {
			num = rd.nextInt(6)+1;
			hist[num-1]++;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println((i+1)+"의 개수: "+hist[i]);
			sum += hist[i];
		}
		
		System.out.println("뽑은 횟수 총합: "+sum);
	}
}