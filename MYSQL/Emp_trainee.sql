create database p1236;
use p1236;

create table Emp_trainee (
eid numeric(2),
ename varchar(10),
ebasic numeric(6),
designation varchar(10),
eage numeric(2)
);

#rename
alter table Emp1 CHANGE COLUMN eid Emp_trainee int;
#rename age name
alter table Emp1 CHANGE COLUMN eage Age_in_Years int;
#rename
alter table Emp_trainee CHANGE COLUMN designation Programmer_trainee varchar(10) ;

#insert
insert into Emp_trainee values
(1,'Rohit',6700,'Trainee',24),
(2,'Sunil',6200,'Trainee',27),
(3,'Payal',6300,'Trainee',25),
(4,'Kunal',6700,'Trainee',28),
(5,'Sunita',6230,'Trainee',26),
(6,'Bimal',7000,'Trainee',25); 

#drop col
alter table Emp_trainee DROP COLUMN eage;
 






