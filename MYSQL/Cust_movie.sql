create database mn1236;
use mn1236;

create table customer
( cust_id varchar(5) primary key,
  fname varchar(15) not null,
  lname varchar(15),
  area varchar(10) not null,
  phone int(10) 

);

insert into customer values('a01','ivan','ross','sa',6125467);
insert into customer values('a02','vandana','ray','mu',5560379);
insert into customer values('a03','pramada','jauguste','da',4560389);
insert into customer values('a04','basti','navindi','ba',6125401);
insert into customer values('a05','ravi','shridhar','na',null);
insert into customer values('a06','rukmini','ajyer','gh',5125274);

create table movie
( mv_no int(20)primary key,
  cust_id varchar(20),
  title varchar(20)not null,
  star varchar(2)not null,
  price int(5),
  check (price >=100 and price<=250),
  foreign key(cust_id)references customer
);

insert into movie values(1,'a02','bloody','jc',181);
insert into movie values(2,'a04','the firm','tc',200);
insert into movie values(3,'a01','pretty woman','rg',151);
insert into movie values(4,'a06','home alone','mc',150);
insert into movie values(5,'a05','the fugitive','mf',200);
insert into movie values(6,'a03','coma','md',100);
insert into movie values(7,'a02','dracula','go',150);
insert into movie values(8,'a06','quick change','bm',100);
insert into movie values(9,'a03','gone with the cb','jc',200);
insert into movie values(10,'a05','carry on doctor','lp',100);


update movie set title=null where mv_no=2;

delete from customer where cust_id='a01';

update movie set price=3000 where mv_no=9;

select title from movie where price >100 and price <200;

select cust_id from movie where star = 'jc'or star='tc' or star='mc';

select area from customer  where area like '_a%';

select title from movie  where price < 180 AND length(title)=6;


select title, price, price+price*1/10 as incremented_price_column  from movie;
alter table movie add incremented_price_column double(5,2);

select incremented_price_column as ic from movie;
update movie set incremented_price_column=price+price/10 ;


select fname||' '||  lname || ' stays in '|| area ||' and his phone number is '|| phone from customer;

alter table customer  modify lname varchar(15) not null;

select fname,lname from customer where phone is null;

update customer set phone=1111 where area like '_a%';

#select unique cust_id from movie;

#alter table movie modify star null;

delete from customer where cust_id='a02';

delete from movie where mv_no=3;

drop table customer; 

drop table movie; 

alter table movie drop column cust_id;











