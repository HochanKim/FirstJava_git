SELECT *
FROM T_EMP;

-- DELETE, INSERT, UPDATE
-- 해당 키워드 먼저 입력하고 쿼리 작성

-- UPDATE
UPDATE T_EMP
SET
    HOBBY = '코딩',
    PAY = PAY * 1.1
WHERE EMPNO = '19960212';

UPDATE T_EMP
SET
    PAY = PAY * 1.2
WHERE EMP_TYPE IN ('수습직');

COMMIT;

-- EX) STUDENT 테이블에서 키(STU_HEIGHT)가 NULL인 사람들의 값을 170으로 변경
SELECT *
FROM STUDENT;

UPDATE STUDENT
SET
    STU_HEIGHT = 170
WHERE STU_HEIGHT IS NULL;

COMMIT;

-- INSERT
INSERT INTO STUDENT  -- INSERT INTO 테이블명
VALUES (20241234, '홍길동', '컴퓨터정보', 1, 'A', 'M', 170, 60);

INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT)
VALUES (20249876, '김철수', '기계');

ROLLBACK;
COMMIT;

-- EX) EMP 테이블에 모든 값을 채워서 INSERT
SELECT *
FROM T_EMP;

INSERT INTO T_EMP
VALUES ('20241234', '홍길동', '93/09/21', 1006, '인턴직', '032)123-4567', '코딩', 24000000, '신입', 20240711);

-- DELETE
DELETE FROM T_EMP;
ROLLBACK;

DELETE FROM T_EMP
WHERE EMPNO = '20241234';

-- EX) STUDENT 테이블에서 '홍길동', '김철수' 데이터 삭제
SELECT *
FROM STUDENT;

DELETE FROM STUDENT
WHERE STU_NO = '20241234';

DELETE FROM STUDENT
WHERE STU_NO = '20249876';

COMMIT;