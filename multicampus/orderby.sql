# 사원들의 이름, 급여, 보너스를 조회하되 BONUS 로 오름차순 정렬하세요.
SELECT EMP_NAME, SALARY, BONUS
FROM employee
ORDER BY BONUS ASC;


# result set 의 두번째 컬럼을 기준으로 내림차순 정렬
SELECT EMP_NAME, SALARY, BONUS
FROM employee
ORDER BY SALARY DESC;


# 사원들의 이름, 급여, 보너스, 연봉레벨, 부서코드를 조회하되 연봉레벨로 오름차순 정렬을 하세요. 만약 같다면 연봉으로 내림차순 정렬하세요.
SELECT EMP_NAME, SALARY, BONUS, SAL_LEVEL, DEPT_CODE
FROM employee
ORDER BY SAL_LEVEL ASC, SALARY DESC;


# 사원들의 이름, 급여, 보너스, 연봉레벨, 부서코드를 조회하되 보너스로 오름차순 정렬을 하고, NULL 은 뒤에 정렬하세요.
SELECT EMP_NAME, SALARY, BONUS, SAL_LEVEL, DEPT_CODE
FROM employee
ORDER BY BONUS IS NULL ASC, BONUS ASC;
