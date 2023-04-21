package study_230421;

/*
 * 도형객체를 상속받은 여러종류의 도형의 둘레와 넓이 구하는거 
 * 도형객체와 여러종류의 도형은 _figure에 할당되어있음.
 */

import _figure.Circle;
import _figure.Rhombus;
import _figure.Square;
import _figure.Triangle;

public class InheritTest1 {
	public static void main(String[] args) {

		Circle c = new Circle(5);
		System.out.println("원");
		System.out.println(c.round + c.area());
		System.out.println(c.area + c.round());

		System.out.println();

		Square s = new Square(7, 5);
		System.out.println("사각형");
		System.out.println(s.round + s.round());
		System.out.println(s.area + s.area());

		System.out.println();

		Triangle t = new Triangle(7, 4);
		System.out.println("삼각형");
		System.out.println(t.round + t.round());
		System.out.println(t.area + t.area());

		System.out.println();

		Rhombus r = new Rhombus(6, 7, 3);
		System.out.println("다각형");
		System.out.println(r.round + r.round());
		System.out.println(r.area + r.area());

	}
}
