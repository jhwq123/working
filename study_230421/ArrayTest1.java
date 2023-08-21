package study_230421;

/*
 *	3행 3열짜리 문자열 배열을 선언 및 할당하고 
 *	인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 
 *	“(0, 0)”과 같은 형식으로 저장 후 출력하세요.
 */
public class ArrayTest1 {
	public static void main(String[] args) {

		String[][] ary = new String[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ary[i][j] = "(" + i + ", " + j + ")";
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(ary[i][j] + "");
			}
			System.out.println();
		}

	}
}
