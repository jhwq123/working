CREATE TABLE EMPLOYEES(
	id VARCHAR(10) NOT NULL,
	pass VARCHAR(10) NOT NULL,
	NAME VARCHAR(24),
	lev CHAR(1) DEFAULT 'A',
	enter DATE DEFAULT NOW(),
	gender CHAR(1) DEFAULT '1',
	phone VARCHAR(30),
	PRIMARY KEY(id)
);

INSERT INTO employees VALUES ('admin', '1111', '이수정', 'A', NULL, '1', '010-1111-1111');
INSERT INTO employees VALUES ('subin', '2222', '강민주', 'B', NULL, '2', '010-2222-2222');
INSERT INTO employees VALUES ('pinksung', '3333', '오동진', 'A', NULL, '2', '010-2222-2222');

SELECT * FROM employees;

SELECT score FROM minesweeper_tbl ORDER BY score DESC;

CREATE TABLE tbl_breakblock(
	pnum INT(4) AUTO_INCREMENT PRIMARY KEY,
	score INT(3)
);

-- tbl_minesweeper 정보 더 받기
-- 필요 내용 : 오픈 횟수, 깃발 체크 횟수, 실패 횟수, 총게임 횟수, 플레이 타임, 최종 스코어
-- 마우스 클릭 카운트, 깃발 체크 카운트, 게임 오버 횟수 카운트, 게임 실행 카운트, 플레이 시간 카운트, 최종 점수 집계
CREATE TABLE tbl_minesweeper2(
	pnum INT(4) AUTO_INCREMENT PRIMARY KEY,
	openCnt INT(4) NOT NULL,
	checkCnt INT(4) NOT NULL,
	overCnt INT(4) NOT NULL,
	runCnt INT(4) NOT NULL,
	playTime INT(4) NOT NULL,
	score INT(3) NOT NULL,
	pdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);

-- tbl_tetris 정보 더 받기
-- 필요 내용 : 배치 횟수, 회전 횟수, 줄완성 타입, 총게임 횟수, 플레이 타임, 최종 스코어
-- 블럭 배치 카운트, 회전 카운트, 줄완성한 블럭정보, 게임실행 카운트, 플레이 시간 카운트, 최종 점수 집계
CREATE TABLE tbl_tetris2(
	pnum INT(4) AUTO_INCREMENT PRIMARY KEY,
	dropCnt INT(4) NOT NULL,
	rotateCnt INT(4) NOT NULL,
	sucNcnt INT(4) NOT NULL,
	sucScnt INT(4) NOT NULL,
	sucLcnt INT(4) NOT NULL,
	sucJcnt INT(4) NOT NULL,
	sucTcnt INT(4) NOT NULL,
	sucOcnt INT(4) NOT NULL,
	sucIcnt INT(4) NOT NULL,
	runCnt INT(4) NOT NULL,
	playTime INT(4) NOT NULL,
	score INT(3) NOT NULL,
	pdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);
-- tbl_breakblock 정보 더 받기
-- 필요 내용 : 부순 개수, 바운드 횟수, 최종 스테이지, 총게임 횟수, 플레이 타임, 최종 스코어
-- 부순 블럭개수, 바운드 횟수, 최종도달 스테이지, 게임실행 카운트, 플레이 시간 카운트, 최종 점수 집계
CREATE TABLE tbl_breakblock2(
	pnum INT(4) AUTO_INCREMENT PRIMARY KEY,
	breakCnt INT(4) NOT NULL,
	boundCnt INT(4) NOT NULL,
	lastStage INT(4) NOT NULL,
	playTime INT(4) NOT NULL,
	mode2Cnt INT(4) NOT NULL,
	mode3Cnt INT(4) NOT NULL,
	mode4Cnt INT(4) NOT NULL,
	mode5Cnt INT(4) NOT NULL,
	score INT(3) NOT null
);
-- tbl_runmonkey 정보 더 받기
-- 필요 내용 : 점프 횟수, 총게임 횟수, 플레이 타임, 최종 스코어
-- 점프 동작 횟수, 장애물 피한 횟수, 게임실행 카운트, 플레이 시간 카운트, 최종 점수 집계
CREATE TABLE tbl_runmonkey2(
	pnum INT(4) AUTO_INCREMENT PRIMARY KEY,
	jumpCnt INT(4) NOT NULL,
	dodgeCnt INT(4) NOT NULL,
	runCnt INT(4) NOT NULL,
	playTime INT(4) NOT NULL,
	score INT(3) NOT NULL
);
-- tbl_rhythm 정보 추가해야됨
-- 필요 내용 : 난이도별 점수, 플레이 횟수, 판정 통계, 총게임 횟수, 플레이 타임, 최종 스코어
-- 번호, 곡이름, 난이도, 판정통계, 총노트수, 게임실행 카운트, 플레이 시간 카운트, 최종 점수 집계
CREATE TABLE tbl_rhythm(
	pnum INT(4) AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(20) NOT NULL,
	diff VARCHAR(20) NOT NULL,
	trank VARCHAR(10) NOT NULL,
	koolCnt INT(4) NOT NULL,
	coolCnt INT(4) NOT NULL,
	goodCnt INT(4) NOT NULL,
	failCnt INT(4) NOT NULL,
	noteCnt INT(4) NOT NULL,
	runCnt INT(4) NOT NULL,
	playTime INT(4) NOT NULL,
	score INT(3) NOT NULL
);


SELECT score FROM minesweeper_tbl ORDER BY score DESC;

INSERT INTO tbl_runmonkey (score) VALUES (100);

CREATE TABLE tbl_board(
	id INT AUTO_INCREMENT PRIMARY KEY,
	vote INT DEFAULT 0,
	writer VARCHAR(20) NOT NULL,
	title VARCHAR(50) NOT NULL,
	content VARCHAR(100) NOT NULL,
	comments INT(10) DEFAULT 0,
	date TIMESTAMP DEFAULT CURRENT_TIMESTAMP(),
	type INT(10) NOT NULL DEFAULT 1 
);

INSERT INTO tbl_board (writer, title, content) VALUES ('test', '페이지네이션용', '더미입니다.');

SELECT * FROM tbl_board LIMIT 0, 10;

SELECT * FROM tbl_board ORDER BY vote DESC, date DESC LIMIT 0, 10;

CREATE TABLE tbl_comment(
	id INT AUTO_INCREMENT PRIMARY KEY,
	bnum INT NOT NULL,
	writer VARCHAR(20) NOT NULL,
	comment VARCHAR(50) NOT NULL,
	date TIMESTAMP DEFAULT CURRENT_TIMESTAMP()
);

INSERT INTO tbl_comment (bnum, writer, comment) VALUES ('14', '잔망스런포치', '어디사냐');

INSERT INTO myuser VALUES ('잔망스런포치', '어디사냐');

SELECT * FROM myuser;

SELECT COUNT(*) AS cnt FROM tbl_comment WHERE bnum = 14;

UPDATE tbl_board SET vote = '?'
WHERE id = '?';

INSERT INTO tbl_minesweeper2 (openCnt, checkCnt, overCnt, runCnt, playTime, score) VALUES (14, 10, 0, 1, 270, 192)

SELECT * FROM tbl_board WHERE type = 1 ORDER BY vote DESC LIMIT 0, 5;
SELECT * FROM tbl_board WHERE type = 1 ORDER BY date DESC LIMIT 0, 30;
SELECT * FROM tbl_board WHERE type = 2 ORDER BY vote DESC LIMIT 0, 5;
SELECT * FROM tbl_board WHERE type = 2 ORDER BY date DESC LIMIT 0, 30;

INSERT INTO tbl_board (writer, title, content, type) VALUES ("운영자숭이", "테스트공지입니다", "내용 추가예정", 3)
UPDATE tbl_board SET writer = "운영자숭", title = "테스트2", content = "제곧내", date = current_timestamp() WHERE id = 0;

SELECT score FROM tbl_minesweeper;

SELECT SUM(mode2Cnt) AS m2, SUM(mode3Cnt) AS m3, SUM(mode4Cnt) AS m4, SUM(mode5Cnt) AS m5 FROM tbl_breakblock

DELETE FROM tbl_comment WHERE s1 = 100;