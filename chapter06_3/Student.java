package chapter06_3;

public class Student {

	private int sno;
	private String name;
	
	private int korScore;
	private int engScore;
	private int matScore;
	private int socScore;
	private int sciScore;
	private int total;
	private double average;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	int getSno() {
		return sno;
	}
	
	String getName() {
		return name;
	}
	
	void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	int getKorScore() {
		return korScore;
	}
	
	void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	int getEngScore() {
		return engScore;
	}
	
	void setMatScore(int matScore) {
		this.matScore = matScore;
	}
	int getMatScore() {
		return matScore;
	}
	
	void setSocScore(int socScore) {
		this.socScore = socScore;
	}
	int getSocScore() {
		return socScore;
	}
	
	void setSciScore(int sciScore) {
		this.sciScore = sciScore;
	}
	int getSciScore() {
		return sciScore;
	}
	
	int getTotal() {
		total = korScore + engScore + matScore + socScore + sciScore;
		return total;
	}
	
	double getAverage() {
		average = total/5.0;
		return average;
	}
	
	void showStudentInfo() {
		System.out.println("<학생 단독점수>");
		System.out.println("번호: "+sno+" | 이름: "+name+" | 국어점수: "+korScore+" | 영어점수: "+engScore+" | 수학점수: "+matScore+" | 사회점수: "+socScore+" | 과학점수: "+sciScore+" | 총점: "+total);
	}
}
