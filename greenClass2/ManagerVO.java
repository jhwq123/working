package greenClass2;

public class ManagerVO extends HumanVO {

	private String depart;
	private String rank;
	private int money;
	private int bonus;
	
	ManagerVO (String name, int age) {
		super(name, age);
		super.setType(0);
		super.setId("admin");
		super.setPw("1234");
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
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
		return "ManagerVO ["+super.toString()+"depart=" + depart + ", rank=" + rank + ", money=" + money + ", bonus=" + bonus + "]";
	}
	
}
