create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
	id bigint auto_increment,
	especie varchar (30) not null,
	tipo varchar(30) not null,
	primary key (id)
);

create table tb_produto(
	id bigint auto_increment,
	nome varchar (30) not null,
    validade varchar (10),
    peso varchar (10) not null,
    valor decimal (5,2) not null,
    id_categoria bigint,
    primary key (id),
    foreign key (id_categoria) references tb_categoria (id)
);

insert into tb_categoria (especie, tipo) values ("Bovina", "Vermelha");
insert into tb_categoria (especie, tipo) values ("Suína", "Vermelha");
insert into tb_categoria (especie, tipo) values ("Ave", "Branca");
insert into tb_categoria (especie, tipo) values ("Peixe", "Branca");

select * from tb_categoria;

insert into tb_produto (nome, validade, peso, valor, id_categoria) values ("Bife de Contra Filé", "6 meses", "900g", 31.43, 1);
insert into tb_produto (nome, validade, peso, valor, id_categoria) values ("Filé de Peito de Frango", "4 meses", "1Kg", 13.27, 3);
insert into tb_produto (nome, validade, peso, valor, id_categoria) values ("Bisteca", "4 meses", "1Kgg", 21.43, 2);
insert into tb_produto (nome, validade, peso, valor, id_categoria) values ("Bife de Filé Mignon", "6 meses", "900g", 51.96, 1);
insert into tb_produto (nome, validade, peso, valor, id_categoria) values ("Cubos de Acém", "6 meses", "500g", 12.43, 1);
insert into tb_produto (nome, validade, peso, valor, id_categoria) values ("Filé de Salmão", "9 meses", "900g", 66.93, 4);
insert into tb_produto (nome, validade, peso, valor, id_categoria) values ("Coxinha da Asa", "6 meses", "1Kg", 14.26, 2);
insert into tb_produto (nome, validade, peso, valor, id_categoria) values ("Linguiça de Pernil", "9 meses", "700g", 15.63, 2);

select * from tb_produto where valor > 50;

select * from tb_produto where valor > 3 and valor < 60;

select * from tb_produto where nome like "%co%";

update tb_produto set id_categoria = 3 where id = 7;

select * from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria;
    
select * from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.id_categoria where especie like "Bovina";
    

    