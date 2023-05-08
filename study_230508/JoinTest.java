package study_230508;

class MonThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + i);

		}
	}
}

public class JoinTest {
	public static void main(String[] args) {
		MonThread mt1 = new MonThread();
		MonThread mt2 = new MonThread();
		mt1.start();
		try {
			mt1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		mt2.start();
	}
}
