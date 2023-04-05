package study_230405;

public class Square extends Figure {

	Square(int a, int b) {
		super(a, b);
	}
	
	void Area() {
		int result = a * b;
		System.out.println(result);
	}
	
}
