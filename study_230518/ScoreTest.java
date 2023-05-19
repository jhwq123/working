package study_230518;

public class ScoreTest {
	public static void main(String[] args) {
		ScoreManager sm = new ScoreManager();
		try {
			sm.validScoreRange(100);
		} catch (MinusException | Over100Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
