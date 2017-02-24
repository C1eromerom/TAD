DROP DATABASE Club_náutico; 
CREATE DATABASE Club_náutico;
USE Club_náutico;





CREATE TABLE Socios(
CI_socios INT PRIMARY KEY AUTO_INCREMENT,
Fecha_ingreso DATE NOT NULL,
Nombre varchar(255) NOT NULL,
Tlf INT NOT NULL,
Dirección varchar(255) NOT NULL);

CREATE TABLE Embarcaciones(
Matrícula INT PRIMARY KEY,
Dimensiones INT NOT NULL,
Tipo varchar(255) NOT NULL,
Nombre varchar(255) NOT NULL,
CI_socios INT,
CONSTRAINT cons_poseen FOREIGN KEY (CI_socios) REFERENCES Socios (CI_socios));

CREATE TABLE Zonas(
Letra char PRIMARY KEY,
Tipo_barco varchar(255) NOT NULL,
N_barcos INT NOT NULL,
Ancho_amarre INT NOT NULL,
Prof_amarre INT NOT NULL);

CREATE TABLE Empleados(
CI_empleados INT PRIMARY KEY AUTO_INCREMENT,
Nombre varchar(255) NOT NULL,
Dirección varchar(255) NOT NULL,
Especialidad varchar(255) NOT NULL,
Tlf INT NOT NULL);

CREATE TABLE Está_asignado(
CI_empleados INT,
Letra char,
N_barcos_asig INT NOT NULL,
PRIMARY KEY(CI_empleados,Letra),
CONSTRAINT cons_empl FOREIGN KEY (CI_empleados) REFERENCES Empleados (CI_empleados),
CONSTRAINT cons_zona FOREIGN KEY (Letra) REFERENCES Zonas (Letra));

CREATE TABLE Amarres(
N_amarre INT PRIMARY KEY,
Cont_luz INT NOT NULL,
Cont_agua INT NOT NULL,
Serv_mant BOOLEAN NOT NULL,
Letra char,
CONSTRAINT cons_amarr_letra FOREIGN KEY (Letra) REFERENCES Zonas (Letra));

CREATE TABLE Tienen(
N_amarre INT,
CI_socios INT,
Fecha_compra DATE,
PRIMARY KEY(N_amarre,CI_socios),
CONSTRAINT cons_tiene_socios FOREIGN KEY (CI_socios) REFERENCES Socios (CI_socios),
CONSTRAINT cons_tiene_amarre FOREIGN KEY (N_amarre) REFERENCES Amarres (N_amarre));

CREATE TABLE Ocupan(
N_amarre INT,
Matrícula INT,
Fecha DATE,
PRIMARY KEY(N_amarre,Matrícula),
CONSTRAINT cons_ocupan_embarca FOREIGN KEY (Matrícula) REFERENCES Embarcaciones (Matrícula),
CONSTRAINT cons_ocupan_amarre FOREIGN KEY (N_amarre) REFERENCES Amarres (N_amarre));
 

  


