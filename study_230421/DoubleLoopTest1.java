package study_230421;

// 구구단 출력하기. ( a x b = c | a x d = e… )

public class DoubleLoopTest1 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			System.out.print("|");
			for (int j = 1; j < 10; j++) {
				System.out.print("  " + i + " * " + j + " = " + i * j + "\t|");
			}
			System.out.println();
		}

	}
}
