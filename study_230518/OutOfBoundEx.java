package study_230518;

public class OutOfBoundEx {
	public static void main(String[] args) {
		int[] A = new int[3];

		try {
			A[0] = 1;
			A[1] = 2;
			A[2] = 3;
			// Bound
			A[3] = 4;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 범위 초과맨");
			System.out.println("A배열에는 " + A.length + "개의 데이터만 입력할 수 있음.");
		}
	}
}
