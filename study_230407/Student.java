package study_230407;

public class Student {
	private int sno;
	private String name;
	
	public Student() {
		;
	}
	
	public Student(int sno) {
		this.sno = sno;
	}
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
//	@Override
//	public String toString() {
//		
//		return "번호 : " + sno + "이름 : " + name;
//	}
	
	
	
}
