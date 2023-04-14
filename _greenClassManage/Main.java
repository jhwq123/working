package _greenClassManage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0; // 수강신청 배열데이터 카운트값
		int sel = 0; // 입력받는 sel
		int flag = -1; // 사용자 확인값
		int idx = 0; // 학생 idx값
		String id = "", pw = ""; // 입력받는 id, pw
		
		ArrayList<HumanVO> hList = new ArrayList<HumanVO>();
		ManagerVO[] mList = new ManagerVO[5];
		TeacherVO[] tList = new TeacherVO[5];
		StudentVO[] sList = new StudentVO[5];
		
//		Human temp = new Student("철수", 29);
//		sList[0] = (Student) temp;
		// 수업 신청서 양식 데이터
		String[] sugang = {"JAVA,민식,34,Y", "JAVA,영희,27,N", "SPRING,규식,30,Y"};
		
		// 관리자 데이터 미리 설정
		ManagerVO manager = new ManagerVO("철수", 30);
		manager.setId("admin");
		manager.setPw("1234");
		manager.setDepart("실장");
		manager.setRank("주임");
		manager.setMoney(1200000);
		manager.setBonus(500000);
		mList[0] = manager;
//		ClassService.setHuman(manager);

		// 선생 데이터 미리 설정
//		temp = new TeacherVO("승호", 40);
//		tList[0] = (TeacherVO) temp;
//		tList[0].setSub("JAVA");
//		tList[0].setMoney(2500000);
//		tList[0].setBonus(1000000);
		
		
		System.out.println("=====================");
		System.out.println("= 성적관리 프로그램 V1.3 =");
		System.out.println("=====================");
		
		System.out.println("로그인이 필요합니다. 로그인 해주세요");
		System.out.print("아이디를 입력하세요>>");
		id = sc.next();
		System.out.print("비밀번호를 입력하세요>>");
		pw = sc.next();
		
//		flag = ClassService.login(id, pw, hList);
		if(flag == 0) {
			// 관리자군
			
			while(true) {
				System.out.println("\n"+manager.getName()+" 관리자님 환영합니다.");
				System.out.println("= 1. 등록 / 2. 조회 =");
				System.out.print("할 일을 입력하세요>>");
				sel = sc.nextInt();
				
				if (sel == 1) {				
					System.out.println("\n정보를 등록합니다.");
					System.out.println("= 1. 선생 / 2. 학생 =");
					System.out.print("할 일을 입력하세요>>");
					sel = sc.nextInt();
					
					if (sel == 1) {
						// 선생등록
						System.out.println("\n선생을 생성합니다.");
//						hList[1] = ClassService.create((TeacherVO) hList[1]);
					} else if (sel == 2) {
						// 학생등록
						System.out.println("\n학생을 생성합니다.");
						System.out.println("수강신청서 데이터를 받아옵니다.");
						String[] temp = sugang[cnt].split(",");
						StudentVO s = new StudentVO(temp[1], Integer.parseInt(temp[2]));
						s.setSub(temp[0]);
						s.setMajor(temp[3]);
//						hList[idx+2] = s;
						idx++;
						System.out.println("등록이 완료되었습니다.");
//						hList[flag] = Crud.create((Student) hList[flag]);
					} else {
//						ClassService.error();
					}
					
					
				} else if (sel == 2) {
					System.out.println("\n정보를 조회합니다.");
					System.out.println("= 1. 내정보 / 2. 선생 / 3. 학생 =");
					System.out.print("할 일을 입력하세요>>");
					sel = sc.nextInt();
					
					if (sel == 1) {
						// 내정보
						System.out.println("\n내 정보를 조회합니다.");
//						ClassService.read(hList[0]);
					} else if (sel == 2) {
						// 선생 조회
						System.out.println("\n선생님의 정보를 조회합니다.");
//						ClassService.read(hList[1]);
					} else if (sel == 3) {
						// 학생 조회
						System.out.println("= 1. 학생 전체 조회 / 2. 학생 개별 조회 =");
						System.out.print("할 일을 입력하세요>>");
						sel = sc.nextInt();
						if (sel == 1) {
							
						} else if (sel == 2) {
							System.out.println("학생 번호를 입력하세요.");
							sel = sc.nextInt();
							System.out.println("학생의 정보를 조회합니다.");
							
						} else {
							
						}
						
//						ClassService.read((StudentVO)hList[idx+1]);	
					} else {
//						ClassService.error();
					}
					
				} else {
//					ClassService.error();
				}
				
			}
			
		} else if (flag == 1) {
			// 쌤이군
			while(true) {
//				System.out.println("\n"+teacher.getName()+" 선생님 환영합니다.");
				System.out.println("= 1. 학생 조회  =");
				System.out.println("할 일을 입력하세요>>");
				sel = sc.nextInt();
				if (sel == 1) {
					System.out.println("\n정보를 조회합니다.");
					System.out.println("= 1. 내정보 / 2. 학생 =");
					System.out.print("할 일을 입력하세요>>");
					sel = sc.nextInt();
					
					if (sel == 1) {
						// 선생 조회
						System.out.println("\n내 정보를 조회합니다.");
//						ClassService.read(hList[1]);	
					} else if (sel == 2) {
						// 학생 조회
						System.out.println("\n학생의 정보를 조회합니다.");
//						ClassService.read(hList[idx+1]);	
					} else {
//						ClassService.error();
					}
				} else {
//					ClassService.error();
				}
			}
			
			
		} else {
			// 학생이군
			while(true) {
//				System.out.println("\n"+hList[idx+1].getName()+" 학생 환영합니다.");
				System.out.println("정보를 조회합니다.");
				System.out.println("= 1. 학생  =");
				System.out.println("할 일을 입력하세요>>");
				sel = sc.nextInt();
				if (sel == 1) {
					// 학생 조회
					System.out.println("\n내 정보를 조회합니다.");
//					ClassService.read(hList[idx+1]);	
				} else {
//					ClassService.error();
				}
			}
			
		}
		
	}	
}
