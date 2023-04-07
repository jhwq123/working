package greenClass2;

public class StudentVO extends HumanVO{

	private static int cnt;
	private int number;
	private String sub;
	private String major;
	
	StudentVO (String name, int age) {
		super(name, age);
		super.setType(2);
		number = ++cnt;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "StudentVO ["+super.toString()+"number=" + number + ", sub=" + sub + ", major=" + major + "]";
	}
}
