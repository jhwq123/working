package study_230406;

public class Servant2 extends Boss  {

	String s = "피자";
	
	Servant2(int s2) {
		super(s2);
	}
	
	void order() {
		System.out.println(s+"배달 갑니다.");
	}
	
	void s2() {
		System.out.println("2번마 호출요");
	}
}
