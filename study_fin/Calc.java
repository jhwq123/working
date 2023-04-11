package study_fin;

import java.io.Serializable;

public class Calc implements Serializable {

	private static final long serialVersionUID = 2850123849367876728L;
	private int n1;
	private int n2;
	private char c;
	private String result;

	Calc(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	static void intro() {
		System.out.println("=================");
		System.out.println("=   계산기_1.0v   =");
		System.out.println("=================\n\n");
	}

	String oper(char c) {

		switch (c) {
		case '+':
			return add() + "";
		case '-':
			return min() + "";
		case '*':
			return sub() + "";
		case '/':
			return div() + "";
		}
		return null;
	}

	int add() {
		return n1 + n2;
	}

	int min() {
		if (n2 > n1) {
			return n2 - n1;
		} else {
			return n1 - n2;
		}
	}

	int sub() {
		return n1 * n2;
	}

	double div() {
		if (n2 > n1) {
			return n2 / (double) n1;
		} else {
			return n1 / (double) n2;
		}
	}

	@Override
	public String toString() {
		return "Calc [" + n1 + "" + c + "" + n2 + " = " + result + "]";
	}

}
