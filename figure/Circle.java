package figure;

public class Circle extends Figure {
	
	double pi = Math.PI;
	
	public Circle(int a) {
		super(a);
	}
	
	@Override
	public String round() {
		return (double)(2 * pi * a)+"";
	}
	
	@Override
	public String area() {
		return (double)(pi * a * a)+"";
	}
	
}
