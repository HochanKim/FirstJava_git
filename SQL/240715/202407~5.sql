-- UNION : 작성한 쿼리문의 출력 내용을 합침 (중복된 값도 합친다)
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

-- UNION ALL : 쿼리문의 출력 내용을 합치지만 중복된 값을 합치지 않고 출력
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

-- 합쳐진 쿼리문에서 위에 설정한 별칭은 유지된다
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
    
    
-- EX) 평균점수 합치기
SELECT 학생이름, 평균점수
FROM (
    SELECT 
        S.STU_NAME AS 학생이름, 
        AVG(ENR_GRADE) AS 평균점수,
        1 AS ORDERKEY  -- 학생 평균점수 정렬용
    FROM STUDENT S
    INNER JOIN ENROL E ON S.STU_NO = E.STU_NO
    GROUP BY S.STU_NO, S.STU_NAME   -- 동명이인 여부가 있을수 있기 때문에 이름만 묶지 않는다
    UNION 
    SELECT
        '전체평균', -- 임의의 컬럼 생성
        ROUND(AVG(ENR_GRADE), 1),
        2 AS ORDERKEY   -- 전체평균 정렬용
    FROM ENROL
    ORDER BY ORDERKEY, 평균점수 DESC
);
