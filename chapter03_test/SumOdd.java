package chapter03_test;

public class SumOdd {
	public static void main(String[] args) {
		
		int sum = 0, cnt = 0;
		
		for (int i = 0; i < 100; i++) {
			if (i%2 != 0) {
				sum += i;
				cnt++;
				System.out.print(sum+"\t");
			}
			if (cnt == 10) { // 10개 출력할때마다 참
				System.out.println("\n");
				cnt = 0;
			}
		}
	}
}