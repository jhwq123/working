package chapter03_test;

public class WhileTest {
	public static void main(String[] args) {
		
		int sum = 0;
		int n = 0;
		
		while(n < 100) {
			if (n%2 == 0) {
				sum += n;
			}
			n++;
		}
		
		System.out.println(sum);
		
	}
}