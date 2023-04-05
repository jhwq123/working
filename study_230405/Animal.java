package study_230405;

public class Animal {
	
	String name;
	
	public Animal(String name) {
		this.name = name;
		System.out.println("동물이 생성되었습니다.");
	}
	
	void cry() {
		System.out.println("동물이 웁니다.");
	}
	
}
