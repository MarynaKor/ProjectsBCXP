CREATE TABLE t_project (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description VARCHAR(255),
    starting_at TIMESTAMP,
    ending_at TIMESTAMP DEFAULT NULL
);

CREATE TABLE t_person(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    title VARCHAR(255)
);

CREATE TABLE t_personprojectposition (
    id SERIAL PRIMARY KEY,
    start_in_project_date TIMESTAMP DEFAULT NULL,
    person_id INT,
    project_id INT
);

INSERT INTO t_project ( title, description, starting_at, ending_at) VALUES ( 'Bmw-Projekt', 'Auto Konfiguration in der App', '2022-09-08 12:00:00', '2025-09-08 12:00:00');
INSERT INTO t_project ( title, description, starting_at, ending_at) VALUES ( 'Barmer', 'Online LogIn Webapplication', '2022-01-08 00:00:00','2024-09-08 12:00:00');
INSERT INTO t_project ( title, description, starting_at) VALUES ( 'Daimler', 'Eine application wird erstellt', '2024-05-03 12:00:00');
INSERT INTO t_person ( name, title) VALUES ( 'Tessa Test', 'Software Engineer');
INSERT INTO t_person ( name, title) VALUES ( 'Luca Lucky', 'Projekt Manager');
INSERT INTO t_person ( name, title) VALUES ( 'Mina Minestrone', 'Senior Software Engineer');
INSERT INTO t_personprojectposition (person_id, project_id) VALUES ( 1,1 );
INSERT INTO t_personprojectposition (person_id, project_id) VALUES ( 2,1 );
INSERT INTO t_personprojectposition (person_id, project_id) VALUES ( 3,2)