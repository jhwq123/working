package study_230502;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("a.txt");
			FileWriter fw = new FileWriter("b.txt", true);

			int inputData = 0;
			while ((inputData = fr.read()) != -1) {
				// 2바이트씩 읽고 기록하되,
				// 기존 파일의 데이터뒤에 덧붙여 기록한다.
				fw.write(inputData);
			}
			fr.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
