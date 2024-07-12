-- NVL
SELECT EMPNO, ENAME, SAL, NVL(COMM, 0) AS COMM  -- NVL(컬럼명, 0) => NULL값을 0으로 바꿔서 출력
FROM EMP;

-- NVL2
SELECT EMPNO, ENAME, SAL, NVL2(COMM, 0, 1), COMM  -- NVL2(컬럼명, 0, 1) => NULL값은 1로 반환, NOT NULL값은 0으로 반환
FROM EMP;

-- DECODE (if문과 비슷함)
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '사장') AS JOB  -- DECODE(컬럼명, 해당 컬럼값, 대체할 값)
FROM EMP;

-- DECODE (if-else문과 비슷)
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '사장', '사원') AS JOB    -- DECODE(컬럼명, 해당 컬럼값, 대체할 값, 해당되지 않은 값에 넣을 대체할 값)
FROM EMP;

-- if-else, if-else
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '사장', 'MANAGER', '관리자', '사원') AS JOB    
FROM EMP;

-- CASE - WHEN
SELECT EMPNO, ENAME,
    CASE JOB WHEN 'PRESIDENT' THEN '사장'
             WHEN 'MANAGER' THEN '관리자'
             ELSE '사원'
    END AS JOB
FROM EMP;

SELECT EMPNO, ENAME, SAL,
    CASE WHEN SAL > 3000 THEN '많이받네'       -- CASE-WHEN에는 연산자도 사용 가능
         WHEN SAL > 2000 THEN '적당히받네'
         ELSE '화이팅'
    END AS 직급
FROM EMP;

-- SYSDATE (시간표현, 오라클 전용)
SELECT 
    SYSDATE,
    TO_CHAR(SYSDATE, 'YYMMDD') AS CASE1,
    TO_CHAR(SYSDATE, 'YYYYMMDD') AS CASE2,
    TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS CASE3,
    TO_CHAR(SYSDATE, 'YYYY-MM-DD-HH:MI:SS') AS CASE4,
    TO_CHAR(SYSDATE, 'YYYY-MM-DD-HH24:MI:SS') AS CASE5
FROM DUAL;


