package exam02;

import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sel = 0, num = 0, flag = 0, score = 0;
		String id = "", pw = "", name = "";
		StdFunction sFunc = new StdFunction(3);
		
//		if(result == 1) {
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");			
//		}
		
		sFunc.addStudent(22, "철수");
		sFunc.sList[0].setKorScore(96);
		sFunc.sList[0].setEngScore(84);
		sFunc.sList[0].setMatScore(72);
		sFunc.addStudent(11, "영희");
		sFunc.sList[1].setKorScore(97);
		sFunc.sList[1].setEngScore(85);
		sFunc.sList[1].setMatScore(74);
		sFunc.addStudent(24, "바둑");
		sFunc.sList[2].setKorScore(91);
		sFunc.sList[2].setEngScore(84);
		sFunc.sList[2].setMatScore(78);
		
		System.out.println("========================");
		System.out.println("= 학생 성적 관리 시스템 V1.0 =");
		System.out.println("========================");
		
		while(true) {
			System.out.println("\n\n1. 로그인 / 2. 아이디만들기");
			System.out.print("메뉴를 선택하세요>>");
			sel = sc.nextInt();
			System.out.println("");
			
			if (sel == 1) {
				// 로그인 진입
				System.out.println("로그인이 필요합니다.");
				System.out.print("아이디를 입력하세요>>");
				id = sc.next();
				System.out.print("패스워드를 입력하세요>>");
				pw = sc.next();
				flag = Login.loginCheck(sFunc.sList, id, pw);
				if (flag == -1) {
					// 관리자 로그인 실행
					System.out.println("\nAdmin님 안녕하세요.\n");
					System.out.println("\n1. 학생추가 / 2. 전체조회");
					System.out.print("메뉴를 선택하세요>>");
					sel = sc.nextInt();
					if(sel == 1) {
						// 학생 추가
						System.out.println("\n학생을 추가합니다.\n");
						System.out.println("번호를 입력하세요");
						num = sc.nextInt();
						System.out.println("이름을 입력하세요");
						name = sc.next();
						sFunc.addStudent(num, pw);
						System.out.println("국어점수를 입력하세요");
						score = sc.nextInt();
						
						System.out.println("국어점수를 입력하세요");
					} else if (sel == 2) {
						// 전체 조회
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
					
				} else if (flag != -2) {
					// 학생 로그인 실행
					System.out.println("\n"+sFunc.sList[flag].getName()+"님 안녕하세요.");
					System.out.println("\n1. 내성적 조회");
					System.out.print("메뉴를 선택하세요>>");
					sel = sc.nextInt();
					if(sel == 1) {
						// 내성적 조회
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
					
				} else {
					System.out.println("아이디 또는 패스워드가 잘못되었습니다.");
				}
			} else if (sel == 2) {
				// 아이디 만들기
				System.out.println("계정을 생성합니다.");			
				System.out.print("학생 번호를 입력하세요>>");
				num = sc.nextInt();
				if(sFunc.getStudent(num).getId() != "") {
					System.out.print("아이디를 입력하세요>>");
					id = sc.next();
					System.out.print("패스워드를 입력하세요>>");
					pw = sc.next();
					Login.addAccount(sFunc.getStudent(num), id, pw);
					System.out.println("생성 완료되었습니다.");				
				} else {
					System.out.println("이미 아이디가 있습니다.");
				}
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
}
