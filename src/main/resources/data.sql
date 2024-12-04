CREATE TABLE T_PROJECT (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description CHAR(255)
);

INSERT INTO T_PROJECT ( title, description) VALUES ( 'Bmw-Projekt', 'Auto Konfiguration in der App');
INSERT INTO T_PROJECT ( title, description) VALUES ( 'Barmer', 'Online LogIn Webapplication');