package study_230508;

public class RecordTest {
	public static void main(String[] args) {

		double start = System.currentTimeMillis();
		System.out.println(start);

		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}

		double end = System.currentTimeMillis();
		System.out.println(end);

		System.out.println((end - start) / 1000 + "초");

	}
}
