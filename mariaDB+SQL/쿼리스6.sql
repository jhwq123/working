CREATE TABLE tbl_a(
	ac1 INT,
	ac2 VARCHAR(2) PRIMARY KEY
);

INSERT INTO tbl_a VALUES(1, 'AA');
INSERT INTO tbl_a VALUES(2, 'BB');
INSERT INTO tbl_a VALUES(3, 'CC');

SELECT * FROM tbl_a;
tbl_b
bc1 int
bc2 VARCHAR(2)

DROP TABLE tbl_b;

CREATE TABLE tbl_b(
	bc1 INT,
	bc2 VARCHAR(2),
	CONSTRAINT fk_tbl_b FOREIGN KEY(bc2) REFERENCES tbl_a(ac2)
	ON UPDATE CASCADE
	ON DELETE SET NULL
);

INSERT INTO tbl_b VALUES(1, 'BB');
INSERT INTO tbl_b VALUES(2, 'AA');
INSERT INTO tbl_b VALUES(3, 'CC');
-- INSERT INTO tbl_b VALUES(4, 'DD');

SELECT * FROM tbl_a;
SELECT * FROM tbl_b;
DELETE FROM tbl_b WHERE bc1 = 3;
DELETE FROM tbl_a WHERE ac1 = 1;
UPDATE tbl_a SET ac1 = 4 WHERE ac1 = 1;
UPDATE tbl_a SET ac2 = 'DD' WHERE ac1 = 4;
UPDATE tbl_b SET bc2 = 'DD' WHERE bc1 = 1;
-- a에서 쓰는 키에 묶여있어서, a에서 없는 값은 b에 추가 불가
-- 또는 변경 불가함

-- a 테이블의 참조되고 있는 ac2 컬럼의 값을 변경해보자.
UPDATE tbl_a SET ac2 = 'DD' WHERE ac1 = 4;
-- a 테이블에 참조되고 있는 ac2 컬럼의 값을 삭제해보자.
DELETE from tbl_a WHERE ac2 = 'DD';