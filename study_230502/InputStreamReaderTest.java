package study_230502;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {

		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		int inputData = 0;

		// 10개 문자를 보관할 수 있는 배열 객체 생성.
		char[] temp = new char[10];
		System.out.print("데이터를 입력하세요 : ");
		// InputStreamReader의 read() 메소드의 인수가 배열인 경우,
		// 배열의 크기만큼 배열에 문자를 읽어 들인 후 읽은 문자의 개수를 반환한다.

		try {
			inputData = isr.read(temp);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < inputData; i++) {
			System.out.print(temp[i]);
		}

	}
}
