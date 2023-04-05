package study_230405;

public class UnitTest {
	public static void main(String[] args) {
		
		Unit[] u = new Unit[3];
		u[0] = new Marine("마린");
		u[1] = new Hydra("히드라");
		u[2] = new Zealot("질럿");
		
		for(int i = 0; i < 3; i++) {
			u[i].attack();
		}
		
	}
}
