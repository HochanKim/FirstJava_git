-- PL / SQL
-- DECLARE -- 선언
CREATE OR REPLACE PROCEDURE update_sal
    (T_EMPNO IN NUMBER)
IS 
BEGIN   -- 실행
    UPDATE EMP
    SET
        SAL = SAL + 100
    WHERE EMPNO = T_EMPNO;
END update_sal;     -- 끝

-- EXCEPTION  -- 예외, 생략 가능
SELECT * 
FROM EMP;
EXECUTE UPDATE_SAL(7369);   -- 사번 7369의 급여가 100 증가

-- EX) STUDENT 테이블 사용
-- 학번을 입력받아서 해당 학번 학생의 키를 1 증가 시키는 프로시저 생성
-- 프로시저 생성


CREATE OR REPLACE PROCEDURE UP_HEIGHT
    (H_STU_NO IN NUMBER)
IS BEGIN
    UPDATE STUDENT
    SET STU_HEIGHT = STU_HEIGHT + 1
    WHERE STU_NO = H_STU_NO;
END UP_HEIGHT;
/

SELECT *
FROM STUDENT;
EXECUTE UP_HEIGHT(20143054);
EXECUTE UP_HEIGHT(20151062);
