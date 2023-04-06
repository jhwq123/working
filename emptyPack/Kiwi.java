package emptyPack;

public class Kiwi extends Fluits {

	Kiwi(String name) {
		super(name);
	}
	
	@Override
	void buy(String name) {
		System.out.println(name+" 구매 완료");
	}
	
}
