--1. �Լ� ��������
--ȣ�� : FORMAT_DATE2(��¥������, 'DATETIME or DATE or TIME');
--��� :  -- 'DATETIME' -> YYYY-MM-DD HH24:MI:SS
--       -- 'DATE' -> YYYY-MM-DD
--       -- 'TIME' -> HH24:MI:SS
CREATE OR REPLACE FUNCTION FORMAT_DATE2(��¥������ DATE)
RETURN VARCHAR2
IS
BEGIN
    RETURN TO_CHAR(��¥������, 'YYYY-MM-DD HH24:MI:SS');
END;
/

SELECT FORMAT_DATE2(HIREDATE) AS �����
FROM PROFESSOR;

   
--2. ���ν��� ��������(��� ���̺� : PROFESSOR)
--ȣ�� : EXECUTE PROF_SAL(������ȣ(PROFNO), ������(���� ��))
--��� : ������ȣ�� �ش��ϴ� ����� �޿��� ���� ����ŭ ����(10�� ���� ��� 10% ����)
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


--3. Ʈ���� ��������(��� ���̺� : PROFESSOR)
--���̺� ���� : 
CREATE TABLE PROFESSOR_LOG (
    PROFNO NUMBER,
    NAME VARCHAR(20),
    PAY NUMBER,
    ID VARCHAR(20)
);
--	���̺�� => PROFESSOR_LOG
--	�÷� => PROFNO(NUMBER), NAME(VARCHAR(20)), PAY(NUMBER), ID, CDATETIME(DATE), EVENT(VARCHAR(10))
CREATE OR REPLACE TRIGGER PROFESSOR_LOG
    AFTER
    UPDATE ON PROFESSOR
    FOR EACH ROW
BEGIN
    INSERT INTO PROFESSOR_LOG
    VALUES(NEW)
END;
/


--ȣ�� : PROFESSOR ���̺��� INSERT, UPDATE, DELETE
--��� : 
--	INSERT => PROFESSOR_LOG ���̺� �� �÷� �� ä���, EVENT�� ��� 'I'�� ����
--	UPDATE => PROFESSOR_LOG ���̺� �� �÷� �� ä���, EVENT�� ��� 'U'�� ����
--	DELETE => ����� ���� ������ ���� �� '���� �Ұ���' ���� �޽��� ���