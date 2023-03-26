package chapter05;

public class GridEx {
	public static void main(String[] args) {
		// Grid 문제

		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
				
				
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					A[i][j] = 10;
				} else {
					A[i][j] = 0;
				}
			}
		}
				
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i+j == 2) {
					B[i][j] = 10;
				} else {
					B[i][j] = 0;
				}
			}
		}
				
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
				
		System.out.println("\n");
				
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(B[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
