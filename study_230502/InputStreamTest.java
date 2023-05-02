package study_230502;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamTest {

	public static void main(String[] args) {

		// 키보드를 입력 스트림 객체에 할당한다.
		InputStream is = System.in; // 영어랑 숫자를 읽는다
		InputStreamReader isr = new InputStreamReader(is); // 한글을 읽는다
		int inputData = 0;

		System.out.print("데이터를 입력하세요 : ");

		// InputStream이 제공하는 read() 메소드는 1바이트를 읽으며 해당 문자의
		// 정수 코드값을 반환한다.
		try {
			inputData = isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 바로 출력하면, 정수 코드 값이 출력되며 문자로 캐스팅하면 문자가 출력된다.
		System.out.println("실제 입력된 데이터(정수) : " + inputData);
		System.out.println("실제 입력된 데이터(문자) : " + (char) inputData);
	}
}
