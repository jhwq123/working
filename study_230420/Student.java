package study_230420;

import lombok.Data;

@Data
public class Student {
	private int sno;
	private String name;
	private int score;

	public Student(int sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score = score;
	}
}
