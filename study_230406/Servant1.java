package study_230406;

public class Servant1 extends Boss {

	char c = 'C';
	
	Servant1(int s1) {
		super(s1);
	}
	
	void order() {
		System.out.println(c+"번 테이블 주문요.");
	}
	
	void s1() {
		System.out.println("1번마 호출요");
	}
	
}
