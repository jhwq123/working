CREATE TABLE TBL_PRODUCT_202101(
	PCODE CHAR(4) NOT NULL PRIMARY KEY,
	PNAME VARCHAR(30),
	COST INT(7)
);

INSERT INTO TBL_PRODUCT_202101 VALUES
('AA01', '삼각김밥', 1000),
('AA02', '도시락', 2500),
('AA03', '봉지만두', 3000),
('AA04', '컵라면', 1500),
('AA05', '아메리카노', 2000),
('AA06', '콜라', 800);

CREATE TABLE TBL_SHOP_202101(
	SHOPNO CHAR(4) NOT NULL PRIMARY KEY,
	SHOPNAME CHAR(20),
	DISCOUNT INT(3)
);

INSERT INTO TBL_SHOP_202101 VALUES
('S001', 'AA 할인점', 10),
('S002', 'BB 할인점', 15),
('S003', 'CC 할인점', 10),
('S004', 'DD 할인점', 15);

CREATE TABLE TBL_ORDER_202101(
	ORDERNO CHAR(8) NOT NULL PRIMARY KEY,
	SHOPNO CHAR(4),
	ORDERDATE CHAR(8),
	PCODE CHAR(4),
	AMOUNT INT(5)
);

INSERT INTO TBL_ORDER_202101 VALUES
('20210001', 'S001', '20210302', 'AA01', 50),
('20210002', 'S001', '20210302', 'AA02', 30),
('20210003', 'S001', '20210302', 'AA03', 20),
('20210004', 'S002', '20210303', 'AA01', 50),
('20210005', 'S002', '20210303', 'AA02', 40),
('20210006', 'S002', '20210303', 'AA03', 60),
('20210007', 'S001', '20210304', 'AA01', 60),
('20210008', 'S001', '20210304', 'AA02', 70),
('20210009', 'S001', '20210304', 'AA03', 80),
('20210010', 'S002', '20210305', 'AA01', 30),
('20210011', 'S002', '20210305', 'AA02', 40),
('20210012', 'S002', '20210305', 'AA03', 50),
('20210013', 'S001', '20210306', 'AA01', 30),
('20210014', 'S001', '20210306', 'AA02', 20),
('20210015', 'S001', '20210306', 'AA03', 50);

-- 할인점코드, 점포명, 주문번호, 주문일자, 제품코드, 제품명, 주문수량, 단가, 소비자가격, 할인가격
SELECT o.SHOPNO, s.SHOPNAME, to_char(o.ORDERNO,'yyyy-mmdd') AS ORDERNO , to_char(o.ORDERDATE, 'yyyy-mm-dd') AS ORDERDATE, o.PCODE, p.PNAME, o.AMOUNT, p.COST, o.AMOUNT*p.COST AS custcost, (O.AMOUNT*p.COST*(1 - s.DISCOUNT/100)) AS discost 
FROM tbl_product_202101 p, tbl_shop_202101 s, tbl_order_202101 o
WHERE o.SHOPNO = s.SHOPNO AND o.PCODE = p.PCODE
GROUP BY o.orderno
ORDER BY o.orderno;

-- 할인점코드, 제품코드, 제품명, 주문총수량
SELECT o.SHOPNO, o.PCODE, p.PNAME, SUM(o.AMOUNT) AS AMOUNTALL
FROM tbl_product_202101 p, tbl_order_202101 o
WHERE o.PCODE = p.PCODE
GROUP BY o.SHOPNO, o.PCODE

-- 제품코드, 제품명, 단가, 할인율10, 할인율15
SELECT PCODE, PNAME, COST, COST*0.90 AS DIS10, COST*0.85 AS DIS15
FROM tbl_product_202101

SELECT COUNT(*) AS cnt FROM tbl_order_202101