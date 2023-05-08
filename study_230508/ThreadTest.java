package study_230508;

class MyThread extends Thread {
	@Override
	public void run() {
		int j = 1;
		for (int i = 0; i < 10; i++) {
			System.out.println(j + " 쓰레드 동작");
		}
	}

}

class MyThread2 extends Thread {
	@Override
	public void run() {
		int j = 2;
		for (int i = 0; i < 10; i++) {
			System.out.println("무한" + j + "쓰레드");
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "번째 종료.");
		}

	}
}
