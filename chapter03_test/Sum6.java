package chapter03_test;

public class Sum6 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i+j == 6) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
		
	}
}