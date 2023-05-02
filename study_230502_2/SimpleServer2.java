package study_230502_2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer2 {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;
		OutputStream out = null;
		DataOutputStream dos = null;

		String str = "이 문자열은 몇 바이트 일지 맞춰보십쇼...";

		try {
			serverSocket = new ServerSocket(8111);
			System.out.println("서버 준비 완료");
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결 완료...");

			out = socket.getOutputStream();
			dos = new DataOutputStream(out);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				out.close();
				socket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
