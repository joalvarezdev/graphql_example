CREATE TABLE IF NOT EXISTS courses (
    id SERIAL,
    name VARCHAR(50) NOT NULL,
    category VARCHAR(50) NOT NULL,
    teacher VARCHAR(50) NOT NULL,
    CONSTRAINT "pk_courses" PRIMARY KEY("id")
);