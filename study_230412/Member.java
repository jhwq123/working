package study_230412;

import lombok.Data;

//@AllArgsConstructor // 모든 데이터를 담는 생성자를 자동으로 만든다.
@Data // 모든 데이터들의 get() set()을 자동으로 만든다.
public class Member {

	private int mno;
	private String name;
	private String phone;
	private String id;
	private String pw;

	@Override
	public String toString() {
		return mno + " | " + name + " | " + phone + " | " + id + " | " + pw;
	}

}
