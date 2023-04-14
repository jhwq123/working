-- DB별 용량 확인
SELECT table_schema "green01", 
ROUND (SUM(data_length + index_length) / 1024 / 1024, 1) "MB"
FROM information_schema.tables
GROUP BY table_schema;

-- DB 사용자 권한 생성
CREATE USER 'khw'@'localhost' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON green01.* TO 'khw'@'localhost';

SHOW GRANTS FOR 'khw'@'localhost';

-- Index 생성
CREATE TABLE temp (
	c1 INT,
	c2 VARCHAR(10)
);

INSERT INTO temp
(c1 , c2) VALUES
(10 , 'AA');

SELECT * FROM member
WHERE NAME = '철수';

UPDATE member SET pw = '1234'
WHERE id LIKE '%jhwq%' AND phone LIKE '%010%';

DELETE FROM temp
WHERE s1 = 100;