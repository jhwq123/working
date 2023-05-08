package study_230508;

class MyRunnable implements Runnable {

	String myName;

	public MyRunnable(String myName) {
		this.myName = myName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(myName);
		}
	}
}

public class ThreadTest3 {
	public static void main(String[] args) {

		Thread t1 = new Thread(new MyRunnable("개미"));
		Thread t2 = new Thread(new MyRunnable("휴지"));
		t1.start();
		t2.start();

	}
}
