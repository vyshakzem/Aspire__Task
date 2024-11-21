create database Aspire_plsql;
use Aspire_plsql;
create table Emp_loyee(Emp_id int primary key,Name varchar(230),Department varchar(100),salary int(20));
Delimiter $$

insert into Emp_loyee (Emp_id,name,Department,salary)
values (12345,'Ronaldo','EI',12000);
insert into Emp_loyee(Emp_id,name,Department,salary)
values (13254,'Messi','Ias',60000);
insert into Emp_loyee
values(124321,'Ramos','Insurance',40000),
(128742,'Pepe','D&A',30000);

select*from Emp_loyee;
create table NO_Employe(No_emp int);
Delimiter $$

insert into NO_Employe(No_emp)
values((select count(*)from  Emp_loyee where Emp_id is not null));

select*from NO_Employe;
Delimiter $$
create trigger AFTER_insert_employee1
after Insert
on Emp_loyee
for each row
update  NO_Employe
set No_emp=No_emp+1;
Delimiter $$
insert into Emp_loyee(Emp_id,name,Department,salary)
values(124221,'Pedri','Insurance',40000);

