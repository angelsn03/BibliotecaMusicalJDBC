DROP DATABASE IF EXISTS bibliotecamusical2;
CREATE DATABASE bibliotecamusical2;
USE bibliotecamusical2;

CREATE TABLE usuarios(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    correo VARCHAR(100) UNIQUE,
    contrasenia VARCHAR(60) NOT NULL,
    imagen VARCHAR(100),
    fecha_registro DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE artistas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    tipo ENUM('solista', 'banda') NOT NULL,
    imagen VARCHAR(255),
    genero VARCHAR(50) NOT NULL
);

-- en caso de que el artista sea una banda se llenaría una tabla con integrantes
CREATE TABLE integrantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_artista INT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    rol VARCHAR(100) NOT NULL,
    fecha_ingreso DATE NOT NULL,
    fecha_salida DATE,
    estado_activo BOOLEAN NOT NULL DEFAULT TRUE,
    FOREIGN KEY (id_artista) REFERENCES artistas(id) ON DELETE CASCADE
);

CREATE TABLE albumes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    fecha_lanzamiento DATE NOT NULL,
    genero VARCHAR(50) NOT NULL,
    portada VARCHAR(255),
    id_artista INT NOT NULL,
    FOREIGN KEY (id_artista) REFERENCES artistas(id) ON DELETE CASCADE
);

CREATE TABLE canciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    duracion TIME NOT NULL,
    id_album INT NOT NULL,
    FOREIGN KEY (id_album) REFERENCES albumes(id) ON DELETE CASCADE
);

-- aquí uso enum como pequeña mejora a la bd original
-- con el fin de no tener que llenar 3 campos de id
-- que bueno que se me ocurrió ahora XD
CREATE TABLE favoritos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_cancion INT NOT NULL,
    fecha_agregado DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_cancion) REFERENCES canciones(id)
);

CREATE TABLE baneados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    id_cancion INT NOT NULL,
    fecha_agregado DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_usuario) REFERENCES usuarios(id),
    FOREIGN KEY (id_cancion) REFERENCES canciones(id)
);
