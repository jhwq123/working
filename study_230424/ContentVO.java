package study_230424;

import lombok.Data;

@Data
public class ContentVO {

	private int cno;
	private String name;
	private String detail;
	private String writer;
	private String isDate;
	private String moDate;

	ContentVO(int cno, String name, String writer) {
		this.cno = cno;
		this.name = name;
		this.writer = writer;
	}
}
