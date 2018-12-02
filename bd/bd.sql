create table usuarios (
id integer auto_increment not null,
login varchar(30),
senha varchar(30),
constraint PK_ID_USUARIOS primary key(id));

create table clientes (
nome varchar(99),
endereco varchar(99),
dataNasc varchar(10),
sexo varchar(25),
cpf varchar(11) primary key unique not null,
estadocivil varchar(25),
rg integer,
uf varchar(2),
cidade varchar(20),
cod_contrato integer);

create table veiculo (
Placa varchar(10) primary key not null,
Renavam bigint,
AnoFab varchar(4),
Quilometragem integer,
avariado varchar(3),
cod_contrato integer,
nome varchar (90),
motorizacao varchar (3)
);