package study_230421;

// 별찍기 - 세개 세줄

// 별찍기 - 하나에서 다섯까지
// 별찍기 - 다섯에서 하나까지
// 별찍기 - 하나에서 다섯까지 피라미드 모양으로
/*
 * 
 *        *		(space 4, * 1)
 *       * *	(space 3, * 2)
 *      * * *	(space 2, * 3)
 *     * * * *	(space 1, * 4)
 *    * * * * *	(space 0, * 5)
 */

public class DoubleLoopTest3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = (5 - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
