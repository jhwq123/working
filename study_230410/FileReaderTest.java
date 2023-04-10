package study_230410;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\GGG\\Desktop\\f003.txt");
			char[] buff = new char[20];
			fr.read(buff);
			
			for(int i = 0; i < buff.length; i++) {
				System.out.print(buff[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
