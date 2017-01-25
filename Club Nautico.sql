Drop database Club_Nautico;
Create database Club_Nautico;
use Club_Nautico;

create table socios
(C.I int primary key auto_increment,
nombre varchar (255) not null,
direccion varchar (255) not null,
fecha_increso_club date);





create table embarcaciones
(idmatricula int primary key auto_increment,
nombre varchar (255) not null,
tipo varchar (255) not null,
dimensiones float not null);



create table amarres
(idn_amarre 