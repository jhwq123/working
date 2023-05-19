package study_230518;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("인터럽트 발생....");
				break;
			}
			save();
		}
		System.out.println("데몬 스레드 종료");
	}
}
