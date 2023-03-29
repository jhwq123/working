package chapter06_3;

public class Sample {

	private int n;
	private int pw;
	
	public Sample(int n) {
		this.n = n;
	}
	
	void setSample(int pw) {
		this.pw = pw;
	}
	
	int comparSample(int toPw) {
		if (toPw == pw) {
			return n;
		} else {
			return -191919;
		}
	}
	
}
