
CREATE TABLE conTbl(
	cno INT PRIMARY KEY,
	cname VARCHAR(20) NOT NULL,
	detail VARCHAR(100),
	writer VARCHAR(20) NOT NULL,
	isDate DATETIME,
	moDate DATETIME
);

DESC contbl;

INSERT INTO conTbl VALUES (1, '작성물1', '내용1', '작성자1', CURTIME(), NULL);
INSERT INTO conTbl VALUES (2, '작성물2', '내용2', '작성자1', CURTIME(), NULL);
INSERT INTO conTbl VALUES (3, '작성물3', '내용3', '작성자3', CURTIME(), NULL);
INSERT INTO conTbl VALUES (4, '작성물4', '내용4', '작성자3', CURTIME(), NULL);
INSERT INTO conTbl VALUES (5, '작성물5', '내용5', '작성자2', CURTIME(), NULL);
INSERT INTO conTbl VALUES (6, '작성물6', '내용6', '작성자3', CURTIME(), NULL);
INSERT INTO conTbl VALUES (7, '작성물7', '내용7', '작성자2', CURTIME(), NULL);
INSERT INTO conTbl VALUES (8, '작성물8', '내용8', '작성자3', CURTIME(), NULL);
INSERT INTO conTbl VALUES (9, '작성물9', '내용9', '작성자2', CURTIME(), NULL);
INSERT INTO conTbl VALUES (10, '작성물10', '내용10', '작성자1', CURTIME(), NULL);

-- DROP TABLE contbl;
-- DROP TABLE contblDelete;
-- DROP TABLE contblUpdate;


CREATE TABLE conTblDelete(
	cno INT,
	cname VARCHAR(20),
	detail VARCHAR(100),
	writer VARCHAR(20),
	isDate DATETIME,
	delDate DATETIME
);

-- DESC contbldelete;

CREATE TABLE conTblUpdate(
	cno INT,
	cname VARCHAR(20),
	detail VARCHAR(100),
	writer VARCHAR(20),
	isDate DATETIME,
	updDate DATETIME,
	curWriter VARCHAR(20)
);

-- DESC conTblUpdate;

-- DROP table contblupdate;

DELIMITER //

CREATE TRIGGER conTblDeleteTrg
	AFTER DELETE
	ON conTbl
	FOR EACH ROW
BEGIN
	INSERT INTO conTblDelete
	VALUES (OLD.cno, OLD.cname, OLD.detail, OLD.writer, OLD.isDate, CURTIME());
END //
DELIMITER ;


DELIMITER //

CREATE TRIGGER conTblUpdateTrg
	AFTER UPDATE
	ON conTbl
	FOR EACH ROW
BEGIN
	INSERT INTO conTblUpdate
	VALUES (OLD.cno, OLD.cname, OLD.detail, OLD.writer, OLD.isDate, CURTIME(), NEW.writer);
END //
DELIMITER ;

DELETE FROM contbl WHERE cname = '작성물4';

UPDATE contbl SET writer = '깜찍스' WHERE cno = 3;

-- 작성자별 게시글 수 개수 확인하기
SELECT writer, COUNT(writer) FROM conTbl
GROUP BY writer;