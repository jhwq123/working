CREATE TABLE tbl_board (
	bno INT(3) AUTO_INCREMENT NOT NULL PRIMARY KEY,
	title VARCHAR(20) NOT NULL,
	content VARCHAR(100) NOT NULL,
	writer VARCHAR(10) NOT NULL,
	regdate DATETIME DEFAULT CURRENT_TIMESTAMP,
	moddate DATETIME DEFAULT NULL
);

INSERT INTO tbl_board (bno, title, content, writer)VALUES
(1, '밥맛있게 먹는법', '3단계만 지키자', '김철수');

SELECT * FROM tbl_board;

-- 게시글 번호, 댓글 번호, 댓글 내용, 작성자, 작성일
CREATE TABLE tbl_reply (

)