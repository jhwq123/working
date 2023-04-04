package study_230404;

public class Bus {
	String busNumber;
	int passengerCount;
	int money;
	
	public Bus(String busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int price) { // 승객이 탐.
		money = money + price;
		passengerCount = passengerCount + 1;
	}
	
	void showInfo() {
		System.out.println(busNumber+"번 버스의 승객 수는 "+passengerCount+"명이고, 수입은 "+money+"원입니다.");
	}
	
	// 승객이 버스를 탑니다.
}
