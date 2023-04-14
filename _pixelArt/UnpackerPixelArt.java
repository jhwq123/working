package _pixelArt;

// pixelArt는 가로 32개 고정이다.
// f(x) = 문자 AND f(x-1) = 띄어쓰기 ==> 콤마 넣기
// 배열1 제작 최초 "{" 넣고, 끝날때 "}" 넣어 끝내기
// 배열2 제작 최초 "{" 넣고, 값들 작업해주고 끝날때 "}," 넣어 끝내기

/*
 * 1. 1차 사이트에서 픽셀아트 색상을 8가지 정도로 축소한 그림을 뽑음
 * 2. 2차 사이트에서 32x32 짜리 픽셀아트 도안을 뽑음
 * 3. 나온 도안의 엑셀파일에서 각 2차 배열 값들의 숫자를 전부 가져옴
 * 4. 가져온 숫자 String을 배열규칙에 맞게 자동으로 정렬시킴
 * 5. 정렬된 data 값과 2중 for문 및 배열 특수문자 값으로 print함
 * 6. 1~5까지 자동으로 출력되는 프로그램 제작 후 속도가 충분히 빠르면
 * GIF파일의 초단위 캡쳐 이미지로 실시간 출력하여 print갱신
 * 7. 6의 작업이 잘 되면 데이터 값의 역순으로 임의 메신저 등에 강제로
 * 움짤 출력이 가능해진다.
 */

public class UnpackerPixelArt {
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