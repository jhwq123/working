package study_230508;

import java.util.Random;

import lombok.Data;

// 달리기 경주
// 3명? 정도 정해진 거리 달려서
// 도착 하면, 걸린시간 출력하기

@Data
class AnimalVO {
	int dimension;
	String name;
	int speed;
	double time;
	int rank;

	AnimalVO(String name, int speed, int dimention) {
		this.dimension = dimention;
		this.name = name;
		this.speed = speed;
		this.time = 0;
		this.rank = 0;
	}
}

class MonkeyThread2 implements Runnable {

	AnimalVO[] al;
	int dimension;
	int length;
	static Boolean[] flag = { false, false, false };

	MonkeyThread2(int dimension, AnimalVO[] al) {
		this.dimension = dimension;
		length = dimension / 10;
		this.al = al;
	}

	@Override
	public void run() {
		Random rd = new Random(); // 1 ~ 30
		while (true) {
			for (int i = 0; i < 80; i++) {
				System.out.println();
			}
			System.out.println("원숭이배 " + dimension + "m 달리기경주 시작");
			for (int i = 0; i < al.length; i++) {

				al[i].setSpeed(rd.nextInt(30) + 1);

				if (al[i].dimension > al[i].speed) {
					System.out.print(al[i].name + " 거리\t |");
					int temp = length - (al[i].dimension / 10);
					for (int j = 0; j < temp - 1; j++) {
						System.out.print("=");
					}
					System.out.print("♟");
					for (int j = 0; j < length - temp; j++) {
						System.out.print("-");
					}
					System.out.println("│\t");

					al[i].dimension -= al[i].speed;

					if (al[i].dimension <= al[i].speed) {
						al[i].time += (al[i].speed + al[i].dimension) / 1000.0;
						al[i].dimension = 0;
						break;
					}
					al[i].time++;
				} else {
					System.out.print(al[i].name + " 거리\t |");
					for (int j = 0; j < length - 1; j++) {
						System.out.print("=");
					}
					System.out.print("♟│ ");
					System.out.print(al[i].name + " 도착! / 걸린 시간 : " + al[i].time + "s\n");
					flag[i] = true;
				}
			}
			System.out.println();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (flag[0] && flag[1] && flag[2]) {
				System.out.println("\n\n\n");
				System.out.println("결과 발표: ");
				double[] ranks = new double[al.length];
				for (int i = 0; i < al.length; i++) {
					ranks[i] = al[i].time;
				}
				// al.time[123]으로 줄세우기
				for (int i = 0; i < al.length; i++) {
					for (int j = 0; j < al.length; j++) {
						if (al[j].time > al[i].time) {
							ranks[i] = al[j].time;
						}
					}
				}
				break;
			}
		}

	}
}

public class RunnerGameUpgrade {
	public static void main(String[] args) throws Exception {

		int dim = 100;

		AnimalVO[] al = new AnimalVO[3];
		AnimalVO a1 = new AnimalVO("거북이", 10, dim);
		AnimalVO a2 = new AnimalVO("원숭이", 23, dim);
		AnimalVO a3 = new AnimalVO("토끼", 17, dim);

		al[0] = a1;
		al[1] = a2;
		al[2] = a3;

		Thread t1 = new Thread(new MonkeyThread2(dim, al));

		t1.start();
	}

}
