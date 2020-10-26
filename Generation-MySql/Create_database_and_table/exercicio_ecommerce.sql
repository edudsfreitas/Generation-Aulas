create database db_ecommerce;

use db_ecommerce;

create table tb_produtos (
	id bigint auto_increment,
    nome varchar(255) not null,
    categoria varchar (255) not null,
    estoque bigint,
    preco decimal (10.2),
    primary key (id)
);

insert into tb_produtos (nome, categoria, estoque, preco) values ("Redmi Note 9", "Smartphone", 1000, 1509.50);
insert into tb_produtos (nome, categoria, estoque, preco) values ("iPhone 11", "Smartphone", 1000, 4663.00);
insert into tb_produtos (nome, categoria, estoque, preco) values ("Smart TV LED 50", "TV", 990, 2299.00);
insert into tb_produtos (nome, categoria, estoque, preco) values ("Lavadora", "Eletrodoméstico", 669, 1699.00);
insert into tb_produtos (nome, categoria, estoque, preco) values ("Refrigerador Frost Free", "Eletrodoméstico", 150, 1949.00);
insert into tb_produtos (nome, categoria, estoque, preco) values ("Furadeira", "Ferramenta", 500, 145.90);
insert into tb_produtos (nome, categoria, estoque, preco) values ("Bicicleta Aro 12", "Esporte e Lazer", 30, 159.00);
insert into tb_produtos (nome, categoria, estoque, preco) values ("Escada Extensiva", "Ferramenta", 185, 389.90);

select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

update tb_produtos set estoque = 399 where id = 1;


