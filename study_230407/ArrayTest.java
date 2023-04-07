package study_230407;

import java.util.ArrayList;

public class ArrayTest {
	public static void main(String[] args) {
		
		Student std1 = new Student(1, "홍길동");
		Student std2 = new Student(2, "임꺽정");
		Student std3 = new Student(3, "일지매");
		Student std4 = new Student(4, "James");
		
		Student[] sArray = new Student[10];
		sArray[0] = std1;
		sArray[1] = std2;
		sArray[2] = std3;
		sArray[3] = std4;
		
		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i] != null) {
				System.out.println(sArray[i].toString());
			}
		}
	}
}
