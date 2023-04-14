package _studyFin;

public class Score {

	static int idx;
	private int num;
	private String name;
	private int KorScore;
	private int EngScore;
	private int MatScore;
	
	Score (int num, String name) {
		this.num = num;
		this.name = name;
		idx++;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return KorScore;
	}

	public void setKorScore(int korScore) {
		KorScore = korScore;
	}

	public int getEngScore() {
		return EngScore;
	}

	public void setEngScore(int engScore) {
		EngScore = engScore;
	}

	public int getMatScore() {
		return MatScore;
	}

	public void setMatScore(int matScore) {
		MatScore = matScore;
	}
	
	int getTotal() {
		return KorScore + EngScore + MatScore;
	}
	
	double getAverage() {
		return getTotal()/(double)3;
	}

	@Override
	public String toString() {
		return "Score [num=" + num + ", name=" + name + ", KorScore=" + KorScore + ", EngScore=" + EngScore
				+ ", MatScore=" + MatScore + ", getTotal()=" + getTotal() + ", getAverage()=" + getAverage() + "]";
	}
	
	
}
