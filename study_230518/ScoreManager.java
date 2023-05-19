package study_230518;

public class ScoreManager {

	public void validScoreRange(int score) throws MinusException, Over100Exception {
		if (score < 0) {
			throw new MinusException("음수는 입력할 수 없습니다.");
		} else if (score > 100) {
			throw new Over100Exception("점수는 100을 넘을 수 없습니다.");
		} else {
			System.out.println("정상값입니다.");
		}
	}

}
