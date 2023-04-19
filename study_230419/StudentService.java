package study_230419;

public class StudentService {

	static Student[] sList;

	StudentService() {
		sList = new Student[5];
	}

	Student getLastStudent() {
		int idx = Student.idx;
		return sList[idx - 1];
	}

	int getTotalScore() {
		int sum = 0;
		for (int i = 0; i < sList.length; i++) {
			sum += sList[i].getScore();
		}
		return sum;
	}

	Student getScoreMaxStudent() {
		int max = -1;
		Student std = null;
		for (int i = 0; i < sList.length; i++) {
			if (sList[i].getScore() > max) {
				max = sList[i].getScore();
				std = sList[i];
			}
		}
		return std;
	}

	Student getScoreMinStudent() {
		int min = 200;
		Student std = null;
		for (int i = 0; i < sList.length; i++) {
			if (sList[i].getScore() < min) {
				min = sList[i].getScore();
				std = sList[i];
			}
		}
		return std;
	}

}
