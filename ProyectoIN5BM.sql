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

create table Cliente(
	codigoCliente int not null auto_increment,
    DPI varchar(15) not null,
    nombreCliente varchar(200) not null,
    direccion varchar(200) not null,
    estado varchar(1) not null,
    Primary key(codigoCliente)
);

create table Ventas(
	codigoVentas int not null auto_increment,
    F_codigoCliente int not null,
    F_codigoPersona int not null,
    numeroSerie varchar(200) not null,
    fechaVentas date not null,
    monto double,
    estado varchar(1),
    foreign key (F_codigoCliente) references cliente(codigoCliente),
    foreign key (F_codigoPersona) references persona(codigoPersona),
    Primary key (codigoVentas)
);

create table Producto(
	codigoProducto int not null auto_increment,
    nombreProducto varchar(200),
    precioProducto double,
    stock int(11),
    estado varchar(1),
    primary key (codigoProducto)
);

create table detalleVentas(
	codigoDetalleVentas int not null auto_increment,
    F_codigoVentas int not null,
    F_codigoProducto int not null,
    cantidad int(11) not null,
    precioVenta double,
    foreign key (F_codigoVentas) references ventas(codigoVentas),
    foreign key (F_codigoProducto) references Producto(codigoProducto),
    primary key (codigoDetalleVentas)
);