package study_230518;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClient2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Socket socket = null;
		PrintWriter out = null;
		String outMsg = "";

		try {
			// 접속 소켓 값 생성
			socket = new Socket("localhost", 9000);
			// out 스트림 생성
			out = new PrintWriter(socket.getOutputStream(), true);

			// Input Thread
			ReceiverThread rt = new ReceiverThread(socket);
			rt.start();

			while (true) {
				outMsg = sc.nextLine();
				if (outMsg.equals("bye~")) {
					break;
				}
				out.println(outMsg);
			}
			throw new SocketException();

		} catch (SocketException e) {
			System.out.println("접속을 종료합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
