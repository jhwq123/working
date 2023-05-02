package study_230501;

public class TestA {

	static StudentVO student = new StudentVO();

	public static void main(String[] args) {

		regist(student);
		System.out.println(student);

		int total = getTotal();
		System.out.println(total);

		double avg = getAvg(total);
		System.out.println(avg);

		String pass = passOrFail();
		System.out.println(pass);

	}

	public static void regist(StudentVO student) {

		student.setSno(1);
		student.setName("홍길동");

		Subject[] subLists = new Subject[2];

		subLists[0] = new Subject("JAVA", 77);
		subLists[1] = new Subject("SQL", 50);

		student.setSubjects(subLists);
	}

	public static int getTotal() {
		int total = 0;
		for (int i = 0; i < student.getSubjects().length; i++) {
			total += student.getSubjects()[i].getScore();
		}
		return total;
	}

	public static double getAvg(int total) {
		double avg = (double) total / student.getSubjects().length;
		return avg;
	}

	public static String passOrFail() {
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
