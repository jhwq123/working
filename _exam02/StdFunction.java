package _exam02;

public class StdFunction {

	Student[] sList;
	int idx;
	
	public StdFunction(int length) {
		Student[] sList = new Student[length];
		this.sList = sList;
	}
	
	void addStudent(int num, String name) {
		if (idx > sList.length-1) { // 배열 추가
			Student[] temp = new Student[sList.length+1];
			for(int i = 0; i < sList.length; i++) {
				temp[i] = sList[i];
			}
			sList = temp;
		}
		sList[idx] = new Student(num, name);
		idx++;
		
	}
	
	Student getStudent(int num) {
		for (int i = 0; i < sList.length; i++) {
			if (sList[i].getNum() == num) {
				return sList[i];				
			}
		}
		return null;
	}
	
	void personCheck() {
		
	}
	
	void manageCheck() {
		
	}
	
	void showInfo(Student s1) {
		System.out.println("번호: "+s1.getNum()+
				"\t이름: "+s1.getName()+"\t국어점수: "+s1.getKorScore()+
				"\t영어점수: "+s1.getEngScore()+"\t수학점수: "+s1.getMatScore()+
				"\t총점: "+s1.getTotal()+"\t평균: "+s1.getAverage());
	}
	
	void showAll() {
		for (int i = 0; i < sList.length; i++) {
			showInfo(sList[i]);
		}
	}
	
}
