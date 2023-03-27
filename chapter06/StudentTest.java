package chapter06;

public class StudentTest {
	public static void main(String[] args) {
		// 학생 배열 만들기 --> 선언하기(3개 저장)
		
		Student[] students = new Student[3];
		
		Student std01 = new Student(1, "현우");
		Student std02 = new Student(2, "선영");
		Student std03 = new Student(3, "상훈");
		
		students[0] = std01;
		students[1] = std02;
		students[2] = std03;
		
		for (int i = 0; i < 3; i++) {
			students[i].showStudentInfo();			
		}
	}
}
