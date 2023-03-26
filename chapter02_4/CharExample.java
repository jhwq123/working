package chapter02_4;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
//		65는 A의 유니코드
//		유니코드를 문자로 변환
		char c2 = 65;
//		4*16+1 = 65
//		\\u: 16진수(0x)
		char c3 = '\u0041';
		
		char c4 = '가';
//		44032는 '가'의 유니코드
		char c5 = 44032;
//		10진수 : 0~9
//		16진수 : 0~15 (a:10, f:15)
		char c6 = '\uac00';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}