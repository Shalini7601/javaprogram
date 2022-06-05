create database n1236;
use n1236;

create table Student (
id int primary key auto_increment,
sname varchar(30) not null,
sphone bigint(11) not null unique,
semail varchar(30) not null unique,
saddress varchar(50),
squalification varchar(10)not null,
sfees double,
sdept varchar(20)
);

#drop col
#alter table Student Drop COLUMN sdept;

#change col name
#alter table Student CHANGE COLUMN age sage int;

#rename table name
#alter table Student RENAME student_details;

#insert sigle row
#insert into student_detail value(1,'rohini',6539898234,'1234@gmail.com','mumbai' , 'maharashtra', 'MCA','1000','2022-09-01',12)


#insert multiple row
#insert into student_details values
#(2,'rohini',6539898234,'1234@gmail.com','chennai' ,  'BE','1000','2002-04-01',15)
#(3,'rohi',9039898234,'5678@gmail.com','delhi' ,  'BSE','1000','1995-01-01',35)
#(4,'ram',8339898234,'9143@gmail.com','tamilnadu' , 'BBA','1000','2000-09-01',20)
 
