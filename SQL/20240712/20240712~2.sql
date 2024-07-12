SELECT * FROM EMP;
SELECT * FROM DEPT;
SELECT * FROM SALGRADE;

-- 1. 2000�̻� �޿��� �޴� ����� ���� ���Ͻÿ�
SELECT COUNT(*)
FROM EMP
WHERE SAL >= 2000;

-- 2. �����ȣ, �̸�, �޿��� ����Ͻÿ�. ��, �޿��� ����� ��, 
--    Ŀ�̼��� �޴� ����� Ŀ�̼ǰ� ���ؼ� ����� ��.
SELECT EMPNO, ENAME, SAL+NVL(COMM, 0) AS SAL
FROM EMP;

-- 3. WARD���� ���� �޿�(SAL)�� �޴� ������� ����Ͻÿ�.
SELECT ENAME, SAL
FROM EMP
WHERE ENAME = 'WARD';

SELECT ENAME, SAL
FROM EMP
WHERE (
    SELECT SAL
    FROM EMP
    WHERE ENAME = 'WARD'
) < SAL
ORDER BY SAL DESC;

-- 4. �޿������ 3��� �̻��� ������� ���� ����Ͻÿ�.
SELECT COUNT(*)
FROM EMP E
INNER JOIN SALGRADE S ON E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE GRADE >= 3;

--SELECT ENAME, GRADE
--FROM EMP E
--INNER JOIN SALGRADE S ON E.SAL BETWEEN S.LOSAL AND S.HISAL
--WHERE GRADE >= 3;

-- 5. 81�⵵�� �Ի��� ������� ��� ����Ͻÿ�.
SELECT *
FROM EMP
WHERE TO_CHAR(HIREDATE, 'YY') = 81;
    
-- 6. �� ���޺� ���� ���� �޿��� �޴� ����� ����Ͻÿ�.
SELECT ENAME, E.JOB, SAL
FROM EMP E
INNER JOIN (
    SELECT MAX(SAL) AS MAX_SAL, JOB
    FROM EMP
    GROUP BY JOB
) P ON E.SAL = MAX_SAL AND E.JOB = P.JOB;   -- JOIN�� ��ġ�� ������ ����

SELECT MAX(SAL), JOB
FROM EMP
GROUP BY JOB;

-- 7. SALESMAN ���޺��� ��ձ޿��� ���� �μ����� �μ���, ��յ���� ����Ͻÿ�.
SELECT AVG(SAL), JOB
FROM EMP group by JOB
HAVING JOB = 'SALESMAN';    -- SALESMAN �μ��� ��ձ޿�

SELECT AVG(SAL), JOB
FROM EMP
GROUP BY JOB
HAVING AVG(SAL) > (
    SELECT AVG(SAL)
    FROM EMP group by JOB
    HAVING JOB = 'SALESMAN'
); -- SALESMAN �μ����� ��ձ޿��� ���� �μ����� �μ���, ��ձ޿�

SELECT AVG(GRADE)
FROM EMP E
INNER JOIN SALGRADE S ON E.SAL BETWEEN S.LOSAL AND S.HISAL
WHERE E.JOB = 'SALESMAN';   -- SALESMAN �μ��� ��յ��

SELECT ROUND(AVG(GRADE), 1), JOB
FROM EMP E
INNER JOIN SALGRADE S ON E.SAL BETWEEN S.LOSAL AND S.HISAL
INNER JOIN DEPT D ON E.DEPTNO = D.DEPTNO
GROUP BY JOB
HAVING AVG(SAL) > (
    SELECT AVG(SAL)
    FROM EMP group by JOB
    HAVING JOB = 'SALESMAN'
); -- SALESMAN �μ����� ��ձ޿��� ���� �μ����� �μ���, ��յ��
