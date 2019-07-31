create database tona;

use tona;

CREATE TABLE usuario (
  idUsuario int(11) NOT NULL AUTO_INCREMENT,
  user varchar(20) DEFAULT NULL,
  pass varchar(32) DEFAULT NULL,
  Constraint pk_user PRIMARY KEY (idUsuario)
  );
  
create table campana(
idCampana int auto_increment not null,
descripcion varchar(50),
constraint pk_camp primary key(idCampana)
);


create table producto(
idProducto int auto_increment not null,
descripcion varchar(100) null,
imagen mediumblob null,
idCampana int null,
Constraint pk_prod primary key(idProducto),
Constraint fk_prod_Camp foreign key (idCampana) references Campana(idCampana)
);


insert into campana (descripcion) value ('Otoño Invierno');
insert into campana (descripcion) value ('Primaver Verano');

CREATE TABLE `tona`.`fotoportada` (
  `idFoto` INT NOT NULL,
  `fotoPortada` BLOB NULL,
  PRIMARY KEY (`idFoto`));
