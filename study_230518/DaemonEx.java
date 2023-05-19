package study_230518;

public class DaemonEx {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // 반드시 이 쓰레드를 deamon으로 만들려면 start 전에 세팅 해줘야됨.
		autoSaveThread.start(); // 메인이 끝나면 같이 끝나게끔 설정함.

		try {
			Thread.sleep(1500);
			autoSaveThread.interrupt();
		} catch (InterruptedException e) {

		}

		System.out.println("메인 스레드 종료");
	}
}
