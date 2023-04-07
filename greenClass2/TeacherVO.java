package greenClass2;

public class TeacherVO extends HumanVO {

	private String sub;
	private int money;
	private int bonus;
	
	TeacherVO (String name, int age) {
		super(name, age);
		super.setType(1);
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return "TeacherVO ["+super.toString()+"sub=" + sub + ", money=" + money + ", bonus=" + bonus + "]";
	}
	
}
