package study_230405;

public class Marine extends Unit {

	Marine(String name) {
		super(name);
	}
	
	@ Override
	void attack() {
		System.out.println("탕탕탕.");
	}
	
}
