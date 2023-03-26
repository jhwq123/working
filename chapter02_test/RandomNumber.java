package chapter02_test;

public class RandomNumber {
	public static void main(String[] args) {
//		타입 불일치로 오류
//		String n = rollDie();
		int dice = rollDie();
		System.out.println("주사위의 눈: "+dice);
		
	}
//	매개변수가 없는 메소드(주사위의 숫자 구하기 = 1~6)
	public static int rollDie() {
//		random() : 0이상 1미만 난수 발생(실수)
		double x = Math.random() * 6;
//		0~5 의 난수를 1~6까지로 바꿈
		int temp = (int)x + 1;
		return temp;
	}
}