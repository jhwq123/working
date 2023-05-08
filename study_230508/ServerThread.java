package study_230508;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class InputThread implements Runnable {

	Socket socket = null;
	BufferedReader in = null;
	PrintWriter out = null;
	String result;

	InputThread(BufferedReader in, PrintWriter out) {
		this.in = in;
		this.out = out;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// 채팅을 기다린다.
				result = in.readLine();
				// 채팅을 출력한다.
				System.out.println(result);
				// 채팅을 2에도 출력한다.
				Thread.sleep(100);
				out.println(result);
				out.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			out.close();
		}

	}
}

public class ServerThread {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = null;
		Socket socket1 = null;
		BufferedReader in1 = null;
		PrintWriter out1 = null;
		Socket socket2 = null;
		BufferedReader in2 = null;
		PrintWriter out2 = null;
		Scanner sc = new Scanner(System.in);
		String result, title1, title2;

		try {
			serverSocket = new ServerSocket(5000);
			System.out.println("5000클라이언트1 연결 대기중...");
			socket1 = serverSocket.accept();
			System.out.println("5000클라이언트2 연결 대기중...");
			socket2 = serverSocket.accept();
			out1 = new PrintWriter(socket1.getOutputStream());
			in1 = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
			out2 = new PrintWriter(socket2.getOutputStream());
			in2 = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
			System.out.println("클라이언트들과 연결이 되었어요.");
			// 랜덤챗 방을 만들어보자.
			title1 = "┌     원숭이가 지켜보는 랜덤채팅방";
			title2 = "│     (서로 매너있는 채팅 부탁드립니다.)\n" + "│\n" + "│\n" + "│\n ";
			System.out.println(title1);
			System.out.println(title2);
			// 연결 되었으면 1과 2에 채팅 틀을 넘겨주자.
			out1.println(title1);
			out1.println(title2);
			out1.flush();
			out2.println(title1);
			out2.println(title2);
			out2.flush();

			Thread it1 = new Thread(new InputThread(in1, out2));
			Thread it2 = new Thread(new InputThread(in2, out1));

			it1.start();
			it2.start();

			while (true) {
				// 내 채팅을 기다린다.
				result = "│>> HOST : " + sc.nextLine();
				// 내 채팅을 출력한다.
				System.out.println(result);
				// 내 채팅을 1과 2에도 출력한다.
				out1.println(result);
				out1.flush();
				out2.println(result);
				out2.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			serverSocket.close();
			socket1.close();
			in1.close();
			out1.close();
			socket2.close();
			in2.close();
			out2.close();
			sc.close();
		}

	}

}
