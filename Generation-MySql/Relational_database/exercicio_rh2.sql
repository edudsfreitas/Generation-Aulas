create database db_rh2;

use db_rh2;

create table tb_nivel( -- Na primeira tentativa de resolver o exercício, inseri as informações de nível na tabela cargo, mas assim, precisaria repetir o mesmo cargo três vezes, preferi criar outra tabela.
	id bigint auto_increment,
    nome varchar(30),
    
    primary key (id)
);

insert into tb_nivel(nome) values("Júnior");
insert into tb_nivel(nome) values("Pleno");
insert into tb_nivel(nome) values("Sênior");

create table tb_cargo(
	id bigint auto_increment,
    nome varchar(50),
    
    primary key (id)
);

insert into tb_cargo(nome) values("Analista de Suporte");
insert into tb_cargo(nome) values("Gerente de Projetos");
insert into tb_cargo(nome) values("Estagiário");
insert into tb_cargo(nome) values("Analista de Sistemas");
insert into tb_cargo(nome) values("Analista de Performance");

select * from tb_cargo;

create table tb_funcionario(
	id bigint auto_increment,
    nome varchar(50),
	cargo_id bigint not null,
    nivel_id bigint,
    salario decimal (10,2),
    
    primary key (id),
    foreign key (cargo_id) references tb_cargo (id),
    foreign key (nivel_id) references tb_nivel (id)
);

insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Jose de Moura", 2, 3, 14989.00);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Hayla Chaves Frade", 5, 2, 4550.89);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Kyle Saraiva Alencar", 1, 1, 2556.30);
insert into tb_funcionario (nome, cargo_id, salario) values ("Mohammad Rios", 3, 1412.00);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("íris Alves Salomão", 5,3,9204.00);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values  ("Aline Parracho", 4,3,8194.00);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Alicia Carvalhoso", 4,1,3125.12);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Pérola Mourão", 2, 3, 14989.00);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Angelina Vilante", 2, 3, 14989.00);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Johnny Lameiras", 5, 2, 4550.89);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Timóteo Rangel", 1, 1, 2556.30);
insert into tb_funcionario (nome, cargo_id, salario) values ("Taísa Torres Simões", 3, 1412.00);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Nélson Pardo Prada", 5,3,9204.00);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Jael Picão Telinhos", 4,3,8194.00);
insert into tb_funcionario (nome, cargo_id, nivel_id, salario) values ("Cosmo de Leal", 2, 3, 14989.00);

select * from tb_funcionario where salario > 2000;

select * from tb_funcionario where salario > 1000 and salario < 2000;

select * from tb_funcionario where nome like "c%";

