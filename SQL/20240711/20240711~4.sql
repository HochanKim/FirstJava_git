-- 1. ������ �л��� ���� ������ ������� ���� �̸� ���
SELECT STU_NAME, SUB_NAME, SUB_PROF
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO
WHERE STU_NAME = '������';

--SELECT STU_NAME, SUB_NAME, SUB_PROF
--FROM STUDENT S
--INNER JOIN SUBJECT SJ ON S.STU_DEPT = SJ.SUB_DEPT     -- �ٶ����� JOIN�� �ƴ�
--WHERE STU_NAME = '������';

-- 2. �����۹�, �������ڽ��� ������ ��� �л��� �й�, �̸�, ������ ���
SELECT S.STU_NO, S.STU_NAME, SUB_NAME
FROM ENROL E
INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SJ ON SJ.SUB_NO = E.SUB_NO
WHERE SUB_NAME = '�����۹�' OR SUB_NAME = '�������ڽ���';

-- 3. �����̸鼭 ������ ������ ������ ��� �л��� �й�, �̸�, �а�, ������, ���� ���� ���
SELECT S.STU_NO, STU_NAME, STU_DEPT, SUB_NAME, ENR_GRADE
FROM ENROL E
INNER JOIN SUBJECT SJ ON SJ.SUB_NO = E.SUB_NO
INNER JOIN STUDENT S ON E.STU_NO = S.STU_NO
WHERE S.STU_GENDER = 'F' AND SJ.SUB_PROF = '������';

-- 4. �������� ��� �������� ���� ������ ���� �л����� �̸�, �����, ���� ���
SELECT *
FROM STUDENT 
WHERE STU_NAME = '������';

SELECT AVG(ENR_GRADE) AS IJ_KIM_AVG
FROM ENROL
WHERE STU_NO = '20151062';

SELECT STU_NAME, SUB_NAME, ENR_GRADE
FROM ENROL E
INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SJ ON SJ.SUB_NO = E.SUB_NO;

SELECT *
FROM (
    SELECT STU_NAME, SUB_NAME, ENR_GRADE
    FROM ENROL E
    INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
    INNER JOIN SUBJECT SJ ON SJ.SUB_NO = E.SUB_NO
) WHERE ENR_GRADE < (
    SELECT AVG(ENR_GRADE) AS IJ_KIM_AVG
    FROM ENROL
    WHERE STU_NO = '20151062'
);

-- 5. 2�� �̻��� ������ ��� �л����� ��� ���(�����, ����)
SELECT *
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO
INNER JOIN (
    SELECT COUNT(*) AS CNT, STU_NO
    FROM ENROL
    GROUP BY STU_NO
) C ON C.STU_NO = S.STU_NO
WHERE CNT >= 2;

SELECT *
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO
WHERE S.STU_NO IN (
    SELECT STU_NO
    FROM (
        SELECT COUNT(*) AS CNT, STU_NO
        FROM ENROL
        GROUP BY STU_NO
    ) WHERE CNT >= 2
)
ORDER BY STU_NAME;

SELECT *
FROM (  -- ���������� ȸ�� ī��Ʈ �Է�
    SELECT COUNT(*) AS CNT, STU_NO
    FROM ENROL
    GROUP BY STU_NO
) WHERE CNT >= 2;   -- �÷�ȭ�� ī��Ʈ ���������� ���ǹ� ����

SELECT COUNT(*) AS CNT, STU_NO  -- �й��� ���� ��� ȸ�� ī��Ʈ, ī��Ʈ�� �÷�ȭ
FROM ENROL
GROUP BY STU_NO;



-- 6. �������ڰ��� ��� �������� ���� ��������� ���� �л����� ��� ���
-- HAVING ���
SELECT AVG(ENR_GRADE), STU_NAME
FROM ENROL E
INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
GROUP BY S.STU_NO, STU_NAME
HAVING AVG(ENR_GRADE) > (   -- �׷��Լ��� ���� ������ HAVING�� ����Ͽ� �����Ҽ� �ִ�.
    SELECT AVG(ENR_GRADE)
    FROM ENROL E
    INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
    WHERE S.STU_DEPT = '��������'
    GROUP BY S.STU_DEPT
) ON C.STU_DEPT = S.STU_DEPT;

-- Ǯ��
SELECT STU_AVG, STU_NAME
FROM (
    SELECT AVG(ENR_GRADE) AS STU_AVG, STU_NAME
    FROM ENROL E
    INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
    GROUP BY STU_NAME
)
WHERE STU_AVG > (
    SELECT AVG(ENR_GRADE)
    FROM ENROL E
    INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
    WHERE S.STU_DEPT = '��������'
    GROUP BY S.STU_DEPT
);

--SELECT AVG(ENR_GRADE), STU_NAME
--FROM ENROL E
--INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
--GROUP BY STU_NAME;
--
--SELECT AVG(ENR_GRADE)
--FROM ENROL E
--INNER JOIN STUDENT S ON S.STU_NO = E.STU_NO
--WHERE S.STU_DEPT = '��������'
--GROUP BY S.STU_DEPT;

-- EX) �а��� ��� Ű�� 165 �̻��� �а� ���
SELECT ROUND(AVG(STU_HEIGHT), 1), STU_DEPT
FROM STUDENT
GROUP BY STU_DEPT
HAVING AVG(STU_HEIGHT) >= 165;

