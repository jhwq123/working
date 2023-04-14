package _greenClassManage;

public class HumanVO {

	private String name;
	private int age;
	private String id;
	private String pw;
	
	HumanVO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void setId(String id) {
		this.id = id;
	}
	String getId() {
		return id;
	}
	
	void setPw(String pw) {
		this.pw = pw;
	}
	String getPw() {
		return pw;
	}
	
	HumanVO createHuman() {
		System.out.println("생성해유");
		return null;
	}
	
	String readHuman() {
		System.out.println("읽어유");
		return "";
	}
	
}
