package study_230404;

import java.util.Scanner;

public class AdminTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<XX관리 프로그램을 시작합니다.>");
		System.out.print("아이디를 입력하세요>>");
		String id = sc.next();
		System.out.print("패스워드를 입력하세요>>");
		String ps = sc.next();
		
		Admin.verify(id, ps);
		if(Admin.getManage()) {
			System.out.println("\n<XX관리 프로그램-관리자모드>");
			System.out.print("할일을 입력하세요(1.조회/2.삭제)>>");
			int sel = sc.nextInt();			
		}

		sc.close();
	}
	
}
