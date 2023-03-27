package chapter06;

public class test {
	public static void main(String[] args) {
		
		Person p1 = new Person(); // 인스턴스 생성
		p1.name = "철수";
		p1.age = 28;
		p1.gender = 'm';
		p1.nation = "대한민국";
		System.out.print("이름 : " + p1.name);
		
		// 만약에 철수의 나이가 20 이상이면, (성인입니다.) 추가
		System.out.print(", 나이 : " + p1.age);
		if(p1.age >= 20) {
			System.out.println("(성인입니다.)");
		} else {
			System.out.println("");
		}
		
		Person p2 = new Person(); // 인스턴스 생성
		p2.name = "Sue";
		p2.age = 32;
		p2.gender = 'f';
		p2.nation = "미국";
		System.out.print("이름 : " + p2.name);
		
		// 만약에 Sue의 성별이 'f' 이면, "여자" 반환
		System.out.print(", 성별 : ");
		if(p2.gender == 'm') {
			System.out.println("남자");
		} else if(p2.gender == 'f') {
			System.out.println("여자");
		} else {
			System.out.println("불명");
		}
		
		Person p3 = new Person(); // 인스턴스 생성
		p3.name = "만수";
		p3.gender = 'm';
		p3.age = 24;
		p3.nation = "대한민국";
		System.out.print("이름 : " + p3.name);
		System.out.println(", 국적 : " + p3.nation);
		System.out.println("===============================");


		
		
		Person chu = new Person("철수", 'm', 28, "대한민국");
		Person sue = new Person("Sue", 'f', 32, "미국");
		Person man = new Person("만수", 'm', 24, "대한민국");
		Person cho = new Person("최달", 'm', 18, "대한민국");
		
		System.out.println("이름: "+chu.name+",\t성별: "+chu.genderS+",\t나이: "+chu.ageS+",\t국적: "+chu.nation);
		System.out.println("이름: "+sue.name+",\t성별: "+sue.genderS+",\t나이: "+sue.ageS+",\t국적: "+sue.nation);
		System.out.println("이름: "+man.name+",\t성별: "+man.genderS+",\t나이: "+man.ageS+",\t국적: "+man.nation);
		System.out.println("이름: "+cho.name+",\t성별: "+cho.genderS+",\t나이: "+cho.ageS+",\t국적: "+cho.nation);
	}
}
