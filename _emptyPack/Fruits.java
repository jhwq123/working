package _emptyPack;

public class Fruits {

	String name;
	int money;

	public Fruits(String name, int money) {
		this.name = name;
		this.money = money;
	}

	void buy() {
		System.out.println(name + " 구매 완료 / 가격 : " + money);
	}

}
