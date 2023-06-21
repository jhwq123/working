CREATE TABLE mineSweeper_tbl(
	pnum INT(4) AUTO_INCREMENT PRIMARY KEY,
	score INT(3)
);

SELECT score FROM minesweeper_tbl ORDER BY score DESC;