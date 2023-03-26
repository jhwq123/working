package chapter03_test;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int i = 0, sum = 0;
		
//		do {
//			sum += i*2;
//			i++;	
//		} while (i < 50);
//		
		do {
//			99까지 반복 -> 99보다 크면 break
			if (i > 99) {
				break;
			}
			sum += i;
			i += 2;
		} while (true);
		
		System.out.println(sum);
	}
}