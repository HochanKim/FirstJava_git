-- ���� ����
SELECT *
FROM T_EMP
WHERE PAY = (SELECT MAX(PAY) FROM T_EMP);   -- ������ ��ȣ �ȿ� ������ �������� �־ ǥ��
-- ������ 1���� ������ ���ش�. �ʰ��� ��� ���� (IN()�� ����ϸ� ���� ����)

SELECT *
FROM T_EMP
WHERE DEPTNO IN (1001, 1002);   -- OR ����� ���, IN()�� ���Ե� �ڷḦ �ҷ�����

-- EX) STUDENT ���̺��� �л����� ��ü ��� Ű���� ū Ű�� ���� �л����� ����� ����ϱ�
SELECT *
FROM STUDENT
WHERE STU_HEIGHT > 
(SELECT AVG(STU_HEIGHT) FROM STUDENT)   -- ���� ���� �ֱ�
AND STU_GRADE = 1;

-- EX) STUDENT ���̺��� �л����� ��ü ��� �����Ժ��� ���� �л��� ���
SELECT AVG(STU_WEIGHT) FROM STUDENT;
SELECT *
FROM STUDENT
WHERE STU_WEIGHT < (SELECT AVG(STU_WEIGHT) FROM STUDENT);
