package study_230508;

// [완료]

// 달리기 경주
// 3명? 정도 정해진 거리 달려서
// 도착 하면, 걸린시간 출력하기

import java.util.Random;

class MonkeyThread implements Runnable {

	String name;
	int count;
	double start;
	double end;
	double record;
	static int idx = 0;
	static String[] names = new String[3];
	static double[] scores = new double[3];

	MonkeyThread(String name, int count) {
		this.name = name;
		this.count = count;
		start = 0;
		end = 0;
		record = 0;
	}

	@Override
	public void run() {
		Random rd = new Random();

		start = System.currentTimeMillis();

		for (int i = 0; i < count; i++) {
			System.out.println(name + " 달립니다!");
			try {
				int time = rd.nextInt(500) + 1;
				Thread.sleep(time);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		end = System.currentTimeMillis();
		record = (end - start) / 1000;
		names[idx] = name;
		scores[idx] = record;
		idx++;
		System.out.println(name + " 도착!");
		System.out.println(name + "걸린 시간 : " + record + "s");

		if (scores[2] != 0) {
			System.out.println("\n\n결과 발표");
			for (int i = 0; i < names.length; i++) {
				System.out.println((i + 1) + "등 [" + names[i] + "] : " + scores[i] + "초");
			}

		}
	}
}

public class RunnerGame {
	public static void main(String[] args) {
		int count = 100;

		Thread t1 = new Thread(new MonkeyThread("거북이", count));
		Thread t2 = new Thread(new MonkeyThread("원숭이", count));
		Thread t3 = new Thread(new MonkeyThread("토끼", count));

		System.out.println("원숭이배 " + count + "m 달리기경주 시작");
		t1.start();
		t2.start();
		t3.start();
	}
}
