CREATE TABLE loginInfo(
	id VARCHAR(20) PRIMARY KEY,
	pw VARCHAR(20),
	lname VARCHAR(10),
	phone VARCHAR(13)
);

INSERT INTO loginInfo VALUES ("admin", "1234", "Monkey", "010-1111-1111");
INSERT INTO loginInfo VALUES ("root", "4321", "Carrot", "010-2222-2222");
INSERT INTO loginInfo VALUES ("pao12", "1443", "Rabbit", "010-3333-3333");
INSERT INTO loginInfo VALUES ("jhwq123", "1324", "Banana", "010-4444-4444");

DESC logininfo;

SELECT COUNT(*) AS flag FROM logininfo WHERE id = 'jhwq123' && pw = '1324';
