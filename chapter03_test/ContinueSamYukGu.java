package chapter03_test;

public class ContinueSamYukGu {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			if (i%3 == 0) {
				System.out.println("짝 ");
				continue;
			}
			System.out.println(i+" ");
			
//			if (i%3 == 0) {
//				System.out.print("짝 ");
//			} else {
//				System.out.print(i+" ");
//			}
		}
	}
}