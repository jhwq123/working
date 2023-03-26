package chapter05;

public class DoubleArray2 {
	public static void main(String[] args) {
		// 2차 배열 문제2

		int[][] array03 = new int[3][];

		array03[0] = new int[1];
		array03[1] = new int[2];
		array03[2] = new int[3];

		array03[0][0] = 1;
		array03[1][0] = 2;
		array03[1][1] = 3;
		array03[2][0] = 4;
		array03[2][1] = 5;
		array03[2][2] = 6;

		for (int i = 0; i < array03.length; i++) {
			for (int j = 0; j < array03[i].length; j++) {
				System.out.print(array03[i][j] + "\t");
			}
		System.out.println("\n");
		}
	}
}
