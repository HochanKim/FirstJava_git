-- WHERE -> LIKE
SELECT * 
FROM STU
WHERE ID LIKE 'a%';     -- �տ� 'a'�� ���Ե� ��� ���̵� ���

SELECT * 
FROM STU
WHERE ID LIKE '%e';     -- �ڿ� 'e'�� ���Ե� ��� ���̵� ���

SELECT * 
FROM STU
WHERE ID LIKE '%a%';        -- 'a'�� ���Ե� ��� ���̵� ���

SELECT * 
FROM STU
WHERE ID LIKE '_____';       -- '_' => ���ڼ� (��Ư�� ���ڸ� �˻�)

SELECT * 
FROM STU
WHERE ID LIKE '____o';      -- '_'�� ������ �� �¾ƾ� �˻��� ���� ('%'�� ����)

SELECT * 
FROM STU
WHERE UPPER(ID) LIKE '%B%';        -- �˻��� ��ҹ��ڸ� ������

SELECT * 
FROM STU
WHERE ID LIKE '%\_%' ESCAPE '\';   -- �̽������� ���� '\' 

-- EX)
SELECT * FROM DEPARTMENT
WHERE DNAME LIKE '%��ǻ��%';