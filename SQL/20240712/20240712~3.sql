SELECT * FROM EMP
WHERE EMPNO = '7369';

-- SELF JOIN
SELECT E1.ENAME, E2.ENAME
FROM EMP E1                                 -- ������ ���̺�
INNER JOIN EMP E2 ON E1.MGR = E2.EMPNO      -- SELF JOIN
WHERE E1.EMPNO = '7369';

-- EX) ���, �̸�, ����, ����� �̸� ���
SELECT E1.EMPNO AS ���, E1.ENAME AS ���, E1.JOB AS ����, E2.ENAME AS �����
FROM EMP E1
INNER JOIN EMP E2 ON E1.MGR = E2.EMPNO;