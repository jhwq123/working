package chapter06;

public class Person {

	String name;
	char gender;
	int age;
	String nation;
	String genderS;
	String ageS;
	
	public Person() {
		;
	}
	
	public Person(String name, char gender, int age, String nation) {
		
		this.name = name;
			
		if(gender == 'm') {
			genderS = "남자";
		} else if(gender == 'f') {
			genderS = "여자";
		} else {
			genderS = "불명";
		}
		
		if(age >= 20) {
			ageS = age+"(성인입니다.)";
		} else {
			ageS = age+"";
		}
		
		this.nation = nation;
		
		
	}
}
