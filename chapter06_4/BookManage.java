package chapter06_4;

import java.util.Scanner;

public class BookManage {

	private BookMaker[] bookList;
	private int idx = 0;
	
	public BookManage(int list) {
		this.bookList = new BookMaker[list]; //2
	}
	
	BookMaker getBook(int index) {
		return bookList[index];
	}
	
	void addBook() {
		Scanner scanner = new Scanner(System.in);

		if(idx >= bookList.length) {
			BookMaker[] tempList = new BookMaker[idx+1];
			for (int i = 0; i < idx; i++) {
				tempList[i] = this.bookList[i];				
			}
			this.bookList = tempList;
		} 
		bookList[idx] = new BookMaker(0, ""); //3
		
		System.out.println(idx+"번째 책 정보를 추가합니다.");
		bookList[idx].setNum(idx);

		System.out.println("제목을 입력하세요");
		String title = scanner.nextLine();
		bookList[idx].setTitle(title);

		System.out.println("부제를 입력하세요");
		String subTitle = scanner.nextLine();
		bookList[idx].setSubTitle(subTitle);

		System.out.println("글쓴이를 입력하세요");
		String author = scanner.next();
		bookList[idx].setAuthor(author);

		System.out.println("연도를 입력하세요");
		int year = scanner.nextInt();
		bookList[idx].setYear(year);

		System.out.println("출판사를 입력하세요");
		String publish = scanner.next();
		bookList[idx].setPublish(publish);

		System.out.println("가격을 입력하세요");
		int price = scanner.nextInt();
		bookList[idx].setPrice(price);
		
		System.out.println("입력이 완료되었습니다.");
		System.out.println(bookList[idx].getNum()+" | "+
		bookList[idx].getTitle()+" | "+bookList[idx].getSubTitle()+" | "+
		bookList[idx].getAuthor()+" | "+bookList[idx].getYear()+" | "+
		bookList[idx].getPublish()+" | "+bookList[idx].getPrice());
		
		idx++;
	}
	
	void delBook() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇번째 책을 지우시겠습니까?");
		int num = scanner.nextInt();
		System.out.println("해당 책 이름: "+getBook(num).getTitle());
		
		System.out.println("해당 책의 내용을 지우겠습니까? (1:예 / 0:아니오)");
		int sel  = scanner.nextInt();
		
		if (sel == 1) {
			System.out.println("해당 작업은 되돌릴 수 없습니다. 진행하시겠습니까? (1:예 / 0:아니오)");
			sel = scanner.nextInt();
			
			if (sel == 1) {
				BookMaker[] tempList = new BookMaker[idx-1];
				
				for (int i = 0, j = 0; i < idx-1; i++, j++) {
					if (i == num) {
						j++;
					}						
					tempList[i] = this.bookList[j];
					tempList[i].setNum(i);
				}
				this.bookList = tempList;
				idx--;
				
				System.out.println("완료되었습니다.");
			}
		}
	}
	
	void modBook() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("책 번호를 입력하세요");
		int num = scanner.nextInt();
		System.out.println("해당 책 이름: "+getBook(num).getTitle());
		
		System.out.println("해당 책의 내용을 수정하겠습니까? (1:예 /2:아니오)");
		int sel  = scanner.nextInt();
		
		if (sel == 1) {
			System.out.println(num+"번째 책 정보를 수정합니다.");
			bookList[num].setNum(num);

			System.out.println("제목을 입력하세요");
			String title = scanner.nextLine();
			title = scanner.nextLine();
			bookList[num].setTitle(title);

			System.out.println("부제를 입력하세요");
			String subTitle = scanner.nextLine();
			bookList[num].setSubTitle(subTitle);

			System.out.println("글쓴이를 입력하세요");
			String author = scanner.next();
			bookList[num].setAuthor(author);

			System.out.println("연도를 입력하세요");
			int year = scanner.nextInt();
			bookList[num].setYear(year);

			System.out.println("출판사를 입력하세요");
			String publish = scanner.next();
			bookList[num].setPublish(publish);

			System.out.println("가격을 입력하세요");
			int price = scanner.nextInt();
			bookList[num].setPrice(price);
			
			System.out.println("입력이 완료되었습니다.");
			System.out.println(bookList[num].getNum()+" | "+
			bookList[num].getTitle()+" | "+bookList[num].getSubTitle()+" | "+
			bookList[num].getAuthor()+" | "+bookList[num].getYear()+" | "+
			bookList[num].getPublish()+" | "+bookList[num].getPrice());
			
		}
	}
	
	void showTotalInfo() {
		
		System.out.println("=========== 책 리스트 ===========");
		System.out.println("번호\t | 제목\t | 부제\t | 글쓴이\t | 연도\t | 출판사\t | 가격 | ");
		for(int i = 0; i < idx; i++) {
			bookList[i].showInfo();
		}
		System.out.println("============= 끗 ==============");
	}
}
