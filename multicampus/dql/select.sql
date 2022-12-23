# job 테이블에서 직급명을 조회
SELECT JOB_NAME 
FROM JOB;


# employee 테이블에서 모든 사원의 사번, 이름, 급여를 조회
SELECT EMP_ID, EMP_NAME, SALARY 
FROM employee;


# employee 테이블에서 급여가 3000000 이상인 사원들의 이름과 급여를 조회하세요.
SELECT EMP_NAME, SALARY 
FROM employee
WHERE SALARY >= 3000000;


# employee 테이블에서 부서코드 D9 인 사원들을 조회하세요.
SELECT *
FROM employee
WHERE DEPT_CODE = 'D9';


# *** 컬럼값 산술연산 *** #
# 1. employee 테이블에서 직원의 이름과 연봉(급여 * 12) 을 조회
SELECT EMP_NAME, SALARY * 12
FROM employee;


# 2. employee 테이블에서 연봉이 3천만원 이상인 직원들의 이름과 급여를 조회
SELECT EMP_NAME, SALARY * 12
FROM employee
WHERE SALARY * 12 >= 30000000;


# *** 컬럼별칭 *** #
# 형식 : 컬럼명 AS 별칭, 컬럼명 별칭, 컬럼명 AS '별칭', 컬럼명 '별칭'
SELECT EMP_NAME, SALARY * 12 AS 연봉
FROM employee;


# *** DISTINCT *** #
# result set 에서 중복된 row 를 제거해준다.
# employee 테이블에서 부서코드를 조회해보자.
SELECT DISTINCT DEPT_CODE, JOB_CODE
FROM employee;


# 실습
# 1. employee 테이블에서 D5 부서이면서 급여가 3000000 이상인 직원의 이름, 연봉, 보너스를 추가한 연봉을 조회하시오.
#    연봉의 별칭은, [연봉] 보너스를 포함한 연봉의 별칭인 [총 연봉] 으로 합니다.
#    * 총 연봉에 NULL 이 나오는 것은 신경쓰지 마세요.
SELECT 	EMP_NAME, SALARY * 12 AS '[연봉]', 
	SALARY * 12 * (1 + BONUS) AS '[총 연봉]'
FROM employee
WHERE DEPT_CODE = 'D5' AND SALARY >= 3000000;


