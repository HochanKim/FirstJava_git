DECLARE
    I NUMBER;
BEGIN
    FOR I IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(I);
    END LOOP;
END;
/

-- EX) 1���� 10���� Ȧ���� ����ϱ�
DECLARE
    I NUMBER;
BEGIN
    FOR I IN REVERSE 1..10 LOOP
        IF I MOD 2 = 1 THEN     -- IF�� ����������(MOD) �ֱ�
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

���θ�					
					
�� ���̺� (TBL_USER)			=> �ʿ��� �÷� ����		
��ǰ ���̺� (TBL_PRODECT)			=> �ʿ��� �÷� ����		
					
�Ļ��Ǵ� ���̺���� ��͵��� �ִ���???					=> ���̺� �� �ۼ�

*/