package study_230403;

public class StringEx {
	public static void main(String[] args) {
	
		String str = "abcd efg hij";
		
		// 1. length();
		int length = str.length();
		System.out.println(length);
		
		// 2. charAt(index)
		char ch = str.charAt(11);
		System.out.println(ch);
		
		int cnt = 0;
		String s = "eeee++ee=_+edee0e0eeee";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'e') {
				cnt++;
			}
		}
		System.out.println("e의 개수는 "+cnt+"개 입니다.");
		
		// 3. 문자열 비교
		String insa = new String("Hello");
		String x = new String("Hello");
		
		
		// 4. 특정 문자 최초 위치 반환
		String xxx = "abcd efg";
		int result = xxx.indexOf('h');
		System.out.println(result);
		
		// 1. 문자 10개를 저장할 수 있는 문자 배열을 만든다.
		//    (문자 배열은 '*'로 채워져 있다.)
		// 2. 10글자 이내의 문자열을 준비한다.
		// 3. 사용자가 문자를 입력한다.
		// 4. 사용자가 입력한 문자가 문자열 안에 있으면 해당 문자 위치를 파악하여
		//    문자 배열의 해당 위치에 그 문자를 저장한다.
		
		
		
	}
}
