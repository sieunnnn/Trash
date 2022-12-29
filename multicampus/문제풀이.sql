# 부서명과 부서별 평균급여를 구하세요.
# 평균 급여는 소수점에서 내림처리하여 정수로 표현하세요
# 부서에 사원이 존재하지 않아 평균급여가 NULL 일경우 0 으로 표현하세요
SELECT DEPT_CODE,  FLOOR (AVG (SALARY))
FROM employee
JOIN department ON DEPT_CODE = DEPT_ID
GROUP BY DEPT_CODE;


# 각 부서별 급여의 합계들을 구하여,
# 부서 급여합이 1000 만을 초과하는 부서명과 부서별 급여합계를 조회하는
# SELECT 문을 작성하세요.
SELECT DEPT_TITLE, SUM(SALARY)
FROM employee
JOIN department ON DEPT_CODE = DEPT_ID
GROUP BY DEPT_CODE HAVING SUM(SALARY) > 10000000;


# 직원 테이블에서
# 사번, 이름, 부서명, 직급명, 입사일, 보너스를 포함한 연봉, 순위를 출력하세요.
SELECT EMP_NO, EMP_NAME, E.JOB_CODE, HIRE_DATE, SALARY * 12 * (1 + BONUS) 총연봉,
	RANK() OVER(ORDER BY SALARY * 12 * (1 + BONUS) DESC) 순위
FROM employee E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE;


# 직원 테이블에서 보너스를 포함한 연봉이 높은 5명의
# 사번, 이름, 부서명, 직급명, 입사일을 조회하세요.
SELECT EMP_NO, EMP_NAME, DEPT_TITLE, HIRE_DATE
FROM employee
JOIN department ON DEPT_CODE = DEPT_ID
ORDER BY SALARY * 12 * (1 + BONUS)
LIMIT 5;


# 70 년대 생이면서 성별이 여성이고 성이 전씨인 사원의
# 이름, 주민등록번호, 부서명, 직급명을 출력하세요
SELECT EMP_NAME, EMP_NO, DEPT_TITLE, JOB_NAME
FROM employee E
JOIN department ON DEPT_CODE = DEPT_ID
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE 
WHERE EMP_NO LIKE '7______2%';


# 이름에 '형'이 들어가는 사원의 사원ID, 사원이름, 직업명을 출력하세요.
SELECT EMP_NO, EMP_NAME, JOB_NAME
FROM employee E 
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE EMP_NAME LIKE '%형%';


#  부서코드가 D5, D6 인 사원의 이름, 직급명, 부서코드, 부서명을 출력하세요
SELECT EMP_NAME, JOB_NAME, DEPT_CODE, DEPT_TITLE
FROM employee E
JOIN department  ON DEPT_CODE = DEPT_ID
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE
WHERE E.DEPT_CODE IN('D5','D6');


# 사번, 사원명, 급여
# 급여가 500만원 이상이면 '고급'
# 급여가 300~500만원이면 '중급'
# 그 이하는 '초급'으로 출력처리 하고 별칭은 '구분' 으로 한다.
SELECT EMP_NO, EMP_NAME, 
	(CASE 
		WHEN SALARY >= 5000000 THEN '고급'
        WHEN SALARY BETWEEN 3000000 AND 5000000 THEN '중급'
        WHEN SALARY < 3000000 THEN '초급'
	END) AS '구분' 
FROM employee;


# 부서에서 가장 어린 사원의 사원ID, 이름, 나이, 부서명, 직급명을 출력하세요


# 보너스를 받은 사원의 사원명, 보너스, 부서명, 지역명을 출력하세요
SELECT EMP_NAME, BONUS, DEPT_TITLE, LOCAL_NAME
FROM employee
JOIN department  ON DEPT_CODE = DEPT_ID
JOIN location ON LOCATION_ID = LOCAL_CODE;


# 부서가 위치한 국가가 한국이나 일본인 사원의 이름, 부서명, 지역명, 국가명을 출력하시오
SELECT EMP_NAME, DEPT_TITLE, LOCAL_NAME, NATIONAL_CODE
FROM employee
JOIN department  ON DEPT_CODE = DEPT_ID
JOIN location ON LOCATION_ID = LOCAL_CODE
WHERE NATIONAL_CODE IN('KO', 'JP');


# job_code가 'J4', 'J7'이면서 보너스를 받지 못한 사원의 이름, 직급명, 급여, 보너스금액(0원으로) 출력하세요
SELECT EMP_NAME, JOB_NAME, SALARY, IFNULL(BONUS, 0) 
FROM employee E
JOIN JOB J ON E.JOB_CODE = J.JOB_CODE 
WHERE J.JOB_CODE IN('J4', 'J7');