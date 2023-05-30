CREATE TABLE IF NOT EXISTS students (
    id SERIAL,
    name VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL,
    age INTEGER NOT NULL,
    id_course INTEGER,
    CONSTRAINT "pk_students" PRIMARY KEY ("id"),
    FOREIGN KEY (id_course) REFERENCES courses (id)
);