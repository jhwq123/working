package chapter06_4;

public class Calc {
	
	int add(int num1, int num2) {
		return num1+num2;
	}

	int sub(int num1, int num2) {
		if (num1 > num2) {
			return num1-num2;			
		} else {
			return num2-num1;						
		}
	}

	int mul(int num1, int num2) {
		return num1*num2;
	}

	double div(int num1, int num2) {
		return num1/(double)num2;
	}
}