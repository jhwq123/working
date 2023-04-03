package study_230403;

public class StaticTest {
	public static void main(String[] args) {
		
		Static.printA();
		System.out.println(Static.a);
		Static.a = 20;
		Static.printA();
		Static.a = 30;
		
		
		Static s = new Static();
		s.printB();
		System.out.println(s.b);
		s.b = 30;
		s.printB();
		
		
	}
	
}
