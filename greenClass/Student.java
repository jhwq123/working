package greenClass;

public class Student extends Human {

	private static int cnt;
	private int number;
	private String sub;
	private String major;
	
	Student(String name, int age) {
		super(name, age);
		cnt++;
		this.number = cnt;
	}
	
	void setSub(String sub) {
		this.sub = sub;
	}
	String getSub() {
		return sub;
	}
	
	void setMajor(String major) {
		this.major = major;
	}
	String getMajor() {
		return major;
	}
	
	@Override
	Human createHuman() {
		return null;
	}
	
	@Override
	String readHuman() {
		return "번호: "+number+"\t| 이름: "+super.getName()+"\t| 나이: "+super.getAge()+
				"\t| 수강과목: "+sub+"\t| 전공여부: "+major;
	}
}
