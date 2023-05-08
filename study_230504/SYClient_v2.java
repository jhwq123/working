package study_230504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SYClient_v2 {

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
			System.out.println("숫자맞추기 게임을 시작하겠습니다.");
			msg = in.readLine();

			System.out.println("서버로부터 온 메시지 : " + msg);

			while (true) {
				System.out.println("숫자를 입력하세요");
				System.out.println(">>");
				String num = sc.nextLine();
				out.println(num);
				out.flush();

				msg = in.readLine();
				System.out.println(msg); // 더 큰 숫자 입니다. // 정답입니다.
				msg = in.readLine();
				System.out.println(msg); // 남은횟수 //클라이언트 윈

				if (msg.equals("Client win!")) {
					break;
				}
				if (msg.equals("Server win!")) {
					break;
				}
			}
			msg = in.readLine();
			System.out.println(msg);
			msg = in.readLine();
			System.out.println(msg);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				in.close();
				out.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
