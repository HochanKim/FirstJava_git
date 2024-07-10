-- 테이블 삭제
-- DROP TABLE STUDENT;
-- COMMIT;

CREATE TABLE student (
  stu_no char(8)PRIMARY KEY,
  stu_name varchar(12),
  stu_dept varchar(20),
  stu_grade NUMBER ,
  stu_class char(1) ,
  stu_gender char(1) ,
  stu_height NUMBER ,
  stu_weight NUMBER
 
);

CREATE TABLE subject (
  sub_no char(3) PRIMARY KEY,
  sub_name varchar(30) ,
  sub_prof varchar(12) ,
  sub_grade NUMBER ,
  sub_dept varchar(20) 
) ;

CREATE TABLE enrol (
  sub_no char(3) REFERENCES subject(sub_no),
  stu_no char(8) REFERENCES student(stu_no),
  enr_grade NUMBER 
);
INSERT INTO STUDENT VALUES(20153075,'옥한빛','기계',1,'C','M',177,80);
INSERT INTO STUDENT VALUES(20153088,'이태연','기계',1,'C','F',162,50);
INSERT INTO STUDENT VALUES(20143054,'유가인','기계',2,'C','F',154,47);
INSERT INTO STUDENT VALUES(20152088,'조민우','전기전자',1,'C','M',188,90);
INSERT INTO STUDENT VALUES(20142021,'심수정','전기전자',2,'A','F',168,45);
INSERT INTO STUDENT VALUES(20132003,'박희철','전기전자',3,'B','M',NULL,63);
INSERT INTO STUDENT VALUES(20151062,'김인중','컴퓨터정보',1,'B','M',166,67);
INSERT INTO STUDENT VALUES(20141007,'진현무','컴퓨터정보',2,'A','M',174,64);
INSERT INTO STUDENT VALUES(20131001,'김종헌','컴퓨터정보',3,'C','M',NULL,72);
INSERT INTO STUDENT VALUES(20131025,'옥성우','컴퓨터정보',3,'A','F',172,63);

INSERT INTO SUBJECT VALUES('111', '데이터베이스', '이재영',2,'컴퓨터정보');
INSERT INTO SUBJECT VALUES('110', '자동제어','정순정',2,'전기전자');
INSERT INTO SUBJECT VALUES('109', '자동화설계','박민영',3,'기계');
INSERT INTO SUBJECT VALUES('101', '컴퓨터개론','강종영',3,'컴퓨터정보');
INSERT INTO SUBJECT VALUES('102', '기계공작법','김태영',1,'기계');
INSERT INTO SUBJECT VALUES('103', '기초전자실험','김유석',1,'전기전자');
INSERT INTO SUBJECT VALUES('104', '시스템분석설계','강석현',3,'컴퓨터정보');
INSERT INTO SUBJECT VALUES('105', '기계요소설계','김명성',1,'기계');
INSERT INTO SUBJECT VALUES('106', '전자회로실험','최영민',3,'전기전자');
INSERT INTO SUBJECT VALUES('107', 'CAD응용실습','구봉규',2,'기계');
INSERT INTO SUBJECT VALUES('108', '소프트웨어공학','권민성',1,'컴퓨터정보');

INSERT INTO ENROL VALUES('101', '20131001', 80);
INSERT INTO ENROL VALUES('104', '20131001', 56);
INSERT INTO ENROL VALUES('106', '20132003', 72);
INSERT INTO ENROL VALUES('103', '20152088', 45);
INSERT INTO ENROL VALUES('101', '20131025', 65);
INSERT INTO ENROL VALUES('104', '20131025', 65);
INSERT INTO ENROL VALUES('108', '20151062', 81);
INSERT INTO ENROL VALUES('107', '20143054', 41);
INSERT INTO ENROL VALUES('102', '20153075', 66);
INSERT INTO ENROL VALUES('105', '20153075', 56);
INSERT INTO ENROL VALUES('102', '20153088', 61);
INSERT INTO ENROL VALUES('105', '20153088', 78);
COMMIT;
