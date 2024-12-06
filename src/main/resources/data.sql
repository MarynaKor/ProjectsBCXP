CREATE TABLE t_project (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description VARCHAR(255)
);

INSERT INTO t_project ( title, description) VALUES ( 'Bmw-Projekt', 'Auto Konfiguration in der App');
INSERT INTO t_project ( title, description) VALUES ( 'Barmer', 'Online LogIn Webapplication');