package greenClass;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		// 연쇄 상속 이용해보자.
		// Human -> manager -> teacher -> student
		
		Scanner sc = new Scanner(System.in);
		int sel = 0, flag = -1, cnt = 0, idx = 0;
		String id = "", pw = "";
		Human[] hList = new Human[5];
		Student[] sList = new Student[3];
		String[] sugang = {"JAVA,민식,34,Y", "JAVA,영희,27,N", "SPRING,규식,30,Y"}; 

		Manager manager = new Manager("철수", 30);
		manager.setDepart("실장");
		manager.setRank("주임");
		manager.setMoney(1200000);
		manager.setBonus(500000);
		hList[0] = manager;
		hList[0].setId("admin");
		hList[0].setPw("1234");

		Teacher teacher = new Teacher("승호", 40);
		teacher.setSub("JAVA");
		teacher.setMoney(2500000);
		teacher.setBonus(1000000);
		hList[1] = teacher;
		
		
		
		System.out.println("=====================");
		System.out.println("= 성적관리 프로그램 V1.3 =");
		System.out.println("=====================");
		
		System.out.println("로그인이 필요합니다. 로그인 해주세요");
		System.out.print("아이디를 입력하세요>>");
		id = sc.next();
		System.out.print("비밀번호를 입력하세요>>");
		pw = sc.next();
		
		flag = Crud.login(id, pw, hList);
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
						hList[1] = Crud.create((Teacher) hList[1]);
					} else if (sel == 2) {
						// 학생등록
						System.out.println("\n학생을 생성합니다.");
						System.out.println("수강신청서 데이터를 받아옵니다.");
						String[] temp = sugang[cnt].split(",");
						Student s = new Student(temp[1], Integer.parseInt(temp[2]));
						s.setSub(temp[0]);
						s.setMajor(temp[3]);
						sList[idx] = s;
						idx++;
						System.out.println("등록이 완료되었습니다.");
//						hList[flag] = Crud.create((Student) hList[flag]);
					} else {
						Crud.error();
					}
					
					
				} else if (sel == 2) {
					System.out.println("\n정보를 조회합니다.");
					System.out.println("= 1. 내정보 / 2. 선생 / 3. 학생 =");
					System.out.print("할 일을 입력하세요>>");
					sel = sc.nextInt();
					
					if (sel == 1) {
						// 내정보
						System.out.println("\n내 정보를 조회합니다.");
						Crud.read(sList[0]);	
					} else if (sel == 2) {
						// 선생 조회
						System.out.println("\n선생님의 정보를 조회합니다.");
						Crud.read(sList[1]);	
					} else if (sel == 3) {
						// 학생 조회
						System.out.println("\n학생의 정보를 조회합니다.");
						Crud.read((Student)sList[idx-1]);	
					} else {
						Crud.error();
					}
					
				} else {
					Crud.error();
				}
				
			}
			
		} else if (flag == 1) {
			// 쌤이군
			while(true) {
				System.out.println("\n"+teacher.getName()+" 선생님 환영합니다.");
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
						Crud.read(sList[1]);	
					} else if (sel == 2) {
						// 학생 조회
						System.out.println("\n학생의 정보를 조회합니다.");
						Crud.read(sList[flag]);	
					} else {
						Crud.error();
					}
				} else {
					Crud.error();
				}
			}
			
			
		} else {
			// 학생이군
			while(true) {
				System.out.println("\n"+sList[flag].getName()+" 학생 환영합니다.");
				System.out.println("정보를 조회합니다.");
				System.out.println("= 1. 학생  =");
				System.out.println("할 일을 입력하세요>>");
				sel = sc.nextInt();
				if (sel == 1) {
					// 학생 조회
					System.out.println("\n내 정보를 조회합니다.");
					Crud.read(sList[flag]);	
				} else {
					Crud.error();
				}
			}
			
		}
		
	}	
}
