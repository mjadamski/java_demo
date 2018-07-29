create database poleksport;
use poleksport;
create table opiekunowie(
id_o int primary key auto_increment,
name_o varchar(50) not null,
last_o varchar(50) not null
);
create table klienci(
id_k int primary key auto_increment,
name_k varchar(50) not null,
last_k varchar(50) not null,
id_o int,
foreign key (id_o) references opiekunowie(id_o) 
);
create table produkty(
id_p int primary key auto_increment,
name_p varchar(50) not null,
price_p float not null,
id_o int,
foreign key (id_o) references opiekunowie(id_o) 
);
insert into opiekunowie (name_o, last_o) values ('Jan','Nowak');
insert into opiekunowie (name_o, last_o) values ('Leszek','Biały');
insert into opiekunowie (name_o, last_o) values ('Roman','Romain');

insert into klienci (name_k, last_k, id_o) values ('Boguslaw','Duży',1);
insert into klienci (name_k, last_k, id_o) values ('Alanek','Mały',1);
insert into klienci (name_k, last_k, id_o) values ('Natanek','Średni',2);
insert into klienci (name_k, last_k, id_o) values ('Janusz','Biznesu',2);
insert into klienci (name_k, last_k, id_o) values ('Jan','Pan',3);
insert into klienci (name_k, last_k, id_o) values ('Ela','Czarna',3);

insert into produkty (name_p, price_p, id_o) values ('Rower1',100.5,1);
insert into produkty (name_p, price_p, id_o) values ('Rower2',80.5,1);
insert into produkty (name_p, price_p, id_o) values ('Rower3',110.5,1);
insert into produkty (name_p, price_p, id_o) values ('Kredki1',40.5,2);
insert into produkty (name_p, price_p, id_o) values ('Kredki2',30.5,2);
insert into produkty (name_p, price_p, id_o) values ('Radio1',100.5,3);
insert into produkty (name_p, price_p, id_o) values ('Radio2',100.5,3);
# Opiekunowie - Klienci
select o.name_o, o.last_o, k.name_k, k.last_k from opiekunowie o natural join klienci k;
# Opiekunowie - Produkty
select o.name_o, o.last_o, p.name_p, p.price_p from opiekunowie o natural join produkty p;
# Opiekunowie - Liczba produktów
select o.name_o, o.last_o, count(*) from opiekunowie o natural join produkty p group by p.id_o;


