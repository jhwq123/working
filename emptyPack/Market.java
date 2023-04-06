package emptyPack;

public class Market {

	void setFluits(Fluits f) {
		f.buy(f.name);
		System.out.println(f.name+"한상자 주문이요.");
	}
	
	void getFluits(Fluits f) {
		System.out.println(f.name+"한상자 나왔습니다.");
	}
}
