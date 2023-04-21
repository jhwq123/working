package study_230421;

// 

public class ArrayTestEx1 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 3, 4 };

		int answer = 0;
		int[] nList = new int[1000];

		for (int i = 0; i < array.length; i++) {
			nList[array[i]]++;
			if (array[i] > answer) {
				answer = array[i];
			}
		}

		System.out.println(nList[0]);
		System.out.println(nList[1]);
		System.out.println(nList[2]);
		System.out.println(nList[3]);
		System.out.println(nList[4]);
		System.out.println(nList[5]);
		System.out.println();

		int[] temp = new int[answer];

		for (int i = 0, j = 0; i < answer + 1; i++) {
			if (nList[i] != 0) {
				temp[j] = nList[i];
				j++;
			}
		}

		nList = temp;
		answer = 0;

		for (int i = 0; i < nList.length; i++) {
			System.out.println(nList[i]);
		}

		for (int i = 0; i < nList.length; i++) {
			if (nList[i] > answer) {
				answer = nList[i];
				nList[i] = 0;
			}
		}
		for (int i = 0; i < nList.length; i++) {
			if (answer == nList[i]) {
				answer = -1;
			}
		}

		System.out.println();
		System.out.println(answer);
	}
}
