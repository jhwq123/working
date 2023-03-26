package chapter03_test;

public class SumFive {
	public static void main(String[] args) {
		
		int n = 500, sum = 0;
		
		while (n <= 600) {
			if (n%5 == 0) {
				sum += n;
			}
			n++;
		}
		
		System.out.println("5의 배수 합계: "+sum);
	}
}