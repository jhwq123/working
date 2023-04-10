package study_fin;

public class BookTest {
	public static void main(String[] args) {
		BookService service = new BookService();
		
		service.intro();
		
		while(true) {
			service.mainLib();
		}
	}
}
