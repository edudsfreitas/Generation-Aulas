create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria( 
	id bigint auto_increment,
	nome varchar (55) not null,
    sub_categoria varchar (55) not null,    
    primary key (id) 
);
    
create table tb_curso(
	id bigint auto_increment,
	nome varchar (30) not null,
    duracao varchar (10),
    valor decimal (5,2) not null,
    id_categoria bigint,
    primary key (id),
    foreign key (id_categoria) references tb_categoria (id)
);

insert into tb_categoria (nome, sub_categoria) values ("Desenvolvimento", "Web");
insert into tb_categoria (nome, sub_categoria) values ("Negócios", "Gestão de Projetos");
insert into tb_categoria (nome, sub_categoria) values ("TI e Software", "Redes de Segurança");
insert into tb_categoria (nome, sub_categoria) values ("Design", "Design Gráfico e Ilustração");
insert into tb_categoria (nome, sub_categoria) values ("Marketing", "Marketing Digital");

select * from tb_categoria;

insert into tb_curso (nome, duracao, valor, id_categoria) values ("Google Ads", "20 horas", 54.90, 5);
insert into tb_curso (nome, duracao, valor, id_categoria) values ("Gestão Ágil com Scrum", "10 horas", 44.90, 2);
insert into tb_curso (nome, duracao, valor, id_categoria) values ("Adobe Photoshop", "20 horas", 37.90, 4);
insert into tb_curso (nome, duracao, valor, id_categoria) values ("Arquitetura de Redes", "19 horas", 37.90, 3);
insert into tb_curso (nome, duracao, valor, id_categoria) values ("Gamificação", "3 horas", 37.90, 2);
insert into tb_curso (nome, duracao, valor, id_categoria) values ("Javascrip", "23 horas", 64.90, 1); 
insert into tb_curso (nome, duracao, valor, id_categoria) values ("HTML5 e CSS3", "8 horas", 37.90, 1);
insert into tb_curso (nome, duracao, valor, id_categoria) values ("Corel Draw", "20 horas", 54.90, 4);

select * from tb_curso where valor > 50;

select * from tb_curso where valor > 3 and valor < 60;

select * from tb_curso where nome like "%JAV%";

select * from tb_curso
	inner join tb_categoria on tb_categoria.id = tb_curso.id_categoria;
    
alter table tb_categoria 
    change nome categoria varchar(55) not null;    
    
select * from tb_curso
	inner join tb_categoria on tb_categoria.id = tb_curso.id_categoria where categoria like "Desenvolvimento";
    

