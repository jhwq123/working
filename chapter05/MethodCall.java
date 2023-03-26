package chapter05;

public class MethodCall {
	// 함수가 함수 호출

	public static void main(String[] args) {
		teacher(); // 선생이 학생1 호출
	}
		
	static void teacher( ) {
		System.out.println("선생: 내 밑으로 다 집합\n");
		stu01(); // 학생1이 학생2 호출
	}
	
	static void stu01() {
		System.out.println("학생 1번 입니다.");
		System.out.println("학생 2 나와라\n");
		stu02(); // 학생2가 학생3 호출
	}
	
	static void stu02() {
		System.out.println("학생 2번 입니다.");
		System.out.println("학생 3 나와라\n");
		stu03(); // 학생3이 마무리
	}

	static void stu03() {
		System.out.println("학생 3번 입니다.");
		System.out.println("번호 끝\n");
	}
}
