package study_230508;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) throws Exception {

		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);

		try {
			socket = new Socket("192.168.0.71", 5000);
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String resultMe, resultYou, resultHost, title;

			System.out.println("호스트 연결 대기중...");

			// 타이틀 출력
			while (!(title = in.readLine()).equals(" ")) {
				System.out.println(title);
			}

			while (true) {
				// 쓴이1 내용 받을준비
				System.out.print("│>> 쓴이1 답장> ");
				// 쓴이1 내용 받기
				resultYou = in.readLine();
				System.out.println(resultYou);
				// 쓴이2이 입력
				System.out.print("│>> 쓴이2 : ");
				resultMe = sc.nextLine();
				// 쓴이2 내용 출력
				out.println(resultMe);
				out.flush();
				// 호스트 내용 받을준비
				System.err.print("│>> 호스트 답장> ");
				// 호스트 내용 받기
				resultHost = in.readLine();
				System.err.println(resultHost);
				// 반복
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
