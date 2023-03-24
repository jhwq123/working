package working;

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
		int[][] cnts = {{1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 1, 1, 1},
				{1, 1, 1, 1}};
		
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

/*
 * 코드 알고리즘을 구현하는 것은 자바 수업에서 매우 중요합니다. 이를 위해 다음과 같은 방법을 고려해 볼 수 있습니다.

문제를 이해하고 분석하기: 알고리즘을 구현하기 전에, 문제를 이해하고 필요한 입력, 출력 및 제약 조건 등을 파악해야 합니다. 문제를 명확하게 이해하고 분석한 후에는 문제를 해결할 수 있는 알고리즘을 선택할 수 있습니다.

알고리즘을 선택하고 설계하기: 문제를 이해한 후에는 알고리즘을 선택하고 설계해야 합니다. 이를 위해서는 알고리즘의 시간 복잡도, 공간 복잡도 등을 고려해야 합니다. 일반적으로 시간 복잡도가 낮은 알고리즘이 더 효율적이며, 메모리를 적게 사용하는 알고리즘이 더 효율적입니다.

코드 작성하기: 알고리즘을 선택하고 설계한 후에는 코드를 작성해야 합니다. 이 과정에서는 변수와 함수 등을 사용하여 알고리즘을 구현할 수 있습니다. 코드를 작성할 때는 가독성과 유지보수성을 고려해야 합니다.

코드 테스트하기: 코드를 작성한 후에는 코드를 테스트해야 합니다. 이를 위해서는 입력값을 변경하고 예외 상황을 시뮬레이션하는 등 다양한 테스트 케이스를 작성해야 합니다.

코드 리뷰하기: 코드를 작성하고 테스트한 후에는 다른 사람에게 코드를 검토해 달라고 요청할 수 있습니다. 이를 통해 코드의 문제점을 발견하고 개선할 수 있습니다.

이러한 방법을 고려하여 코드 알고리즘을 구현할 때는 문제를 분석하고 알고리즘을 선택하고 설계하여 코드를 작성하는 것이 중요합니다. 또한, 코드를 테스트하고 리뷰하여 코드의 문제점을 발견하고 개선할 수 있도록 노력해야 합니다.
 */