CREATE TABLE playerDB (
	id VARCHAR(20) PRIMARY KEY,
	pw VARCHAR(10) NOT NULL,
	pname VARCHAR(20) NOT NULL,
	phone VARCHAR(13),
	score INT(10)
);

DESC playerdb;

CREATE TABLE rankDB (
	id VARCHAR(20) NOT NULL,
	rname VARCHAR(10) NOT NULL,
	rrank INT(5) NOT NULL,
	score INT(10) NOT NULL
);

DESC rankdb;

CREATE TABLE guestLog (
	gname VARCHAR(20) NOT NULL,
	score INT(10) NOT NULL
)

DESC guestLog;