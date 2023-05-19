package study_230518;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;

public class ChatServer extends Thread {

	private static ArrayList<Socket> clients = new ArrayList<>();
	private Socket socket;

	public ChatServer(Socket socket) {
		this.socket = socket;
	}

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 대기중......");

		while (true) {
			Socket socket = server.accept();
			clients.add(socket);
			System.out.println(socket + " 접속함.");

			ChatServer chatServer = new ChatServer(socket);
			chatServer.start();
		}

	}

	@Override
	public void run() {
		System.out.println("chatThread running......");
		BufferedReader in = null;
		PrintWriter out = null;
		String inMsg = "";

		try {
			// in스트림 생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (true) {
				// in값 받을 준비
				inMsg = in.readLine();
				// 클라이언트들이 준 값들을 받고 뿌려준다.
				// 클라이언트들에게 뿌려줄건데, 본인에게는 뿌려주지 않고
				// 다른 클라이언트 들에게 뿌려주는것임.
				for (Socket s : clients) {
					if (socket != s) {
						out = new PrintWriter(s.getOutputStream(), true);
						out.println(inMsg);
					}
				}
			}

		} catch (SocketException e) {
			System.out.println("접속 종료.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}

	}
}
