-- NVL
SELECT EMPNO, ENAME, SAL, NVL(COMM, 0) AS COMM  -- NVL(�÷���, 0) => NULL���� 0���� �ٲ㼭 ���
FROM EMP;

-- NVL2
SELECT EMPNO, ENAME, SAL, NVL2(COMM, 0, 1), COMM  -- NVL2(�÷���, 0, 1) => NULL���� 1�� ��ȯ, NOT NULL���� 0���� ��ȯ
FROM EMP;

-- DECODE (if���� �����)
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '����') AS JOB  -- DECODE(�÷���, �ش� �÷���, ��ü�� ��)
FROM EMP;

-- DECODE (if-else���� ���)
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '����', '���') AS JOB    -- DECODE(�÷���, �ش� �÷���, ��ü�� ��, �ش���� ���� ���� ���� ��ü�� ��)
FROM EMP;

-- if-else, if-else
SELECT EMPNO, ENAME, DECODE(JOB, 'PRESIDENT', '����', 'MANAGER', '������', '���') AS JOB    
FROM EMP;

-- CASE - WHEN
SELECT EMPNO, ENAME,
    CASE JOB WHEN 'PRESIDENT' THEN '����'
             WHEN 'MANAGER' THEN '������'
             ELSE '���'
    END AS JOB
FROM EMP;

SELECT EMPNO, ENAME, SAL,
    CASE WHEN SAL > 3000 THEN '���̹޳�'       -- CASE-WHEN���� �����ڵ� ��� ����
         WHEN SAL > 2000 THEN '�������޳�'
         ELSE 'ȭ����'
    END AS ����
FROM EMP;

-- SYSDATE (�ð�ǥ��, ����Ŭ ����)
SELECT 
    SYSDATE,
    TO_CHAR(SYSDATE, 'YYMMDD') AS CASE1,
    TO_CHAR(SYSDATE, 'YYYYMMDD') AS CASE2,
    TO_CHAR(SYSDATE, 'YYYY-MM-DD') AS CASE3,
    TO_CHAR(SYSDATE, 'YYYY-MM-DD-HH:MI:SS') AS CASE4,
    TO_CHAR(SYSDATE, 'YYYY-MM-DD-HH24:MI:SS') AS CASE5
FROM DUAL;


