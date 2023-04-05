package study_230405;

public class FigureTest {
	public static void main(String[] args) {
		
		Figure[] f = new Figure[3];
		f[0] = new Square(5, 3);
		f[1] = new Triangle(5, 2);
		f[2] = new Circle(3);
		
		for(int i = 0; i < 3; i++) {
			f[i].Area();
		}
	}
}
