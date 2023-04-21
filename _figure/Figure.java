package _figure;

public abstract class Figure {

	int a;
	int b;
	int c;
	public String round = "둘레: ";
	public String area = "넓이: ";

	// 원
	Figure(int a) {
		this.a = a;
	}

	// 삼각형, 사각형
	Figure(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// 다각형
	Figure(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	abstract String round();

	abstract String area();

}
