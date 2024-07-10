SELECT *
FROM T_EMP;

-- EX) 사람 이름에 *표시
-- 1)
SELECT NAME, REPLACE(NAME, SUBSTR(NAME, 2, 3), '**')
FROM T_EMP;

-- 2)
SELECT NAME, RPAD(SUBSTR(NAME, 1, 1), 4, '*')   -- 한글은 한 글자당 2byte
FROM T_EMP;

-- EX) 지역번호를 '*'표시로 바꾸기
SELECT LPAD(SUBSTR(TEL, INSTR(TEL, ')')), LENGTH(TEL), '*') AS 번호,
    SUBSTR(TEL, INSTR(TEL, ')'))    -- 괄호 이전의 값들을 빼기
FROM T_EMP;

SELECT TEL,
    SUBSTR (TEL, 3),    -- SUBSTR(컬럼명, 문자 시작지점, 문자수) / 지정한 문자수 이전의 자료 잘라내기
    INSTR (TEL, ')'),   -- INSTR (컬럼명, 특정 문자)           / 선택된 문자의 위치의 번호
    LENGTH(TEL),        -- LENGTH(컬럼명)                     / 해당 컬럼의 전체 크기
    SUBSTR (TEL, INSTR(TEL, ')'))
FROM T_EMP;

-- EX) '-' 이후의 번호를 '*'로 바꾸기
SELECT TEL,
    LENGTH(TEL),                        -- 컬럼명 'TEL'의 길이 수
    INSTR (TEL, '-'),                   -- '-'의 위치 번호
    SUBSTR(TEL, 1, INSTR (TEL, '-')),   -- 컬럼명 'TEL'에서 1번째부터 '-' 위치까지 잘라내기
    SUBSTR(TEL, INSTR(TEL, '-')),       -- '-' 위치부터 끝까지 잘라내기
    RPAD(SUBSTR(TEL, 1, INSTR (TEL, '-')), LENGTH(TEL), '*')
FROM T_EMP;