SELECT *
FROM STU;
SELECT *
FROM PROFESSOR;
SELECT *
FROM DEPARTMENT;

--1. ���̵� 7���� �̻��� �л����� ����� ����Ͻÿ�.
SELECT *
FROM STU
WHERE LENGTH(ID) >= 7;  // LENGTH(�÷���) = �������� ���� ��

-- ���̵� 7���� �л� ���
SELECT *
FROM STU
WHERE ID LIKE '_______';


--2. ���̵� a�� ����ִ� �л����� ����� ����Ͻÿ�. (like)
SELECT *
FROM STU
WHERE ID LIKE '%a%';


--3. ����(DEPTNO1)�� ��ǻ�Ͱ��а��� �л����� ����� ����Ͻÿ�.
SELECT *
FROM STU S
INNER JOIN DEPARTMENT D ON S.DEPTNO1 = D.DEPTNO
WHERE D.DNAME = '��ǻ�Ͱ��а�';


--4. 81�⵵�� �Ի��� �������� ����� ����Ͻÿ�.
SELECT *
FROM PROFESSOR
WHERE TO_CHAR(HIREDATE, 'YY') = 81;


--5. �� �г⺰ �л����� ��� Ű�� ���Ͻÿ�.
SELECT AVG(HEIGHT), GRADE
FROM STU
GROUP BY GRADE;


--6. 96�й��� 97�й� �� ���� Ű�� ū �л��� �й�, �̸�, ���̵�, Ű�� ����Ͻÿ�.
-- (�й� : STUNO �� ù �α���)
SELECT *
FROM STU S1
INNER JOIN (
    SELECT MAX(HEIGHT) AS MAX_HEIGHT, SUBSTR(STUNO, 1, 2) AS STUNO 
    FROM STU
    WHERE SUBSTR(STUNO, 1, 2) IN (96, 97)
    GROUP BY SUBSTR(STUNO, 1, 2)
) S2 ON SUBSTR(S1.STUNO, 1, 2) = S2.STUNO  AND S1.HEIGHT = S2.MAX_HEIGHT;

SELECT MAX(HEIGHT), SUBSTR(STUNO, 1, 2) AS STUNO -- SUBSTR(�÷���, ���� �ε��� ����, �ε��� ������ ���ڼ�)
FROM STU
WHERE SUBSTR(STUNO, 1, 2) IN (96, 97)
GROUP BY SUBSTR(STUNO, 1, 2);



--7. ������ ����ӱ��� ���� ���� �а��� �а���, ��� �ӱ��� ����Ͻÿ�.
SELECT *
FROM (
    SELECT DNAME, ROUND(AVG(PAY), 1) AS P_PAY_AVG
    FROM PROFESSOR P 
    INNER JOIN DEPARTMENT D ON P.DEPTNO = D.DEPTNO
    GROUP BY DNAME
    ORDER BY ROUND(AVG(PAY), 1) DESC
)
WHERE ROWNUM = 1;   -- �ֻ��� �÷��� ����ϴ� ���� (ROWNUM = num)

SELECT  DNAME, ROUND(AVG(PAY), 1) AS P_PAY_AVG
FROM PROFESSOR P 
INNER JOIN DEPARTMENT D ON P.DEPTNO = D.DEPTNO
GROUP BY DNAME
ORDER BY ROUND(AVG(PAY), 1) DESC;


--8. '�ι�����'�� �Ҽӵ� �������� ����� ���Ͻÿ�.
SELECT P.NAME, D1.DEPTNO, D2.PART, D3.DNAME
FROM PROFESSOR P
INNER JOIN DEPARTMENT D1 ON P.DEPTNO = D1.DEPTNO
INNER JOIN DEPARTMENT D2 ON D1.PART = D2.DEPTNO
INNER JOIN DEPARTMENT D3 ON D2.PART = D3.DEPTNO
WHERE D3.DNAME = '�ι�����';

--9. �� �г⺰ Ű�� ���� ū �л��� �й�, �̸�, �г�, Ű�� ���Ͻÿ�.
SELECT STUNO, NAME, GRADE, HEIGHT
FROM STU
WHERE (HEIGHT, GRADE) IN (
    SELECT MAX(HEIGHT) AS MAX_HEIGHT, GRADE
    FROM STU
    GROUP BY GRADE
);

SELECT MAX(HEIGHT), GRADE 
FROM STU
GROUP BY GRADE;


--10. 76��� �л����� ����(��,��) �ο����� ���Ͻÿ�.
SELECT *
FROM (
    SELECT *
    FROM STU
    WHERE SUBSTR(JUMIN, 1, 2) = 76
);

-- DECODE
SELECT
    COUNT(DECODE(SUBSTR(JUMIN, 7, 1), 1, '��')) AS ����,
    COUNT(DECODE(SUBSTR(JUMIN, 7, 1), 2, '��')) AS ����
FROM STU
WHERE SUBSTR(JUMIN, 1, 2) = 76;

-- SUM(DECODE)
SELECT
    SUM(DECODE(SUBSTR(JUMIN, 7, 1), 1, 1, 3, 1, 0)) AS ����,
    SUM(DECODE(SUBSTR(JUMIN, 7, 1), 2, 1, 4, 1, 0)) AS ����
FROM STU
WHERE SUBSTR(JUMIN, 1, 2) = 76;
?