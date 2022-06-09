SELECT * FROM e1236.emp;
#sum
select dept, sum(qorking_hour) as 'totalhours' from emp group by dept;

select dept, sum(qorking_hour) as 'totalhours' from emp where dept = 'operator';

select dept, sum(salary) as 'total_dept_salary' from emp group by dept;

#average
select dept, avg(salary) as 'avg_dept_salary' from emp group by dept;

#min
select ename, deept, min(salry) as 'avg_dept_salary' from emp group by dept;
select ename, min(salary) from emp;


#max
select dept,max(salary) as 'avg_dept-salary' from emp group by dept;

#having
select dept, sum(working_hour) as 'totalhours' from emp group by dept having sum ( working_hour) > 15;

select job_id, avg(salary) from employees where job_id <> 'programmer' group by job_id; 

#subquery

select * from emp where emp_id IN (select emp_id from emp where working_hour > 10);

select * from emp where emp_id IN (select emp_id from emp where salary > 1200);

select * from emp where salary = (select max(salary) from emp);

select * from emp where addr NOT IN (select addr from emp where addr = 'mumbai');

select * from emp where dept != (select dept from emp where dept = 'operation');

select * from emp where salary > (select salary from emp where ename = 'john');

select cutomerid, customername from cutomer where customerid > ANY ( select customerid from orders);

select cutomerid, customername from cutomer where customerid > ALL ( select customerid from orders);

select cutomerid, customername from cutomer where not exists(select * from orders where customers.customerid = orders.customerid);


# ASSIGNMENT write a sql statement to perpare a list with salesman name, cutomer name their cities for the  salemen and customer who belongs to the same city.alter
select salesmen.name as 'salesmen', customer.cust_name, customer.city from salesmen, customer where salesmen.city = customer.city; 


