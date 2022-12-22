# FUNCTION
SELECT LENGTH('멀티캠퍼스'), LENGTH('MULTICAMPUS'),
CHAR_LENGTH('멀티캠퍼스'), CHAR_LENGTH('MULTICAMPUS')
FROM DUAL;

# SUBSTR
SELECT SUBSTR('MULTICAMPUS', 2 );
SELECT SUBSTR('MULTICAMPUS', 2 , 4);
SELECT SUBSTR('MULTICAMPUS', 2 );
SELECT SUBSTR('MULTICAMPUS' FROM 2 FOR 4 );
SELECT SUBSTR('MULTICAMPUS', -5 );
SELECT SUBSTR('MULTICAMPUS', -5, 4 );


# employee 테이블에서 성별이 남자인 직원들만 조회하세요.
SELECT EMP_NAME, EMP_NO
FROM employee
WHERE SUBSTR(EMP_NO, 8, 1) IN(1, 3);


# employee 테이블에서 60 년대생인 사원들을 출력하세요.
SELECT EMP_NAME, EMP_NO
FROM employee
WHERE SUBSTR(EMP_NO, 1, 2) LIKE '6%' ;


# INSTR
SELECT INSTR('MULTICAMPUS MYSQL', 'A');


# employee 테이블에서 사원들의 이름, 이메일, 이메일 아이디를 조회하세요.
SELECT EMP_NAME, EMAIL, SUBSTR(EMAIL, 1, INSTR(EMAIL, '@') -1)
FROM employee;


# CONCAT
SELECT CONCAT('MULTICAMPUS ', 'MYSQL ', 'EASY');
SELECT 'MULTICAMPUS ' 'MYSQL ' 'EASY';


# REPLACE
SELECT REPLACE('MultiCampus MySQL', 'M', 'AGG');


# TRIM
SELECT TRIM('    MultiCampus      ');
SELECT TRIM('Z' FROM 'ZZZZMultiCampusZZZZZZZZ');
SELECT TRIM(LEADING 'Z' FROM 'ZZZZZZZZZZZMultiCampusZZZZZZZZZZZZ');
SELECT TRIM(TRAILING 'Z' FROM 'ZZZMultiCampusZZZZZZZZZZZZZZZZ');
SELECT TRIM(BOTH 'Z' FROM 'ZZZZMultiCampusZZZZZZZZZZZZZZZ');


# LPAD, RPAD
SELECT LPAD('MultiCampus', 20, '#');
SELECT RPAD('MultiCampus', 20, '#');
SELECT RPAD(EMAIL, 30, '#') 
FROM employee;


# EMPLOYEE 테이블에서 사원명과 주민번호를 조회하시오
# 단 주민번호는 생년월일까지만 표시하고 '-'  다음 자리수는 모두 '*'로 바꿔 출력하시오
# EX) 001111-1111111 => 001111-*******
# 3가지 방법으로 풀어보십시오

# 1.
SELECT EMP_NAME, RPAD(SUBSTR(EMP_NO, 1, 7), 14, '*')
FROM employee;

# 2.
SELECT EMP_NAME, REPLACE(EMP_NO, SUBSTR(EMP_NO, -7, 7), '*******')
FROM employee;

# 3.
SELECT EMP_NAME, CONCAT(SUBSTR(EMP_NO, 1, 7), '*******')
FROM employee;


# 숫자 관련 함수
# ABS
SELECT ABS(-100);


# MOD
SELECT MOD(10, 3);


# FLOOR
SELECT FLOOR(10.15);


# ROUND
SELECT ROUND(10.55);
SELECT ROUND(10.55, 1);
SELECT ROUND(15.55, -1);


# CEIL
SELECT CEIL(10.15);


# TRUNCATE
SELECT TRUNCATE(10.55, 1);
SELECT TRUNCATE(15.55, -1);


# NOW
SELECT NOW();


# DATE_ADD
SELECT DATE_ADD(NOW(), INTERVAL '1 1:1:1' DAY_SECOND);
SELECT DATE_ADD(NOW(), INTERVAL '-1 1:1:1' DAY_SECOND);
SELECT DATE_ADD(NOW(), INTERVAL 1 DAY);

# DATE_SUB
SELECT DATE_SUB(NOW(), INTERVAL '1 1:1:1' DAY_SECOND);
SELECT DATE_SUB(NOW(), INTERVAL 1 DAY);


# 이 회사는 30 개월간 근무할 경우 100 만원을 지급합니다.
# employ 테이블에서 사원들의 입사일로부터 30 개월 이후의 날짜를 조회하세요.
# 사원들의 이름, 입사일, 30 개월 이후 날짜를 조회합시다.

SELECT EMP_NAME, HIRE_DATE, DATE_ADD(HIRE_DATE, INTERVAL 30  MONTH)
FROM employee;


# DATEDIFF
# employee 테이블에 사람들의 근무일자를 구해보자. 단, 퇴사한 사람은 빼자.
SELECT EMP_NAME, DATEDIFF(NOW(), HIRE_DATE)
FROM employee
WHERE ENT_YN = 'N';

# employee  테이블에 사람들의 근속년수를 더해보자. 단, 퇴사한 사람은 빼자.
SELECT EMP_NAME, TIMESTAMPDIFF(YEAR, HIRE_DATE, NOW())
FROM employee;


# YEAR, MONTH, DAY, HOUR, MINUTE, SECOND
SELECT YEAR(NOW())
	, MONTH(NOW())
    , DAY(NOW())
    , HOUR(NOW())
	, MINUTE(NOW())
    , SECOND(NOW());
    

# CAST
SELECT CAST('2022-12-21' AS DATE);
SELECT CAST(NOW() AS YEAR);
SELECT CAST(NOW() AS TIME);


# IFNULL
# employee 테이블에서 D5 부서이면서 급여가 3000000 이상인 직원의 이름, 연봉, 보너스를 추가한 연봉을 조회하시오.
#    연봉의 별칭은, [연봉] 보너스를 포함한 연봉의 별칭인 [총 연봉] 으로 합니다.
SELECT 	EMP_NAME, SALARY * 12 AS '[연봉]', 
	SALARY + (1 + IFNULL(BONUS, 0)) * 12 AS '[총 연봉]'
FROM employee
WHERE DEPT_CODE = 'D5' AND SALARY >= 3000000;


# CASE-WHEN-THEN
SELECT EMP_NAME, SAL_LEVEL,
	CASE WHEN SALARY >= 6000000 AND SALARY <= 10000000 THEN 'S1'
		WHEN SALARY >= 5000000 THEN 'S2'
        WHEN SALARY >= 4000000 THEN 'S3'
        WHEN SALARY >= 3000000 THEN 'S4'
        WHEN SALARY >= 2000000 THEN 'S5'
        WHEN SALARY >= 1000000 THEN 'S6'
        ELSE 'S7'
END AS SAL_LEVEL2
FROM employee;

