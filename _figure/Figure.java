package _figure;

public class Figure {

	int a;
	int b;
	int c;
	String round = "둘레: ";
	String area = "넓이: ";
		
	Figure(int a) {
		this.a = a;
	}
	
	Figure(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	Figure(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	
	public String round() {
		System.out.println("둘레구함");
		return "";
	}
	
	public String area() {
		System.out.println("넓이구함");
		return "";
	}
	
	
}
