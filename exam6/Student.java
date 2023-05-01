package exam6;

public interface Student {

	int sno = 0;
	String sname = "";

	abstract String getScore();

	abstract String getPass();

	abstract int getTotal();

	abstract double getAvg();
}
