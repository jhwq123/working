package study_230405;

public class Hydra extends Unit{

	Hydra(String name) {
		super(name);
	}
	
	@ Override
	void attack() {
		System.out.println("퉤퉤퉤.");
	}
	
}
