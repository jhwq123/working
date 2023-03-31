package chapter06_4;

import java.util.Scanner;

public class BookManageTest {
	public static void main(String[] args) {
		
		boolean flag = true;
		int sel = 0;
		Scanner scanner = new Scanner(System.in);
		BookManage bookList = new BookManage(3); //1
		System.out.println("=======책 관리 프로그램========\n");
		
		while(flag) {
			
			System.out.println("작업을 선택하세요");
			System.out.println("< 1:등록 | 2:수정 | 3:제거 | 4:조회 >");
			sel = scanner.nextInt();
			if (sel < 0 || sel > 4) {
				
			}
			
			switch(sel) {
			case 1:
				bookList.addBook();
				break;
			case 2:
				bookList.modBook();
				break;
			case 3:
				bookList.delBook();
				break;
			case 4:
				bookList.showTotalInfo();
				break;
			}
			
			System.out.println("계속 하시겠습니까?");
			System.out.println("< 1:예 | 0:아니오 >");
			sel = scanner.nextInt();
			if(sel == 0) {
				flag = false;
			}
		}
		
		scanner.close();
		
	}
}
