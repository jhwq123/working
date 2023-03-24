package working;

public class std_230321_2 {
	public static void main(String[] args) {
		greeting(11);
		greeting(13);
	}

	static void greeting(int hour) {
		if (hour < 12) {
			System.out.println("좋은 아침");			
		} else {
			System.out.println("점심 먹자");						
		}
	}
}
