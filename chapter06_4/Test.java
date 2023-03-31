package chapter06_4;

public class Test {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(5, 3));
		System.out.println(c.sub(3, 5));
		System.out.println(c.mul(6, 3));
		System.out.println(c.div(7, 3));
	}
}
