package chapter04;

public class MakeArray {
	// 자료구조 사용의 이유

	public static void main(String[] args) {
		
		int[] scores = new int[3];
		// int score1; -> scores[0];
		// int score2; -> scores[1];
		// int score3; -> scores[2];
		// 배열은 0번부터 시작한다.
		int sum = 0;

		// 반복문이랑 같이 쓰이기 좋음
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println(sum);

	}
}
