SELECT *
FROM STUDENT;

-- ORDER BY (����)
SELECT *
FROM STUDENT
ORDER BY STU_HEIGHT ASC;    -- ����Ʈ : ��������(ASC)

SELECT *
FROM STUDENT
ORDER BY STU_HEIGHT DESC;    -- ����Ʈ : ��������(DESC)

SELECT *
FROM STUDENT
ORDER BY STU_HEIGHT DESC, STU_WEIGHT DESC;  -- ������ ���� �켱����


-- STUDENT, ENROL, SUBJECT (JOIN)
SELECT *
FROM ENROL;

SELECT *
FROM STUDENT
INNER JOIN ENROL ON STUDENT.STU_NO = ENROL.STU_NO;

SELECT STU_NAME, ENR_GRADE
FROM STUDENT
INNER JOIN ENROL ON STUDENT.STU_NO = ENROL.STU_NO;

SELECT STU_NAME, ENR_GRADE
FROM STUDENT S      -- ���̺� ��Ī �ο�
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO;

SELECT S.STU_NO, STU_NAME, ENR_GRADE      -- �� �� ���̺� �����ϴ� �÷� 'STU_NO'�� ��Ȯ�� �����ϱ� ���� �տ� ���̺��� ��Ī�� ����
FROM STUDENT S      
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO;


---- ANSI JOIN
--SELECT S.STU_NO, STU_NAME, ENR_GRADE
--FROM STUDENT S      
--INNER JOIN ENROL E ON S.STU_NO = E.STU_NO;

---- ORACLE JOIN
--SELECT S.STU_NO, STU_NAME, ENR_GRADE
--FROM STUDENT S, ENROL E     
--INNER JOIN ENROL E ON S.STU_NO = E.STU_NO;


-- EX) ENROL ���̺� ���� ����� ��, ������� ���� ��� (ENROL�� SUBJECT�� JOIN)
SELECT *
FROM ENROL;
SELECT *
FROM SUBJECT;

SELECT SUB_NAME, E.SUB_NO, STU_NO, ENR_GRADE
FROM ENROL E      
INNER JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO;  -- �� ���̺��� ���� �÷� 'SUB_NO'�� �������� ����

-- EX) �л��̸�, ���� ���
SELECT STU_NAME, ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO;

-- EX) �л� �̸�, �����, ���� ���
SELECT *
FROM STUDENT;
SELECT *
FROM ENROL;
SELECT *
FROM SUBJECT;

SELECT STU_NAME, ENR_GRADE, SUB_NAME
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SJ ON SJ.SUB_NO = E.SUB_NO;

-- GROUP BY
SELECT AVG(ENR_GRADE), STU_NO
FROM ENROL
GROUP BY STU_NO;    -- GROUP BY�� ����Ͽ� �ش� �÷��� ��� ��� ���� (��� ��)

-- EX) ���� ��� ����(���� ��ȣ, ��� ���� ���)
SELECT AVG(ENR_GRADE), SUB_NO
FROM ENROL
GROUP BY SUB_NO;

-- EX) �л��� ��� ���� (�л� �̸�, �а�, ������� ���)
SELECT AVG(ENR_GRADE), STU_NAME, STU_DEPT
FROM ENROL E
INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO     -- ����� �÷����� �� ���̺� ����
GROUP BY S.STU_NAME, S.STU_DEPT;                -- �л� �̸�, �а� �÷��� ���� ��հ��� ��� ���

-- EX) �л����� ��ü ����������� ������ ���� �л����� �й�, �̸�, ���� ���
SELECT S.STU_NO, S.STU_NAME
FROM STUDENT S;

SELECT *
FROM (
    SELECT AVG(ENR_GRADE) AS ENR_AVG, STU_NO   -- AS �׷��Լ� => �׷��Լ��� '�÷�ȭ'
    FROM ENROL
    GROUP BY STU_NO
    -- WHERE AVG(ENR_GRADE) > 60   -- �׷��Լ��� ���ǽĿ� ���� ����
)
WHERE ENR_AVG >= 60;

SELECT *
FROM STUDENT S
INNER JOIN (    -- ���������� ���� ������ JOIN
    SELECT AVG(ENR_GRADE) AS ENR_AVG, STU_NO   -- AS �׷��Լ� => �׷��Լ��� '�÷�ȭ'
    FROM ENROL 
    GROUP BY STU_NO
) E ON S.STU_NO = E.STU_NO;


SELECT S.STU_NO, S.STU_NAME, E.ENR_AVG
FROM STUDENT S
INNER JOIN (
    SELECT AVG(ENR_GRADE) AS ENR_AVG, STU_NO
    FROM ENROL
    GROUP BY STU_NO
) E ON S.STU_NO = E.STU_NO;

















