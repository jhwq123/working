CREATE TABLE tbl_tetris(
	pno INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	score INT(3) NOT NULL,
	pdate DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO tbl_tetris (score) VALUES
(20);

SELECT score FROM tbl_tetris
ORDER BY score DESC LIMIT 0, 1;



SELECT * FROM tbl_msg
ORDER BY ccode ASC
LIMIT 0,1;

SELECT *
FROM
(
SELECT *
FROM tbl_msg
ORDER BY ccode DESC LIMIT 0,15
)
tbl_msg ORDER BY ccode ASC;



CREATE TABLE tbl_member13(
	name VARCHAR(20) NOT NULL,
	id VARCHAR(20) NOT NULL PRIMARY KEY,
	pw VARCHAR(20) NOT NULL,
	tel VARCHAR(20) NOT NULL,
	addr VARCHAR(20) NOT NULL
);

INSERT INTO tbl_member13 VALUES ('test1', 'test2', 'test3', 'test4', 'test5');

SELECT COUNT(*) FROM tbl_member13 WHERE id = 'jhwq';

SELECT COUNT(*) FROM tbl_member13 WHERE tel = '010-1111-1111';