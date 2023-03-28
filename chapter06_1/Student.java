package chapter06_1;

public class Student {

	private int sno;
	private String name;
	
	private int kor_score;
	private int eng_score;
	private int math_score;
	private int total;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	void setKor_score(int kor_score) {
		this.kor_score = kor_score;
	}
	
	int getKor_score() {
		return kor_score;
	}
	
	void setEng_score(int eng_score) {
		this.eng_score = eng_score;
	}
	
	int getEng_score() {
		return eng_score;
	}
	
	void setMath_score(int math_score) {
		this.math_score = math_score;
	}
	
	int getMath_score() {
		return math_score;
	}
	
	void setTotal() {
		total = kor_score + eng_score + math_score;
	}
	
	void showStudentInfo() {
		System.out.println("번호: "+sno+" | 이름: "+name+" | 국어점수: "+kor_score+" | 영어점수: "+eng_score+" | 수학점수: "+math_score+" | 총점: "+total);
	}
}
