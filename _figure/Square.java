package _figure;

public class Square extends Figure{

	private String name = "사각형";
	
	String getName() {
		return name;
	}
	
	public Square(int a, int b) {
		super(a, b);
	}
	
	@Override
	public String round() {
		return (double)((a+b)*2)+"";
	}
	
	@Override
	public String area() {
		return (double)(a*b)+"";
	}
}
