package study_230426;

public class Calculator {
	// 덧셈, 뺄셈 기능을 제공하는 클래스

	// add
	static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	// sub
	int sub(int n1, int n2) {
		if (n1 < n2) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		int result = n1 - n2;
		return result;
	}

}
