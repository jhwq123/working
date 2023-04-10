package study_230410;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		
		System.out.println("파일에 쓸 문자열을 입력하세요.");
		String str = sc.nextLine();
		
		try {
			fw = new FileWriter("C:\\Users\\GGG\\Desktop\\f003.txt");
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
