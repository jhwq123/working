package study_230421;

/*
 *	4행 4열짜리 정수형 배열을 선언 및 할당하세요
 *	1) 1 ~ 16까지 값을 차례대로 저장하세요.
 *	2) 저장된 값들을 차례대로 출력하세요.
 */

public class ArrayTest2 {
	public static void main(String[] args) {

		int[][] aryI = new int[4][4];
		int cnt = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				aryI[i][j] = cnt;
				cnt++;
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
