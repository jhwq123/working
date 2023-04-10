package study_230410;

public class ExceptionTest {
	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 0;
		int result = 0;
		
		try {
			result = n1/n2;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안됨.");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(result);
	}
}
