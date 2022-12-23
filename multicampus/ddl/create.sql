# CREATE
CREATE TABLE OUR_DEPT(
	DEPT_CODE CHAR(3) PRIMARY KEY,
    DEPT_TITLE VARCHAR(30)
);


INSERT INTO OUR_DEPT VALUES('D01', '개발팀');
INSERT INTO OUR_DEPT(DEPT_CODE, DEPT_TITLE) VALUES('D02', '인사팀');
INSERT INTO OUR_DEPT VALUES('D03', '총무팀');


COMMIT;


SELECT * FROM OUR_DEPT;


CREATE TABLE OUR_EMP(
	# EMP_ID 를 기본키로 지정.
    # AUTO_INCREMENT : INSERT  문에서 컬럼을 지정하지 않으면 순차적으로 1씩 증가하는 숫자값을 EMP_ID 에 넣어준다.
	
    EMP_ID INT AUTO_INCREMENT PRIMARY KEY,
    EMP_NAME VARCHAR(30) NOT NULL,
    AGE INT CHECK(AGE > 0),
    EMP_NO CHAR(14) UNIQUE,
    HIRE_DATE TIMESTAMP DEFAULT NOW(),
    
    # DEPT_CODE  를 외래키(부모테이블을 참조하는 키) 로 사용
    DEPT_CODE CHAR(3),
	FOREIGN KEY(DEPT_CODE) REFERENCES OUR_DEPT(DEPT_CODE)
    
);


# DEFAULT 확인
INSERT INTO OUR_EMP(EMP_ID, EMP_NAME, AGE, EMP_NO, DEPT_CODE)
VALUES(1, '하명도', '19', '000000-0000000', 'D01');


SELECT*
FROM our_emp
JOIN our_dept USING(DEPT_CODE);


# 외래키 제약조건 확인
# 부모테이블의 컬럼에 존재하지 않는 값을 자식테이블의 외래키 컬럼에 넣을 수 없음
-- INSERT INTO OUR_EMP(EMP_ID, EMP_NAME, AGE, EMP_NO, DEPT_CODE)
-- VALUES(1, '하명도', 19, '000000-0000000', 'D04');


# NULL 제약조건 : NOT NULL이 지정된 EMP_NAME을 빼고 INSERT
# 실패
-- INSERT INTO OUR_EMP(EMP_ID, AGE, EMP_NO, DEPT_CODE)
-- VALUES(2, 19, '000000-0000001', 'D01');
# 성공
INSERT INTO OUR_EMP(EMP_ID, EMP_NAME, AGE, EMP_NO, DEPT_CODE)
VALUES(2, '신비', 19, '000000-0000001', 'D01');
COMMIT;


# CHECK 제약조건
# AGE에 -100을 넣어보자.
# 실패
-- INSERT INTO OUR_EMP(EMP_ID, EMP_NAME, AGE, EMP_NO, DEPT_CODE)
-- VALUES(3, '배재현', -100, '000000-0000002', 'D01');

# 성공
INSERT INTO OUR_EMP(EMP_ID, EMP_NAME, AGE, EMP_NO, DEPT_CODE)
VALUES(3, '배재현', 10, '000000-0000002', 'D01');
COMMIT;


# UNIQUE 제약조건
# 실패
-- INSERT INTO OUR_EMP(EMP_ID, EMP_NAME, AGE, EMP_NO, DEPT_CODE)
-- VALUES(4, '이준형', 10, '000000-0000002', 'D01');
# 성공
INSERT INTO OUR_EMP(EMP_ID, EMP_NAME, AGE, EMP_NO, DEPT_CODE)
VALUES(4, '이준형', 10, '000000-0000003', 'D01');


# 기본키 : 유일성 + 최소성
# 최소성 어겨보기
-- INSERT INTO OUR_EMP( EMP_NAME, AGE, EMP_NO, DEPT_CODE)
-- VALUES('여태양', 15, '000000-0000004', 'D01');

# 유일성 어겨보기
-- INSERT INTO OUR_EMP(EMP_ID, EMP_NAME, AGE, EMP_NO, DEPT_CODE)
-- VALUES(4, '여태양', 15, '000000-0000004', 'D01');

INSERT INTO OUR_EMP(EMP_ID, EMP_NAME, AGE, EMP_NO, DEPT_CODE)
VALUES(5, '여태양', 15, '000000-0000004', 'D01');
COMMIT;


# 테이블 복제
CREATE TABLE CP_EMPLOYEE
AS SELECT * FROM employee WHERE ENT_YN = 'Y';
