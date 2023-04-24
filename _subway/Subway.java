package _subway;

public class Subway {

	private static Sandwitch sw;

	public static void setSandwitch(Bread b, Meat m, Veget v, Sauce s) {
		System.out.println("샌드위치를 만듭니다.");
		System.out.println("빵: " + b.getBread());
		System.out.println("고기: " + m.getMeat());
		System.out.println("야채: " + v.getVeget());
		System.out.println("소스: " + s.getSauce());
		Sandwitch sw = new Sandwitch(b, m, v, s);
		Subway.sw = sw;
		System.out.println("샌드위치가 완성되었습니다.");
	}

	public static void setComboSandwitch(Bread b, Meat m, Veget v, Sauce s, Cookie c, Bever e) {
		System.out.println("샌드위치를 만듭니다.");
		System.out.println("빵: " + b.getBread());
		System.out.println("고기: " + m.getMeat());
		System.out.println("야채: " + v.getVeget());
		System.out.println("소스: " + s.getSauce());
		System.out.println("샌드위치가 완성되었습니다.");
		System.out.println("쿠키: " + c.getCookie());
		System.out.println("음료: " + e.getBever());
		Sandwitch sw = new Sandwitch(b, m, v, s, c, e);
		Subway.sw = sw;
		System.out.println("세트가 완성되었습니다.");
	}

	public static Sandwitch getSandwitch() {
		if (sw.cookie == null) {
			System.out.println("샌드위치를 제공합니다.");
			return sw;
		} else {
			System.out.println("샌드위치 세트를 제공합니다.");
			return sw;
		}
	}

}
