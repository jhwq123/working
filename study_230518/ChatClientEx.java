package study_230518;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClientEx {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Socket socket = null;
		PrintWriter out = null;
		String outMsg = "";
		String name = "";

		try {
			// 접속 소켓 값 생성
			socket = new Socket("192.168.0.71", 9000);
			// out 스트림 생성
			out = new PrintWriter(socket.getOutputStream(), true);

			// 사용자 아이디 넣어보자~
			System.out.println("사용자 아이디 >> ");
			name = sc.nextLine();

			// Input Thread
			ReceiverThread rt = new ReceiverThread(socket);
			rt.setDaemon(true); // 메인이 꺼지면 자동으로 같이 꺼지게 설정
			rt.start();

			while (true) {
				outMsg = sc.nextLine();
				if (outMsg.equals("bye~")) {
					break;
				}
				outMsg = name + " >> " + outMsg;
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
