CREATE TABLE RANDOMACTIVITY (ID BIGINT NOT NULL, DATETIME LONGBLOB, NAAM VARCHAR(255), TREKKING INTEGER, PRIMARY KEY (ID))
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT DECIMAL(38), PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
