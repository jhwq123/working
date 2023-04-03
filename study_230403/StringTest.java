package study_230403;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char[] cList = new char[10];
		String sList = "hectopasca";
		
		for(int i = 0; i < sList.length(); i++) {
			cList[i] = '*';
		}
		
		for(int i = 0; i < sList.length(); i++) {
			System.out.print(cList[i]);			
		}
		
		System.out.print("\n문자를 입력하세요>>");
		String s = scanner.next();
		char c = s.charAt(0);
		
		if (sList.indexOf(c) != -1) {
			cList[sList.indexOf(c)] = c;
		}
		
		for(int i = 0; i < sList.length(); i++) {
			System.out.print(cList[i]);			
		}
		
		scanner.close();
	}
}
