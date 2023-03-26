package chapter04;

public class ArrayFract {
	public static void main(String[] args) {
		// 변수 초기 값 할당, 배열에 짝수 값 넣기
		// 어떤 배열값이 들어와도, evens배열에 짝수 5개를 순서대로 넣기

		// 1단계
		int[] x1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] evens1 = new int[5];
					
		for (int i = 0; i < 10; i++) {
			if (x1[i]%2 == 0) {
				evens1[i/2] = x1[i];
			}
		}
			
		// 2단계
		int[] x2 = {2, 12, 9, 100, 101, 7, 8, 33, 44};
		int[] evens2 = new int[5];
		int cnt = 0;
		
		for (int i = 0; i < x2.length; i++) {
			if (x2[i]%2 == 0) {
				evens2[cnt] = x2[i];
				cnt++;
			}
		}

		// 3단계
		int[] x3 = {2, 12, 9, 100, 101, 7, 8, 33, 44};
		int[] evens3 = new int[5];
		int[] odds = new int [x3.length-5];
		int evensIdx = 0;
		int oddsIdx = 0;
		
		for (int i = 0; i < x3.length; i++) {
			if (x3[i]%2 == 0) {
				evens3[evensIdx] = x3[i];
				evensIdx++;
			} else {
				odds[oddsIdx] = x3[i];
				oddsIdx++;
			}
		}
	}
}
