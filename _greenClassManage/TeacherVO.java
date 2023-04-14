package _greenClassManage;

public class TeacherVO extends StudentVO {

	private String sub;
	private int money;
	private int bonus;
	
	
	TeacherVO(String name, int age) {
		super(name, age);
	}
	
	void setSub(String sub) {
		this.sub = sub;
	}
	String getSub() {
		return sub;
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
//		Teacher teacher = new Teacher("승호", 40);
//		teacher.setSub("JAVA");
//		teacher.setMoney(2500000);
//		teacher.setBonus(1000000);
//		return teacher;
		return null;
		// 기능 x
	}
	
	@Override
	String readHuman() {
		return "이름: "+super.getName()+"\t| 나이: "+super.getAge()+
		"\t| 강의과목: "+sub+"\t| 급여: "+money+"\t| 보너스: "+bonus;
	}
}
