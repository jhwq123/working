package study_230403;

public class GreenStudent {

	static private int idx;
	static private int cnt_a;
	static private int cnt_b;
	static private int cnt_c;
	static private String list_a = "";
	static private String list_b = "";
	static private String list_c = "";
	private int sno;
	private String name;
	private char scl;
	
	public GreenStudent(String name, char scl) {
		sno = ++idx;
		this.name = name;
		this.scl = scl;
		if (scl == 'A') {
			cnt_a++;
			list_a += "g-"+sno+"\n";
		} else if (scl == 'B') {
			cnt_b++;
			list_b += "g-"+sno+"\n";
		} else if (scl == 'C') {
			cnt_c++;
			list_c += "g-"+sno+"\n";
		} else {
			;// 나중에 생각
		}
	}
	
	int getSno() {
		return sno;
	}
	
	String getName() {
		return name; 
	}
	
	char getScl() {
		return scl;
	}
	
	static void printClass(char scl) {
		if (scl == 'A') {
			System.out.println(scl+"반 - "+cnt_a+"명");
			System.out.println(list_a);
		} else if (scl == 'B') {
			System.out.println(scl+"반 - "+cnt_b+"명");
			System.out.println(list_b);
		} else if (scl == 'C') {
			System.out.println(scl+"반 - "+cnt_c+"명");
			System.out.println(list_c);
		} else {
			System.out.println("error");
		}
	}
	
	static void printAll() {
		System.out.println("전체 - "+idx+"명");
	}
	
}
