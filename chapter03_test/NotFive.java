package chapter03_test;

public class NotFive {
	public static void main(String[] args) {
		
		int n = 200, cnt = 0;
		
		while (n <= 800) { // 1000까지
			if (n%5 != 0) { // 3의 배수가 아니면
				System.out.print(n+"");
				cnt++; // 10개 출력을 위한 카운트
			}
			if (cnt == 10) { // 10개 출력할때마다 참
				System.out.println("");
				cnt = 0;
			}
			n++;
		}	
	}
}