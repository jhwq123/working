package chapter04;

public class NoOneMin {
	public static void main(String[] args) {
		// 배열 맨 앞의 값을 배열의 최솟값과 바꾸기

		int[] a = {90, 80, 70, 60, 50};
		int cnt = 0;
		int temp = 100; // 최솟값 찾기, 값 바꾸기용
			
		for (int i = 0; i < a.length; i++) {
			if (a[i] < temp) {
				temp = a[i];
				cnt = i;
			}
		}
			
		temp = a[0];
		a[0] = a[cnt];
		a[cnt] = temp;
			
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"");
		}
	}
}
