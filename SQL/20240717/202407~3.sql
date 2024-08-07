-- 1. EMP 테이블 트리거
-- 2. EMP_LOG 테이블 생성
-- -> L_EMPNO, L_MGR, L_SAL, L_COMM, L_ID, EVENT
-- 3. INSERT, UPDATE, DELETE 이벤트 처리
-- EMP_LOG.EVENT 컬럼에 INSERT => 'I'. UPDATE -> 'U', DELETE -> 'D'

/* EMP_LOG 테이블 생성 */
CREATE TABLE EMP_LOG (
    L_EMPNO NUMBER,
    L_MGR NUMBER,
    L_SAL NUMBER,
    L_COMM NUMBER,
    L_ID VARCHAR2(10),
    EVENT CHAR(1)
);
SELECT * FROM EMP_LOG;

/* EMP 테이블 트리거 생성*/
CREATE OR REPLACE TRIGGER EMP_TRIGGER1
    AFTER
    INSERT OR UPDATE OR DELETE ON EMP
    FOR EACH ROW
BEGIN
    IF INSERTING THEN
        INSERT INTO EMP_LOG
        VALUES (:NEW.EMPNO, :NEW.MGR, :NEW.SAL, :NEW.COMM, SYS_CONTEXT('USERENV', 'SESSION_USER'), 'I');
    ELSIF UPDATING THEN
        INSERT INTO EMP_LOG
        VALUES (:NEW.EMPNO, :NEW.MGR, :NEW.SAL, :NEW.COMM, SYS_CONTEXT('USERENV', 'SESSION_USER'), 'U');
    ELSIF DELETING THEN
        INSERT INTO EMP_LOG
        VALUES (:NEW.EMPNO, :NEW.MGR, :NEW.SAL, :NEW.COMM, SYS_CONTEXT('USERENV', 'SESSION_USER'), 'D');
    END IF;
END;
/
UPDATE EMP
SET
    SAL = 1000
WHERE EMPNO = 7369;

