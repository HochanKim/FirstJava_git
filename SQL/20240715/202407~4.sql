-- STU ���̺��� �й�, �̸�, �г�, �ڽź��� ���� �г��� ��� ��
SELECT S1.STUNO, S1.NAME, S1.GRADE, COUNT(S2.GRADE) --> COUNT(������ ���� �г��� ���� ���̺�)
FROM STU S1
LEFT JOIN STU S2 ON S1.GRADE < S2.GRADE --> ���ǿ� ���� �ʴ� ���� ������ ī��Ʈ (NULL������ JOIN)
--> JOIN�� ���ǿ� �´� ���� ã�°Ŵ� (������ '='���� ã�°Ŵ� �ƴ�)
GROUP BY S1.STUNO, S1.NAME, S1.GRADE;

-- STUDENT, ENROL, SUBJECT
-- 1. �л� �̸�, �а�, �����, ���� ���
SELECT S.STU_NAME, S.STU_DEPT, SJ.SUB_NAME, E.ENR_GRADE
FROM STUDENT S
INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
INNER JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO;

-- 2. ������ �Ⱥ� �л����� ������ 0������ ���
SELECT S.STU_NAME, S.STU_DEPT, NVL(SJ.SUB_DEPT, '���� ������') AS TEST_SUB, NVL(ENR_GRADE, 0) AS GRADE
FROM STUDENT S
LEFT JOIN ENROL E ON S.STU_NO = E.STU_NO
LEFT JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO;