SELECT *
FROM EMP;
SELECT *
FROM DEPT;
SELECT *
FROM SALGRADE;

-- EX) JOB�� MANAGER�� ������� ��� �޿�
SELECT AVG(SAL)
FROM EMP
WHERE JOB = 'MANAGER';

-- EX) ���, �̸�, ����� �̸��� ��� (���� JOIN)
SELECT E.EMPNO, E.ENAME, E2.ENAME   -- SELF JOIN�� ���̺��� ����̸� ���
FROM EMP E 
INNER JOIN EMP E2 ON E.MGR = E2.EMPNO;  -- SELF JOIN ������� ���� ���̺� �� �÷��� JOIN

-- EX) ���, �̸�, ���������� �� ���
SELECT COUNT(MGR) AS CNT, MGR
FROM EMP
GROUP BY MGR;

SELECT E.ENAME, E.EMPNO, E2.CNT
FROM EMP E
INNER JOIN (
    SELECT COUNT(MGR) AS CNT, MGR
    FROM EMP
    GROUP BY MGR
) E2 ON E2.MGR = E.EMPNO;






