package study_230509;

// userVO를 foodRecipeVO가 상속

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String something = "";
		String input = "";
		int n = 1;

		System.out.println("요리순서 입력 ('끝'입력시 종료됨)");

		while (!input.equals("exit")) {
			System.out.print(n + ". ");
			input = sc.nextLine();
			if (!input.equals("exit")) {
				something = something + n + ") " + input + "\n";
			}
			n++;
		}

		System.out.println("출력값:");
		System.out.println(something);

		sc.close();
	}
}
