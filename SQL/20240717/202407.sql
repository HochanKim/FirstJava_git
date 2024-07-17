-- FUNCTION 함수
-- 숫자를 넣으면 2배로 리턴해주는 함수
CREATE OR REPLACE FUNCTION MULTI(P_VALUE NUMBER)    -- SQL 함수 생성
RETURN NUMBER                                       -- RETURN 리턴타입
IS
BEGIN
    RETURN P_VALUE * 2;
END;
/
SELECT *
FROM EMP;

SELECT SUBSTR(ENAME, 1, 2)
FROM EMP;

/* 기존 급여(SAL), 급여 두 배(MULTI(SAL)) */
SELECT SAL, MULTI(SAL)     
FROM EMP;


-- 2024-07-17 00:00:00
CREATE OR REPLACE FUNCTION FORMAT_DATE(P_DATE DATE)
RETURN VARCHAR2
IS
BEGIN
    RETURN TO_CHAR(P_DATE, 'YYYY-MM-DD HH24:MI:SS');
END;
/

SELECT FORMAT_DATE(HIREDATE) AS HIREDATE
FROM EMP;
