package study_230412;

import lombok.Data;

//@AllArgsConstructor // 피라미터 있는 기본 생성자 자동 생성
//@NoArgsConstructor // 피라미터 없는 기본 생성자 자동 생성
//@ToString // toString 자동 생성 
@Data // 모든 데이터 get() set() 자동 생성

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
