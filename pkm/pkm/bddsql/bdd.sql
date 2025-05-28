CREATE DATABASE IF NOT EXISTS pokemon_db;
USE pokemon_db;

-- Tabla de entrenadores
CREATE TABLE IF NOT EXISTS entrenadores (
                                            id INT PRIMARY KEY,
                                            nombre VARCHAR(100) NOT NULL,
    region VARCHAR(100),
    experiencia INT
    );

-- Tabla de pokemons (todos los tipos en una sola tabla)
CREATE TABLE IF NOT EXISTS pokemons (
                                        id INT PRIMARY KEY,
                                        nombre VARCHAR(100) NOT NULL,
    nivel INT,
    hp INT,
    ataque INT,
    defensa INT,
    velocidad INT,
    tipo VARCHAR(20), -- 'Fuego', 'Agua', 'Electrico'

-- Campos específicos por tipo
    temperatura_corporal DOUBLE,      -- Solo para Fuego
    resistencia_calor DOUBLE,         -- Solo para Fuego

    habilidades_nado VARCHAR(100),    -- Solo para Agua
    tiempo_bajo_agua INT,             -- Solo para Agua

    voltaje DOUBLE,                   -- Solo para Eléctrico
    capacidad_carga DOUBLE,           -- Solo para Eléctrico

    entrenador_id INT,
    FOREIGN KEY (entrenador_id) REFERENCES entrenadores(id)
    );
