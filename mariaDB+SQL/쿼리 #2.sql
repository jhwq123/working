INSERT INTO member
(NAME, phone, id, pw) VALUES
('김홍수현', '010-8550-5648', 'jhwq1231231', '1234');

SELECT NAME, id, pw FROM member
WHERE NAME = '김홍수';

SELECT * FROM member
WHERE mno >= 3 && mno <= 5;

SELECT * FROM member
WHERE mno < 3 || mno > 5;

SELECT DISTINCT name FROM member;

SELECT * FROM member
ORDER BY mno DESC LIMIT 3;

