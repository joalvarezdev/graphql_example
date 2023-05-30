INSERT INTO courses (name, category, teacher)
SELECT 'Matematicas', 'Ciencias exactas', 'Juan Diego Ossa'
    WHERE NOT EXISTS (SELECT name FROM courses WHERE name = 'Juan Diego Ossa');

INSERT INTO courses (name, category, teacher)
SELECT 'Biologia', 'Ciencias', 'Leandro Jarammillo'
    WHERE NOT EXISTS (SELECT name FROM courses WHERE name = 'Leandro Jarammillo');

INSERT INTO courses (name, category, teacher)
SELECT 'Programacion', 'Tecnologia', 'Neiro Figueroa'
    WHERE NOT EXISTS (SELECT name FROM courses WHERE name = 'Neiro Figueroa');
