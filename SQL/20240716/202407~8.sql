-- 1. ENROL 테이블 대상 프로시저 생성
-- - 학번, 과목번호, 점수를 입력받아서
-- - 해당 동일한 학번과 과목번호가 존재할 경우(AND) 기존 점수에 파라미터로 보낸
--   점수를 더해주기
-- - 업데이트 행이 있으면 '저장되었습니다'
-- - 없을 경우 '해당 학번이나 과목이 존재하지 않습니다' 출력
CREATE OR REPLACE PROCEDURE ENROL_CLASS
    (O_SUB_NO IN NUMBER, O_STU_NO IN NUMBER, O_ENR_GRADE IN NUMBER)
IS
    G_COUNT NUMBER;
BEGIN
    UPDATE 
        ENROL
    SET
        ENR_GRADE = ENR_GRADE + O_ENR_GRADE
    WHERE
        SUB_NO = O_SUB_NO AND STU_NO = O_STU_NO;
        
    G_COUNT := SQL%ROWCOUNT;
    IF G_COUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('해당 학번이나 과목이 존재하지 않습니다');
    ELSE
        DBMS_OUTPUT.PUT_LINE('저장되었습니다');
    END IF; 
END ENROL_CLASS;
/

SELECT *
FROM ENROL;
EXECUTE ENROL_CLASS (111, 20143054, 9); 

/* --------------------------------------------------------------- */

-- 해당 학번을 가진 학생의 이름, 학과, 학년 프린트문으로 출력
EXECUTE STUINFO(20131001);
CREATE OR REPLACE PROCEDURE STUINFO
    (P_STUNO IN STUDENT.STU_NO%TYPE)    -- STUDENT 테이블의 STU_NO 컬럼에서 타입을 받는 파라미터 'P_STUNO' 
IS
    P_STUNAME STUDENT.STU_NAME%TYPE;    -- 해당 테이블의 자료를 간접적으로 접근
    P_STUDEPT STUDENT.STU_DEPT%TYPE;
    P_GRADE STUDENT.STU_GRADE%TYPE;
BEGIN
    SELECT STU_NAME, STU_DEPT, STU_GRADE
    -- INTO 절
    INTO P_STUNAME, P_STUDEPT, P_GRADE
    FROM STUDENT
    WHERE STU_NO = P_STUNO;
    DBMS_OUTPUT.PUT_LINE('이름 : ' || P_STUNAME);     -- 접근한 해당 테이블의 자료를 호출
    DBMS_OUTPUT.PUT_LINE('소속학과 : ' || P_STUDEPT);
    DBMS_OUTPUT.PUT_LINE('학년 : ' || P_GRADE);
END STUINFO;

-- EXECUTE EMPINFO (7369)
-- 해당 프로시저 호출 시, 해당 사번을 가진 사람의 이름, 직급 출력
EXECUTE EMPINFO(7369);

-- 해당 프로시저 작성
CREATE OR REPLACE PROCEDURE EMPINFO
    (E_EMPNO IN EMP.EMPNO%TYPE)
IS
    P_EMP EMP%ROWTYPE;
BEGIN
    SELECT ENAME, JOB
    INTO P_EMP.ENAME, P_EMP.JOB     -- SELECT한 컬럼명에 프로시저 접근
    FROM EMP
    WHERE EMPNO = E_EMPNO;
    DBMS_OUTPUT.PUT_LINE('이름 : ' || P_EMP.ENAME);
    DBMS_OUTPUT.PUT_LINE('직급 : ' || P_EMP.JOB);
END EMPINFO;
/

