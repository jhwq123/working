package study_230502;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 키보드를 입력스트림 객체에 할당하고, 콘솔을 출력스트림 객체에 할당한다.
		InputStream is = System.in;
		OutputStream out = System.out;
		System.out.println("데이터를 입력하세요 : ");
		// 입력 스트림 객체의 read() 메소드로 1바이트씩 읽어 들인다.
		int input = sc.nextInt();
		try {
			input = is.read();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실제 입력된 데이터 : " + input);
		// 출력 스트림 객체의 write() 메소드로 1바이트씩 문자로 캐스팅해서 출력한다.

		sc.close();

	}
}
