-- TRIGGER Ʈ����
CREATE OR REPLACE TRIGGER TRIGGER_TEST1
    BEFORE -- AFTER
    UPDATE ON DEPT
    FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('���� �� : ' || :OLD.DNAME);
    DBMS_OUTPUT.PUT_LINE('���� �� : ' || :NEW.DNAME);
END;
/

SET SERVEROUTPUT ON;
UPDATE DEPT
SET 
    DNAME = 'TEST'
WHERE
    DEPTNO = 10;
    
-- EX
CREATE OR REPLACE TRIGGER TRIGGER_TEST2
    BEFORE
    INSERT ON EMP
    FOR EACH ROW
DECLARE  -- TRIGGER�� 'DECLARE'�� ��������
    SALAVG EMP.SAL%TYPE;
BEGIN
    SELECT ROUND(AVG(SAL), 0)
    INTO SALAVG
    FROM EMP;
    DBMS_OUTPUT.PUT_LINE('�޿� ��� : ' || SALAVG);
END;
/

INSERT INTO EMP(EMPNO, ENAME, JOB, HIREDATE, SAL)
    VALUES(1001, 'TEST', 'SALES', SYSDATE, 1234);
    
    

?