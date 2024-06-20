-- Crear la base de datos
CREATE DATABASE tienda;

-- Usar la base de datos creada
USE tienda;

-- Crear la tabla Producto
CREATE TABLE Producto (
    codigo VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(100),
    descripcion VARCHAR(200),
    existencias INT,
    categoria VARCHAR(100),
    precio DOUBLE
);
