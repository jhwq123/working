package chapter04;

public class ArrayXY_Reverse {
	// 배열 y에 x값 역순으로 집어넣기
	public static void main(String[] args) {
		int [] x = new int [5];
		int [] y = new int [5];
			
		for (int i = 0; i < 5; i++) {
			x[i] = i+1;
			y[4-i] = x[i];
		}	
		
		for (int i = 0; i < 5; i++) {
			System.out.println(x[i]+""+y[i]);
		}
		// 초기 값들이 다 정의되기 전에 값을 뽑아서 문제가 생김.

	}
}
