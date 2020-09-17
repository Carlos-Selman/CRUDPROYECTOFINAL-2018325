drop database if exists ProyectoIN5BM;
create database ProyectoIN5BM;
use ProyectoIN5BM;

create table Persona(
	codigoPersona int not null auto_increment,
    DPI varchar(15) not null,
    nombrePersona varchar(200) not null,
    telefono varchar(9) not null,
    estado varchar(1) not null,
    usuario varchar(8) not null,
    Primary key (codigoPersona)
);
