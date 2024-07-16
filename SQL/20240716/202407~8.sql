-- 1. ENROL ���̺� ��� ���ν��� ����
-- - �й�, �����ȣ, ������ �Է¹޾Ƽ�
-- - �ش� ������ �й��� �����ȣ�� ������ ���(AND) ���� ������ �Ķ���ͷ� ����
--   ������ �����ֱ�
-- - ������Ʈ ���� ������ '����Ǿ����ϴ�'
-- - ���� ��� '�ش� �й��̳� ������ �������� �ʽ��ϴ�' ���
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
        DBMS_OUTPUT.PUT_LINE('�ش� �й��̳� ������ �������� �ʽ��ϴ�');
    ELSE
        DBMS_OUTPUT.PUT_LINE('����Ǿ����ϴ�');
    END IF; 
END ENROL_CLASS;
/

SELECT *
FROM ENROL;
EXECUTE ENROL_CLASS (111, 20143054, 9); 

/* --------------------------------------------------------------- */

-- �ش� �й��� ���� �л��� �̸�, �а�, �г� ����Ʈ������ ���
EXECUTE STUINFO(20131001);
CREATE OR REPLACE PROCEDURE STUINFO
    (P_STUNO IN STUDENT.STU_NO%TYPE)    -- STUDENT ���̺��� STU_NO �÷����� Ÿ���� �޴� �Ķ���� 'P_STUNO' 
IS
    P_STUNAME STUDENT.STU_NAME%TYPE;    -- �ش� ���̺��� �ڷḦ ���������� ����
    P_STUDEPT STUDENT.STU_DEPT%TYPE;
    P_GRADE STUDENT.STU_GRADE%TYPE;
BEGIN
    SELECT STU_NAME, STU_DEPT, STU_GRADE
    -- INTO ��
    INTO P_STUNAME, P_STUDEPT, P_GRADE
    FROM STUDENT
    WHERE STU_NO = P_STUNO;
    DBMS_OUTPUT.PUT_LINE('�̸� : ' || P_STUNAME);     -- ������ �ش� ���̺��� �ڷḦ ȣ��
    DBMS_OUTPUT.PUT_LINE('�Ҽ��а� : ' || P_STUDEPT);
    DBMS_OUTPUT.PUT_LINE('�г� : ' || P_GRADE);
END STUINFO;

-- EXECUTE EMPINFO (7369)
-- �ش� ���ν��� ȣ�� ��, �ش� ����� ���� ����� �̸�, ���� ���
EXECUTE EMPINFO(7369);

-- �ش� ���ν��� �ۼ�
CREATE OR REPLACE PROCEDURE EMPINFO
    (E_EMPNO IN EMP.EMPNO%TYPE)
IS
    P_EMP EMP%ROWTYPE;
BEGIN
    SELECT ENAME, JOB
    INTO P_EMP.ENAME, P_EMP.JOB     -- SELECT�� �÷��� ���ν��� ����
    FROM EMP
    WHERE EMPNO = E_EMPNO;
    DBMS_OUTPUT.PUT_LINE('�̸� : ' || P_EMP.ENAME);
    DBMS_OUTPUT.PUT_LINE('���� : ' || P_EMP.JOB);
END EMPINFO;
/

