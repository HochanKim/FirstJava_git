--1. 함수 연습문제
--호출 : FORMAT_DATE2(날짜데이터, 'DATETIME or DATE or TIME');
--결과 :  -- 'DATETIME' -> YYYY-MM-DD HH24:MI:SS
--       -- 'DATE' -> YYYY-MM-DD
--       -- 'TIME' -> HH24:MI:SS
CREATE OR REPLACE FUNCTION FORMAT_DATE2(날짜데이터 DATE)
RETURN VARCHAR2
IS
BEGIN
    RETURN TO_CHAR(날짜데이터, 'YYYY-MM-DD HH24:MI:SS');
END;
/

SELECT FORMAT_DATE2(HIREDATE) AS 고용일
FROM PROFESSOR;

   
--2. 프로시저 연습문제(대상 테이블 : PROFESSOR)
--호출 : EXECUTE PROF_SAL(교수번호(PROFNO), 증가율(숫자 값))
--결과 : 교수번호에 해당하는 사람의 급여가 숫자 값만큼 증가(10을 넣을 경우 10% 증가)
CREATE OR REPLACE PROCEDURE PROF_SAL
    (P_PROFNO IN NUMBER, P_PAY IN NUMBER)
IS 
BEGIN
   UPDATE 
        PROFESSOR
   SET
        PAY = PAY + (PAY * (P_PAY * 0.01))
    WHERE
        PROFNO = P_PROFNO;
END PROF_SAL;
/
EXECUTE PROF_SAL(2001, 10);

SELECT *
FROM PROFESSOR;


--3. 트리거 연습문제(대상 테이블 : PROFESSOR)
--테이블 생성 : 
CREATE TABLE PROFESSOR_LOG (
    PROFNO NUMBER,
    NAME VARCHAR(20),
    PAY NUMBER,
    ID VARCHAR(20)
);
--	테이블명 => PROFESSOR_LOG
--	컬럼 => PROFNO(NUMBER), NAME(VARCHAR(20)), PAY(NUMBER), ID, CDATETIME(DATE), EVENT(VARCHAR(10))
CREATE OR REPLACE TRIGGER PROFESSOR_LOG
    AFTER
    UPDATE ON PROFESSOR
    FOR EACH ROW
BEGIN
    INSERT INTO PROFESSOR_LOG
    VALUES(NEW)
END;
/


--호출 : PROFESSOR 테이블의 INSERT, UPDATE, DELETE
--결과 : 
--	INSERT => PROFESSOR_LOG 테이블에 각 컬럼 값 채우기, EVENT의 경우 'I'로 삽입
--	UPDATE => PROFESSOR_LOG 테이블에 각 컬럼 값 채우기, EVENT의 경우 'U'로 삽입
--	DELETE => 사용자 정의 오류를 생성 후 '삭제 불가능' 오류 메시지 출력