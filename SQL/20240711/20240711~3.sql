-- COUNT()
SELECT COUNT(*) AS CNT
FROM STUDENT
WHERE STU_DEPT = '��ǻ������';

-- EX) ������ 80�� �̻� ���� ����� �� (�ߺ� ���)
SELECT COUNT(*)
FROM ENROL
WHERE ENR_GRADE >= 80;

-- EX) ������ 80�� �̻� ���� ����� �̸��� �й��� ��� (�ߺ� ���)
SELECT ENR_GRADE, S.STU_NO, STU_NAME
FROM ENROL E
INNER JOIN STUDENT S ON E.STU_NO = S.STU_NO
WHERE ENR_GRADE >= 80;