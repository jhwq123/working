package chapter02_test;

public class Cylinder {
	public static void main(String[] args) {
		double r = 7;
		double h = 5;
//		1. 7과 5를 가지고 메소드 호출
//		4. 결과 값 리턴 
		double result = volume(r, h);
		System.out.println("반지름: "+r+", 높이: "+h+"인 원통의 부피는 "+Math.floor(result * 100)/100+"입니다.");
	}
//	매개변수가 2개인 메소드(원기둥 부피 구하기)
//	2. 7을 radius, 5를 height로 받는다.
	public static double volume(double radius, double height) {
//		3. radius, height에 5와 7의 값을 가지고 계산 후 반환
		return Math.PI * radius * radius * height;
	}
}