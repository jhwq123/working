package working;

import java.util.Scanner;

public class std_230322 {
	
	public static void main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		int calc = 0;
		int n1 = 0, n2 = 0;
		
		while(true) {
			System.out.println("---계산기 프로그램 V1.0 ---");
			// calc 연산자 받기
			System.out.println("어떤 연산을 할건지 선택하세요.");
			System.out.println("1.덧셈 / 2.뺄셈 / 3.곱셈 / 4.나눗셈");
			System.out.print("선택>>");
			calc = scanner.nextInt();
			// n1 숫자 받기
			System.out.print("연산할 첫번째 수를 입력하세요>>");
			n1 = scanner.nextInt();
			// n2 숫자 받기
			System.out.print("연산할 두번째 수를 입력하세요>>");		
			n2 = scanner.nextInt();
			// 연산 및 결과 출력하기
			System.out.print("연산 결과>>");
			
			if (calc == 1) {
				int result = add(n1, n2);
				System.out.println(result);
			} else if (calc == 2) {
				int result = sub(n1, n2);
				System.out.println(result);
			} else if (calc == 3) {
				int result = mul(n1, n2);
				System.out.println(result);
			} else if (calc == 4) {
				double result = div(n1, n2);
				System.out.println(result);
			}
			
			System.out.println("계속 하시겠습니까? (1:Y/2:N)");
			calc = scanner.nextInt();
			if (calc == 2) {
				break;
			} 
			
			/*
			switch(calc) {
			case 1: // (+)
				break;
			case 2: // (-)
				break;
			case 3: // (*)
				break;
			case 4: // (/
				break;
			}
			*/	
		}
		
		scanner.close();
	}
	
	static int add3(int n) {
		n += 3;
		return n;
	}
	int f() {
		return 10;
	}
	static int add(int a, int b) {
		return a+b;
	}
	static int sub(int a, int b) {
		return a-b;
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static double div(int a, int b) {
		return a/b;
	}
}
