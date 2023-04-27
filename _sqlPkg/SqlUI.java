package _sqlPkg;

import java.util.Scanner;

public class SqlUI {
	Scanner sc = new Scanner(System.in);

	String userInput(String value) {
		System.out.print(value + "값 입력>> ");
		String sel = sc.next();
		return sel;
	}

	String userInputS(String value) {
		System.out.print(value + "값 입력>>");
		String sel = sc.nextLine();
		sel = sc.nextLine();
		return sel;
	}

	void topGrid(int dataLength) {
		System.out.println();
		System.out.print("┌");
		for (int i = 1; i <= dataLength; i++) {
			System.out.print("───────");
			if (i != dataLength) {
				System.out.print("┬");
			}
		}
		System.out.println("┐");
	}

	void titleGrid(String[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print("│" + data[i] + "\t");
		}
		System.out.println("│");
	}

	void betweenGrid(int dataLength) {
		System.out.print("├");
		for (int i = 1; i <= dataLength; i++) {
			System.out.print("───────");
			if (i != dataLength) {
				System.out.print("┼");
			}
		}
		System.out.println("┤");
	}

	void bottomGrid(int dataLength) {
		System.out.print("└");
		for (int i = 1; i <= dataLength; i++) {
			System.out.print("───────");
			if (i != dataLength) {
				System.out.print("┴");
			}
		}
		System.out.println("┘");
	}

}
