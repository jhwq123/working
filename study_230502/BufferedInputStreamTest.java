package study_230502;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamTest {

	public static void main(String[] args) {

		int inputData = 0;
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			// FileInputStream 객체를 인수로
			// BufferedInputStream 객체를 생성한다.
			BufferedInputStream bis = new BufferedInputStream(fis);
			// 버퍼에서 1바이트씩 읽어 들인다.
			// 한 8000바이트까지는 임시저장이 됨,
			// 메모리에서 임시로 읽고 불러들임.
			while ((inputData = bis.read()) != -1) {
				System.out.print((char) inputData);
			}
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
