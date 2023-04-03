package study_230403;

import java.util.Scanner;

public class StringQuiz {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String flower = "";
		int cnt = 5;
		
		// 대한민국의 국화는 무엇입니까?
		// 무궁화
		// 5번의 기회
		// n번째에 맞췄습니다.
		// 무궁화 또는 Rose of Sharon
		
		
		while(cnt > 0) {
			System.out.println("대한민국의 국화는 무엇입니까?");
			flower = scanner.nextLine();
			if(flower.equals("무궁화") || flower.equals("Rose of Sharon")) {
				System.out.println("정답입니다!");
				System.out.println((5-cnt)+"번의 기회에 맞췄습니다.");
				if (cnt == 5) {
					System.out.println("점수: 대한건아");
				} else if (cnt >= 3) {
					System.out.println("점수: 한국인");
				} else if (cnt >= 1) {
					System.out.println("점수: 한국인 턱걸이");					
				} 
				break;
			} else {
				System.out.println("틀렸습니다! 기회가 소진됩니다");
				cnt--;
				System.out.println("남은 횟수: "+cnt);
			}
		}
		
		if (cnt <= 0) {
			System.out.println("점수: 개못하시네요...");
		}
		
		scanner.close();
	}
}
