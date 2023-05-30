INSERT INTO students (name, lastname, age, id_course)
SELECT 'John', 'Serna', 26, 1
    WHERE NOT EXISTS (SELECT name FROM students WHERE name = 'John');

INSERT INTO students (name, lastname, age, id_course)
SELECT 'Andrea', 'Calle', 21, 2
    WHERE NOT EXISTS (SELECT name FROM students WHERE name = 'Andrea');

INSERT INTO students (name, lastname, age, id_course)
SELECT 'Anyi', 'Hoyos', 22, 1
    WHERE NOT EXISTS (SELECT name FROM students WHERE name = 'Anyi');

INSERT INTO students (name, lastname, age, id_course)
SELECT 'Santiago', 'Perez', 24, 3
    WHERE NOT EXISTS (SELECT name FROM students WHERE name = 'Santiago');
