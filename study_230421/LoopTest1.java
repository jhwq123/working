package study_230421;

// 1부터 10까지 더한값을 출력하기.

public class LoopTest1 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			sum += i;
		}

		System.out.println(sum);
	}
}
