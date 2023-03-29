package chapter06_1;

public class StudentEx {

	private int sno;
	private String[] name = new String[5];
	private int[] korScore = new int[5];
	private int[] engScore = new int[5];
	private int[] matScore = new int[5];
	private int[] socScore = new int[5];
	private int[] sciScore = new int[5];
	private int[] total = new int[5];
	private double[] average = new double[5];
	
	public StudentEx() {
		this.sno = 0;
	}
	
	void setSno(int sno) {
		this.sno = sno;
	}
	int getSno(int son) {
		return sno;
	}
	
	void setName(int sno, String name) {
		this.name[sno] = name;
	}
	String getName(int sno) {
		return name[sno];
	}
	
	void setKorScore(int son, int korScore) {
		this.korScore[sno] = korScore;
	}
	int getKorScore(int son) {
		return korScore[sno];
	}
	
	void setEngScore(int son, int engScore) {
		this.engScore[sno] = engScore;
	}
	int getEngScore(int son) {
		return engScore[sno];
	}
	
	void setMatScore(int son, int matScore) {
		this.matScore[sno] = matScore;
	}
	int getMatScore(int son) {
		return matScore[sno];
	}
	
	void setSocScore(int son, int socScore) {
		this.socScore[sno] = socScore;
	}
	int getSocScore(int son) {
		return socScore[sno];
	}
	
	void setSciScore(int son, int sciScore) {
		this.sciScore[sno] = sciScore;
	}
	int getSciScore(int son) {
		return sciScore[sno];
	}
	
	int getTotal(int sno) {
		total[sno] = korScore[sno] + engScore[sno] + matScore[sno] + 
				socScore[sno] + sciScore[sno];
		return total[sno];
	}
	
	double getAverage(int sno) {
		average[sno] = getTotal(sno)/5.0;
		return average[sno];
	}
	
	void showInfo() {
		
		System.out.print("번호:   \t");
		for(int i = 0; i < 5; i++) {	
			System.out.print((i+1)+"\t");
		}
		
		System.out.print("\n이름:  \t");
		for(int i = 0; i < 5; i++) {
			System.out.print(name[i]+"\t");
		}
		
		System.out.print("\n국어점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(korScore[i]+"\t");
		}
		
		System.out.print("\n영어점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(engScore[i]+"\t");
		}
		
		System.out.print("\n수학점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(matScore[i]+"\t");
		}
		
		System.out.print("\n사회점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(socScore[i]+"\t");
		}
		
		System.out.print("\n과학점수:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(sciScore[i]+"\t");
		}
		
		System.out.print("\n총점:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(getTotal(i)+"\t");
		}
		
		System.out.print("\n평균:\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(getAverage(i)+"\t");
		}
	}
}
