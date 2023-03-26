package chapter04;

public class MaxMin {
	public static void main(String[] args) {
		// 최소 정수 구하기
		
		int [] scores = {70, 80, 30, 60, 90};
		int min = 200; // 초기 값 오버 설정
		int max = 0; // 초기 값 미니멈 설정
		int cnt60 = 0;
				
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < min) {
				min = scores[i];
			}
			if (scores[i] > max) {
				max = scores[i];
			}
			if (scores[i] >= 60) {
				cnt60++;
			}
		}
		
		System.out.println(min+""+max+""+cnt60);
	}
}
