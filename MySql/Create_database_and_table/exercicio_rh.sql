create database db_rh;

use db_rh;

create table tb_funcionarios (
	id bigint auto_increment,
    nome varchar(255) not null,
    data_admissao varchar (10) not null,
    contrato boolean,
    salario decimal (10.2),
    primary key (id)
);

insert into tb_funcionarios (nome, data_admissao, contrato, salario) values ("Roberto Nascimento", "25/10/2015", true, 2885.50);
insert into tb_funcionarios (nome, data_admissao, contrato, salario) values ("Paulo Nogueira", "10/05/2020", true, 1456.24);
insert into tb_funcionarios (nome, data_admissao, contrato, salario) values ("João Gilberto", "05/11/2019", true, 1853.30);
insert into tb_funcionarios (nome, data_admissao, contrato, salario) values ("Julia Silva", "24/02/2017", true, 2323.00);
insert into tb_funcionarios (nome, data_admissao, contrato, salario) values ("Helena Maria", "20/10/2015", true, 3566.00);

select * from tb_funcionarios where salario > 2000;

select * from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 2000 where id = 3;
