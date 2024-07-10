-- 검색(SELECT), 내장 함수(문자)
SELECT NAME AS 이름
FROM T_EMP;

SELECT UPPER('hello oracle') as TEST -- 대문자로 변환
FROM DUAL;

SELECT UPPER(STU_CLASS), STU_NAME FROM STUDENT; -- 컬럼명 예시

SELECT LOWER('hello oracle') as TEST
FROM DUAL;  -- 소문자로 변환

SELECT INITCAP('hello oracle') as TEST
FROM DUAL;  -- 첫 글자만 대문자로 변환

SELECT CONCAT(NAME, EMP_TYPE)   -- 컬럼 이어붙이기
FROM T_EMP;

SELECT NAME ||'의 계약형태는 '||EMP_TYPE||' 입니다.'  -- 문자를 포함한 컬럼 이어 붙이기
FROM T_EMP;

SELECT EMPNO, SUBSTR(EMPNO, 4) AS SUBSTR, SUBSTR(EMPNO, 3, 4) AS SUBSTR     -- SUBSTR(컬럼명, 문자 시작지점, 문자수)
FROM T_EMP;

-- EX) 1996년도에 입사한 사람들의 정보를 출력하시오
SELECT *
FROM T_EMP
WHERE SUBSTR(EMPNO, 1, 4) = 1996;   -- 컬럼명 'EMPNO'에서 1번째부터 4번째 자르기

SELECT NAME, LENGTH(PAY)        -- 해당 컬럼의 문자 길이
FROM T_EMP;

SELECT TEL, INSTR(TEL, '-')     -- 선택된 문자의 위치 찾기
FROM T_EMP;

SELECT LPAD(DEPTNO, 10, '*')    -- 빈공간을 문자로 채우기 (왼쪽 : LPAD(컬럼명, 크기값, 문자))
FROM T_EMP;

SELECT RPAD(DEPTNO, 10, '*')    -- 빈공간을 문자로 채우기 (오른쪽 : RPAD(컬럼명, 크기값, 문자))
FROM T_EMP;

SELECT TRIM(' HELLO ORACLE      ')  -- 빈공간 제거
FROM DUAL;

SELECT REPLACE(TEL, '-', ' ')       -- 특정 문자 대체(바꾸기)
FROM T_EMP;
