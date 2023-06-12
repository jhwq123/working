CREATE TABLE subject(
	sub_no CHAR(3) PRIMARY KEY,
	sub_name VARCHAR(30),
	sub_prof VARCHAR(20),
	sub_grad INT(1),
	sub_dept VARCHAR(20)
);

DROP TABLE subject;

INSERT INTO subject VALUES('111','데이터베이스','이재영',2,'컴퓨터정보');
INSERT INTO subject VALUES('110','자동제어','정순정',2,'전기전자');
INSERT INTO subject VALUES('109','자동화설계','박민영',3,'기계');
INSERT INTO subject VALUES('101','컴퓨터개론','강종영',3,'컴퓨터정보');
INSERT INTO subject VALUES('102','기계공작법','김태영',1,'기계');
INSERT INTO subject VALUES('103','기초전자실험','김유석',1,'전기전자');
INSERT INTO subject VALUES('104','시스템분석설계','강석현',3,'컴퓨터정보');
INSERT INTO subject VALUES('105','기계요소설계','김명성',1,'기계');
INSERT INTO subject VALUES('106','전자회로실험','최영민',3,'전기전자');
INSERT INTO subject VALUES('107','CAD응용실습','구봉규',2,'기계');
INSERT INTO subject VALUES('108','소프트웨어공학','권민성',1,'컴퓨터정보');

CREATE TABLE student(
	stu_no CHAR(3) PRIMARY KEY,
	stu_name VARCHAR(20),
	stu_dept VARCHAR(20),
	stu_garde INT(1),
	stu_class CHAR(1),
	stu_gender CHAR(1),
	stu_height INT(3),
	stu_weight INT(3)
);

INSERT INTO student VALUES
('s01', '안철수', '기계', '1', 'C', 'M', 177, 80),
('s02', '이태연', '기계', '1', 'C', 'M', 162, 50),
('s03', '유가인', '기계', '2', 'C', 'F', 154, 47),
('s04', '조민우', '전기전자', '1', 'C', 'M', 188, 90),
('s05', '심수정', '전기전자', '2', 'A', 'F', 168, 45),
('s06', '박희철', '전기전자', '3', 'B', 'M', NULL, 63),
('s07', '김인중', '컴퓨터정보', '1', 'B', 'M', 166, 67),
('s08', '진현무', '컴퓨터정보', '2', 'A', 'M', 174, 64),
('s09', '김종현', '컴퓨터정보', '2', 'C', 'M', NULL, 72),
('s10', '옥성우', '컴퓨터정보', '2', 'A', 'F', 172, 63);

CREATE TABLE enrol(
	sub_no CHAR(3),
	CONSTRAINT fk_enrol_sub_no FOREIGN KEY(sub_no) REFERENCES subject(sub_no),
	stu_no CHAR(3),
	CONSTRAINT fk_enrol_stu_no FOREIGN KEY(stu_no) REFERENCES student(stu_no),
	enr_grade INT(3),
	PRIMARY KEY(sub_no, stu_no)
);

DROP TABLE enrol;

INSERT INTO enrol VALUES ('101', 's09', 80);
INSERT INTO enrol VALUES ('104', 's09', 56);
INSERT INTO enrol VALUES ('106', 's06', 72);
INSERT INTO enrol VALUES ('103', 's04', 45);
INSERT INTO enrol VALUES ('101', 's10', 65);
INSERT INTO enrol VALUES ('104', 's10', 65);
INSERT INTO enrol VALUES ('108', 's07', 81);
INSERT INTO enrol VALUES ('107', 's03', 41);
INSERT INTO enrol VALUES ('102', 's01', 66);
INSERT INTO enrol VALUES ('105', 's01', 56);
INSERT INTO enrol VALUES ('102', 's02', 61);
INSERT INTO enrol VALUES ('105', 's02', 78);

DESCRIBE student;
DESC subject;
DESC enrol;

SELECT * FROM subject;
SELECT * FROM student;
SELECT * FROM enrol;

SELECT stu_no, stu_name FROM student;
SELECT stu_no, stu_name, stu_dept FROM student;
SELECT stu_dept FROM student;
SELECT DISTINCT stu_dept FROM student;

SELECT * FROM enrol;
SELECT sub_no, stu_no, enr_grade, enr_grade + 10 FROM enrol;
SELECT sub_no, stu_no, enr_grade, enr_grade + 10 AS `plus 10` FROM enrol;

SELECT sub_no, stu_no AS id, enr_grade, enr_grade + 10 AS `plus 10` FROM enrol; -- 별칭(Alias)

-- 학생 테이블에서 학과가 '컴퓨터정보'인 학생의 이름, 학과, 학년, 반을 조회하시오
SELECT stu_name, stu_dept, stu_garde, stu_class FROM student WHERE stu_dept = '컴퓨터정보';

-- 학생 테이블에서 학과가 '기계' 이고, 1학년 인 학생의 이름, 학과, 학년 을 조회하시오.
SELECT stu_name, stu_dept, stu_garde FROM student WHERE stu_dept = '기계' AND stu_garde = 1;

-- 학생 테이블에서 키가 170이하인 학생의 이름, 학과를 조회하시오.
SELECT stu_name, stu_dept FROM student WHERE stu_height <= 170;

-- 학생 테이블에서 키가 160이상 180미만인 학생의 학번, 이름, 성별을 조회하시오.
SELECT stu_no, stu_name, stu_gender FROM student WHERE stu_height >= 160 AND stu_height < 180;
SELECT stu_no, stu_name, stu_gender FROM student WHERE stu_height between 160 AND 179;

ALTER TABLE student CHANGE stu_heightsubject stu_height INT(3);

-- 학생 테이블에서 학생의 성이 '김'씨인 학생의 모든 정보를 조회하시오.
SELECT * FROM student WHERE stu_name LIKE '김%';

-- 학생 테이블에서 학생의 성이 '김' 씨인 학생의 수를 조회하시오.
SELECT COUNT(stu_no) AS count FROM student WHERE stu_name LIKE '김__';

-- 학생 테이블에서 학생 이름의 두번째 글자가 '수'인 학생의 이름을 조회하시오.
SELECT stu_name FROM student WHERE stu_name LIKE '_수%';

-- 학생 테이블에서 학생 이름이 '우'로 끝나는 학생의 이름을 조회하세요
SELECT stu_name FROM student WHERE stu_name LIKE '%우';

SELECT stu_no, stu_name, stu_height FROM student;
SELECT stu_no, stu_name, stu_height/30.48 FROM student;

-- 학생 테이블에서 키가 'null'인 학생의 학번, 이름, 키 정보를 조회하시오.
SELECT stu_no, stu_name, stu_height FROM student WHERE stu_height IS NULL;

-- 학생 테이블에서 키가 'null'이 아닌 학생의 학번, 이름, 키 정보를 조회하시오.
SELECT stu_no, stu_name, stu_height FROM student WHERE stu_height IS NOT NULL;

-- 학생 테이블에서 학과가 '컴퓨터정보' 또는 '기계'인 학생의 학번, 이름, 학과를 조회하시오.
SELECT stu_no, stu_name, stu_dept FROM student WHERE stu_dept = '컴퓨터정보' OR stu_dept = '기계';
SELECT stu_no, stu_name, stu_dept FROM student WHERE stu_dept IN ('컴퓨터정보','기계');

-- 학생 테이블에서 키가 큰 순서대로 정렬하여 학생정보를 조회하시오.
SELECT * FROM student ORDER BY stu_height DESC;

SELECT stu_no, stu_name, stu_dept, stu_weight-5 AS target
FROM student ORDER BY stu_dept, target;

-- 학생테이블에서 안철수 학생의 몸무게를 75로 수정하시오.
UPDATE student SET stu_weight = 75 WHERE stu_name = '안철수';
SELECT * FROM student;

-- 학생테이블에서 안철수 학생의 학년을 2학년으로, 반을 'B'반으로 수정하시오.
UPDATE student SET stu_garde = 2, stu_class = 'B' WHERE stu_name = '안철수';
SELECT * FROM student;

-- 홍길동, 1학년, 컴퓨터정보, A반, 남자, 160, 55
INSERT INTO student VALUES ('s11', '홍길동', '컴퓨터정보', 1, 'A', 'M', 160, 55);
INSERT INTO student VALUES ('s12', '홍길동', '전기전자', 2, 'A', 'M', 162, 58);
SELECT * FROM student;

-- 학생 테이블에서 이름이 '홍길동' 이고, 학과가 '컴퓨터정보' 인 학생정보를 삭제하시오.
DELETE FROM student WHERE stu_name = '홍길동' AND stu_dept = '컴퓨터정보';
SELECT * FROM student;

SELECT * FROM enrol;

-- 수강테이블과 학생테이블에서 '과목번호', '학생번호', '학생이름', '점수'를 가져와서 매핑하시오
CREATE VIEW v_enrol AS
SELECT e.sub_no, e.stu_no, s.stu_name, e.enr_grade 
FROM enrol e, student s
WHERE e.stu_no = s.stu_no;

SELECT * FROM v_enrol;
jspconjspcon