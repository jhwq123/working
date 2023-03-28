package chapter06_1;

import java.util.Scanner;

// 한반에 5명 있다 치고
// 한번 만든 class안에 모든 데이터값을 다 집어넣어야 하므로,
// 다시 생각을 해봐야겠음.

public class StudentTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		StudentEx s1 = new StudentEx(1, "철수");
		s1.setKorScore(90);
		s1.setEngScore(80);
		s1.setMatScore(75);
		s1.setSocScore(67);
		s1.setSciScore(95);
		s1.getTotal();
		s1.getAverage();
		
		s1.showInfo();
		
		scanner.close();
	}
}
