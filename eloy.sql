CREATE database Restaurantes;
use Restaurantes;

CREATE TABLE restaurante(
idrestaurante int primary key auto_increment,
nombre varchar(255) not null,
aforo int,
direccion varchar(255) not null);


CREATE TABLE plantilla(
DNIplantilla int(9) primary key,
nombre varchar(255) not null,
apellido varchar(255) not null,
telefono int(9) not null,
sueldo double,
idrestaurante int,
constraint cons_res_pl foreign key (idrestaurante) references restaurante (idrestaurante));

CREATE TABLE camarero(
DNIplantilla int primary key,
constraint cons_plantillac foreign key (DNIplantilla) references plantilla (DNIplantilla));

CREATE TABLE pinche(
DNIplantilla int primary key,
constraint cons_plantillap foreign key (DNIplantilla) references plantilla (DNIplantilla));

CREATE TABLE cocinero(
DNIplantilla int primary key,
constraint cons_plantillaco foreign key (DNIplantilla) references plantilla (DNIplantilla));

CREATE TABLE encargado(
DNIplantilla int primary key,
constraint cons_plantillae foreign key (DNIplantilla) references plantilla (DNIplantilla));


CREATE TABLE almacen(
idalmacen int primary key auto_increment,
idrestaurante int,
constraint cons_res_al foreign key (idrestaurante) references restaurante (idrestaurante));

CREATE TABLE ingredientes(
idingredientes int primary key auto_increment,
nombre varchar(255) not null,
cantidad int not null);

CREATE TABLE almacena(
idalmacen int,
idingredientes int,
stock int not null,
primary key (idalmacen,idingredientes),
constraint cons_almacenes foreign key (idalmacen) references almacen (idalmacen),
constraint cons_ingredientes foreign key (idingredientes) references ingredientes (idingredientes));



CREATE TABLE mesas(
Nmesa int primary key,
idrestaurante int,
constraint cons_res_mes foreign key (idrestaurante) references restaurante (idrestaurante) );

CREATE TABLE clientes(
DNIcliente varchar(9) primary key,
nombre varchar(255) not null,
telefono int not null);

CREATE TABLE fechahora(
fechahora datetime primary key);

CREATE TABLE reserva(
Nmesa int,
DNIcliente varchar(9),
fechahora datetime,
primary key(Nmesa, DNIcliente, fechahora),
constraint cons_mesa foreign key (Nmesa) references mesas (Nmesa),
constraint cons_cliente foreign key (DNIcliente) references clientes (DNIcliente),
constraint cons_fecha foreign key (fechahora) references fechahora (fechahora));



