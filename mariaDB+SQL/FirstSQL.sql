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

CREATE TABLE simple_bbs3(
	id INT AUTO_INCREMENT PRIMARY KEY,
	vote INT DEFAULT 0,
	writer VARCHAR(20) NOT NULL,
	title VARCHAR(50) NOT NULL,
	content VARCHAR(100) NOT NULL,
	date DATETIME DEFAULT CURDATE()
);

INSERT INTO simple_bbs3 (writer, title, content) VALUES ('test1', '포치스1', '내용없는내용');

INSERT INTO simple_bbs (id, writer, title, content) VALUES
(1, 'John Doe', 'First Post', 'This is the content of the first post.'),
(2, 'Jane Smith', 'Hello World', 'Hello, this is my first blog post!'),
(3, 'David Lee', 'My Thoughts', 'In this post, I share my thoughts on various topics.'),
(4, 'Emily Johnson', 'Travel Diary', 'I recently visited some beautiful places. Let me tell you about them.'),
(5, 'Michael Brown', 'Technology Trends', 'Here are some emerging technology trends.'),
(6, 'Sarah Wilson', 'Book Review', 'I just finished reading an amazing book. Check out my review!'),
(7, 'Robert Davis', 'Recipe of the Day', 'Today, I am sharing a delicious recipe.'),
(8, 'Jessica Anderson', 'Fitness Tips', 'Here are some tips to stay fit and healthy.'),
(9, 'William Clark', 'Movie Recommendations', 'Looking for a good movie to watch? Check out my recommendations.'),
(10, 'Olivia Martinez', 'Art Exhibition', 'I recently attended an art exhibition. Let me share my experience.');

SELECT COUNT(*) AS cnt FROM simple_bbs2;

CT * FROM myuser;

-------------------------------
CREATE TABLE TRANSACTION1(
	consumerid VARCHAR(20),
	amount INT
);

CREATE TABLE TRANSACTION2(
	consumerid VARCHAR(20),
	amount INT
);

CREATE TABLE TRANSACTION3(
	consumerid VARCHAR(20),
	amount INT
);

INSERT INTO TRANSACTION1 VALUES ('1', 100);
INSERT INTO TRANSACTION2 VALUES ('1', 100);
INSERT INTO TRANSACTION3 VALUES ('1', 100);

SELECT * FROM TRANSACTION1;
SELECT * FROM TRANSACTION2;
SELECT * FROM TRANSACTION3;

DELETE FROM transaction1;
DELETE FROM transaction2;
DELETE FROM transaction3;

------------------------------------------
SHOW VARIABLES LIST '%autocommit%';
SELECT @@autocommint;
SET autocommit = 0; -- autocommint off
SET autocommint = 1; -- autocommit on
SELECT variable_name, variable_value FROM session_variables WHERE variable_name = 'autocommit';

SELECT * FROM myuser;
INSERT INTO myuser VALUES('test7', '홍길동7');


COMMIT;
ROLLBACK;

CREATE TABLE tbl_member(
	mno INT(10) PRIMARY KEY AUTO_INCREMENT,
	id VARCHAR(20) NOT NULL,
	pw VARCHAR(20) NOT NULL,
	NAME VARCHAR(20) NOT NULL
);

INSERT INTO tbl_member (id, pw, NAME)VALUES ('id9', 'pw9', '지후');