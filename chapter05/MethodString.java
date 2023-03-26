package chapter05;

import java.util.Scanner;
import java.util.Random;

public class MethodString {
	// 문자열 선택 출력방법

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		String[] names = {"길동이가", "철수가", "영희가"};
		String[] wheres = {"학교에서", "식당에서", "화장실에서"};
		String[] doings = {"공부를 합니다.", "밥을 먹습니다.", "일을 봅니다."};
		String[] sents = new String[3];
		int sel = 0;
		
		sel = getIndex();
		sents[0] = names[sel-1];
		sel = getIndex();
		sents[1] = wheres[sel-1];
		sel = getIndex();
		sents[2] = doings[sel-1];
		
		// 1. 자동? 2. 수동?
		
//			System.out.println("이름: (1:길동이 / 2:철수 / 3:영희)");
//			sel = scanner.nextInt();
//			name = names[sel-1];
//			
//			System.out.println("장소: (1:학교 / 2:식당 / 3:화장실)");
//			sel = scanner.nextInt();
//			where = wheres[sel-1];
//					
//			System.out.println("행동: (1:공부 / 2:밥 / 3:일)");
//			sel = scanner.nextInt();
//			doing = doings[sel-1];
//			
		printSentence(sents);
		
		scanner.close();
	}
	
	static int getIndex() { // index 값 반환 용도
		
		Random random = new Random();
		return random.nextInt(3)+1; // 1~3
		
	}
	
	static void printSentence (String[] s) {
		for (int i = 0; i < 3; i++) {
			System.out.print(s[i]+" ");
		}
	}

}
