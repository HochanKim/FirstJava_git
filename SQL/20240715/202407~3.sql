-- JOIN
-- INNER JOIN : 같은 값을 갖고있는 테이블끼리 합쳐짐
SELECT TITLE, C.*
FROM TBL_BOARD B
INNER JOIN TBL_COMMENT C ON B.BOARDNO = C.BOARDNO
WHERE B.BOARDNO = 2;

-- OUTER (생략가능) JOIN
-- LEFT (OUTER) JOIN : 같지 않은 값이라도 테이블끼리 합침이 가능 (NULL값들과 합쳐짐)
SELECT TITLE, C.*
FROM TBL_BOARD B
LEFT JOIN TBL_COMMENT C ON B.BOARDNO = C.BOARDNO
WHERE B.BOARDNO = 10;