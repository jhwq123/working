package study_230405;

public class C extends P {
	int x;
	
	C(int n) { // 부모클래스의 생성자를 호출하는 코드가 있음.;
		super(n); // 부모클래스 자원을 사용하려고 하는 구문임.
		this.x = n*2;
	}
}
