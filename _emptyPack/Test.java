package _emptyPack;

class A{
	private int a;
	
	public A() {
		System.out.println("A클래스의 생성자 실행");
	}
	
	void setA(int a) {
		this.a = a;
	}
	
	int getA() {
		return a;
	}
}

class B extends A {

	String s;
	
	public B() {
		System.out.println("B클래스의 생성자 실행");
	}
	
}

public class Test {
	public static void main(String[] args) {
//		A a = new A();
		A a = new B();
		
		a.getA();
		a.setA(0);
		
		B b = (B) a;
		String g = b.s;
		
	}
}
