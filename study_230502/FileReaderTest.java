package study_230502;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명을 입력하세요 : ");

		FileReader fr = null;
		int inputData = 0;
		String fileName = "a.txt";
		try {
			fr = new FileReader(fileName);
			// 실제 파일에서 2바이트씩 데이터를 읽어 정수 코드값을 반환한다.
			// 정수값을 문자형으로 캐스팅하여 출력한다. 데이터를 모두 읽으면
			// -1을 반환한다.
			while ((inputData = fr.read()) != -1) {
				System.out.print((char) inputData);
			}

			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();

	}
}
