package study_230405;

public class Triangle extends Figure  {

	Triangle(int a, int b) {
		super(a, b);
	}
	
	void Area() {
		int result = a * b / 2;
		System.out.println(result);
	}
}
