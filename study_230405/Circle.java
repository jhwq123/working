package study_230405;

public class Circle extends Figure  {

	double PI = 3.1415;
	
	Circle(int a) {
		super(a);
	}
	
	void Area() {
		double result = a * a * PI;
		System.out.println(result);
	}
}
