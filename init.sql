CREATE SCHEMA IF NOT EXISTS ventaBoletosDB;
USE ventaBoletosDB;

CREATE TABLE IF NOT EXISTS clientes
(
    id_cliente INT         NOT NULL AUTO_INCREMENT,
    nombre     VARCHAR(45) NOT NULL,
    telefono   VARCHAR(45) NOT NULL,
    correo     VARCHAR(45) NOT NULL,
    password   VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_cliente)
)
    ENGINE = InnoDB;

insert into clientes(nombre,
                     telefono,
                     correo,
                     password)
values ('Jorge M',
        '1234567890',
        'jorge@correo.com',
        '1234');
