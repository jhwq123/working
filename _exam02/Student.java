package _exam02;

public class Student {
	
	private int idx;
	private int num;
	private String name;
	
	private int korScore;
	private int engScore;
	private int matScore;
	private String id;
	private String pw;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	void setIdx(int idx) {
		this.idx = idx;
	}
	
	int getNum() {
		return num;
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

	void setId(String id) {
		this.id = id;
	}
	String getId() {
		return id;
	}

	void setPw(String pw) {
		this.pw = pw;
	}
	String getPw() {
		return pw;
	}
	
	
	
	int getTotal() {
		return (korScore + engScore + matScore);
	}
	
	double getAverage() {
		return getTotal()/3.0;
	}
	
	
}
