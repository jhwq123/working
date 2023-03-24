package working;

// pixelArt는 가로 32개 고정이다.
// f(x) = 문자 AND f(x-1) = 띄어쓰기 ==> 콤마 넣기
// 배열1 제작 최초 "{" 넣고, 끝날때 "}" 넣어 끝내기
// 배열2 제작 최초 "{" 넣고, 값들 작업해주고 끝날때 "}," 넣어 끝내기

public class unpacker_pixelArt {
	public static void main(String[] args) {

		String codes = "";
				// 암호화 필요한 코드 넣기, 끝에 깔끔하게 제거
		
		int h = 2; // 픽셀 높이 크기 넣기, 엑셀의 높이 번지수 값
		int cnt = 0;
		String s1 = "";
		String s2 = "";

		System.out.print("{ {");

		for (int i = 0; i < h; i++) {

//			System.out.println(" {");

			// code내부 값들 이후 콤마 넣기
			while (cnt < codes.length() - 1) {

				s1 += codes.charAt(cnt);
				s2 += codes.charAt(cnt + 1);

				System.out.print(codes.charAt(cnt));  
				if (!s1.equals("	") && s2.equals("	")) {
					System.out.print(", ");
					
				}

				if (s1.equals("\r")) {
					System.out.print("}, {"); // 마지막에 안나오게 개선 가능할 듯.
				}
				cnt++;
				s1 = "";
				s2 = "";
			}
		}

		System.out.println("} };");
	}
}
