Create DATABASE biblioteca_universitaria;
use biblioteca_universitaria;
-- Tabla de Usuarios simplificada
CREATE TABLE usuarios (
    dni VARCHAR(10) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    fecha_registro DATE NOT NULL
);

-- Tabla de Libros simplificada
CREATE TABLE libros (
    id_libro INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(200) NOT NULL,
    autor VARCHAR(200) NOT NULL,
    disponible BOOLEAN NOT NULL DEFAULT TRUE
);

-- Tabla de Préstamos actualizada
CREATE TABLE prestamos (
    id_prestamo INT PRIMARY KEY AUTO_INCREMENT,
    dni_usuario VARCHAR(10) NOT NULL,
    id_libro INT NOT NULL,
    fecha_prestamo DATE NOT NULL,
    fecha_devolucion_prevista DATE NOT NULL,
    fecha_devolucion_real DATE,
    FOREIGN KEY (dni_usuario) REFERENCES usuarios(dni),
    FOREIGN KEY (id_libro) REFERENCES libros(id_libro)
);