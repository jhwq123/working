package chapter02_3;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
//		20L : 명시적으로 long 타입
//		long var2 = 20L;
//		대소문자 관계 없이 명시됨
		long var2 = 20l;
//		기본 정수는 int 타입으로 인식됨
//		long var3 = 1000000000;
//		명시적으로 long 타입 값을 세팅함
		long var3 = 100000000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}