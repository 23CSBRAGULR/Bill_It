show databases;
create database UserDB;
use UserDB;
show tables;

create table adminTable(regId varchar(10) primary key, adminname varchar(20) unique key not null, adminpassword varchar(20) not null);
insert into adminTable values
('rag', 'ragul', 'adminragul'),
('sri', 'srivarshini', 'adminsrivarshini'),
('mat', 'mathavan', 'adminmathavan');
select * from adminTable;
drop table adminTable;
describe adminTable;

create table staffTable(regId varchar(10) primary key, staffname varchar(20) unique key not null, staffpassword varchar(20) not null);
insert into staffTable values
('siv', 'sivasankar', 'staffsivasankar'),
('ram', 'ramkumar', 'stafframkumar'),
('vis', 'visweshwar', 'staffvisweshwar');
select * from staffTable;
describe staffTable;

drop table userTable;

delete from adminTable where regId = 'siv' or regId = 'ram' or regId = 'vis';

alter table adminTable add mbno int;
update adminTable set mbno = 1234567890 where regId = 'rag' or regId = 'sri';

select*from aDmInTaBlE;
select REgID from admintable where regid = 'MAT';

select count(*) from admintable where regid = 'mat';