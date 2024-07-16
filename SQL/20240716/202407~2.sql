-- SEQUENCE 시퀀스
CREATE SEQUENCE SAMPLE_SEQ
    INCREMENT BY 1      -- 증가값
    START WITH 1        -- 시작값
    MINVALUE 1          -- 최소값
    MAXVALUE 9999       -- 최대값
    CYCLE;               -- MAXVALUE까지 도달 시 다시 처음부터 <-> NOCYCLE