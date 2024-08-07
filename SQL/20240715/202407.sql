SELECT *
FROM STU;
SELECT *
FROM PROFESSOR;
SELECT *
FROM DEPARTMENT;

--1. 아이디가 7글자 이상인 학생들의 목록을 출력하시오.
SELECT *
FROM STU
WHERE LENGTH(ID) >= 7;  // LENGTH(컬럼명) = 데이터의 글자 수

-- 아이디가 7글자 학생 목록
SELECT *
FROM STU
WHERE ID LIKE '_______';


--2. 아이디에 a가 들어있는 학생들의 목록을 출력하시오. (like)
SELECT *
FROM STU
WHERE ID LIKE '%a%';


--3. 전공(DEPTNO1)이 컴퓨터공학과인 학생들의 목록을 출력하시오.
SELECT *
FROM STU S
INNER JOIN DEPARTMENT D ON S.DEPTNO1 = D.DEPTNO
WHERE D.DNAME = '컴퓨터공학과';


--4. 81년도에 입사한 교수들의 목록을 출력하시오.
SELECT *
FROM PROFESSOR
WHERE TO_CHAR(HIREDATE, 'YY') = 81;


--5. 각 학년별 학생들의 평균 키를 구하시오.
SELECT AVG(HEIGHT), GRADE
FROM STU
GROUP BY GRADE;


--6. 96학번과 97학번 중 가장 키가 큰 학생의 학번, 이름, 아이디, 키를 출력하시오.
-- (학번 : STUNO 의 첫 두글자)
SELECT *
FROM STU S1
INNER JOIN (
    SELECT MAX(HEIGHT) AS MAX_HEIGHT, SUBSTR(STUNO, 1, 2) AS STUNO 
    FROM STU
    WHERE SUBSTR(STUNO, 1, 2) IN (96, 97)
    GROUP BY SUBSTR(STUNO, 1, 2)
) S2 ON SUBSTR(S1.STUNO, 1, 2) = S2.STUNO  AND S1.HEIGHT = S2.MAX_HEIGHT;

SELECT MAX(HEIGHT), SUBSTR(STUNO, 1, 2) AS STUNO -- SUBSTR(컬럼명, 시작 인덱스 문자, 인덱스 이후의 문자수)
FROM STU
WHERE SUBSTR(STUNO, 1, 2) IN (96, 97)
GROUP BY SUBSTR(STUNO, 1, 2);



--7. 교수의 평균임금이 가장 높은 학과의 학과명, 평균 임금을 출력하시오.
SELECT *
FROM (
    SELECT DNAME, ROUND(AVG(PAY), 1) AS P_PAY_AVG
    FROM PROFESSOR P 
    INNER JOIN DEPARTMENT D ON P.DEPTNO = D.DEPTNO
    GROUP BY DNAME
    ORDER BY ROUND(AVG(PAY), 1) DESC
)
WHERE ROWNUM = 1;   -- 최상위 컬럼만 출력하는 구문 (ROWNUM = num)

SELECT  DNAME, ROUND(AVG(PAY), 1) AS P_PAY_AVG
FROM PROFESSOR P 
INNER JOIN DEPARTMENT D ON P.DEPTNO = D.DEPTNO
GROUP BY DNAME
ORDER BY ROUND(AVG(PAY), 1) DESC;


--8. '인문대학'에 소속된 교수들의 목록을 구하시오.
SELECT P.NAME, D1.DEPTNO, D2.PART, D3.DNAME
FROM PROFESSOR P
INNER JOIN DEPARTMENT D1 ON P.DEPTNO = D1.DEPTNO
INNER JOIN DEPARTMENT D2 ON D1.PART = D2.DEPTNO
INNER JOIN DEPARTMENT D3 ON D2.PART = D3.DEPTNO
WHERE D3.DNAME = '인문대학';

--9. 각 학년별 키가 가장 큰 학생의 학번, 이름, 학년, 키를 구하시오.
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


--10. 76년생 학생들의 성별(남,여) 인원수를 구하시오.
SELECT *
FROM (
    SELECT *
    FROM STU
    WHERE SUBSTR(JUMIN, 1, 2) = 76
);

-- DECODE
SELECT
    COUNT(DECODE(SUBSTR(JUMIN, 7, 1), 1, '남')) AS 남자,
    COUNT(DECODE(SUBSTR(JUMIN, 7, 1), 2, '여')) AS 여자
FROM STU
WHERE SUBSTR(JUMIN, 1, 2) = 76;

-- SUM(DECODE)
SELECT
    SUM(DECODE(SUBSTR(JUMIN, 7, 1), 1, 1, 3, 1, 0)) AS 남자,
    SUM(DECODE(SUBSTR(JUMIN, 7, 1), 2, 1, 4, 1, 0)) AS 여자
FROM STU
WHERE SUBSTR(JUMIN, 1, 2) = 76;
?