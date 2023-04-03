package study_230403;

import java.util.Scanner;

public class PersonTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sel, cnt = 0;
		
		while(true) {
			System.out.print("할 일을 입력하세요(1.사람추가 / 2.조회)>>");
			sel = scanner.nextInt();
			if(sel == 1) {
				// 수정 요
				System.out.println("사람이 추가되었습니다.\n");
			} else if(sel == 2) {
				Person.printPerson();
			} else {
				System.out.println("잘못된 입력.\n");
			}
		}
	}
}
