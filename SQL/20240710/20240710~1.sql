-- �˻�(SELECT), ���� �Լ�(����)
SELECT NAME AS �̸�
FROM T_EMP;

SELECT UPPER('hello oracle') as TEST -- �빮�ڷ� ��ȯ
FROM DUAL;

SELECT UPPER(STU_CLASS), STU_NAME FROM STUDENT; -- �÷��� ����

SELECT LOWER('hello oracle') as TEST
FROM DUAL;  -- �ҹ��ڷ� ��ȯ

SELECT INITCAP('hello oracle') as TEST
FROM DUAL;  -- ù ���ڸ� �빮�ڷ� ��ȯ

SELECT CONCAT(NAME, EMP_TYPE)   -- �÷� �̾���̱�
FROM T_EMP;

SELECT NAME ||'�� ������´� '||EMP_TYPE||' �Դϴ�.'  -- ���ڸ� ������ �÷� �̾� ���̱�
FROM T_EMP;

SELECT EMPNO, SUBSTR(EMPNO, 4) AS SUBSTR, SUBSTR(EMPNO, 3, 4) AS SUBSTR     -- SUBSTR(�÷���, ���� ��������, ���ڼ�)
FROM T_EMP;

-- EX) 1996�⵵�� �Ի��� ������� ������ ����Ͻÿ�
SELECT *
FROM T_EMP
WHERE SUBSTR(EMPNO, 1, 4) = 1996;   -- �÷��� 'EMPNO'���� 1��°���� 4��° �ڸ���

SELECT NAME, LENGTH(PAY)        -- �ش� �÷��� ���� ����
FROM T_EMP;

SELECT TEL, INSTR(TEL, '-')     -- ���õ� ������ ��ġ ã��
FROM T_EMP;

SELECT LPAD(DEPTNO, 10, '*')    -- ������� ���ڷ� ä��� (���� : LPAD(�÷���, ũ�Ⱚ, ����))
FROM T_EMP;

SELECT RPAD(DEPTNO, 10, '*')    -- ������� ���ڷ� ä��� (������ : RPAD(�÷���, ũ�Ⱚ, ����))
FROM T_EMP;

SELECT TRIM(' HELLO ORACLE      ')  -- ����� ����
FROM DUAL;

SELECT REPLACE(TEL, '-', ' ')       -- Ư�� ���� ��ü(�ٲٱ�)
FROM T_EMP;
