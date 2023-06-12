CREATE TABLE member_tbl_02(
	custno INT(6) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	custname VARCHAR(20),
	phone VARCHAR(13),
	address VARCHAR(60),
	joindate DATE,
	grade CHAR(1),
	city CHAR(2) 
);

INSERT INTO member_tbl_02 VALUES
(100001, '김행복', '010-1111-2222', '서울 동대문구 휘경 1동', 20151202, 'A', '01'),
(100002, '이축복', '010-1111-3333', '서울 동대문구 휘경 2동', 20151206, 'B', '01'),
(100003, '장믿음', '010-1111-4444', '울릉군 울릉읍 독도1리', 20151001, 'B', '30'),
(100004, '최사랑', '010-1111-5555', '울릉군 울릉읖 독도2리', 20151113, 'A', '30'),
(100005, '진평화', '010-1111-6666', '제주도 제주시 외나무골', 20151225, 'B', '60'),
(100006, '차공단', '010-1111-7777', '제주도 제주시 감나무골', 20151211, 'C', '60');

CREATE TABLE money_tbl_02(
	custno INT(6) NOT NULL,
	salenol INT(8) NOT NULL,
	pcost INT(8),
	amount INT(4),
	price INT(8),
	pcode VARCHAR(4),
	sdate DATE,
	PRIMARY KEY(custno, salenol)
);

INSERT INTO money_tbl_02 VALUES
(100001, 20160001, 500, 5, 2500, 'A001', 20160101),
(100001, 20160002, 1000, 4, 4000, 'A002', 20160101),
(100001, 20160003, 500, 3, 1500, 'A008', 20160101),
(100002, 20160004, 2000, 1, 2000, 'A004', 20160102),
(100002, 20160005, 500, 1, 500, 'A001', 20160103),
(100003, 20160006, 1500, 2, 3000, 'A003', 20160103),
(100004, 20160007, 500, 2, 1000, 'A001', 20160104),
(100004, 20160008, 300, 1, 300, 'A005', 20160104),
(100004, 20160009, 600, 1, 600, 'A006', 20160104),
(100004, 20160010, 3000, 1, 3000, 'A007', 20160106);

-- 채고로 멋진 코드!
CREATE OR REPLACE VIEW moneyView AS
SELECT o.custno, e.custname, e.grade, SUM(price) AS sales
FROM member_tbl_02 e, money_tbl_02 o
WHERE e.custno = o.custno
GROUP BY o.custno
ORDER BY SUM(price) DESC;

SELECT * FROM moneyview;

SELECT * FROM member_tbl_02 WHERE custno = "100005";

UPDATE member_tbl_02 SET phone = "010-1111-6666" WHERE custname = "진평화";