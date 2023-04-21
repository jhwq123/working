package study_230421;

public class ArrayTest3 {
	public static void main(String[] args) {
		int[][] aryI = new int[4][4];
		int cntD = 16;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				aryI[i][j] = cntD;
				cntD--;
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(aryI[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
