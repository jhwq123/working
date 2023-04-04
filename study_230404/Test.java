package study_230404;

public class Test {
	public static void main(String[] args) {
		Passenger p1 = new Passenger("홍길동", 15000);
		Passenger p2 = new Passenger("고길동", 20000);
		Bus bus = new Bus("44");
		
		p1.takeBus(1000, bus);
		p2.takeBus(500, bus);
		
		p1.showInfo();
		p2.showInfo();
		
		bus.showInfo();
	}
}
