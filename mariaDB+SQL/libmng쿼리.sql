CREATE TABLE tbl_book(
	bcode INT(3) AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	author VARCHAR(50) NOT NULL,
	publisher VARCHAR(100) NOT NULL,
	price INT(6),
	binfo VARCHAR(200)
);

CREATE TABLE tbl_user(
	id VARCHAR(50) PRIMARY KEY,
	pw VARCHAR(10) NOT NULL,
	name VARCHAR(50) NOT NULL
);

INSERT INTO tbl_user VALUES ('user01', '1111', '홍길동');

INSERT INTO tbl_book VALUES
(001, '철학의 역사', '나이절 워버턴', '소소의책', 2000, '철학1'),
(002, '짧고 깊은 철학 50', '톰 버틀러 보던', '흐름출판', 4000, '철학2'),
(003, '너 자신을 알라', '리하르트', '열린책들', 5300, '철학3')

SELECT * FROM tbl_book WHERE title = '철학의 역사';

SELECT name FROM tbl_user WHERE id = 'user01' AND pw = '1111';