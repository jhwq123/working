package greenClass2;

public abstract class HumanVO {

	private int type;
	private String name;
	private int age;
	private String id;
	private String pw;
	
	abstract HumanVO createHuman();
}
