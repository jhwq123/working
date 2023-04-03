package study_230403;

public class HumanTest {
	public static void main(String[] args) {
		
		Human[] hList = new Human[250];
		
		for(int i = 0; i < 250; i++) {
			hList[i] = new Human();
		}
		
		for (int i = 0; i < 250; i++) {
			System.out.print(hList[i].num+"번째 인간 레벨: ");
			System.out.println(hList[i].lev);
		}
	}
}
