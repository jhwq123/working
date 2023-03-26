package chapter02_1;

public class Copy {
	public static void main(String[] args) {
		String origin="가나다라";
		String copy=origin;
		System.out.println(origin);
		System.out.println(copy);
		
		copy += "마바사";
		
		System.out.println(copy);
	}
}