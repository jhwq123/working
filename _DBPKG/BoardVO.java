package _DBPKG;

import lombok.Data;
import lombok.ToString;

//@AllArgsConstructor // 피라미터 있는 기본 생성자 자동 생성
//@NoArgsConstructor // 피라미터 없는 기본 생성자 자동 생성
@ToString // toString 자동 생성
@Data // 모든 데이터 get() set() 자동 생성

public class BoardVO {

	private int bno; // 게시물 번호
	private String title; // 게시물 제목
	private String content; // 게시물 내용
	private String writer; // 작성자
	private String regDate; // 등록 일자
	private String modifyDate; // 수정 일자

	BoardVO(int bno, String title) {
		this.bno = bno;
		this.title = title;
	}

}
