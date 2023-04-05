package study_230405;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person("손오공", 30);
		Person p2 = new Person("저팔계", 28);
		Person p3 = new Person("손오공", 30);
		
		System.out.println("p1"+p1.toString()+"과 p2"+p2.toString()+" : "+p1.equals(p2));
		System.out.println("p1"+p1.toString()+"과 p3"+p3.toString()+" : "+p1.equals(p3));
		System.out.println("p2"+p2.toString()+"과 p3"+p3.toString()+" : "+p2.equals(p3));
		
	}
}

