package study_fin;

public class Calc {

	static void intro() {
		System.out.println("=================");
		System.out.println("=   계산기_1.0v   =");
		System.out.println("=================\n\n");
	}
	
	static String oper(int n1, int n2, char c) {
		
		switch(c) {
		case'+': 
			return Calc.add(n1, n2)+"";
		case'-': 
			return Calc.min(n1, n2)+"";
		case'*': 
			return Calc.sub(n1, n2)+"";
		case'/': 
			return Calc.div(n1, n2)+"";
		}
		return null;
	}
	
	static int add(int n1, int n2) {
		return n1+n2;
	}
	
	static int min(int n1, int n2) {
		if (n2 > n1) {
			return n2-n1;
		} else {
			return n1-n2;			
		}
	}
	
	static int sub(int n1, int n2) {
		return n1*n2;
	}
	
	static double div(int n1, int n2) {
		if (n2 > n1) {
			return n2/(double)n1;			
		} else {
			return n1/(double)n2;			
		}
	}
	
}
