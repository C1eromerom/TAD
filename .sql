USE pizzeria;
CREATE TABLE localito
(
idLocal int PRIMARY KEY AUTO_INCREMENT,
dirección VARCHAR(100) NOT NULL);

CREATE TABLE restaurantito
(
idrestau int PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(50),
mesas int not null,
sillas int not null,
idLocal int);

CREATE TABLE per_emportar
(
idpedido int PRIMARY KEY AUTO_INCREMENT,
telefono int(9) NOT NULL,
cliente  VARCHAR(50),
idrestaurant int);

ALTER TABLE restaurant
ADD CONSTRAINT cons_local FOREIGN KEY (idLocal) REFERENCES localito(idLocal);

ALTER TABLE per_emportar
ADD CONSTRAINT cons_rest FOREIGN KEY (idrestaurant) REFERENCES restaurantito(idrestau);
