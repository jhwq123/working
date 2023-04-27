package _calculator;

// 공학용 계산기를 만들겁니다!

public class Calculator {

	int add(int n1, int n2) {
		return n1 + n2;
	}

	int sub(int n1, int n2) {
		return n1 - n2;
	}

	// 소숫점 깔끔하게 나오는법 찾아보기
	double div(int n1, int n2) {
		return n1 / (double) n2;
	}

	int mul(int n1, int n2) {
		return n1 * n2;
	}

	int multp(int n, int m) {
		int result = 1;
		for (int i = 1; i <= m; i++) {
			result *= n;
		}

		return result;
	}

	double multpD(double n, int m) {
		double result = 1;
		for (int i = 1; i <= m; i++) {
			result *= n;
		}

		return result;
	}

	double reverse(int n) {
		return 1 / (double) n;
	}

	int exp(int n, int m) {
		return (n * multp(10, m));
	}

	// int % int = int
	// double % int = double
	// int % double = double
	// double % double = double
	Object mod(Object n, Object m) {
		if (n.getClass() == Integer.class) {
			int tempN = (int) n;
			if (m.getClass() == Integer.class) {
				int tempM = (int) m;
				int result = tempN % tempM;
				return result;
			} else {
				double tempM = (double) m;
				double result = tempN % tempM;
				return result;
			}
		} else {
			double tempN = (double) n;
			if (m.getClass() == Integer.class) {
				int tempM = (int) m;
				double result = tempN % tempM;
				return result;
			} else {
				double tempM = (double) m;
				double result = tempN % tempM;
				return result;
			}
		}
	}

	int multp10(int m) {
		return multp(10, m);
	}

	// 이진 탐색 알고리즘?
	// 소수점으로 시작해서 인근값 추정하도록 설계
	// 제곱해서 해당 수 근접해 지지만 값이 작은 상수 선정
	// 제곱해서 해당 수랑 차이값이 더 작은쪽 선정
	// 가중치 값을 0.5 ~~~ /2한 값으로 점점 줄여가며 근접하기
	// 약 20번 한 결과값 출력
	double root(double n, int m) {
		double tp = 0;
		double cnt = 0.5;
		double tempN = (double) n;

		// 제곱해서 근접한 가장 작은 상수 선정
		for (int i = 0; i < tempN; i++) {
			if (multp(i, m) > tempN) {
				tp = i - 1;
				break;
			} else if (multp(i, m) == tempN) {
				return i;
			}
		}

		double preResult = 0;
		double preTp = 0;
		double nowResult = 0;
		double nowTp = 0;
		double result = 0;
		// 가중치 줄여가며 근접해보기
		for (int i = 0; i < 100; i++) {
			preTp = tp;
			preResult = multpD(tp, m) - tempN;
			if (preResult < 0) {
				tp += cnt;
			} else {
				tp -= cnt;
			}
			cnt /= 2;
			nowTp = tp;
			nowResult = multpD(tp, m) - tempN;
			if (nowResult < preResult) {
				result = preTp;
			} else {
				result = nowTp;
			}
		}
		return result;

	}

	// 일전에 타입들 상속받던거 이용해서,
	// int, double 등등의 타입 값에대해서
	// 연산 후 반응할 수 있도록 만들수 있지 않을까?
	Object absolute(Object n) {
		if (n.getClass() == Integer.class) {
			int temp = (int) n;
			temp *= -1;
			return temp;
		} else if (n.getClass() == Double.class) {
			double temp = (double) n;
			temp *= -1;
			return temp;
		} else {
			int temp = 0;
			temp *= -1;
			return temp;
		}

	}

	// 소숫점 아래 6자리까지 깔끔하니 반올림 찾기
	double pi() {
		double temp;
		double result = 3;
		for (int i = 0, j = 1; i < 100; i++, j++) {
			int cnt = 2 * j;
			temp = (4 / (double) ((cnt) * (cnt + 1) * (cnt + 2)));
			if (i % 2 == 0) {
				result = result + temp;
			} else {
				result = result - temp;
			}
		}

		return result;
	}

	// 소숫점 아래 2자리까지 깔끔하니 반올림 찾기
	double logE() {

		double cntD = 1000;
		int cnt = (int) cntD;
		return multpD((1 + (1 / cntD)), cnt);
	}

}
