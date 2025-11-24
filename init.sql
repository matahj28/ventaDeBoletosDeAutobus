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


CREATE TABLE IF NOT EXISTS terminales
(
    id_terminal INT         NOT NULL AUTO_INCREMENT,
    estado      VARCHAR(45) NOT NULL,
    nombre      VARCHAR(45) NOT NULL,
    PRIMARY KEY (id_terminal)
)
    ENGINE = InnoDB;

insert into terminales(estado, nombre)
values ('CDMX', 'Observatorio');

CREATE TABLE IF NOT EXISTS autobuses
(
    id_autobus             INT         NOT NULL AUTO_INCREMENT,
    matricula              VARCHAR(45) NOT NULL,
    marca                  VARCHAR(45) NOT NULL,
    anio                   VARCHAR(45) NOT NULL,
    numero_asientos        INT         NOT NULL,
    id_terminal INT         NOT NULL,
    PRIMARY KEY (id_autobus),
    UNIQUE INDEX matricula_UNIQUE (matricula ASC) VISIBLE,
    INDEX fk_autobuses_terminales_idx (id_terminal ASC) VISIBLE,
    CONSTRAINT fk_autobuses_terminales
        FOREIGN KEY (id_terminal)
            REFERENCES terminales (id_terminal)
            ON DELETE RESTRICT
            ON UPDATE RESTRICT
)
    ENGINE = InnoDB;

insert into autobuses(matricula,
                     marca,
                     anio,
                     numero_asientos,
                      id_terminal)
values ('1223-456',
        'Mercedes Benz',
        '2025',
        '40',
        1);

