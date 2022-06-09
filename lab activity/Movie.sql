create database xw1236;
use xw1236;

create table movie
( 
mv_no int(20)primary key,
  cust_id varchar(20),
  title varchar(20)not null,
  star varchar(2)not null,
  price int(5),
  check (price >= 100 and price <= 250),
  foreign key(cust_id)references Movie
);