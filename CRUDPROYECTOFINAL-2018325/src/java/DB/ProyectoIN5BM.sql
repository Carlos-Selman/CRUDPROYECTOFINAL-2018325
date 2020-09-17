##=== drop database if exists ProyectoIN5BM;
create database ProyectoIN5BM;
use ProyectoIN5BM;

create table Personas(
	codigoPersona int not null auto_increment primary key,
    DPI varchar(15) not null,
    NombrePersona varchar(200) not null
);
