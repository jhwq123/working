package _studyFin;

import java.util.Scanner;

public class ScoreService {

	Scanner sc = new Scanner(System.in);
	Score[] sList = new Score[10];
	int idx, sel, num, korScore, engScore, matScore; 
	String name;
	
	ScoreService() {
		Score[] sList = new Score[10]; // 예시로 10개만 만들기
		sList[0] = new Score(23, "민수");
		sList[0].setKorScore(72);
		sList[0].setEngScore(80);
		sList[0].setMatScore(56);
		sList[1] = new Score(12, "철수");
		sList[1].setKorScore(89);
		sList[1].setEngScore(54);
		sList[1].setMatScore(83);
		sList[2] = new Score(16, "재민");
		sList[2].setKorScore(89);
		sList[2].setEngScore(54);
		sList[2].setMatScore(83);
		this.sList = sList;
		
	}
	
	void intro() {
		System.out.println("============================");
		System.out.println("=   학생 성적 관리 시스템_1.0v   =");
		System.out.println("============================\n\n");
	}
	
	void mainServe() {
		System.out.println("\n할 일을 입력하세요.");
		System.out.print("1. 성적 생성 / 2. 성적 조회>>");
		sel = sc.nextInt();
		if(sel == 1) {
			System.out.print("\n학생 번호를 입력하세요>>");
			num = sc.nextInt();
			for(int i = 0; i < sList.length; i++) {
				if(sList[i] != null) {
					if(sList[i].getNum() == num) {
						sel = 0;
						System.out.println("이미 있는 학생입니다.");
					}
				}
			}
			if (sel != 0) {
				create(num);				
			}
		} else if (sel == 2) {
			System.out.println("\n조회 내용을 입력하세요.");
			System.out.print("1. 개별 조회 / 2. 전체 조회>>");
			sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("\n학생 번호를 입력하세요>>");
				num = sc.nextInt();
				System.out.println(getOne(num));
			} else if (sel == 2) {
				System.out.println(getAll());
			} else {
				error();
			}
		} else {
			error();
		}
		
	}
	
	void create(int num) {
		idx = Score.idx;
		System.out.print("이름을 입력하세요>>");
		name = sc.next();
		Score temp = new Score(num, name);
		System.out.print("국어점수를 입력하세요>>");
		korScore = sc.nextInt();
		System.out.print("영어점수를 입력하세요>>");
		engScore = sc.nextInt();		
		System.out.print("수학점수를 입력하세요>>");
		matScore = sc.nextInt();
		temp.setKorScore(korScore);
		temp.setEngScore(engScore);
		temp.setMatScore(matScore);
		sList[idx] = temp;
		System.out.println("학생정보가 생성되었습니다.");
		System.out.println(sList[idx].toString());
	}
	
	String getOne(int num) {
		
		for(int i = 0; i < sList.length; i++) {
			if (sList[i] != null) {
				if(sList[i].getNum() == num) {
					return sList[i].toString();
				}
			}
		}
		System.out.println("해당 번호 학생 정보가 없습니다.");	
		return null;
	}
	
	String getAll() {
		String s = "";
		for(int i = 0; i < sList.length; i++) {
			if (sList[i] != null) {
				s += sList[i].toString()+"\n";
			}
		}
		return s;
	}
	
	void error() {
		System.out.println("잘못 입력했습니다.");
	}
	
	
}
