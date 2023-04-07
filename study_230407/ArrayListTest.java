package study_230407;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setSno(1);
		stu1.setName("길동");
		
		Student stu2 = new Student(2);
		stu2.setName("규식");
		
		Student stu3 = new Student(3, "민석");
		Student stu4 = new Student(4, "James");
		
		Student[] sArray = new Student[3];
		sArray[0] = stu1;
		sArray[1] = stu2;
		sArray[2] = stu3;
		// sArray[3] = stu4;
		
		ArrayList<Student> slist = new ArrayList<>();
		slist.add(stu1);
		slist.add(stu2);
		slist.add(stu3);
		slist.add(stu4);
		slist.get(0);
		// 값을 호출하면, toString이나옴.
		
//		for(int i = 0; i < slist.size(); i++) {
//			System.out.println(slist.get(i));
//		}

		Student stu5 = new Student(5, "good");
		slist.add(2, stu5);
		slist.remove(1);
		
		for(Student s : slist) {
			System.out.println(s);
		}
		
		
		
		
	}
}
