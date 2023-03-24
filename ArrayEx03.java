package working;

public class ArrayEx03 {
	public static void main(String[] args) {
		
		int[][] A = new int[3][5];
		
		int n = 1;
		
		for(int row = 0; row < 3; row++) {
			if (row%2 == 0) {
				for(int col = 0; col < 5; col++) {
					A[row][col] = n;
					n++;
				}
			} else {
				for(int col = 4; col > -1; col--) {
					A[row][col] = n;
					n++;
				}
			}
		}
		
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 5; col++) {
				System.out.print(A[row][col] + "\t");
			}
							
			System.out.println("");
		}
		
	}
}
