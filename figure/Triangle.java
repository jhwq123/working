package figure;

public class Triangle extends Figure {

	public Triangle(int a, int b) {
		super(a, b);
	}
	
	@Override
	public String round() {
		double hypotenuse = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2));
		return (double)(a + b + hypotenuse)+"";
	}
	
	@Override
	public String area() {
		return (double)(a*b/2)+"";
	}
	
}
