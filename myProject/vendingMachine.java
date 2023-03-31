package myProject;

import java.util.Scanner;

public class vendingMachine {
	public static void main(String[] args) {
		
		String[][] items = {{"마듀", "컨피", "おし", "데자"}, 
				{"실론", "솔눈", "삼다", "밀키"},
				{"아메", "라떼", "모카", "카푸"},
				{"파워", "게토", "이프", "토레"}};
		int[][] prices = {{1000, 1500, 1300, 1000},
				{1000, 1000, 1000, 1000},
				{1500, 1500, 2000, 2000},
				{1500, 1500, 1500, 1500}};
		int[][] cnts = new int[4][4];
		
		Scanner scanner = new Scanner(System.in);
		String choice = "";
		
		printVanding(items, prices, cnts);
		
		System.out.println("금액을 투입하십시오>>");
		int money = scanner.nextInt();
		
		System.out.println("음료를 선택하십시오>>");
		choice = scanner.next();
		
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (choice.equals(items[i][j])) {
					money -= prices[i][j];
					cnts[i][j]--;
				}
			}
		}
		
		System.out.println(money);
		
		// 잔돈 계산 알고리즘 필요
		// 남은 음료가 없으면 멈추기
		
		// 동전 반환 알고리즘 필요
		
		scanner.close();
	}
	
	static void printVanding (String[][] s, int[][] p, int[][] c) {
		
		System.out.println("-----------지멋대로 자판기-----------");
		for (int i = 0; i < 4; i++) { // 4반복
			
			// = <마듀> = <컨피> = <おし> = <데자> =
			System.out.print("=");
			for (int j = 0; j < 4; j++) {
				System.out.print(" <"+s[i][j]+"> =");				
			}
			// =       =       =       =       =
			System.out.println("\n=       =       =       =       =");
			
			// =1000[x]=1500[o]=1300[o]=       =
			System.out.print("=");
			for(int j = 0; j < 4; j++) {
				System.out.print(p[i][j]+"[");
				if(c[i][j] > 0) {
					System.out.print("0");
				} else {
					System.out.print("x");
				}
				System.out.print("]=");
			}
			System.out.println("\n");
		}
	}
	
//	static void 
}