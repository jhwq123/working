package study_230518;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ReceiverThread extends Thread {

	private Socket socket;

	public ReceiverThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		System.out.println("채팅방에 입장했습니다....");
		System.out.println("원활한 채팅 부탁드립니다.");
		String inMsg = "";

		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			while (true) {
				inMsg = in.readLine();
				System.out.println(inMsg);
			}

		} catch (SocketException e) {
			System.out.println("접속을 종료합니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
