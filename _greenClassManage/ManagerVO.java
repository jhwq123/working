package _greenClassManage;

public class ManagerVO extends TeacherVO {

	private String depart;
	private String rank;
	private int money;
	private int bonus;
	
	ManagerVO (String name, int age) {
		super(name, age);
	}

	void setDepart(String depart) {
		this.depart = depart;
	}
	String getDepart() {
		return depart;
	}
	
	void setRank(String rank) {
		this.rank = rank;
	}
	String getRank() {
		return rank;
	}
	
	void setMoney(int money) {
		this.money = money;
	}
	int getMoney() {
		return money;
	}
	
	void setBonus(int bonus) {
		this.bonus = bonus;
	}
	int getBonus() {
		return bonus;
	}
	
	
	@Override
	HumanVO createHuman() {
		System.out.println("생성해유");
		return null;
	}
	
	@Override
	String readHuman() {
		return "이름: "+super.getName()+"\t| 나이: "+super.getAge()+
				"\t| 강의과목: "+depart+"\t| 급여: "+money+"\t| 보너스: "+bonus;
	}
}
