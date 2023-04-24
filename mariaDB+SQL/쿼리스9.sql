-- 트리거 연습

CREATE TABLE testTbl(
	id INT,
	txt VARCHAR(10)
);

INSERT INTO testTbl VALUES(1, '이엑스아이디');
INSERT INTO testTbl VALUES(2, '애프터스쿨');
INSERT INTO testTbl VALUES(3, '에이오에이');

SELECT * FROM testtbl;

-- 세미콜론 문법을 //로 대체함.
DELIMITER //

CREATE TRIGGER testTrg
 -- 트리거가 언제 실행되어야 하는지
 -- 알려주는 시점
 	AFTER DELETE
 	ON testtbl
 	FOR EACH ROW
BEGIN
 -- 트리거가 실행되었을 때
 -- 작동되는 코드를 기술하는 영역
	SET @msg = '가수 그룹이 삭제됨';
END //
DELIMITER ;

SET @mas = '';
INSERT INTO testtbl VALUES (4, '나인뮤지스');
SELECT * FROM testtbl;
SELECT @msg;

UPDATE testtbl SET txt = '소방차' WHERE id = 3;
SELECT * FROM testtbl;
SELECT @msg;

DELETE FROM testtbl WHERE id = 3;
SELECT * FROM testtbl;
SELECT @msg;

-- 회원테이블에 delete가 시도되면 삭제된 데이터를
-- 별도의 테이블에 보관하자.

INSERT INTO tbl_user VALUES ('u004', '명훈이', '010-4444-4444', '부산 남구 동제당로스');

DESC tbl_user;

CREATE TABLE tblUser_delete(
	userno CHAR(4),
	username VARCHAR(20),
	userphone CHAR(13),
	useraddr VARCHAR(100),
	deldate DATETIME
);

DROP table tbluser_delete;
DROP TRIGGER tblUser.deleteTrg;

DELIMITER //
CREATE TRIGGER tblUser_deleteTrg
	AFTER DELETE
	ON tbl_user
	FOR EACH ROW
BEGIN
	INSERT INTO tblUser_delete
	VALUES ( OLD.userno, OLD.username, OLD.userphone, OLD.useraddr, CURDATE());
END //
DELIMITER ;

SELECT * FROM tbl_user;
SELECT * FROM tbluser_delete;

DELETE FROM tbl_user WHERE userno = 'u004';

-- 회원테이블(tbl_user)에 update가 시도되면 수정된 데이터를
-- 별도의 테이블(tblUSer_update)에 보관하자.

CREATE TABLE tblUser_update(
	userno CHAR(4),
	username VARCHAR(20),
	userphone CHAR(13),
	useraddr VARCHAR(100),
	upddate DATETIME,
	upduser VARCHAR(20)
);

DROP table tbluser_update;
DROP TRIGGER tblUser_updateTrg;

DELIMITER //
CREATE TRIGGER tblUser_updateTrg
	AFTER UPDATE
	ON tbl_user
	FOR EACH ROW
BEGIN
	INSERT INTO tblUser_update
	VALUES ( OLD.userno, OLD.username, OLD.userphone, OLD.useraddr, CURDATE(), NEW.username);
END //
DELIMITER ;

SELECT * FROM tbl_user;
SELECT * FROM tbluser_update;

UPDATE tbl_user SET userphone = '010-4857-3948' WHERE userno = 'u003';

-- 작업을 실수했을 때, 백업기능도 만들 수 있겠다!
-- 현재 시간, 작업 시간 등등을 이용한 되돌리기 (backup, log)

-- update... delete... 을 하나로 합친다고 생각하고 테이블하나 만들기.
-- 하나의 테이블에 다 넣을거임.

DROP TABLE totaluser;

CREATE TABLE totaluser(
	userinfo CHAR(4),
	userno CHAR(4),
	username VARCHAR(20),
	userphone CHAR(13),
	useraddr VARCHAR(100),
	userdate DATETIME,
	edituser VARCHAR(20)
)

INSERT INTO totalUser VALUES ('I', 'u001', '김철수', '010-1111-1111', '부산 남구 문현동', NULL, NULL);
INSERT INTO totalUser VALUES ('I', 'u002', '김필필', '010-2222-2222', '부산 해운대구 달맞이', NULL, NULL);
INSERT INTO totalUser VALUES ('I', 'u003', '나관중', '010-3333-3333', '부산 다대포 해수욕장', NULL, NULL);
INSERT INTO totalUser VALUES ('I', 'u004', '명훈이', '010-4444-4444', '부산 남구 동제당로스', NULL, NULL);

DELIMITER //
CREATE TRIGGER totalUser_delete
	AFTER DELETE
	ON totalUser
	FOR EACH ROW
BEGIN
	INSERT INTO totalUser
	VALUES ('D', OLD.userno, OLD.username, OLD.userphone, OLD.useraddr, CURDATE(), NULL);
END //
DELIMITER ;

DELIMITER //
CREATE TRIGGER totalUser_update
	AFTER UPDATE
	ON totaluser
	FOR EACH ROW
BEGIN
	INSERT INTO totaluser
	VALUES ('U', OLD.userno, OLD.username, OLD.userphone, OLD.useraddr, CURDATE(), NEW.username);
END //
DELIMITER ;

SELECT * FROM totaluser;

DELETE FROM totalUser WHERE userno = 'u004';

UPDATE totalUser SET userphone = '010-4857-3948' WHERE userno = 'u003';