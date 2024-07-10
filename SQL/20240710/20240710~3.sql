-- 내장 함수 (숫자)

SELECT 
    ROUND(123.456, 2),  -- 2번째 자리 기준으로 반올림
    ROUND(123.333, 2)
FROM DUAL;

SELECT 
    CEIL(123.456),      -- 정수 기준 올림
    CEIL(123.333)
FROM DUAL;

SELECT 
    TRUNC(123.456, 2),  -- 2번째 자리 기준으로 수를 잘라내기(내림)
    TRUNC(123.333, 2)
FROM DUAL;

SELECT 
    FLOOR(123.456),     -- 정수 기준 내림
    FLOOR(123.333)
FROM DUAL;

SELECT 
    SQRT(16)            -- 제곱근
FROM DUAL;

SELECT 
    POWER(2, 3)         -- 제곱 / POWER(제곱근, 승수)
FROM DUAL;

SELECT
    ABS(-123)           -- 절대값
FROM DUAL;

SELECT
    SIGN(-123),         -- 음수일때 -1, 양수일때 1, 0일때 0으로 리턴
    SIGN(456),
    SIGN(0)
FROM DUAL;

SELECT                  -- 나머지 연산
    MOD(10, 3)
FROM DUAL;