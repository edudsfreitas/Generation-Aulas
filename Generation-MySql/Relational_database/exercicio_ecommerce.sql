create database db_ecommerce2;

use db_ecommerce2;

create table tb_categoria(
	id bigint auto_increment,
    nome varchar(255) not null,
    sub_categoria varchar(255) not null,
    
    primary key(id)
);

insert into tb_categoria (nome, sub_categoria) values ("Eletrodomésticos","Refrigerador");
insert into tb_categoria (nome, sub_categoria) values ("Eletrodomésticos","Lavadora");
insert into tb_categoria (nome, sub_categoria) values ("Informática","Notebook");
insert into tb_categoria (nome, sub_categoria) values ("Celulares e Telefones","Smartphone");
insert into tb_categoria (nome, sub_categoria) values ("Móveis","Escritório");

select * from tb_categoria;

create table tb_produto(
	id bigint auto_increment,
    nome varchar(255) not null,
    marca varchar(255),
	preco decimal(10,2),
    estoque bigint not null,
    id_categoria bigint not null,
  
	primary key(id),
	foreign key(id_categoria) references tb_categoria (id)
    
);

insert into tb_produto (nome, marca, preco, estoque, id_categoria) values ("Cadeira Gamer MX5 Giratoria", "Mymax", 999.00, 5000, 1);
insert into tb_produto (nome, marca, preco, estoque, id_categoria) values ("Smartphone Samsung Galaxy A31 Branco 128GB", "Samsung", 1799.00, 10000, 5);
insert into tb_produto (nome, marca, preco, estoque, id_categoria) values ("Asus ProArt (Laptop Gamer) Xeon E-2276M tela 17`", "Asus", 80700.00, 10, 4);
insert into tb_produto (nome, preco, estoque, id_categoria) values ("Escrivaninha 1 Porta - Branco", 169.90, 1000, 1);
insert into tb_produto (nome, preco, estoque, id_categoria) values ("Mesa para Escritório Diretor - Preto",1611.86, 5000, 1);
insert into tb_produto (nome, marca, preco, estoque, id_categoria) values ("Lava e Seca Samsung 11 Kg WD11M4453JW - 110V", "Samsung", 4899.90, 1000, 3);
insert into tb_produto (nome, marca, preco, estoque, id_categoria) values ("Lava & Seca Philco 12/8kg PLS12T 16 Programas", "Philco", 6437.00, 5000, 3);
insert into tb_produto (nome, marca, preco, estoque, id_categoria) values ("Refrigerador Consul Frost Free ", "Consul", 2099.00, 10000, 2);
insert into tb_produto (nome, marca, preco, estoque, id_categoria) values ("Refrigerador Electrolux DFN41 Frost Free", "Electrolux", 2299.00, 5000, 2);
insert into tb_produto (nome, marca, preco, estoque, id_categoria) values ("iPhone 11 Apple com 256GB", "Apple", 5799.00, 50000, 5);

select * from tb_produto where preco > 2000;
select * from tb_produto where preco > 1000 and preco < 2000;
select * from tb_produto where nome like "c%";

