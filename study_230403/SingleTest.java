package study_230403;

public class SingleTest {
	public static void main(String[] args) {
		
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		
		s1.setN(30);
		s2.setN(20);
		
		System.out.println(s1.getN());
		System.out.println(s2.getN());
	}
}
