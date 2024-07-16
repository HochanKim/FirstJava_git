-- PL / SQL
-- DECLARE -- ����
CREATE OR REPLACE PROCEDURE update_sal
    (T_EMPNO IN NUMBER)
IS 
BEGIN   -- ����
    UPDATE EMP
    SET
        SAL = SAL + 100
    WHERE EMPNO = T_EMPNO;
END update_sal;     -- ��

-- EXCEPTION  -- ����, ���� ����
SELECT * 
FROM EMP;
EXECUTE UPDATE_SAL(7369);   -- ��� 7369�� �޿��� 100 ����

-- EX) STUDENT ���̺� ���
-- �й��� �Է¹޾Ƽ� �ش� �й� �л��� Ű�� 1 ���� ��Ű�� ���ν��� ����
-- ���ν��� ����


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
