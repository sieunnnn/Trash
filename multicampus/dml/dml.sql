# 인턴 직급을 추가해보자.
# JOB_CODE : 'J8', JOB_NAME : '인턴'
INSERT INTO JOB(JOB_CODE, JOB_NAME) VALUES('J8', '인턴');
SELECT * FROM JOB;


# JOB_CODE : 'J8', JOB_NAME : '알바'
INSERT INTO JOB VALUES('J9', '알바');


# SUBQUERY 로 데이터 추가
CREATE TABLE EMP_DEPT (
	EMP_ID VARCHAR(3),
    EMP_NAME VARCHAR(20),
    DETP_TITLE VARCHAR(25)
);


# 직급이 'J5' 인 사원의 사번, 이름, 부서명을 EMP_DEPT 테이블에 추가
INSERT INTO EMP_DEPT(
	SELECT EMP_ID, EMP_NAME, DEPT_TITLE
    FROM employee
    JOIN department ON(DEPT_ID = DEPT_CODE)
    WHERE JOB_CODE = 'J5'
);

SELECT * FROM EMP_DEPT;


# INSERT 문으로 여러 행 집어넣기
# EMP_ID : 230, EMP_NAME : 강유리, DEPT_TITLE : 개발팀
# EMP_ID : 231, EMP_NAME : 경제원, DEPT_TITLE : 개발팀
INSERT INTO EMP_DEPT VALUES('230','강유리', '개발팀'), ('231','경제원', '개발팀');

DELETE FROM emp_dept WHERE EMP_ID = '230';
DELETE FROM emp_dept WHERE EMP_ID = '231';


# employee 테이블에서 아시아지역에 근무하는 직원의 보너스를 0.3 으로 조정하세요.
UPDATE employee 
SET BONUS = 0.3
WHERE DEPT_CODE IN(
	SELECT DEPT_ID
	FROM department
	JOIN LOCATION ON(LOCAL_CODE = LOCATION_ID)
	WHERE LOCAL_NAME LIKE 'ASIA%');
    
    ROLLBACK;

    
# 강유리 사원의 부서를 대북혼 사원과 동일하게 변경해주세요.
SELECT* FROM emp_dept;

UPDATE emp_dept A, (SELECT DETP_TITLE FROM EMP_DEPT WHERE EMP_NAME = '대북혼') B
SET A.DETP_TITLE = B.DETP_TITLE
WHERE EMP_ID = 230;


DELETE FROM emp_dept;
SELECT * FROM emp_dept;
ROLLBACK;


DELETE
FROM emp_dept
WHERE EMP_ID = 207;


#TRUNCATE
TRUNCATE TABLE emp_dept;



