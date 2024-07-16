DECLARE
    I NUMBER;
BEGIN
    FOR I IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(I);
    END LOOP;
END;
/

-- EX) 1부터 10까지 홀수만 출력하기
DECLARE
    I NUMBER;
BEGIN
    FOR I IN REVERSE 1..10 LOOP
        IF I MOD 2 = 1 THEN     -- IF에 나머지연산(MOD) 넣기
            DBMS_OUTPUT.PUT_LINE(I);
        END IF;
    END LOOP;
END;
/

/*-------------------------------*/
DECLARE
    I NUMBER := 1;
BEGIN
    WHILE I <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE(I);
        I := I+1;
    END LOOP;
END;
/

/*

쇼핑몰					
					
고객 테이블 (TBL_USER)			=> 필요한 컬럼 정의		
제품 테이블 (TBL_PRODECT)			=> 필요한 컬럼 정의		
					
파생되는 테이블들이 어떤것들이 있는지???					=> 테이블 명만 작성

*/