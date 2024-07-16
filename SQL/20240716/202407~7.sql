CREATE OR REPLACE PROCEDURE update_sal
    (T_EMPNO IN NUMBER,
     T_SAL IN NUMBER)   -- 매개변수를 맞춰서 작성
IS  -- SQL 프로시져의 변수선언 (JAVA의 필드영역과 비슷)
    P_COUNT NUMBER;
BEGIN   -- 실행
    UPDATE EMP
    SET
        SAL = SAL + T_SAL
    WHERE EMPNO = T_EMPNO;
    
    P_COUNT := SQL%ROWCOUNT;
    
    IF P_COUNT = 0 THEN 
        DBMS_OUTPUT.PUT_LINE('사번을 다시 확인해주세요.');
    ELSIF P_COUNT = 1 THEN
        DBMS_OUTPUT.PUT_LINE('저장되었습니다.' || P_COUNT);
    ELSE
        DBMS_OUTPUT.PUT_LINE('2개 이상 저장되었습니다.');
    END IF;
    COMMIT;
END update_sal;
/

SELECT * 
FROM EMP;
SET SERVEROUTPUT ON;

EXECUTE UPDATE_SAL(1234, 50);  
