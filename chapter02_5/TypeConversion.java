package chapter02_5;

public class TypeConversion {
	public static void main(String[] args) {
//		byte 타입 b 변수 선언
//		byte b;
//		변수 선언, 초기화
		byte b = 127;
//		int : 4byte 
		int i = 100;
		
//		변수 2개를 더한 연산
//		연산 결과는 큰타입으로 int
		System.out.println(b+i);
//		정수끼리 연산해서 소수점 이하 버림
		System.out.println(10/4);
//		실수, 정수 연산해서 실수로 출력
		System.out.println(10.0/4);
//		실수, 실수 연산해서 실수로 출력
		System.out.println((int)2.9+1.8);
//		2+1
		System.out.println((int)2.9+(int)1.8);
//		2.9+1
		System.out.println(2.9+(int)1.8);
	}
}