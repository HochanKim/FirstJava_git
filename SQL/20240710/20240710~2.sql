SELECT *
FROM T_EMP;

-- EX) ��� �̸��� *ǥ��
-- 1)
SELECT NAME, REPLACE(NAME, SUBSTR(NAME, 2, 3), '**')
FROM T_EMP;

-- 2)
SELECT NAME, RPAD(SUBSTR(NAME, 1, 1), 4, '*')   -- �ѱ��� �� ���ڴ� 2byte
FROM T_EMP;

-- EX) ������ȣ�� '*'ǥ�÷� �ٲٱ�
SELECT LPAD(SUBSTR(TEL, INSTR(TEL, ')')), LENGTH(TEL), '*') AS ��ȣ,
    SUBSTR(TEL, INSTR(TEL, ')'))    -- ��ȣ ������ ������ ����
FROM T_EMP;

SELECT TEL,
    SUBSTR (TEL, 3),    -- SUBSTR(�÷���, ���� ��������, ���ڼ�) / ������ ���ڼ� ������ �ڷ� �߶󳻱�
    INSTR (TEL, ')'),   -- INSTR (�÷���, Ư�� ����)           / ���õ� ������ ��ġ�� ��ȣ
    LENGTH(TEL),        -- LENGTH(�÷���)                     / �ش� �÷��� ��ü ũ��
    SUBSTR (TEL, INSTR(TEL, ')'))
FROM T_EMP;

-- EX) '-' ������ ��ȣ�� '*'�� �ٲٱ�
SELECT TEL,
    LENGTH(TEL),                        -- �÷��� 'TEL'�� ���� ��
    INSTR (TEL, '-'),                   -- '-'�� ��ġ ��ȣ
    SUBSTR(TEL, 1, INSTR (TEL, '-')),   -- �÷��� 'TEL'���� 1��°���� '-' ��ġ���� �߶󳻱�
    SUBSTR(TEL, INSTR(TEL, '-')),       -- '-' ��ġ���� ������ �߶󳻱�
    RPAD(SUBSTR(TEL, 1, INSTR (TEL, '-')), LENGTH(TEL), '*')
FROM T_EMP;