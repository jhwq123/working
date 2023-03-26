package chapter05;

public class DoubleArray1 {
	public static void main(String[] args) {
		// 2차 배열 문제1

		int[][] array02 = new int[4][5];

		for (int i = 0; i < array02.length; i++) {
			// 한 행의 모든 열의 값 채우기
			for (int j = 0; j < array02[0].length; j++) {
				// 열의 모든 값 세분화 채우기
				array02[i][j] = i * array02[0].length + j + 1;
			}
		}

		for (int i = 0; i < array02.length; i++) {
			for (int j = 0; j < array02[0].length; j++) {
				System.out.print(array02[i][j] + "\t");
				;
			}
			System.out.println("\n");
		}
	}
}
