package chapter06;

// class로 학생 이름 출력
// 학생 배열 만들기, 

public class Student {
	
	int number;
	String name;
	int korScore;
	int javScore;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	void setJavScore(int javScore) {
		this.javScore = javScore;
	}
	
	int getTotal() {
		return korScore + javScore;
	}
	
	double getAverage() {
		int total = getTotal();
		return total/2;
	}
	
	void showStudentInfo() {
		System.out.print("번호: "+number+"\t이름: "+name+"\t국어점수: "+korScore+"\t자바점수: "+javScore+"\t총점: "+getTotal()+"\t평균: "+getAverage()+"\n");
		// 번호 이름 국어 자바 총점 평균
	}
	
}
