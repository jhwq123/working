package study_230414;

import lombok.Data;

@Data
public class Student {

	private static int idx = 0;
	private int sno;
	private int score;
	private String pw;

	Student(int score, String pw) {
		this.score = score;
		this.pw = pw;
		idx++;
		sno = idx;
	}

}
