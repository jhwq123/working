package study_230502_2;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class SimpleClient1 {
	public static void main(String[] args) {
		InputStream in = null;
		Socket socket = null;
		try {
			socket = new Socket("localhost", 8222);
			System.out.println("서버 연결 완료");
			in = socket.getInputStream();
			byte[] basket = new byte[10];
			in.read(basket);
			System.out.println(Arrays.toString(basket));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
