package study_230419;

import lombok.Data;

@Data
public class Student {

	static int idx = 0;
	private int sno;
	private String name;
	private int score;

	public Student() {
		idx++;
	}

	public Student(int sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
		idx++;
	}

}
