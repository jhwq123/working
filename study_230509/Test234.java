package study_230509;

public class Test234 {
	public static void main(String[] args) {

		int temp = 0;
		for (int i = 0; i < 3500; i++) {
			if ((i % 4 == 0 && !(i % 100 == 0)) || i % 400 == 0) {
				temp++;
			}
		}
		System.out.println(temp);

	}
}
