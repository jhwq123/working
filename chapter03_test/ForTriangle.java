package chapter03_test;

public class ForTriangle {
	public static void main(String[] args) {
		
		
//		2중 for (행과 열 출력)
		for (int i = 9; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(i+"");
			}
//			5개 출력후 엔터 필요
			System.out.println("");
		}
	}
}