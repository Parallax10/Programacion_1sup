
DROP DATABASE IF EXISTS pokemondb;
CREATE DATABASE IF NOT EXISTS pokemondb;
USE pokemondb;


CREATE TABLE IF NOT EXISTS pokemon (
  id INT AUTO_INCREMENT PRIMARY KEY,
   nombre VARCHAR(100),
    niveles DOUBLE,
    vida INT,
    ataque INT,
    defensa INT,
    velocidad INT,
    tipo VARCHAR(50)
    );


CREATE TABLE IF NOT EXISTS entrenador (
   id INT AUTO_INCREMENT PRIMARY KEY,
   nombre VARCHAR(100),
    region VARCHAR(100),
    xp INT
    );

CREATE TABLE IF NOT EXISTS entrenador_pokemon (
    entrenador_id INT,
    pokemon_id INT,
    PRIMARY KEY (entrenador_id, pokemon_id),
    FOREIGN KEY (entrenador_id) REFERENCES entrenador(id) ON DELETE CASCADE,
    FOREIGN KEY (pokemon_id) REFERENCES pokemon(id) ON DELETE CASCADE
);

-- pokemons
INSERT INTO pokemon (nombre, niveles, vida, ataque, defensa, velocidad, tipo) VALUES
('Charmander', 12, 40, 52, 43, 65, 'fuego'),
('Squirtle', 10, 44, 48, 65, 43, 'agua'),
('Pikachu', 11, 45, 49, 49, 45, 'electrico');

-- entrenadores
INSERT INTO entrenador (nombre, region, xp) VALUES
('Castro', 'Utrera', 50),
('Manuel', 'Granada', 999999999);

--entrenadores y pokemon
INSERT INTO entrenador_pokemon (entrenador_id, pokemon_id) VALUES
(1, 1), (1, 2), -- castro charmander squirtle
(2, 2), (2, 3); -- manuel squirtle pikachu

