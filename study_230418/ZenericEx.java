package study_230418;

public class ZenericEx {
	// 제네릭 : 다양한 종류의 데이터를 처리할 수 있는 클래스와 메소드를 작성하는 기법
	// : 어떤 값이 하나의 참조 자료형이 아닌 여러 참조 자료형을 사용할 수 있도록 프로그래밍
	// : 하는 것.
	public static void main(String[] args) {
		ThreedPrinter printer = new ThreedPrinter();

		printer.setMaterial(new Plastic());
		Object o = new Plastic();
//		printer.setMaterial(new Powder());

		Plastic x = (Plastic) printer.getMeterial();
	}

}
