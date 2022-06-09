create database m1236;
use m1236;

create table Customer (
Cust_id varchar(5),
Fname varchar(15),
Lname varchar(15),
Carea Char(2),
Cphone bigint(11),
Cpayment bigint(6)
);

#insert multiple row
insert into Customer values
('A01','Ivan','Ross','SA' , 6125467,800.50),
('A02','Vandana','Ray','MU' , 5560379,1000.75),
('A03','Pramada','Jauguste','DA' , 4560389,500.00),
('A04','Basu','Navindi','BA' , 6125401,860.00),
('A05','Ravi','Shridhar','NA' ,null,500.50),
('A06','Rukmini','Alyer','GA' , 5125274,1500.50);

#update 
update Customer set Cphone = 6509765 where Cust_id = 'A01'; 
update Customer set Cphone = 8609765 where Cust_id = 'A04'; 
#update Customer set Cdob = '1988-07-03' where Cust_id = 'A03'; 
#update Customer set Cdob = '1999-04-05' where Cust_id = 'A05'; 

#delete 
delete from Customer where Cust_id = 'A01'; 
delete from Customer where Cust_id = 'A05'; 

select customername, orderdate from cutomer inner join oders on cutomer. Cust_id = o.Cust_id;

#or
select c.customername, o.orderdate from customer c, orders o where c.Cust_id = o.Cust_id;


#left outer join
select cutomer.Cust_id, customername, orderdate from customer left join orders ON customer.Cust_id = orders.Cust_id;

#right join
select cutomer.Cust_id, customername, orderdate from customer right join orders ON customer.Cust_id = orders.Cust_id;

#cross join
select * from customer cross join orders;

#self join
select S1.sname, S1.addr from students_details S1 inner join studdents_details S2 on S1.saddr = S2.saddr and S1.id <> S2.id order by S1.id;

