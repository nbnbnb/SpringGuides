drop table if exists city;
drop table if exists hotel;

create table city (id int primary key IDENTITY , name varchar(500), state varchar(500), country varchar(500));
create table hotel (city int, name varchar(500), address varchar(500), zip varchar(500));

insert into city (name, state, country) values ('San Francisco', 'CA', 'US');
insert into hotel(city, name, address, zip) values (1, 'Conrad Treasury Place', 'William & George Streets', '4001');