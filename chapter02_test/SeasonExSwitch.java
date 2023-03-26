package chapter02_test;

import java.util.Scanner;

public class SeasonExSwitch {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scanner.nextInt();
		String season = "";
		
		switch (month) {
			case 3: case 4: case 5:
				season = "봄";
				break;
			case 6: case 7: case 8:
				season = "여름";
				break;
			case 9: case 10: case 11:
				season = "가을";
				break;
			case 12: case 2: case 1:
				season = "겨울";
				break;
			default:
				season = "잘못입력";
				break; // 여긴 생략가능, 어짜피 끝나기 때문에
		}
		
		System.out.println(season);
		
		scanner.close();
	}
}