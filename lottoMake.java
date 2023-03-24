package working;

import java.util.Random;

public class lottoMake {
	
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
			System.out.print(num[i]+" ");
		}
	}
}