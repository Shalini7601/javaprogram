create database my1236;
use my1236;

create table EMPLOYEE (
EMPLOYEE_ID int(6),
LAST_NAME varchar(25),
JOB_ID varchar(10),
SALARY double(8,2),
COMM_PCT double(4,2),
MGR_ID int(6),
DEPARTMENT_ID int(4)
) ;

insert into EMPLOYEE values
(198,'Connell','SH_CLERK',2600 ,2.5, 124 ,50),
(199,'Grant','SH_CLERK',2600 ,2.2, 124 ,50),
(200,'Whalen','AD_ASST',4400 ,1.3, 101 ,10),
(201,'Hartstien','IT_PROG',6000 ,null, 100 ,20),
(202,'Fay','AC_MGR',6500 ,null, 210 ,20),
(203,'Mavris','AD_VP',7500 ,null, 101 ,40),
(204,'Baer','AD_PRES',3500 ,1.5, 101 ,90),
(205,'Higgins','AC_MGR',2300 ,null, 101 ,60),
(206,'Gitz','IT_PROG',5000 ,null, 103 ,60),
(100,'King','AD_ASSt',8956 ,0.3, 108 ,100),
(101,'Kochar','SH_CLERK',3400 ,1.3, 118 ,30);


select EMPLOYEE_ID,LAST_NAME,JOB_ID from EMPLOYEE;

select * from EMPLOYEE where DEPARTMENT_ID = 60;

select * from EMPLOYEE where LAST_NAME = 'King';

alter table EMPLOYEE Add INCREASED_SALARY int(6) AFTER DEPARTMENT_ID;

 select distinct JOB_ID from EMPLOYEE;
 
 select LAST_NAME, SALARY from EMPLOYEE where INCREASED_SALARY = 300;

 select * from EMPLIYEE where COMM_PACT != null;
 
 select * from EMPLIYEE where COMM_PACT = null;
 
 select EMPLOYEE_ID, DEPARTMENT_ID from EMPLOYEE where SALARY > 5000;
 
 
 select * from EMPLOYEE where SALARY = 4000 and SALARY = 7000;
 
 select * from EMPLOYEE where SALARY = 6000 or SALARY = 6500 or SALARY = 7000;
 
 select * from EMPLOYEE where DEPARTMENT_ID =10 or DEPARTMENT_ID = 20 or DEPARTMENT_ID = 30 or DEPARTMENT_ID = 50 ;
 
 select * from EMPLOYEE where SALARY != 5000;
 
 select * from EMPLOYEE where JOB_ID = 'SH_CLERK';
 
 update EMPLOYEE set JOB_ID = 'GRADE_A' where SALARY > 5000;
 
 select * from EMPLOYEE where JOB_ID = 'SH_CLERK' or JOB_ID = 'IT_PROG' or JOB_ID = 'AD_ASST';
 
 select * from EMPLOYEE where JOB_ID = 'SH_CLERK' and SALARY < 3000;
 
 select LAST_NAME, MGR_ID from EMPLOYEE where SALARY > 3000 and MGR_ID = 101;
 
 
 
 
 
 


