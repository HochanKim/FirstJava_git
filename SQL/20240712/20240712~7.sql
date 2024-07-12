-- WHERE -> LIKE
SELECT * 
FROM STU
WHERE ID LIKE 'a%';     -- 앞에 'a'가 포함된 모든 아이디 출력

SELECT * 
FROM STU
WHERE ID LIKE '%e';     -- 뒤에 'e'가 포함된 모든 아이디 출력

SELECT * 
FROM STU
WHERE ID LIKE '%a%';        -- 'a'가 포함된 모든 아이디 출력

SELECT * 
FROM STU
WHERE ID LIKE '_____';       -- '_' => 글자수 (불특정 글자를 검색)

SELECT * 
FROM STU
WHERE ID LIKE '____o';      -- '_'의 개수에 꼭 맞아야 검색이 가능 ('%'와 차이)

SELECT * 
FROM STU
WHERE UPPER(ID) LIKE '%B%';        -- 검색시 대소문자를 구분함

SELECT * 
FROM STU
WHERE ID LIKE '%\_%' ESCAPE '\';   -- 이스케이프 문자 '\' 

-- EX)
SELECT * FROM DEPARTMENT
WHERE DNAME LIKE '%컴퓨터%';