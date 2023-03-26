package chapter05;

public class SumArray {
	public static void main(String[] args) {
		// 합 배열 문제

		int[][] array = new int[3][5];

		// 배열 값 입력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length - 1; j++) {
				array[i][j] = i * (array[i].length - 1) + j + 1;
				array[i][array[0].length - 1] += array[i][j];
			}
		}

		// 배열 값 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
