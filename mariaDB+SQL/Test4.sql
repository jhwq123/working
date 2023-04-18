-- (2)
CREATE TABLE bookList(
	bk_no CHAR(3) PRIMARY KEY,
	bk_name VARCHAR(30),
	bk_author VARCHAR(30),
	bk_publish VARCHAR(30)
);

-- (1)
DESCRIBE booklist;

-- (3)
INSERT INTO bookList VALUES
('b01', '오베라는 남자', '프레드릭 배크만', '다산책방'),
('b02', '허즈번드 시크릿', '리안 모리아티', '마시멜로'),
('b03', '나미야 잡화점의 기적', '히가시노 게이고', '현대문학'),
('b04', '앵무새 죽이기', '하퍼 리', '열린책들'),
('b05', '파수꾼', '하퍼 리', '열린책들'),
('b06', '달러구트 꿈 백화점', '이미예', '팩토리나인'),
('b07', '기울어진 의자', '이다루', '스토어하우스'),
('b08', '숙명', '히가시노 게이고', '소미미디어'),
('b09', '모두가 세상을 똑같이 살지는 않아', '장폴 뒤부아', '창비'),
('b10', '내게 무해한 사람', '최은영', '문학동네');

-- 1. -- (4) 원래 값 '소미미디어'
UPDATE bookList SET bk_publish = '열린책들'
WHERE bk_no = 'b08';

-- 3. -- (2)
CREATE TABLE userList(
	ur_no CHAR(3) PRIMARY KEY,
	ur_name VARCHAR(30),
	ur_phone VARCHAR(13),
	ur_addr VARCHAR(100)
);

-- (1)
DESCRIBE userList;

-- (3)
INSERT INTO userList VALUES
('u01', '김도윤', '010-2415-2920', 'wejew734@seacob.com'),
('u02', '이서준', '010-7954-1705', 'qwer123@ruu.kr'),
('u03', '박지호', '010-9033-2939', 'fzphk70wx@tmpmail.net');


-- 1. -- (4) 원래 값 '010-7954-1705'
UPDATE userList SET ur_phone = '010-7584-3294'
WHERE ur_no = 'u02';

-- (6) -- 원래 데이터 'u03', '박지호', '010-9033-2939', 'fzphk70wx@tmpmail.net'
DELETE FROM userlist WHERE ur_no = 'u03';
-- INSERT INTO userList VALUES ('u03', '박지호', '010-9033-2939', 'fzphk70wx@tmpmail.net');

-- (2)
CREATE TABLE bookStatus(
	st_no CHAR(3),
	bk_no CHAR(3),
	CONSTRAINT fk_status_book FOREIGN KEY(bk_no) REFERENCES bookList(bk_no)
	ON UPDATE CASCADE ON DELETE SET NULL,
	ur_no CHAR(3),
	CONSTRAINT fk_status_user FOREIGN KEY(ur_no) REFERENCES userList(ur_no)
	ON UPDATE CASCADE ON DELETE SET NULL
);

-- (1)
DESCRIBE bookStatus;

-- (3)
INSERT INTO bookStatus VALUES
('s01', 'b01', 'u01'),
('s02', 'b03', 'u01'),
('s03', 'b05', 'u01'),
('s04', 'b02', 'u02'),
('s05', 'b04', 'u02'),
('s06', 'b08', 'u03');

-- 1. -- (5)
CREATE VIEW v_bookStatus AS
SELECT s.st_no AS 대출번호, u.ur_name AS 이름, 
u.ur_phone AS 휴대전화, SUBSTR(b.bk_name, 1, 7) AS 책,
b.bk_author AS 저자, b.bk_publish AS 출판사
FROM bookList b, userList u, bookStatus s
WHERE s.ur_no = u.ur_no AND s.bk_no = b.bk_no;

SELECT * FROM v_bookstatus;
-- DROP VIEW v_bookstatus;




-- 2, 4. 5. 6.
-- 회원정보를 이용한 조회 (김도윤 이 빌려간 책 목록)
SELECT s.st_no AS 대출번호, u.ur_name AS 이름, 
SUBSTR(b.bk_name, 1, 7) AS 책
FROM bookList b, userList u, bookStatus s
WHERE u.ur_name IN ('김도윤') AND s.ur_no = u.ur_no 
AND s.bk_no = b.bk_no ORDER BY s.st_no;

-- 도서정보를 이용한 조회 (하퍼가 들어간 작가의 책 목록)
SELECT bk_no AS 책번호, bk_name AS 책이름, bk_author AS 작가, 
bk_publish AS 출판사
FROM bookList WHERE bk_author LIKE '%하퍼%';

-- 전체 회원 조회 현황
SELECT ur_no AS 번호, ur_name AS 이름, ur_phone AS 전화번호, 
ur_addr AS 이메일
FROM userList;

-- 전체 도서 조회 현황
SELECT bk_no AS 책번호, bk_name AS 책이름, bk_author AS 작가, 
bk_publish AS 출판사
FROM booklist;

-- 7.
-- 대출 도서 조회 책 개수 조회
SELECT COUNT(st_no) AS CntBookStatus FROM bookstatus;

SELECT * FROM bookList;
SELECT * FROM userList;
SELECT * FROM bookStatus;