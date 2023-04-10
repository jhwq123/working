package study_fin;

public class ScoreTest {
	public static void main(String[] args) {
		ScoreService service = new ScoreService();
		service.intro();
		
		try {
			Score[] sl = new Score[3];
			System.out.println(sl[2].toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("문제 발생~");
		}
		
		while(true) {
			service.mainServe();
		}
	}	
}
