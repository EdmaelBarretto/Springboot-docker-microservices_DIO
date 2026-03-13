CREATE DATABASE IF NOT EXISTS meubanco;

USE meubanco;

CREATE TABLE dados (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50),
    sobrenome VARCHAR(50),
    endereco VARCHAR(150),
    cidade VARCHAR(50),
    host VARCHAR(50)
);
