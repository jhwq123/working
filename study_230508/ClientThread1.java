package study_230508;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class InputThread1 implements Runnable {

	BufferedReader in = null;
	PrintWriter out = null;
	String result;

	InputThread1(BufferedReader in) {
		this.in = in;
	}

	@Override
	public void run() {
		while (true) {
			try {
				// 쓴이2 내용 받을준비
				result = in.readLine();
				// 쓴이2 내용 받기
				System.out.println("\n" + result);
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ClientThread1 {
	public static void main(String[] args) throws Exception {

		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner sc = new Scanner(System.in);
		String result, name;

		try {
			System.out.print("닉네임을 입력하세요>>");
			name = sc.next();
			System.out.println("호스트 연결 대기중...");
			socket = new Socket("192.168.0.71", 5000);
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String title;
			Thread t = new Thread(new InputThread1(in));

			// 타이틀 출력
			while (!(title = in.readLine()).equals(" ")) {
				System.out.println(title);
			}

			t.start();
			result = sc.nextLine();

			while (true) {
				// 내 내용 입력
				result = "│>>" + name + " : " + sc.nextLine();
				System.out.print(result);
				// 내 내용 보내기
				out.println(result);
				out.flush();
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