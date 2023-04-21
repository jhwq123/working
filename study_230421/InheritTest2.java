package study_230421;

/*
 * 과일객체를 상속받은 여러종류의 과일의 구매금액 합계 구하는거
 * 과일객체와 여러종류의 과일은 _emptyPack에 할당되어있음.
 */
import _emptyPack.Apple;
import _emptyPack.Banana;
import _emptyPack.Kiwi;
import _emptyPack.Market;

public class InheritTest2 {
	public static void main(String[] args) {

		Market.setPocketMoney(0);
		Apple a = new Apple("apple", 2000);
		Banana b = new Banana("banana", 1500);
		Kiwi k = new Kiwi("kiwi", 2500);

		System.out.println();

		Market.setFluits(a);
		Market.getFluits(a);

		System.out.println();

		Market.setFluits(b);
		Market.getFluits(b);

		System.out.println();

		Market.setFluits(k);
		Market.getFluits(k);

	}
}
