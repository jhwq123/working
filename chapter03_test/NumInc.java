package chapter03_test;

public class NumInc {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
//			(1+1)*1/2 = 2/2, (1+2)*2/2 = 6/2,
//			i에서 뭘 해주는게 맞음 
			int tmp = (1+i)*i/2;
			sum += tmp;
		}
		System.out.println(sum);
	}
}