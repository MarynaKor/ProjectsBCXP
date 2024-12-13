CREATE TABLE t_project (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description VARCHAR(255),
    starting_at TIMESTAMP,
    ending_at TIMESTAMP DEFAULT NULL
);

INSERT INTO t_project ( title, description, starting_at, ending_at) VALUES ( 'Bmw-Projekt', 'Auto Konfiguration in der App', '2022-09-08 12:00:00', '2025-09-08 12:00:00');
INSERT INTO t_project ( title, description, starting_at) VALUES ( 'Barmer', 'Online LogIn Webapplication', '2022-01-08 00:00:00');
INSERT INTO t_project ( title, description, starting_at) VALUES ( 'Daimler', 'Eine application wird erstellt', '2024-05-03 12:00:00');