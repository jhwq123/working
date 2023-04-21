package study_230421;

// 1+(1+2)+(1+2+3)+...+(1+2+3+4+5+6+7+8+9+10) 출력

public class DoubleLoopTest2 {
	public static void main(String[] args) {

		System.out.print("1+");

		for (int i = 2; i <= 10; i++) {

			System.out.print("(");

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				if (j != i) {
					System.out.print("+");
				}
			}

			System.out.print(")");

			if (i != 10) {
				System.out.print("+");
			}
		}

	}
}
