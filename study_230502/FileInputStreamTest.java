package study_230502;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) throws IOException {

		int inputData = 0;
		// FileInputStream 객체를 선언한다.
		FileInputStream file;

		try {
			// 실제 파일과 연결된 FileInputStream 객체를 생성한다.
			file = new FileInputStream("a.txt");
			// 실제 파일에서 1바이트씩 데이터를 읽어 정수코드값을 반환한다.
			// 정수 값을 문자형으로 캐스팅하여 출력한다.
			// 데이터를 모두 읽으면 -1을 반환한다.
			while ((inputData = file.read()) != -1) {
				System.out.print((char) inputData);
			}

			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
