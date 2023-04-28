CREATE TABLE playerDB (
	id VARCHAR(20) PRIMARY KEY,
	pw VARCHAR(10) NOT NULL,
	pname VARCHAR(20) NOT NULL,
	phone VARCHAR(13),
	score INT(10)
);

DESC playerdb;

CREATE TABLE rankdb (
	rrank INT(5) AUTO_INCREMENT PRIMARY KEY NOT NULL,
	rname VARCHAR(10) NOT NULL,
	score INT(10) NOT NULL
);

DROP TABLE rankdb;

DESC rankdb;

CREATE TABLE guestLog (
	gname VARCHAR(20) NOT NULL,
	score INT(10) NOT NULL
)

DESC guestlog;

SELECT COUNT(*) AS flag FROM playerdb WHERE id = 'pao12' AND pw = 'y}v~v}y|';