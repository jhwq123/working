package _emptyPack;

public class Banana extends Fluits {

	Banana(String name) {
		super(name);
	}
	
	@Override
	void buy(String name) {
		System.out.println(name+" 구매 완료");
	}
	
}
