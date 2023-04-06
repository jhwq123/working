package study_230406;

public class Man {

	String name;
	
	Man(String name) {
		this.name = name;
	}

	void rideVehicle(Transportation t) {
		t.gogoSeoul(name);
	}
	
	void rideVehicle1(Transportation t) {
		if(t.getClass() == Transportation.class) {
			System.out.println("뭐든 타고 서울가요.");
		} else if (t.getClass() == ExpressBus.class) {
			System.out.println("버스 타고 서울 가요.");
		} else if (t.getClass() == Ktx.class) {
			System.out.println("KTX 타고 서울 가요.");
		} else {
			System.out.println("무언가");
		}
	}
}
