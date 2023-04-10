package study_fin;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		char c;
		String result;
		
		Calc.intro();
		System.out.print("n1>>");
		n1 = sc.nextInt();
		System.out.print("n2>>");
		n2 = sc.nextInt();
		System.out.print("Oper>>");
		c = sc.next().charAt(0);
		
		result = Calc.oper(n1, n2, c);
		System.out.println(n1+" "+c+" "+n2+" = "+result);
		
		sc.close();
	}
}
