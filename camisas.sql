CREATE DATABASE IF NOT EXISTS camisas;

USE camisas;

CREATE TABLE IF NOT EXISTS camisas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    time VARCHAR(255) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL
);
