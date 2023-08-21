package chapter05;

import java.util.Random;

 	/* 로또 뽑기
	1. 랜덤수를 뽑는다. (1~45) [ Random 메소드 ]
	2. 그 수를 배열에 넣는다. [ 배열, for, ]
	3. 중복된 수를 제거하던지, 피하던지 한다 [ if, c--? ]
 	 */

public class LottoMake {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] lottoNum = new int [6];
		
		for (int i = 0; i < 6; i++) {
			lottoNum[i] = random.nextInt(45)+1; // 0~44 +1 = 1~45
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
//					System.out.println("겹쳤네요?");
					i--;
				}
//				System.out.println("n["+i+"] 값과 n["+j+"] 값 체크");
			}
			
		}
		printNum(lottoNum);
		
	}
	
	static void printNum(int[] num) {
		for (int i = 0; i < 6; i++) {
			System.out.print(num[i]+"");
		}
	}
}