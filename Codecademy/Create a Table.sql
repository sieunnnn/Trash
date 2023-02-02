# 테이블 생성
CREATE TABLE friends (
	id INTEGER
    , name TEXT
    , birthday DATE
    );

# 테이블 생성 확인
SELECT * FROM friends;

# 데이터 추가
INSERT INTO friends VALUES(1, 'Ororo Munroe', '1940-05-30');
INSERT INTO friends VALUES(2, 'Sieun', '1996-11-20');
INSERT INTO friends VALUES(3, 'Hongsik', '1994-07-21');

# 데이터 수정
UPDATE friends SET 'Ororo Munroe' = 'Storm' WHERE id = 1;

# 컬럼 추가
ALTER TABLE friends ADD email TEXT;

# 이메일 업데이트
UPDATE friends SET email = 'storm@codecademy.com' WHERE id = 1;

# 특정 ROW 삭제
DELETE FROM friends WHERE id = 1;

