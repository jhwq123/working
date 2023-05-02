package study_230502_2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(8111);
			System.out.println("클라이언트 연결 대기중......");
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 : " + socket);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
