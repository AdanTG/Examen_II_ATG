CREATE DATABASE IF NOT EXISTS biblioteca;
USE biblioteca;

CREATE TABLE IF NOT EXISTS libros (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(150),
    autor VARCHAR(100),
    isbn VARCHAR(20),
    disponible BOOLEAN
);

INSERT INTO libros (titulo, autor, isbn, disponible) VALUES
('Cien Años de Soledad', 'Gabriel García Márquez', '1234567890', true),
('1984', 'George Orwell', '9876543210', true),
('El Principito', 'Antoine de Saint-Exupéry', '4567891230', true);

CREATE TABLE IF NOT EXISTS prestamos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_libro INT,
    nombre_usuario VARCHAR(100),
    fecha_prestamo DATE,
    fecha_devolucion DATE,
    FOREIGN KEY (id_libro) REFERENCES libros(id)
);

INSERT INTO prestamos (id_libro, nombre_usuario, fecha_prestamo, fecha_devolucion) VALUES
(1, 'Juan Pérez', '2025-05-01', '2025-05-15'),
(2, 'Ana López', '2025-05-03', '2025-05-17');