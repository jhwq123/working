CREATE TABLE memberTbl14 (
	id VARCHAR(20) NOT NULL PRIMARY KEY,
	pw VARCHAR(20) NOT NULL,
	name VARCHAR(20) NOT NULL
);

INSERT INTO memberTbl14 VALUES ('root', '123', '장보고');



SELECT COUNT(*) AS CNT FROM memberTbl14 WHERE id = 'admin' AND pw = '1234'; 
