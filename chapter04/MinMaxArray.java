package chapter04;

public class MinMaxArray {
	public static void main(String[] args) {
		// 주어진 배열을 최소값 순서로 배열하기
		int[] a = {10, 50, 60, 20, 30};
		int temp = 0;
			
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

	}
}
