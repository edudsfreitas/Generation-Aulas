create database db_escola;

use db_escola;

create table tb_alunos (
	id bigint auto_increment,
    nome varchar(255) not null,
    periodo varchar(50) not null,
    turma varchar(50) not null,
    nota decimal(2.2),
    primary key(id)
);

insert into tb_alunos (nome, periodo, turma, nota) values ("Eduardo Freitas", "Manhã", "3ªB", 9.5);
insert into tb_alunos (nome, periodo, turma, nota) values ("Gabriel Toledo", "Manhã", "3ªA", 7.2);
insert into tb_alunos (nome, periodo, turma, nota) values ("Juliana Moreira", "Noite", "3ªE", 8.0);
insert into tb_alunos (nome, periodo, turma, nota) values ("Lucas Alberto", "Tarde", "1ªA", 3.75);
insert into tb_alunos (nome, periodo, turma, nota) values ("Bruno Silveira", "Noite", "3ªE", 5.5);
insert into tb_alunos (nome, periodo, turma, nota) values ("Raphael Barbosa", "Tarde", "1ªB", 9.5);
insert into tb_alunos (nome, periodo, turma, nota) values ("Gabriela Faria", "Manhã", "3ªA", 0);
insert into tb_alunos (nome, periodo, turma, nota) values ("Maria Ninguem", "Noite", "3ªD", 10);

select * from tb_alunos where nota > 7;

select * from tb_alunos where nota < 7;

update tb_alunos set nota = 5 where id = 7;
