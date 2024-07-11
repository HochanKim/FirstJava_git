-- 1. STUDENT 테이블에서 기계과 이면서 키가 170 이상인 학생 조회
SELECT *
FROM STUDENT
WHERE STU_DEPT = '기계' AND STU_HEIGHT > 170;

-- 2. STUDENT 테이블에서 키가 165~175 사이인 학생 구하기(BETWEEN 사용하기)
SELECT *
FROM STUDENT
WHERE STU_HEIGHT BETWEEN 165 AND 175;

-- 3. 컴퓨터정보과 학생중 가장 키 큰 학생보다 큰 키를 가진 학생들 구하기
SELECT MAX(STU_HEIGHT)
FROM STUDENT
WHERE STU_DEPT = '컴퓨터정보';

SELECT *
FROM STUDENT
WHERE STU_HEIGHT > ( -- 서브쿼리
    SELECT MAX(STU_HEIGHT)
    FROM STUDENT
    WHERE STU_DEPT = '컴퓨터정보'       
);

-- 4. 학과별 가장 키가 큰 값(학과명, 키 출력)
SELECT MAX(STU_HEIGHT), STU_DEPT
FROM STUDENT
GROUP BY STU_DEPT;

-- 5. 컴퓨터개론 수업을 듣는 학생의 학번, 이름 출력
SELECT *
FROM STUDENT;
SELECT *
FROM ENROL;

SELECT SJ.SUB_NAME, S.STU_NO, S.STU_NAME
FROM ENROL E
INNER JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO
INNER JOIN STUDENT S ON E.STU_NO = S.STU_NO
WHERE SJ.SUB_NAME = '컴퓨터개론';

-- 6. 옥한빛의 평균 점수보다 높은 평균 점수를 받은 학생들의 이름, 과목명, 점수 출력
SELECT * 
FROM (  -- 학생 평균 서브쿼리 IN
    SELECT AVG(ENR_GRADE) AS ENR_AVG, STU_NAME
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY S.STU_NO, STU_NAME
) WHERE ENR_AVG > (    -- 옥한빛 평균 서브쿼리 IN
    SELECT AVG(ENR_GRADE)
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    WHERE STU_NAME = '옥한빛'
    GROUP BY S.STU_NO
);

--SELECT *
--FROM (
--    SELECT AVG(ENR_GRADE) AS OTHER_AVG, STU_NAME
--    FROM (
--        SELECT  S.STU_NAME, SJ.SUB_NAME, ENR_GRADE
--        FROM ENROL E
--        INNER JOIN STUDENT S ON E.STU_NO = S.STU_NO
--        INNER JOIN SUBJECT SJ ON E.SUB_NO = SJ.SUB_NO
--    )
--    GROUP BY STU_NAME
--) WHERE OTHER_AVG > (
--    SELECT AVG(ENR_GRADE)
--    FROM (
--        SELECT S.STU_NO, S.STU_NAME, E.ENR_GRADE
--        FROM STUDENT S
--        INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
--        WHERE STU_NAME = '옥한빛'
--    )
--    GROUP BY STU_NAME
--);


