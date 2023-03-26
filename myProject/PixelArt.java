package myProject;

// https://app.monopro.org/pixel/
// http://dot-e-nanika.com/index_en.html

public class PixelArt {
	public static void main(String[] args) {
		String[] marks = { "+", "!", "@", "#", "$", "%", "^", "&", "*", "i", "j", "k", "l", "n", "m" }; // 14가지 무늬
		int[][] data = { }; // 해당 공간에 unpacker 결과물 붙여넣기.

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(marks[data[i][j]] + " ");
			}
			System.out.println("");
		}

	}
}