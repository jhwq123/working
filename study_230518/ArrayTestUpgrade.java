package study_230518;

import java.util.Scanner;

public class ArrayTestUpgrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[5];

		for (int i = 0; i < A.length; i++) {
			try {
				System.out.print("정수 입력 >> ");
				int score = sc.nextInt();

				// 배열 길이만큼 남아있는지 검증
				if (i >= A.length - 1) {
					A = addArray(A);
				}

				// 값 넣기
				A[i] = score;

				// 출력 내용
				System.out.println("A[" + i + "] = " + score);

			} catch (Exception e) {

				// 정수아닌 값(고의적인 에러) 발생 시 break로 빠져나오기
				System.out.println("End.");
				break;
			}
		}

		Scanner sc2 = new Scanner(System.in);
		while (true) {
			System.out.println("< 배열 정보 >");
			for (int i = 0; i < A.length; i++) {
				System.out.print("A[" + i + "] = " + A[i]);
				if (i != A.length - 1) {
					System.out.print(" / ");
				}
				if (i % 5 == 0 && i != 0) {
					System.out.println();
				}
			}
			System.out.println();

			// getArrayTest
			// System.out.print("index >> ");
			// int idx = sc2.nextInt();
			// System.out.println(getArray(A, idx));

			// removeArrayTest
			System.out.print("index >> ");
			int idx = sc2.nextInt();
			A = removeArray(A, idx);
		}
	}

	static int[] addArray(int[] array) {
		int[] temp = new int[array.length + 5];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		return temp;
	}

	static int[] removeArray(int[] array, int index) {
		// 최종적으로 나올 배열크기는 기존배열-1
		int[] temp = new int[array.length - 1];
		// 해당 요소 삭제 후 배열들을 앞으로 1칸씩 땡김
		for (int i = 0, j = 0; i < array.length - 1; i++, j++) {
			// 해당 index에 도착하면 j값 1올림
			if (i == index) {
				j++;
			}
			// j값이 배열 크기를 넘어서는지 확인하고 맞으면 i배열 값에 0을 넣고 끝냄
			if (j >= array.length) {
				temp[i] = 0;
				break;
			}

			temp[i] = array[j];

		}
		return temp;
	}

	static int getArray(int[] array, int index) { // 특정 idx array 요소를 가져오게 해보자
		return array[index];
	}

}
