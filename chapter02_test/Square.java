package chapter02_test;

public class Square {
//	void : 리턴 타입 (리턴 할것이 없음.)
	public static void main(String[] args) {
		int n = 4;
//		1. square 메소드 호출하면서 n을 넘김.
//		4. n의 제곱을 result로 저장함.
		int result = square(n);
		System.out.println("한번의 길이가 "+n+"인 정사각형의 넓이 : "+result);
	}
//	square : 메소드명
//	int length : int 타입의 매개변수(인자, 파라미터)
//	2. square 메소드 호출되면서 n을 length에 받는다.
	public static int square(int length) {
//		3. 매개변수로 받은 값을 제곱해서 반환
		return length * length;
//		리턴 타입 안맞으면 오류
//		return "a"
//		return 타입이 void가 아닐 경우 리턴 값 있어야 함
//		return 0
	}
}