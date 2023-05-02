package study_230502;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
	public static void main(String[] args) {

		// 파일을 인수로 FileOutputStream 객체를 생성하고
		// 그 객체를 인수로 BufferedOutputStream 객체를 생성한다.
		try {
			FileOutputStream fos = new FileOutputStream("alpha.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			// a~z 문자를 기록한다.
			// 실제 파일에 기록되는 것이 아니라 버퍼에 기록된다.
			for (int i = 'a'; i <= 'z'; i++) {
				bos.write(i);
			}
			// 버퍼에 이록된 데이터를 실제 파일에 기록한다.
			bos.flush();
			fos.close();
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
