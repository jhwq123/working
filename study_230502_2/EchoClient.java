package study_230502_2;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Socket socket = null;
		OutputStream out = null;
		DataOutputStream dos = null;

		try {
			socket = new Socket("localhost", 8111);
			System.out.println("서버 연결 완료");
			out = socket.getOutputStream();
			dos = new DataOutputStream(out);

			System.out.println("서버로 전송할 메시지를 입력하세요");
			String msg = sc.nextLine();
			dos.writeUTF(msg);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				out.close();
				dos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		sc.close();
	}
}
