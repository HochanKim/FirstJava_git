-- ���� �Լ� (����)

SELECT 
    ROUND(123.456, 2),  -- 2��° �ڸ� �������� �ݿø�
    ROUND(123.333, 2)
FROM DUAL;

SELECT 
    CEIL(123.456),      -- ���� ���� �ø�
    CEIL(123.333)
FROM DUAL;

SELECT 
    TRUNC(123.456, 2),  -- 2��° �ڸ� �������� ���� �߶󳻱�(����)
    TRUNC(123.333, 2)
FROM DUAL;

SELECT 
    FLOOR(123.456),     -- ���� ���� ����
    FLOOR(123.333)
FROM DUAL;

SELECT 
    SQRT(16)            -- ������
FROM DUAL;

SELECT 
    POWER(2, 3)         -- ���� / POWER(������, �¼�)
FROM DUAL;

SELECT
    ABS(-123)           -- ���밪
FROM DUAL;

SELECT
    SIGN(-123),         -- �����϶� -1, ����϶� 1, 0�϶� 0���� ����
    SIGN(456),
    SIGN(0)
FROM DUAL;

SELECT                  -- ������ ����
    MOD(10, 3)
FROM DUAL;