create database ragul_tech;
use ragul_tech;
create table employee(id int,name varchar(50),dept varchar(50),salary int);
insert into employee values
(2,"Praveen","Backend",45000),
(3,"Ragul","Java",95000),
(4,"Subash","Frontend",85000);

set sql_safe_updates = 0;
delete from employee where name = "Praveen";
update employee set salary = 95000 where name = "Pradeepan";

select * from employee;
select name,salary from employee;
select * from employee where name = "Subash";

alter table employee add column phone int;
alter table employee drop column phone;

drop table employee;
