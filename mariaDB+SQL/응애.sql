-- --------------------------------------------------------
-- 호스트:                          127.0.0.1
-- 서버 버전:                        10.11.2-MariaDB - mariadb.org binary distribution
-- 서버 OS:                        Win64
-- HeidiSQL 버전:                  11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- green01 데이터베이스 구조 내보내기
CREATE DATABASE IF NOT EXISTS `green01` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `green01`;

-- 테이블 green01.notice 구조 내보내기
CREATE TABLE IF NOT EXISTS `notice` (
  `bno` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL DEFAULT '빈 게시물',
  `content` varchar(500) DEFAULT '빈 내용',
  `writer` varchar(10) DEFAULT '작성자',
  `regDate` varchar(20) DEFAULT NULL,
  `modifyDate` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`bno`),
  UNIQUE KEY `title` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='For testing post registration program';

-- 테이블 데이터 green01.notice:~5 rows (대략적) 내보내기
/*!40000 ALTER TABLE `notice` DISABLE KEYS */;
INSERT IGNORE INTO `notice` (`bno`, `title`, `content`, `writer`, `regDate`, `modifyDate`) VALUES
	(1, '수업 접습니다', '람쥐썬더', 'kiwii', '2023-04-11', NULL),
	(2, '몽블랑', '몽블랑은 블랑블랑', 'wikki', '2023-04-12', NULL),
	(3, '점심으로 뭘먹을까', '떡볶이 채고', '최배달', '2023-04-13', NULL),
	(4, '뽕뽕뽕', '빵빵빵', '빵상', '2023-04-13', NULL),
	(5, '사람은', '밥을먹는다', '공공자자', '2023-04-13', NULL),
	(6, '누누티비 사망!', '서비스 종료안내', '팝콘끄야', '2023-04-14', NULL),
	(7, '집에 가고싶다', '집에있는데도 집에가고싶다', 'mytype댕댕이', '2023-04-14', NULL),
	(8, '퇴사를 앞두고 있습니다', '입사 1일차!', '새로운행복', '2023-04-14', NULL),
	(9, '출근길에 보초운전 처음봄...', '제곧내', '하쳇트', '2023-04-14', NULL),
	(10, '이번주 마스크꼭 쓰고다니세요', '미세먼지 장난아님!', '바른생활어린이', '2023-04-14', NULL),
	(11, '회사에 원도PC 없어 삽질함', '어떡하죠', 'pmnxis', '2023-04-14', NULL),
	(12, '요즘 글카 디자인 근황', '이쁘네요', 'user792081', '2023-04-14', NULL);
/*!40000 ALTER TABLE `notice` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
