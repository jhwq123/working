package _exam7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws Exception {

		ServerSocket serverSocket = null;
		Socket socket = null;
		BufferedReader in = null;
		PrintWriter out = null;
		BufferedWriter bw = null;
		String result;
		Scanner sc = new Scanner(System.in);
		boolean endFlag = false;

		try {
			serverSocket = new ServerSocket(9999);
			System.out.println("응답대기중...");
			socket = serverSocket.accept();
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			SimpleDateFormat date = new SimpleDateFormat("yyMMddkkssSS");
			String fileName = date.format(new Date());
			fileName = "chat_" + fileName + ".txt";
			bw = new BufferedWriter(new FileWriter(fileName));
			System.out.println("연결되었어요...");

			while (!endFlag) {
				// client의 채팅을 기다린다.
				result = in.readLine();
				// client의 채팅을 출력한다.
				System.out.println("Client >> " + result);
				// 만약, client의 채팅에 bye또는 BYE가 있으면 종료한다.
				if (result.equals("bye") || result.equals("BYE")) {
					System.out.println("채팅을 종료합니다...");
					// 그리고 파일에 계속 남겨놓은 로그를 저장하는것도 만든다.
					bw.flush();
					bw.close();
					endFlag = true;
					break;
				}
				// 로그에 저장한다.
				result = "Client >> " + result;
				for (int i = 0; i < result.length(); i++) {
					bw.write(result.charAt(i));
				}
				bw.write('\n');

				if (!endFlag) {
					// server의 채팅을 준비한다.
					System.out.print("Server >> ");
					result = sc.nextLine();
					// server의 채팅을 보낸다.
					out.println(result);
					out.flush();
					// 그리고 로그에 저장
					result = "Server >> " + result;
					for (int i = 0; i < result.length(); i++) {
						bw.write(result.charAt(i));
					}
					bw.write('\n');
					// 이상 반복
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			socket.close();
			in.close();
			out.close();
			bw.close();
			sc.close();
		}

	}
}
