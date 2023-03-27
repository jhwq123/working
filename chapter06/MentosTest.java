package chapter06;

// 멘토스를 만들어 팔자

public class MentosTest {
	public static void main(String[] args) {
	
		String[] flavors = {"푸르티", "믹스", "레인보우", 
				"카라멜초코", "화이트초코", "민트초코", "콜라",
				"요거트", "스무디", "소다킥", "레몬라임", "딸기맛",
				"스피아민트맛", "시나몬맛"};
		
		Mentos[] mentos = new Mentos[14];
		
		for (int i = 0; i < mentos.length; i++) {
			mentos[i].flavor = flavors[i];
		}
		
	}
}
