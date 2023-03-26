package chapter03_test;

public class ForSample {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			System.out.print(i);
			if (i != 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			sum += i;
		}
		System.out.print(sum);
	}
}