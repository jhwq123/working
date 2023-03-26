package chapter02_4;

/*
 * 원의 면적 구하기
 * 공식 = 파이 * r^2
 * */
public class CircleArea {
	public static void main(String[] args) {
//		double pi = 3.14;
		final double PI = 3.14;
		double radius = 10.0;
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 = " + circleArea);
	}
}