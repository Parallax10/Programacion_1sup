DROP DATABASE IF EXISTS repasoMioDB;
CREATE DATABASE repasoMioDB;
USE repasoMioDB;

CREATE TABLE Personajes (
nombre VARCHAR(50) PRIMARY KEY,
vida INT,
dano INT,
tipo INT
);

CREATE TABLE Guerrero (
nombreg VARCHAR(50) PRIMARY KEY,
tipog INT
);

CREATE TABLE Arquero (
nombrea VARCHAR(50) PRIMARY KEY,
tipoa INT
);

ALTER TABLE Guerrero ADD CONSTRAINT guerrerofk FOREIGN KEY (nombreg) REFERENCES Personajes(nombre);
ALTER TABLE Arquero ADD CONSTRAINT arquerofk FOREIGN KEY (nombrea) REFERENCES Personajes(nombre);
