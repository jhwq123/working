package _figure;

public class Rhombus extends Figure {

	public Rhombus(int a, int b, int c) {
		super(a, b, c);
	}
	
	@Override
	public String round() {
		double temp = (b-a)/2;
		double hypotenuse = Math.sqrt( Math.pow(temp, 2) + Math.pow(c, 2));
		return (double)((a+b)+hypotenuse*2)+"";
	}
	
	@Override
	public String area() {
		return (double)((a+b)*c/2)+"";
	}
	
}
