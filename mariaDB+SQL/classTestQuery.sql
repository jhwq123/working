DROP TABLE studb;
DROP TABLE rankdb;
DROP TABLE teachdb;

CREATE TABLE stuDB (
	sno INT(3) PRIMARY KEY AUTO_INCREMENT NOT NULL,
	sname VARCHAR(10) NOT NULL,
	id VARCHAR(20) NOT NULL,
	pw VARCHAR(20) NOT NULL,
	score INT(10) DEFAULT -1,
	coment VARCHAR(100)
);

CREATE TABLE teachDB (
	tno INT(3) PRIMARY KEY AUTO_INCREMENT NOT NULL,
	tname VARCHAR(10) NOT NULL,
	id VARCHAR(20) NOT NULL,
	pw VARCHAR(20) NOT NULL
);

CREATE TABLE rankDB (
	rno INT(3) PRIMARY KEY AUTO_INCREMENT NOT NULL,
	sno INT(3) UNIQUE KEY NOT NULL,
	tname VARCHAR(10) NOT NULL,
	score INT(10) DEFAULT -1,
	pass VARCHAR(5)
);

INSERT INTO studb (sno, sname, id, pw) VALUES (13, '삼만이', 'stu13', 'pw13');
INSERT INTO studb (sno, sname, id, pw) VALUES (12, '홍만이', 'stu12', 'pw12');
INSERT INTO studb (sno, sname, id, pw) VALUES (7, '생만이', 'stu7', 'pw7');
INSERT INTO studb (sno, sname, id, pw) VALUES (3, '콩민이', 'stu3', 'pw3');
INSERT INTO studb (sno, sname, id, pw) VALUES (5, '종민이', 'stu5', 'pw5');

INSERT INTO teachdb (tno, tname, id, pw) VALUES (1, '관리자', 'admin', 1234);

INSERT INTO rankdb (sno, tname) VALUES (13, '삼만이');
INSERT INTO rankdb (sno, tname) VALUES (12, '홍만이');
INSERT INTO rankdb (sno, tname) VALUES (7, '생만이');
INSERT INTO rankdb (sno, tname) VALUES (3, '콩민이');
INSERT INTO rankdb (sno, tname) VALUES (5, '종민이');



