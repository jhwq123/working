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
CREATE INDEX idx_member ON member(id);
SHOW INDEX FROM member;


INSERT INTO member
(NAME, phone, id, pw) VALUES
('이수영', '010-8546-5644', 'jhwq1231', '1234');

SELECT NAME, id, pw FROM member
WHERE NAME = '김홍수';