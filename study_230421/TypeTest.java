package study_230421;

// 국어 99점, 영어 80점, 수학 96점의 평균 값을
// 실수형과 정수형으로 나태내어라

public class TypeTest {
	public static void main(String[] args) {

		int korScore = 99;
		int engScore = 80;
		int matScore = 96;

		int total = (korScore + engScore + matScore);
		int average_i = total / 3;
		double average_d = total / 3.0;

		System.out.println(average_i);
		System.out.println(average_d);

	}
}
