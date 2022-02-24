DROP table IF EXISTS empleado;
DROP table IF EXISTS departamento;

create table departamento(
	codigo int not null auto_increment primary key,
    nombre varchar(250) default null,
    presupuesto int default null
    );
    
create table empleado(
    dni nvarchar(9) not null primary key,
    nombre nvarchar(100) default null,
    apellidos nvarchar(255) default null,
    departamento int default null,
    foreign key (departamento) references departamento (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

insert into departamento (nombre,presupuesto) values ('Informatica',10000);
insert into empleado (dni,nombre,apellidos,departamento) values ('48023213H','Abel','Jornet Molero',1);
