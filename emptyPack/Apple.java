package emptyPack;

public class Apple extends Fluits {

	Apple(String name) {
		super(name);
	}
	
	@Override
	void buy(String name) {
		System.out.println(name+" 구매 완료");
	}
	
}
