package study_230508;

// 달리기 경주
// 3명? 정도 정해진 거리 달려서
// 도착 하면, 걸린시간 출력하기

class MonkeyThread implements Runnable {

	int dimension;
	int speed;
	String name;
	double time;
	int num;

	MonkeyThread(int dimension, int speed, String name, int num) {
		this.dimension = dimension;
		this.speed = speed;
		this.name = name;
		this.num = num;
		this.time = 0;
	}

	@Override
	public void run() {
		while (dimension > speed) {
			for (int i = 0; i < num; i++) {
				;
			}
			System.out.println(name + " 달립니다!");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			dimension -= speed;
			time++;
		}
		time += (speed + dimension) / 1000.0;
		System.out.println(name + " 도착!");
		System.out.println(name + "걸린 시간 : " + time + "s");
	}
}

public class RunnerGame {
	public static void main(String[] args) {
		int dim = 1000;

		Thread t1 = new Thread(new MonkeyThread(dim, 10, "거북이", 1));
		Thread t2 = new Thread(new MonkeyThread(dim, 23, "원숭이", 3));
		Thread t3 = new Thread(new MonkeyThread(dim, 17, "토끼", 2));

		System.out.println("원숭이배 " + dim + "m 달리기경주 시작");
		t1.start();
		t2.start();
		t3.start();

	}

}
