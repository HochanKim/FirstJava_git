-- UNION : �ۼ��� �������� ��� ������ ��ħ (�ߺ��� ���� ��ģ��)
SELECT 
    ENAME, JOB
FROM 
    EMP
WHERE 
    SAL >= 1500
UNION
SELECT
    ENAME, JOB
FROM 
    EMP
WHERE 
    COMM IS NOT NULL;

-- UNION ALL : �������� ��� ������ ��ġ���� �ߺ��� ���� ��ġ�� �ʰ� ���
SELECT 
    ENAME, JOB
FROM 
    EMP
WHERE 
    SAL >= 1500
UNION ALL
SELECT
    ENAME, JOB
FROM 
    EMP
WHERE 
    COMM IS NOT NULL;

-- ������ ���������� ���� ������ ��Ī�� �����ȴ�
SELECT 
    ENAME, JOB, SAL+NVL(COMM, 0) AS SAL_COMM
FROM 
    EMP
WHERE 
    SAL >= 1500
UNION ALL
SELECT
    ENAME, JOB, SAL+NVL(COMM, 0)
FROM 
    EMP
WHERE 
    COMM IS NOT NULL;
    
    
-- EX) ������� ��ġ��
SELECT �л��̸�, �������
FROM (
    SELECT 
        S.STU_NAME AS �л��̸�, 
        AVG(ENR_GRADE) AS �������,
        1 AS ORDERKEY  -- �л� ������� ���Ŀ�
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY S.STU_NO, S.STU_NAME   -- �������� ���ΰ� ������ �ֱ� ������ �̸��� ���� �ʴ´�
    UNION 
    SELECT
        '��ü���', -- ������ �÷� ����
        ROUND(AVG(ENR_GRADE), 1),
        2 AS ORDERKEY   -- ��ü��� ���Ŀ�
    FROM ENROL
    ORDER BY ORDERKEY, ������� DESC
);
