package study_230519;

import java.util.Scanner;

public class ArrayHalfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] A = autoNumArray(10);
		int[] B = { 21, 13, 9, 41, 33, 19, 44, 53, 71, 60 };
		int[] C = arrangeArray(B);

		System.out.print("C = { ");
		for (int i = 0; i < C.length; i++) {
			System.out.print(C[i] + ", ");
		}
		System.out.println("}");

		System.out.print("찾는 값? >> ");
		int sel = sc.nextInt();

		System.out.println(findValue(C, sel));

		sc.close();
	}

	static int[] autoNumArray(int length) {
		int[] temp = new int[length];
		for (int i = 0; i < length; i++) {
			temp[i] = i + 1;
		}

		return temp;
	}

	static int findValue(int[] array, int value) {
		int idx1 = 0;
		int idx2 = array.length - 1;
		int cnt = 0;
		int tempIdx = (idx2 + idx1) / 2;

		if (value == array[idx1]) {
			return idx1;
		} else if (value == array[idx2]) {
			return idx2;
		}

		while (cnt <= 100) { // 제한 횟수안에 검증안되면 없는것으로 판단
			if (value == array[tempIdx]) { // 값을 찾면 idx 출력
				return tempIdx;
			} else if (idx1 == idx2) { // idx1과 idx2가 같으면 범위에 없음
				return -1;
			} else if (value > array[tempIdx]) { // 찾으려는 값이 tempIdx값보다 클경우
				idx1 = tempIdx;
			} else { // 찾으려는 값이 tempIdx값보다 작을경우
				idx2 = tempIdx;
			}
			tempIdx = (idx2 + idx1) / 2;
			cnt++;
		}
		return -1;
	}

	// 앞선 번호의 값과, 이후 값들을 비교하여
	// 뒤의 번호 값이 작으면 양측 값을 교체하는 방식
	static int[] arrangeArray(int[] array) {
		int[] tempArray = array;
		int temp;

		for (int i = 0; i < tempArray.length; i++) {
			for (int j = i; j < tempArray.length; j++) {
				if (tempArray[i] > tempArray[j]) {
					temp = tempArray[i];
					tempArray[i] = tempArray[j];
					tempArray[j] = temp;
				}
			}
		}
		return tempArray;
	}
}
