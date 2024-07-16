CREATE OR REPLACE PROCEDURE update_sal
    (T_EMPNO IN NUMBER,
     T_SAL IN NUMBER)   -- �Ű������� ���缭 �ۼ�
IS  -- SQL ���ν����� �������� (JAVA�� �ʵ念���� ���)
    P_COUNT NUMBER;
BEGIN   -- ����
    UPDATE EMP
    SET
        SAL = SAL + T_SAL
    WHERE EMPNO = T_EMPNO;
    
    P_COUNT := SQL%ROWCOUNT;
    
    IF P_COUNT = 0 THEN 
        DBMS_OUTPUT.PUT_LINE('����� �ٽ� Ȯ�����ּ���.');
    ELSIF P_COUNT = 1 THEN
        DBMS_OUTPUT.PUT_LINE('����Ǿ����ϴ�.' || P_COUNT);
    ELSE
        DBMS_OUTPUT.PUT_LINE('2�� �̻� ����Ǿ����ϴ�.');
    END IF;
    COMMIT;
END update_sal;
/

SELECT * 
FROM EMP;
SET SERVEROUTPUT ON;

EXECUTE UPDATE_SAL(1234, 50);  
