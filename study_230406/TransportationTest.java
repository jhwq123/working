package study_230406;

public class TransportationTest {
	public static void main(String[] args) {
		
		// 사람이 버스를 타면, 버스타고 서울가요 출력됨.
		// 사람이 ktx를 타면, ktx타고 서울가요 출력됨.
		// 단, void안에서 쓰지말고, 메서드가 실행되야함.
		
		Man m = new Man("철수");
		Transportation[] t = new Transportation[2];
		t[0] = new ExpressBus();
		t[1] = new Ktx();
		
		m.rideVehicle(t[0]);
		m.rideVehicle(t[1]);
		
	}
}
