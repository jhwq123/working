package study_230502_2;

import java.io.IOException;
import java.net.Socket;

public class SocketTest {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("192.168.0.186", 8111);
			System.out.println("연결되었습니다." + socket);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
