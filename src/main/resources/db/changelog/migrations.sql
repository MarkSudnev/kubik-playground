--liquibase formatted sql

--changeset MarkSudnev:create-tables
CREATE TABLE person (
    id                          UUID            NOT NULL PRIMARY KEY,
    name                        VARCHAR         NOT NULL,
    email                       VARCHAR         NOT NULL UNIQUE,
    phone                       VARCHAR         NOT NULL
);
--rollback DROP TABLE person;
