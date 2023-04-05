package study_230405;

public class Figure {

	int a;
	int b;
	
	Figure(int a) { // 원
		this.a = a;
	}
	
	Figure(int a, int b) { // 사각형, 삼각형
		this.a = a;
		this.b = b;
	}
	
	void Area() {
		System.out.println("면적을 구할겁니다.");
	}
	
}
