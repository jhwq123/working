package _DBPKG;

public class BoardTest {
	public static void main(String[] args) throws Exception {

		// 메인에서 굴리는거
		BoardDAO bdao = new BoardDAO();
		while (true) {

			bdao.select();

			bdao.mainDB();
		}

	}
}