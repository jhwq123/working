package study_230501;

public class AcademyA implements IScoreManager {

	@Override
	public void regist(StudentVO student) {
		student.setSno(1);
		student.setName("홍길동");

		Subject[] subLists = new Subject[2];

		subLists[0] = new Subject("JAVA", 77);
		subLists[1] = new Subject("SQL", 50);

		student.setSubjects(subLists);
	}

	@Override
	public int getTotal(StudentVO student) {
		int total = 0;
		for (int i = 0; i < student.getSubjects().length; i++) {
			total += student.getSubjects()[i].getScore();
		}
		return total;
	}

	@Override
	public double getAvg(int total, int length) {
		double avg = (double) total / length;
		return avg;
	}

	@Override
	public String passOrFail(StudentVO student) {
		String pass = "수료";
		// 수료, 미수료 여부확인
		for (int i = 0; i < student.getSubjects().length; i++) {
			if (student.getSubjects()[i].getScore() < 60) {
				pass = "미수료";
				return pass;
			}
		}
		return pass;
	}

}
