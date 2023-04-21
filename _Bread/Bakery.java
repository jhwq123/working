package _Bread;

import java.util.Random;

public class Bakery {

	private static Bread b;

	public static void setBread(Bread b) {
		Random rd = new Random();
		System.out.println("빵 재료를 준비합니다.");
		System.out.println("밀가루: " + b.getFlour() + "g");
		System.out.println("물을 준비합니다.");
		System.out.println("물: " + b.getWater() + "ml");
		System.out.println("이스트를 준비합니다..");
		System.out.println("이스트: " + b.getWater() + "g");
		System.out.println("잘 섞어줍니다...");
		System.out.println("빵을 굽겠습니다, 일정확률로 폭발합니다.");
		System.out.println();
		int chance = rd.nextInt(10) + 1;
		if (chance <= 2) {
			System.out.println("빵이 폭발했습니다.");
			b = null;
		} else {
			System.out.println("빵이 잘 부풀어 올랐습니다.");
			System.out.println("앙고를 넣습니다.");
			System.out.println("앙고: " + b.getSauce());
			System.out.println("빵 굽는 중....");
			System.out.println("빵 굽기 완료");
			Bakery.b = b;
		}

	}

	public static void getBread() {
		System.out.println();
		if (b != null) {
			System.out.println(b.getSauce() + "빵을 찾았습니다.");
		} else {
			System.out.println("빵이 없습니다.");
		}
		System.out.println();
		b = null;
	}

}
