CREATE TABLE buyTbl(
	userid VARCHAR(20),
	prodName VARCHAR(20),
	ea INT,
	price INT
);

INSERT INTO buyTbl
VALUES
('user01', 'TV', 1, 1000000),
('user02', 'TV', 1, 1000000),
('user03', 'TV', 1, 1000000),
('user01', 'computer', 1, 2000000),
('user02', 'mouse', 2, 20000),
('user03', 'keyboard', 3, 10000),
('user02', 'keyboard', 1, 10000),
('user01', 'mouse', 1, 20000),
('user03', 'DVD', 1, 500000),
('user02', 'DVD', 1, 500000);
SELECT * FROM buytbl;

CREATE TABLE studentTbl(
	sname VARCHAR(20),
	sgroup CHAR(1),
	score INT
);

INSERT INTO studentTbl
VALUES
('aaa', 'A', 50),
('bbb', 'B', 60),
('ccc', 'C', 70),
('ddd', 'A', 80),
('eee', 'B', 90),
('fff', 'C', 75),
('ggg', 'A', 85),
('hhh', 'B', 55),
('iii', 'C', 45),
('jjj', 'A', 30);

SELECT * FROM studentTbl;
-- Count( ) : 행의 개수
SELECT COUNT(*) FROM studentTbl;
SELECT COUNT(*) FROM studentTbl WHERE score >= 70;

-- AVG( ) : 평균
SELECT AVG(score) FROM studentTbl;

-- MIN( ) : 최소값
SELECT MIN(score) FROM studentTbl;

-- MAX( ) : 최대값
SELECT MAX(score) FROM studentTbl;

-- SUM( ) : 합 계
SELECT SUM(score) FROM studentTbl;

-- 반 별 점수의 합 구하기(조건)
SELECT sgroup, SUM(score) FROM studentTbl
GROUP BY sgroup HAVING SUM(score) > 200;

-- buyTbl 구매 테이블에서, 제품별 판매 개수를
-- 카운트 해보자.

SELECT prodName, SUM(ea) FROM buytbl
GROUP BY prodName;

-- buyTbl 구매자별 구매금액을 카운트 해보자

SELECT userid, SUM(price*ea) FROM buytbl
GROUP  BY userid;