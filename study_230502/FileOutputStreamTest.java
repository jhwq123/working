package study_230502;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// 파일 읽어서 복사 생성하는 거.
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("b.txt");
			int inputData = 0;

			while ((inputData = fis.read()) != -1) {
				fos.write(inputData);
			}
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
