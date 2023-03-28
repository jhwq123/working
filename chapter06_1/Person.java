package chapter06_1;

public class Person {
	
	private String name;
	private int age;
	
//	public Person() { // 생략할 수 있음.
//		;
//	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age;
	}
}
