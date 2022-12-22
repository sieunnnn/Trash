# WHERE 절

# AND, OR
# 1. employee 테이블에서 부서코드가 'D6' 이고 급여를 200 만원 이상 받는 직원의 이름, 부서코드, 급여 조회
SELECT EMP_NAME, DEPT_CODE, SALARY
FROM employee
WHERE DEPT_CODE = 'D6' AND SALARY >= 2000000;

# 2. employee 테이블에서 부서코드가 D9 이거나 D5 인 사원 중 급여를 400 만원 이상 받는 모든 사원을 조회하세요.
SELECT *
FROM employee
WHERE (DEPT_CODE = 'D9' OR DEPT_CODE = 'D5')
	AND SALARY >= 4000000;

# 3. employee 테이블에서 월그빙 350 만원 이상, 600 만원 이하에 속하는 사원들의 모든 정보를 조회
SELECT EMP_NAME, SALARY
FROM employee
WHERE SALARY >= 3500000 AND SALARY <= 6000000;


# BTWEEN A AND B
SELECT EMP_NAME, SALARY
FROM employee
WHERE SALARY BETWEEN 3500000 AND 6000000;

# 3-1. employee 테이블에서 월급이 350 만원 이상, 600 만원 이하에 속하지 않는 사람들의 모든 정보를 조회
SELECT EMP_NAME, SALARY
FROM employee
WHERE NOT SALARY >= 3500000 AND SALARY <= 6000000;


## 날짜 데이터로 조건식 만들어보기
# 날짜 데이터 : 비교연산이 가능, +, -
# employee 테이블에서 고용일이 90-01-01 ~ 01-01-01 사이에 속하지 않는 사원들을 조회하세요.
SELECT EMP_NAME, HIRE_DATE
FROM employee
WHERE NOT (HIRE_DATE >= '90-01-01' AND HIRE_DATE <= '01-01-01');


# LIKE 사용
SELECT EMP_ID, EMP_NAME, HIRE_DATE
FROM employee
WHERE EMP_NAME LIKE '이%'
AND HIRE_DATE > '12-01-01';


# employee 테이블에서 이름에 이가 포함되고 부서코드가 'D5' 인 사원의 사번, 이름, 고용일 조회
SELECT EMP_ID, EMP_NAME, HIRE_DATE
FROM employee
WHERE EMP_NAME LIKE '%이%'
	AND DEPT_CODE = 'D5';


# employee 테이블에서 이름이 연으로 긑나고 퇴사하지 않은 사원을 조회
SELECT EMP_NAME, ENT_YN
FROM employee
WHERE ENT_YN = 'N'
	AND EMP_NAME LIKE '%연';


# 사원 중 '_' 앞 글자가 3 자리인 이메일 주소를 가진 사원의 정보를 조회
SELECT EMP_NAME, EMAIL
FROM employee
WHERE EMAIL LIKE '___$_%' ESCAPE '$';


# 사원 중 010 으로 시작하지 않는 전화번호를 가진 사람을 조회하세요.
SELECT EMP_NAME, PHONE
FROM employee
WHERE PHONE NOT LIKE '010%';


# 직급코드가 'J7' 또는 'J2' 인 직원 중 급여가 200 만원 이상인 직원의 이름, 급여, 직급코드를 조회
SELECT EMP_NAME, SALARY, JOB_CODE
FROM employee
WHERE JOB_CODE IN('J7', 'J2')
	AND SALARY >= 200;


# employee 테이블에서 보너스가 NULL 인 사원을 조회
SELECT EMP_NAME, BONUS
FROM employee
WHERE BONUS IS NULL;

