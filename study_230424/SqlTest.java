package study_230424;

public class SqlTest {
	public static void main(String[] args) throws Exception {
		ContentService service = new ContentService();

		service.select();

		service.update();
		// service.delete();
	}
}
