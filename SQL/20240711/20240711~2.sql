-- 1. STUDENT ���̺��� ���� �̸鼭 Ű�� 170 �̻��� �л� ��ȸ
SELECT *
FROM STUDENT
WHERE STU_DEPT = '���' AND STU_HEIGHT > 170;

-- 2. STUDENT ���̺��� Ű�� 165~175 ������ �л� ���ϱ�(BETWEEN ����ϱ�)
SELECT *
FROM STUDENT
WHERE STU_HEIGHT BETWEEN 165 AND 175;

-- 3. ��ǻ�������� �л��� ���� Ű ū �л����� ū Ű�� ���� �л��� ���ϱ�
SELECT MAX(STU_HEIGHT)
FROM STUDENT
WHERE STU_DEPT = '��ǻ������';

SELECT *
FROM STUDENT
WHERE STU_HEIGHT > ( -- ��������
    SELECT MAX(STU_HEIGHT)
    FROM STUDENT
    WHERE STU_DEPT = '��ǻ������'       
);

-- 4. �а��� ���� Ű�� ū ��(�а���, Ű ���)
SELECT MAX(STU_HEIGHT), STU_DEPT
FROM STUDENT
GROUP BY STU_DEPT;

-- 5. ��ǻ�Ͱ��� ������ ��� �л��� �й�, �̸� ���
SELECT *
FROM STUDENT;
SELECT *
FROM ENROL;

SELECT SJ.SUB_NAME, S.STU_NO, S.STU_NAME
FROM ENROL E
INNER JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO
INNER JOIN STUDENT S ON E.STU_NO = S.STU_NO
WHERE SJ.SUB_NAME = '��ǻ�Ͱ���';

-- 6. ���Ѻ��� ��� �������� ���� ��� ������ ���� �л����� �̸�, �����, ���� ���
SELECT * 
FROM (  -- �л� ��� �������� IN
    SELECT AVG(ENR_GRADE) AS ENR_AVG, STU_NAME
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY S.STU_NO, STU_NAME
) WHERE ENR_AVG > (    -- ���Ѻ� ��� �������� IN
    SELECT AVG(ENR_GRADE)
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    WHERE STU_NAME = '���Ѻ�'
    GROUP BY S.STU_NO
);

--SELECT *
--FROM (
--    SELECT AVG(ENR_GRADE) AS OTHER_AVG, STU_NAME
--    FROM (
--        SELECT  S.STU_NAME, SJ.SUB_NAME, ENR_GRADE
--        FROM ENROL E
--        INNER JOIN STUDENT S ON E.STU_NO = S.STU_NO
--        INNER JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO
--    )
--    GROUP BY STU_NAME
--) WHERE OTHER_AVG > (
--    SELECT AVG(ENR_GRADE)
--    FROM (
--        SELECT S.STU_NO, S.STU_NAME, E.ENR_GRADE
--        FROM STUDENT S
--        INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
--        WHERE STU_NAME = '���Ѻ�'
--    )
--    GROUP BY STU_NAME
--);


