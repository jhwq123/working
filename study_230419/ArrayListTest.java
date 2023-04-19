package study_230419;

/*
 * 1. 배열 정의 -> 길이제한 = 무제한 [배열복사]
 * 2. 배열 타입 -> 기초선언 = Object 써서, 받아온 배열을 형변환해서 주면 될듯?
 * 
 * ArrayList 모사하기
 * 값 생성할때 어떤 타입이든 받을 수 있도록 모사하기
 * 무한 배열에 값을 집어넣을 때, add메소드 이용
 * 값 얻어낼때는 get으로 얻어내기
 * print 메소드 만들어서, 배열의 모든자료 화면 출력하는거
 * add, get, print
 * 
 * 1. 배열을 선언할 수 있다.
 * 2. 배열에 값을 넣을 수 있다.
 * 3. 반복문을 사용할 수 있다.
 * 4. 조건문을 사용할 수 있다.
 * 5. 두 개의 클래스가 상속관계일 때 부모타입의 참조변수는 자식타입의 값을 받을 수 있다.
 * 6. 배열의 길이가 고정되어 있다. 길이가 변경 되지 않는다.
 * 7. 변수는 필요에 따라 임의로 만들어 사용할 수 있다.
 * 
 */

public class ArrayListTest {
	public static void main(String[] args) {

		ArrayLT<Integer> alt = new ArrayLT<>();

// Integer
//		alt.add(543);
//		alt.add(526);
//		alt.add(5447);
//		alt.add(6585);
//		alt.add(7587);
//		alt.add(659);

// Double
//		alt.add(3.14);
//		alt.add(67.14);
//		alt.add(7.14);
//		alt.add(9.14);
//		alt.add(0.145);
//		alt.add(3.1646544);

// Character
//		alt.add('A');
//		alt.add('B');
//		alt.add('C');
//		alt.add('D');
//		alt.add('E');
//		alt.add('F');

// String
//		alt.add("문자1");
//		alt.add("문자2");
//		alt.add("문자3");
//		alt.add("문자4");
//		alt.add("문자5");
//		alt.add("문자6");

		alt.print();

	}
}
