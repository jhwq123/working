package chapter04;

public class ForArray {
	// 반복문으로 배열 안에 숫자를 집어넣는 코드

	public static void main(String[] args) {
		
		int[] a = new int[3];
		
		for (int i = 0; i < 3; i++) {
			a[i] = i+1;
			System.out.println("a["+i+"] = "+a[i]);
		}

		System.out.println(a); // 메모리 주소 값
		
	}
}
