package chapter03_test;

public class ForTest {
	public static void main(String[] args) {
		int sum = 0, n = 99;
//		0~99 까지 짝수만
		for (int i = 0; i < n; i++) {
			if (i%2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}