package chapter02_5;

public class ByteOperationExample {
	public static void main(String[] args) {
//		연산식을 변수로 저장
		byte result1 = 10+20;
		System.out.println(result1);
		
		byte x=10; // 0b 0000 1010
		byte y=20; // 0b 0001 0100
//		연산되어 int로 자동변환되어, btye로 casting함
		byte result2 = (byte) (x+y);
		System.out.println(result2);
	}
}