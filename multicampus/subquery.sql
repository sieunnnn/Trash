# Subquery
# 부서코드가 노옹철사원과 같은 직원명단을 조회하세요.
SELECT EMP_NAME 
FROM employee
WHERE DEPT_CODE = (SELECT DEPT_CODE 
									FROM employee
									WHERE EMP_NAME = '노옹철');	# 단일 행 단일 열 반환


# 단일행, 단일 열 서브쿼리
# 비교연산자 사용
SELECT EMP_NAME, 
	(SELECT DEPT_CODE FROM employee WHERE EMP_NAME = '노옹철')
FROM employee;


# 다중행 서브쿼리
# 최대 급여가 4999999 보다 적은 급여등급을 가지고 있는 직원을 조회하세요.
SELECT EMP_NAME, SAL_LEVEL
FROM employee
WHERE SAL_LEVEL 
	IN (SELECT SAL_LEVEL FROM SAL_GRADE WHERE MAX_SAL < 4999999);


# 박나라가 속한 부서 사람들의 급여레벨에 속하는 사원들의 정보를 출력하세요.
SELECT DISTINCT SAL_LEVEL 
FROM employee
WHERE DEPT_CODE = (SELECT DEPT_CODE FROM employee WHERE EMP_NAME = '박나라');

SELECT EMP_NAME, SAL_LEVEL
FROM employee
WHERE SAL_LEVEL = ANY (SELECT DISTINCT SAL_LEVEL 
											FROM employee
											WHERE DEPT_CODE = (SELECT DEPT_CODE FROM employee WHERE EMP_NAME = '박나라'));


# 박나라가 속한 부서의 사람들 중 가장 적은 연봉을 받는 사람보다 많은 연봉을 받는 사람을 구하세요.
SELECT EMP_NAME, SALARY
FROM employee
WHERE SALARY > ANY(SELECT SALARY 
									FROM employee 
									WHERE DEPT_CODE = (SELECT DEPT_CODE FROM employee WHERE EMP_NAME = '박나라'));


# 박나라가 속한 부서의 사람들 중 가장 많은 연봉을 받는 사람보다 많은 연봉을 받는 사람을 구하세요.
SELECT EMP_NAME, SALARY
FROM employee
WHERE SALARY > ALL (SELECT SALARY 
					FROM employee 
                    WHERE DEPT_CODE = (SELECT DEPT_CODE FROM employee WHERE EMP_NAME = '박나라'));


# 매니저인 사원을 조회하세요.
# 선동일을 매니저로 두고 있는 사원을 조회
SELECT EMP_ID, EMP_NAME, MANAGER_ID
FROM employee E
WHERE EXISTS (SELECT * 
							FROM employee 
							WHERE MANAGER_ID = E.EMP_ID);	# E : 참조
        
        
# 상관쿼리(상호연관쿼리)
SELECT EMP_ID, EMP_NAME, MANAGER_ID
FROM employee E
WHERE EXISTS (SELECT EMP_ID 
							FROM employee 
                            WHERE MANAGER_ID = E.EMP_ID);


# IN 을 사용해서 위와 같은 쿼리를 작성
SELECT EMP_ID, EMP_NAME, MANAGER_ID
FROM employee E
WHERE EMP_ID IN (SELECT MANAGER_ID 
								FROM employee );


# 퇴사한 직원이 존재하는 부서의 사원 중에서 퇴사한 사원과 같은 직급인 사원의 이름, 직급, 부서를 조회
SELECT EMP_NAME, JOB_CODE, DEPT_CODE
FROM employee
WHERE DEPT_CODE IN(SELECT DEPT_CODE 
									FROM employee 
                                    WHERE ENT_YN = 'Y')
AND JOB_CODE IN(SELECT JOB_CODE 
								FROM employee 
                                WHERE ENT_YN = 'Y');


# 다중열 서브쿼리 
SELECT EMP_NAME, JOB_CODE, DEPT_CODE
FROM employee
WHERE (DEPT_CODE, JOB_CODE) IN(SELECT DEPT_CODE, JOB_CODE FROM employee WHERE ENT_YN = 'Y');


# 인라인뷰
# MySQL  에서는 인라인뷰에 반드시 별칭을 붙여야 한다.
SELECT *
FROM (SELECT EMP_ID, EMP_NAME, DEPT_CODE
			FROM employee WHERE JOB_CODE = 'J6') A;


