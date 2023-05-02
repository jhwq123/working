package study_230502_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {

		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;

		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket("192.168.0.62", 5002);
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String msg = "";

			while (true) {
				System.out.println("서버를 보낼 문자열을 입력하세요");
				System.out.print(">> ");
				msg = sc.nextLine();
				if (msg.equalsIgnoreCase("quit")) {
					out.println(msg);
					out.flush();
					break;
				}
				out.println(msg);
				out.flush();
				msg = in.readLine();
				System.out.println("서버로부터 온 메시지 : " + msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				socket.close();
				in.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
