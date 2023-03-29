package chapter06_1;

// 한반에 5명 있다 치고
// 한번 만든 class안에 모든 데이터값을 다 집어넣어야 하므로,
// 다시 생각을 해봐야겠음.

public class StudentTest {
	public static void main(String[] args) {
		
		StudentEx table = new StudentEx();
		
		for (int i = 0; i < 5; i++) {
			table.setSno(i);
			table.setName(i, "철수"+(i+1));
			table.setKorScore(i, 90-i*2);
			table.setEngScore(i, 80-i*2);
			table.setMatScore(i, 75-i*2);
			table.setSocScore(i, 67-i*2);
			table.setSciScore(i, 95-i*2);
			table.getTotal(i);
			table.getAverage(i);
		}
		
		table.showInfo();
		
	}
}
