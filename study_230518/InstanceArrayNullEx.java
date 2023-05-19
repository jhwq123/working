package study_230518;

class Student {
	int sno;
	String name;
	int score;

	public String toString() {
		return sno + " | " + name + " | " + score;
	}
}

public class InstanceArrayNullEx {
	public static void main(String[] args) {
		// int[] array = new int[3];
		// int[] array = {1, 2, 3}; // 배열 초기화
		// Student stu01 = new Student(1, "홍길동", 100);
		// Student[] array = {stu01, new Student(2, "멍멍이", 97), new Student(3, "비해피",
		// 70)}; // 배열 초기화
		Student[] students = new Student[3];

		try {
			// students[0] = new Student();
			students[0].sno = 1;
			students[0].name = "apple";
			students[0].score = 70;
		} catch (NullPointerException e) {
			// e.printStackTrace();
			// System.out.println(e.getMessage());
			// System.out.println("배열에 먼저 Student객체를 저장하세요.");
		}
		// System.out.println(students[0]);
	}
}
