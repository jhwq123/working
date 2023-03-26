package chapter02_2;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour=3;
		int minute=5;
//		정수 출력
		System.out.println(hour+minute);
//		문자열 출력
		System.out.println((hour+"시간"+minute+"분").getClass());
		
		int totalMinute = (hour*60)+minute;
		System.out.println("총"+totalMinute+"분");
	}
}