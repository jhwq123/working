package chapter06_3;

import java.util.Scanner;

// 한반에 5명 있다 치고
// 반이 3개 있다 치고
// Student 함수 - 생성 시 값받기(넘버, 이름), 성적받기, 개인 총점및 평균 구하기
//  - 생성 시 값받기(int sno, int name)
//  - 성적 받기 (void setKorScore()...)
//  - 학생 개인 총점 및 평균 구하기 (void getTotal(), getAverage())
//  - 학생 개인 정보 출력하기 (void getInfo())
// StdClass 함수 - 생성 시 학생칸 만들기, 학생들 데이터 받기, 단체 총점 및 단체평균 구하기
//  - 생성 시 학생칸 만들기 (s1.sno = sno; s1.name = name;)
//  - 
//
// School 함수 - 생성 시 교실칸 만들기, 교실들 데이터 받기, 총 총점 및 총평균 구하기
// 
// 반 단위로 특정 함수 입력 시, 각 성적을 입력받아 정리할 수 있도록 하는 기능 추가
// setClassScore

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int flag = 3;
		
		StdClass c1 = new StdClass();
		
		c1.setStudentScore(0, 90, 60, 90, 70, 96);
		c1.setStudentScore(1, 98, 74, 89, 73, 93);
		c1.setStudentScore(2, 65, 80, 69, 75, 56);
		c1.setStudentScore(3, 94, 76, 99, 76, 89);
		c1.setStudentScore(4, 95, 79, 64, 77, 90);
		
		c1.showClassInfo();
		
		System.out.println("<< 학생 성적 관리 프로그램 >>");
		
		while(flag != 0) {
			System.out.println("1. 기본정보 등록 / 2. 학생정보 조회 / 0. 종료");
			System.out.print("작업을 선택하세요>> ");
			flag = scanner.nextInt();
			
			if (flag == 1) {
				; // 학생 정보 입력 함수 + 상황따라 학생 추가
			} else if (flag == 2) {
				; // 학생 정보 조회 함수 시작
			} else if (flag == 0) {
				System.out.println("종료합니다.");
				flag = 0;
			} else {
				System.out.println("비정상적인 값입니다.");
				flag = -1;
			}	
		}
		
		scanner.close();
	}
	
	void addStudentInfo() {
		System.out.println("학생 정보입력을 시작합니다.");
		;
	}
	
	void scanStudentInfo() {
		System.out.println("학생 정보조회를 시작합니다.");
		;
	}
	
}
