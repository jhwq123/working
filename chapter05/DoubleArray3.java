package chapter05;

import java.util.Scanner;
import java.util.Random;

public class DoubleArray3 {
	// 2차 배열 문제3

	public static void main(String[] args) {

		/*
		 * 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 9를 찾아보세요... (3개?)
		 * 
		 * 행 좌표 입력: 4 열 좌표 입력: 3
		 * 
		 * [1] 거기엔 없습니다.. [2] 맞췄습니다!!
		 * 
		 * 끝나면 End
		 */

		// 1. 2차원배열(5행5열을 준비하자)
		// 2. 배열에 9를 넣자(3개 --> 일단 1개만 넣어보자)
		// 3. 입력을 받아서 9가있는 배열인지 비교해보자
		// 4. 
		Scanner scanner = new Scanner(System.in);

		int[][] land = new int[5][5];
		int[][] tempLand = new int[5][5];
		int row, col;
		int cnt = 3;
		int score = 100;
		
		// tempLand 0으로 초기화
		for (int i = 0; i < tempLand.length; i++) {
			for (int j = 0; j < tempLand[i].length; j++) {
				tempLand[i][j] = 0;
			}
		}
		
		System.out.println("<<<9 찾기 게임>>>");
		System.out.println("초기점수 100, 틀리면 5점 감점");
		land = autoLand(land);
		System.out.println("맵이 생성되었습니다.\n");
		
		while(true) {
			printLand(tempLand);
			
			if(cnt <= 0) {
				System.out.println("남은 9의 개수를 모두 찾았습니다.");
				System.out.println("달성 점수: "+score);
				if (score <= 30) {
					System.out.println("개못하시네요...");
				}
				break;
			} else {
				System.out.println("남은 9의 개수: "+cnt+"개");			
				System.out.println("현재 점수: "+score+"점");			
				System.out.println("==============");			
			}
			
			System.out.print("행 좌표 입력(0~4): ");
			row = scanner.nextInt();
			while(row < 0 || row > 4 ) {
				System.out.println("맞는 범위 값을 다시 입력하십시오.\n");
				System.out.print("행 좌표 입력(0~4): ");
				row = scanner.nextInt();
			}
			
			System.out.print("열 좌표 입력(0~4): ");
			col = scanner.nextInt();
			while(col < 0 || col > 4 ) {
				System.out.println("맞는 범위 값을 다시 입력하십시오.\n");
				System.out.print("열 좌표 입력(0~4): ");
				col = scanner.nextInt();
			}
			
			if(tempLand[row][col] > 0) {
				System.out.println("이미 선택했습니다. 다시 선택하세요.");
			} else if(land[row][col] == 9) {
				System.out.println("맞췄습니다!!");
				tempLand[row][col] = 9;
				cnt--;
			} else if(land[row][col] == 0) {
				System.out.println("거기엔 없습니다..");
				tempLand[row][col] = 1;
				score -= 5;
			}

		}
		
		scanner.close();
	}

	static int[][] autoLand (int[][] land) {
		
		Random random = new Random();
		
		for (int i = 0; i < 3; i++) {
			int ran1 = random.nextInt(5);
			int ran2 = random.nextInt(5);
			if (land[ran1][ran2] != 9) {
				land[ran1][ran2] = 9;			
			} else {
				i--;
			}
		}
		int[][] map = land;
		return map;
		
	}
	
	static void printLand (int[][] tempLand) {
		System.out.println("=========");
		for (int i = 0; i < tempLand.length; i++) {
			for (int j = 0; j < tempLand[i].length; j++) {
				System.out.print(tempLand[i][j]+"");
			}
			System.out.println("");
		}
		System.out.println("=========");

	}
}
