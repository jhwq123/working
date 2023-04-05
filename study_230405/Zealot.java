package study_230405;

public class Zealot extends Unit{

	Zealot(String name) {
		super(name);
	}
	
	@ Override
	void attack() {
		System.out.println("콕콕콕.");
	}
	
}
