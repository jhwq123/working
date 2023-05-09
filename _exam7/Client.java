package _exam7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {

		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);
		String result;
		boolean endFlag = false;

		try {
			socket = new Socket("192.168.0.71", 9999);
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("서버에 접속되었습니다.");

			while (!endFlag) {
				// client 내용 입력
				System.out.print("Client >> ");
				result = sc.nextLine();
				// client 내용 출력
				out.println(result);
				out.flush();
				if (result.equals("bye") || result.equals("BYE")) {
					System.out.println("채팅을 종료합니다...");
					endFlag = true;
					break;
				}
				if (!endFlag) {
					// server 내용 받을준비
					result = in.readLine();
					// server 내용 받은것 출력
					System.out.println("Server >> " + result);
					// 반복
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			socket.close();
			in.close();
			out.close();
			sc.close();
		}

	}
}
