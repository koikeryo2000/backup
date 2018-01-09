drop database if exists booksell;

create database if not exists booksell;
use booksell;

drop table if exists login_user_transaction;

create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
year varchar(5),
street_address varchar(100),
sex varchar(5),
phone_number varchar(20),
insert_date datetime,
updated_date datetime
);