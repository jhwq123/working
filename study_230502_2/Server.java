package study_230502_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);

		try {
			serverSocket = new ServerSocket(5000);
			System.out.println("연결을 기다리고 있음");
			socket = serverSocket.accept();
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("클라이언트와 연결 되었음...");

			while (true) {
				String msg = in.readLine();
				if (msg.equalsIgnoreCase("quit")) {
					System.out.println("클라이언트에서 연결을 종료함.");
					break;
				}
				System.out.println("클라이언트가 보낸 문자열 : " + msg);
				System.out.println("클라이언트에게 보낼 문자열을 입력하세요~~");
				System.out.print(">> ");
				String omsg = sc.nextLine();
				out.write(omsg + "\n");
				out.flush();

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
				socket.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
