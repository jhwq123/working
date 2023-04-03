package study_230403;

public class Person {

	static int person;
	
	public Person() {
		person++;
	}
	
	static void printPerson() {
		System.out.println(person+"명의 인원이 있습니다.\n");
	}
	
}
