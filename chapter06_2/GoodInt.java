package chapter06_2;

public class GoodInt {
	private int n;
	private boolean b;
	
	public GoodInt(int n) {
		this.n = n;
	}
	
	boolean positive() { // 양수인지 확인 1
		if(n > 0) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}
	
	boolean odd() { // 홀수인지 확인 1
		if(n%2 == 1) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}
}
