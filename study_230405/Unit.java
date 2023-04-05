package study_230405;

public class Unit {

	String name;
	
	Unit(String name) {
		this.name = name;
	}
	
//	@ Override
	void attack() {
		System.out.println("여기서 공격합니다.");
	}
	
}
