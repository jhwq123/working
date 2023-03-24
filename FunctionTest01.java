package working;

import java.util.Scanner;

public class FunctionTest01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("몇줄 출력?>> ");
		int l = scanner.nextInt();
		
		System.out.print("어떤 기호?>> ");
		String s = scanner.next();
		
		System.out.print("몇개씩 출력?>> ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < l; i++) {
			LinePrint(n, s);
		}
		
		scanner.close();
	}
	
	static void LinePrint(int n, String s) {
		for (int i = 0; i < n; i++) {
			System.out.print(s);			
		}
		System.out.println("");
	}
}
