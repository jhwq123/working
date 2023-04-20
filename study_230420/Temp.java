package study_230420;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Temp {

	private int c1;
	private String c2;
	private Timestamp c3;
	private Timestamp c4;

	Temp(int c1, String c2, Timestamp c3, Timestamp c4) {
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
	}
}
