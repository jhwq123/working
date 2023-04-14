INSERT INTO notice
(title, content, writer, regDate) VALUES
('몽블랑' , '홀리몰리', 'wikki', '2023-04-12');

SELECT * FROM notice
WHERE bno = 3;

ALTER TABLE notice AUTO_INCREMENT = 1;
SET @COUNT = 0;
UPDATE notice SET bno = @COUNT:=@COUNT+1;