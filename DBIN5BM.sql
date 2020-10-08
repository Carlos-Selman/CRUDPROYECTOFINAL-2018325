#==== drop database if exists DBRegistro;
create database DBRegistro;
use DBRegistro;

create table persona(
	codigoPersona int not null auto_increment primary key,
    DPI varchar(15) not null,
    NombrePersona varchar(200) not null
);

#======= Examen final.
create table Rol (
	codigo_rol int not null auto_increment primary key,
    descripcion varchar(32) not null
);

create table Usuario (
	codigo_Usuario int primary key auto_increment,
    users varchar(32) not null,
    passwords varchar(32) not null,
    rols int,
    foreign key(rols) references Rol(codigo_rol)
);

#==== Registros de Rol
insert into Rol (codigo_rol, descripcion) value(1, 'Administrador');
insert into Rol (codigo_rol, descripcion) value(2, 'Usuario');

#==== Registros de Login
#insert into Usuario(codigo_Usuario, users, passwords, rols) value (1, 'tecunMartin', '1234', 1);
#insert into Usuario(codigo_Usuario, users, passwords, rols) value (2, 'aleCh', '1234', 2);

#insert into persona(DPI,NombrePersona) value(201622849156,"Martin");
#insert into persona(DPI,NombrePersona) value(202015489120,"Alejandro");
#insert into persona(DPI,NombrePersona) value(405060107890,"Pedro");
#insert into persona(DPI,NombrePersona) value(504030201078,"Juan");
#insert into persona(DPI,NombrePersona) value(123456789101,"Pablo");