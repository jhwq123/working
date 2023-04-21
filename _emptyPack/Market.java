package _emptyPack;

public class Market {

	private static int totalMoney;

	public static void setPocketMoney(int totalMoney) {
		Market.totalMoney = totalMoney;
	}

	public static int getPocketMoney() {
		return totalMoney;
	}

	public static void setFluits(Fruits f) {
		System.out.println(f.name + " 하나 주문이요.");
		f.buy();
		totalMoney += f.money;
		System.out.println("구매 총액: " + totalMoney);
	}

	public static void getFluits(Fruits f) {
		System.out.println(f.name + " 하나 나왔습니다.");
	}
}
