CREATE TABLE course_entity
(
    id          BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    name        VARCHAR(255),
    CONSTRAINT pk_courseentity PRIMARY KEY (id)
);