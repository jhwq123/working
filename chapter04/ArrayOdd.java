package chapter04;

public class ArrayOdd {
	public static void main(String[] args) {
		
		// 가벼운 문제
		// x 배열 숫자 10개 아무거나, 홀수 몇개? 짝수 몇개? 

		int[] x = {4, 1, 7, 64, 3, 18, 9, 2, 1, 33, 43, 65, 3, 54};
		int[] evOd = new int [2];
			
		for (int i = 0; i < x.length; i++) {
			if (x[i]%2 == 0) {
				evOd[1]++;
			} else {
				evOd[0]++;
			}
		}

		// print test
		System.out.println("배열의 홀수: "+evOd[0]+"개");
		System.out.println("배열의 짝수: "+evOd[1]+"개");
	}
}
