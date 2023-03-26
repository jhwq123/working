package chapter02_test;

import java.util.Scanner;

public class testtttt {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int roll = 0;
		int hp = 50;
		
		while(hp > 0) {
		
			System.out.println("<보스체력>");
			
			System.out.print("[");
			for(int i=1; i < hp+1; i++)
			{
				System.out.print("");
			}
			System.out.println("]");
			System.out.println("");
			System.out.println("[공격:1/쉬기:2] 를 입력하시오.");
			
			int btn = scanner.nextInt();
			
			if (btn == 1) {
				roll = rollDie();
				hp = hp - roll;
				System.out.println("공격하였습니다. "+roll+"데미지 공격.");
				System.out.println("보스 남은체력: "+hp);
			}
			else if (btn == 2) {
				System.out.println("쉬었습니다.");
			}
			else {
				System.out.println("잘못된 명령입니다. 다시 입력하십시오.");
			}
			System.out.println("");
			System.out.println("");
			System.out.println("");
			
		}
		
		System.out.println("보스를 쓰러트렸습니다.");
		
		scanner.close();
	}
//	매개변수가 없는 메소드(주사위의 숫자 구하기 = 1~6)
	public static int rollDie() {
//		random() : 0이상 1미만 난수 발생(실수)
		double x = Math.random() * 6;
//		0~5 의 난수를 1~6까지로 바꿈
		int temp = (int)x + 1;
		return temp;
	}
}