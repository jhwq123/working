package study_230404;

public class SubStringEx {
	
	static String s = "hello world";
	
	public static void main(String[] args) {
		
//		System.out.println(SubStringEx.subString(4));
//		System.out.println(SubStringEx.subString(0, 4));
//		System.out.println(s.substring(4));
//		System.out.println(s.substring(0, 4));
		System.out.println(SubStringEx.indexOf('w'));
		System.out.println(SubStringEx.lastIndexOf('l'));
		System.out.println(s.indexOf('w'));
		System.out.println(s.lastIndexOf('l'));
		
		
	}

	public static int indexOf(char c) {
		int idx = -1;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	public static int lastIndexOf(char c) {
		int idx = -1;
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == c) {
				idx = i;
				break;
			}
		}
		return idx;
	}
	
	public static String subString(int startIdx) {
		// startIdx 부분 까지 반복하며 배열 값 무시
		// 이후부터 나오는 string을 새로운 string에 덮는다.
		String temp = "";
		for(int i = 0; i < s.length(); i++) {
			if(i > startIdx-1) {
				temp = temp + s.charAt(i);
			}
		}
		return temp;
	}
	
	public static String subString(int startIdx, int endIdx) {
		String temp = "";
		for(int i = 0; i < s.length(); i++) {
			if(i > startIdx-1 && i < endIdx) {
				temp = temp + s.charAt(i);
			}
		}
		return temp;
	}
}
