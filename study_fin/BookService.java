package study_fin;

import java.util.Scanner;

public class BookService {
	Scanner sc = new Scanner(System.in);
	BookVO[] bList;
	int sel, num, idx, newNum;
	String name, author, publish;
	
	BookService() {
		BookVO[] bList = new BookVO[3]; // 샘플 3개 생성하고 시작 (맨땅)
		this.bList = bList;
	}
	
	void intro() {
		System.out.println("============================");
		System.out.println("=  도서 정보 관리 프로그램_1.0v   =");
		System.out.println("============================\n\n");
	}
	
	void mainLib() {
		System.out.println("\n할 일을 입력하세요.");
		System.out.print("1.책 생성 / 2.책 조회 / 3.책 수정 / 4.책 삭제>>");
		sel = sc.nextInt();
		switch(sel) {
		case 1:
			// Create
			System.out.print("\n책 번호를 입력하세요>>");
			num = sc.nextInt();
			createBook(num);
			break;
		case 2:
			// Read 내용
			System.out.println("\n조회 내용을 입력하세요.");
			System.out.print("1.개별 조회 / 2.전체 조회>>");
			sel = sc.nextInt();
			if (sel == 1) {
				System.out.print("\n책 번호를 입력하세요>>");
				num = sc.nextInt();
				System.out.println(readBook(num));
			} else if (sel == 2) {
				System.out.println(readBook());
			} else {
				error();
			}
			break;
		case 3:
			// update 내용
			System.out.print("\n책 번호를 입력하세요>>");
			num = sc.nextInt();
			updateBook(num);
			break;
		case 4:
			// delete 내용
			System.out.print("\n책 번호를 입력하세요>>");
			num = sc.nextInt();
			deleteBook(num);
			break;
		default:
			error();
			break;
		}
	}
	
	boolean dublicate(int num) {
		for(int i = 0; i < bList.length; i++) {
			if(bList[i] != null) {
				if(bList[i].getNum() == num) {
					System.out.println("책을 발견했습니다.");
					System.out.println(bList[i].toString());
					idx = i;
					return true;
				}
			}
		}
		return false;
	}
	
	void createBook(int num) {
		// 책 중복 사전 확인
		if (!dublicate(num)) {
			// 등록
			System.out.println("새로운 책을 등록합니다.");
			idx = BookVO.getIdx();
			System.out.print("제목을 입력하세요>>");
			name = sc.next();
			BookVO temp = new BookVO(num, name);
			System.out.print("글쓴이를 입력하세요>>");
			author = sc.next();
			System.out.print("출판사를 입력하세요>>");
			publish = sc.next();	
			temp.setAuthor(author);
			temp.setPublish(publish);
			
			// 배열 길이 자동 증가
			if (idx > bList.length) { // 하나 더 추가
				BookVO[] bTemp = new BookVO[bList.length+1];
				for(int i = 0; i < bList.length; i++) {
					bTemp[i] = bList[i];
				}
				bList = bTemp;
			}
			bList[idx] = temp;
			System.out.println("책 정보가 생성되었습니다.");
			System.out.println(bList[idx].toString());
		}
		
	}
	
	String readBook(int num) {
		for(int i = 0; i < bList.length; i++) {
			if (bList[i] != null) {
				if(bList[i].getNum() == num) {
					return bList[i].toString();
				}
			}
		}
		System.out.println("해당 번호 책이 없습니다.");	
		return null;
	}
	
	String readBook() {
		String s = "";
		for(int i = 0; i < bList.length; i++) {
			if (bList[i] != null) {
				s += bList[i].toString()+"\n";
			}
		}
		return s;
	}
	
	void updateBook(int num) {
		// 책 중복 사전 확인
		if (dublicate(num)) {
			System.out.println("수정 내용을 입력하세요.");
			System.out.print("1.전체 수정 / 2.부분 수정>>");
			sel = sc.nextInt();
			if (sel == 1) {
				System.out.println("전체 수정을 시작합니다.");
				System.out.print("번호를 입력하세요>>");
				newNum = sc.nextInt();
				bList[idx].setNum(newNum);				
				System.out.print("제목을 입력하세요>>");
				name = sc.next();
				bList[idx].setName(name);
				System.out.print("글쓴이를 입력하세요>>");
				author = sc.next();
				bList[idx].setAuthor(author);
				System.out.print("출판사를 입력하세요>>");
				publish = sc.next();					
				bList[idx].setPublish(publish);
				
			} else if (sel == 2) {
				System.out.println("부분 수정을 시작합니다. 할 일을 선택하세요");
				System.out.print("1.번호 / 2.제목 / 3.글쓴이 / 4.출판사>>");
				sel = sc.nextInt();
				switch(sel) {
				case 1: // 번호 수정
					System.out.print("번호를 입력하세요>>");
					newNum = sc.nextInt();
					bList[idx].setNum(newNum);			
					break;
				case 2: // 제목 수정
					System.out.print("제목을 입력하세요>>");
					name = sc.next();
					bList[idx].setName(name);
					break;
				case 3: // 글쓴이 수정
					System.out.print("글쓴이를 입력하세요>>");
					author = sc.next();
					bList[idx].setAuthor(author);
					break;
				case 4: // 출판사 수정
					System.out.print("출판사를 입력하세요>>");
					publish = sc.next();					
					bList[idx].setPublish(publish);
					break;
				default:
					error();
					break;
				}
			} else {
				error();
			}
			System.out.println("책 정보가 수정되었습니다.");
			System.out.println(bList[idx].toString());
		}
	}
	
	void deleteBook(int num) {
		if (dublicate(num)) {
			
			
			
		}
	}
	
	void error() {
		System.out.println("잘못 입력했습니다.");
	}
	
}
