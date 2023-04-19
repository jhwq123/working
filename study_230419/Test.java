package study_230419;

public class Test {
	public static void main(String[] args) {

		StudentService service = new StudentService();

		service.sList[0] = new Student(1, "몰루", 54);
		service.sList[1] = new Student(2, "아루", 84);
		service.sList[2] = new Student(3, "털자", 65);
		service.sList[3] = new Student(4, "밍나", 35);
		service.sList[4] = new Student(5, "쟈몽", 95);

		System.out.println(service.getLastStudent());
		System.out.println(service.getTotalScore());
		System.out.println(service.getScoreMaxStudent());
		System.out.println(service.getScoreMinStudent());
	}

}
