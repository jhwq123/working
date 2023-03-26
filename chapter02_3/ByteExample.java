package chapter02_3;

public class ByteExample {
	public static void main(String[] args) {
//		오류 : byte 타입 범위 벗어남
//		byte var1 = -129;
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		오류 : byte 타입 범위 벗어남
//		byte var5 = 128;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}