\c salesrepresentativedb;
alter default privileges grant all on tables to postgres;
alter default privileges grant all on sequences to postgres;
DROP TABLE IF EXISTS salesrepinfo;

CREATE TABLE salesrepinfo (
                            ID Bigserial PRIMARY KEY NOT NULL,
                            NAME varchar(100) NOT NULL,
                            REGION varchar(100) NOT NULL,
                            OPENINGSALES smallint NOT NULL,
                            CLOSINGSALES smallint NOT NULL
);