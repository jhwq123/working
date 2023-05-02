package study_230502;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) throws IOException {

		String inputData = null;

		try {
			FileReader fr = new FileReader("a.txt");
			BufferedReader br = new BufferedReader(fr);
			// readLine() 메소드로 라인 단위로 읽어 들인다.
			while ((inputData = br.readLine()) != null) {
				System.out.print(inputData);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
