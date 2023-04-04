package study_230404;

public class Passenger {
	String name;
	int money;
	
	public Passenger(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(int price, Bus bus) {
		//승객이 버스를 타면 승객의 돈은 줄어든다.
		money = money - price;
		//버스의 승객수는 증가한다. 버스의 수입은 올라간다.(버스가 이 메소드안에 존재해야함.)
		bus.take(price);
		
	}
	
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"원 입니다.");
	}
}
