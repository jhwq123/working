package study_230403;

public class Single {

	private int n;
	private static Single instance = new Single();
	
	private Single() {
		n = 10;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
	
	public static Single getInstance() {
		if (instance == null) {
			instance = new Single();
		}
		return instance;
	}
	
}
