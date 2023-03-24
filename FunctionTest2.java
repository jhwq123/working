package working;

import java.util.Scanner;
import java.util.Random;

public class FunctionTest2 {
	
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
		
		printSentence(sents);
		
		scanner.close();
	}
	
	static int getIndex() { // index 값 랜덤 반환 용도
		
		Random random = new Random();
		return random.nextInt(3)+1; // 1~3
		
	}
	
	static void printSentence (String[] s) {
		for (int i = 0; i < 3; i++) {
			System.out.print(s[i]+" ");
		}
	}
}
