package study_230508;

class MyThread3 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread3 실행");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread4 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread4 실행");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		Thread t3 = new Thread(new MyThread3());
		Thread t4 = new Thread(new MyThread4());
		t3.start();
		t4.start();
		System.out.println("쓰레드 진행중~");
	}
}
