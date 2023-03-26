package chapter02_4;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호이름직업");
		System.out.println("번호\t이름\t직업");
		System.out.print("행 단위 출력");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력");
		System.out.println(); // 엔터
		System.out.println("우리는 개발자 입니다.");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄여름가을겨울");
		System.out.println("봄\\여름\\가을\\겨울");
	}
}