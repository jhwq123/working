package chapter06_3;

import java.util.Scanner;

public class StdClass {

	Student[] member;
	private int classTotal;
	
	public StdClass() {
		this.member = new Student[5];
		member[0] = new Student(1, "민준");
		member[1] = new Student(2, "서준");
		member[2] = new Student(3, "도윤");
		member[3] = new Student(4, "예준");
		member[4] = new Student(5, "시우");
	}
	
	void addStudent() {
		
	}
	
	void setStudentScore(int sno, int korScore, int engScore, int matScore, int socScore, int sciScore) {
		System.out.println("<"+(sno+1)+"번 "+member[sno].getName()+"학생 점수를 세팅합니다.>");
		member[sno].setKorScore(korScore);
		member[sno].setEngScore(engScore);
		member[sno].setMatScore(matScore);
		member[sno].setSocScore(socScore);
		member[sno].setSciScore(sciScore);
		System.out.print("국어성적: "+member[sno].getKorScore()+
				" | 영어성적: "+member[sno].getEngScore()+
				" | 수학성적: "+member[sno].getMatScore()+
				" | 사회성적: "+member[sno].getSocScore()+
				" | 과학성적: "+member[sno].getSciScore()+
				" | 총점: "+member[sno].getTotal()+
				" | 평균: "+member[sno].getAverage()+"\n");
	}
	
	int getClassTotal() {
		for (int i = 0; i < 5; i++) {
			classTotal += member[i].getTotal();
		}
		return classTotal;
	}
	
	double getClassAverage() {
		return classTotal/25;
	}
	
	void showClassInfo() {
		System.out.print("번호:   \t");
		for(int i = 0; i < 5; i++) {	
			System.out.print((i+1)+"\t");
		}
		
		System.out.print("\n이름:  \t");
		for(int i = 0; i < 5; i++) {
			System.out.print(member[i].getName()+"\t");
		}
		
		System.out.print("\n국어점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(member[i].getKorScore()+"\t");
		}
		
		System.out.print("\n영어점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(member[i].getEngScore()+"\t");
		}
		
		System.out.print("\n수학점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(member[i].getMatScore()+"\t");
		}
		
		System.out.print("\n사회점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(member[i].getSocScore()+"\t");
		}
		
		System.out.print("\n과학점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(member[i].getSciScore()+"\t");
		}
		
		System.out.print("\n총점:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(member[i].getTotal()+"\t");
		}
		
		System.out.print("\n평균:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(member[i].getAverage()+"\t");
		}
		
		System.out.print("\n반 총점: "+getClassTotal());
		
		
		System.out.print("\n반 평균:\t"+getClassAverage());
	}
	
	void setClassScore() { //추가 필요, 사용 불가
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("<"+member[i].getSno()+"번 "+member[i].getName()+"학생 점수를 세팅합니다.>");
			System.out.print("국어성적>>");		
		}
		
		scanner.close();
	}
	
	
	
}
