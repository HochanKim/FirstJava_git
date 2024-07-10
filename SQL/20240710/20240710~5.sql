-- 서브 쿼리
SELECT *
FROM T_EMP
WHERE PAY = (SELECT MAX(PAY) FROM T_EMP);   -- 쿼리의 괄호 안에 조건의 쿼리문을 넣어서 표현
-- 조건은 1개만 매핑을 해준다. 초과할 경우 에러 (IN()을 사용하면 매핑 가능)

SELECT *
FROM T_EMP
WHERE DEPTNO IN (1001, 1002);   -- OR 개념과 비슷, IN()에 포함된 자료를 불러오기

-- EX) STUDENT 테이블에서 학생들의 전체 평균 키보다 큰 키를 가진 학생들의 목록을 출력하기
SELECT *
FROM STUDENT
WHERE STU_HEIGHT > 
(SELECT AVG(STU_HEIGHT) FROM STUDENT)   -- 서브 쿼리 넣기
AND STU_GRADE = 1;

-- EX) STUDENT 테이블에서 학생들의 전체 평균 몸무게보다 작은 학생들 출력
SELECT AVG(STU_WEIGHT) FROM STUDENT;
SELECT *
FROM STUDENT
WHERE STU_WEIGHT < (SELECT AVG(STU_WEIGHT) FROM STUDENT);
