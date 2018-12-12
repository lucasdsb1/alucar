create schema alucar;
use alucar;

create table funcionario (
id integer auto_increment not null,
nome varchar(99),
nivel_acesso int,
cod_cargo int(30),
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
cidade varchar(20));

create table veiculo (
Placa varchar(10) primary key not null,
Renavam bigint,
AnoFab varchar(4),
Quilometragem bigint,
avariado varchar(3),
cod_contrato integer,
nome varchar (90),
motorizacao varchar (3)
);

create table tipo_aluguel (
cod_tipo integer primary key not null auto_increment,
nome_tipo varchar(60)
);

create table aluguel (
cod_contrato integer primary key not null auto_increment,
placa varchar(10),
cpf varchar(11),
fim_contrato varchar(10),
cod_tipo integer,
valor_contrato float,
constraint fk_placa foreign key(placa) references veiculo(placa),
constraint fk_cpf foreign key(cpf) references clientes(cpf),
constraint fk_tipo foreign key(cod_tipo) references tipo_aluguel(cod_tipo)
);

alter table veiculo add constraint fk_cod_contrato_vei foreign key(cod_contrato) references aluguel(cod_contrato) on delete set null;
alter table aluguel add constraint uni_placa unique (placa);