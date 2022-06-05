create database e1236;
use e1236;

create table Emp1 (
eid numeric(2),
ename varchar(15),
ebasic numeric(6),
designation varchar(10),
eage numeric(2)
);

#rename column name
alter table Emp1 CHANGE COLUMN eid EMP_trainee int; 
#rename column name
alter table Emp1 CHANGE COLUMN eage Age_in_Years int;

#insert multiple row
insert into Emp1 values
(1,'Rohit',6700,'Manager',24),
(2,'Sunil',6200,'Engineer',27),
(3,'Payal',6300,'Engineer',25),
(4,'Kunal',6700,'Trainee',28),
(5,'Sunita',6230,'Trainee',26),
(6,'Bimal',7000,'Trainee',25),
(7,'vijay',7500,'Manager',28);

 
 insert into Emp1 values
(1,'Rohit',6700,'Trainee',24),
(2,'Sunil',6200,'Trainee',27),
(3,'Payal',6300,'Trainee',25);

#add column
alter table Emp1 add Skills varchar(10) ;

#delete 
delete from Emp1 where EMP_trainee = 1;




 






