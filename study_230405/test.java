package study_230405;

public class test {
	public static void main(String[] args) {
		
		Animal[] aList = new Animal[4];
		aList[0] = new Dog("튼튼이");
		aList[1] = new Tiger("통통이");
		aList[2] = new Cat("째낏");
		aList[3] = new Mouse("몽실이");
		
		
		for(int i = 0; i < aList.length; i++) {
			aList[i].cry();
		}
		
		
	}
}
