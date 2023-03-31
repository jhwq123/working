package chapter06_4;

import java.util.Scanner;

public class MenuTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----- 계산기 프로그램 -----");

		System.out.println("첫번째 정수를 입력하세요.");
		int num1 = scanner.nextInt();
		
		System.out.println("두번째 정수를 입력하세요.");
		int num2 = scanner.nextInt();
		
		boolean flag = true;
		while(flag) {
			System.out.println("프로그램 실행중......");
			System.out.println("어떤 연산을 할 건가요?");
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈");
			int sel = scanner.nextInt();
			
			// 1일때, 2일때, 3일때, 4일때,
			int result = 0;
			switch(sel) {
			case 1: 
				result = num1+num2;
				System.out.println(num1+" + "+num2+" = "+result);
				break;
			case 2: 
				result = num1-num2; 
				System.out.println(num1+" - "+num2+" = "+result);
				break;
			case 3: 
				result = num1*num2; 
				System.out.println(num1+" * "+num2+" = "+result);
				break;
			case 4: 
				result = num1/num2; 
				System.out.println(num1+" / "+num2+" = "+result);
				break;
			}
					
			System.out.println("계속 하시겠습니까? (1:계속 | 0:그만)");
			sel = scanner.nextInt();
			if(sel == 0) {
				flag = false;
			}
		}	
		scanner.close();
	}
}
