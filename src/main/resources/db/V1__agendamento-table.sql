CREATE TABLE agendamento(
    id UUID PRIMARY KEY,
    receiver VARCHAR(100) NOT NULL ,
    message VARCHAR(600) NOT NULL,
    status VARCHAR(20) NOT NULL
);