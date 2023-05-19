package study_230518;

public class User1 extends Thread {

	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}

	@Override
	public void run() {
//		calculator.setMemory(100);
		calculator.setMemory2(100);
	}
}
