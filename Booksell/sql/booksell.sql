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
mail_address varchar(100),
insert_date datetime,
updated_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(50),
item_price int,
item_stock int,
Genre varchar(30),
Description varchar(200),

insert_date datetime,
update_date datetime
);

create table Manager_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
year varchar(5),
position varchar(50),
insert_date datetime,
update_date datetime
);

INSERT INTO item_info_transaction(item_name, item_price, item_stock, Genre, Description) VALUES("ブラックジャックによろしく", 500, 1,"漫画", "藪医者物語");
INSERT INTO Manager_transaction(login_id, login_pass, user_name, year, position) VALUES("test", "1234", "テスト","58", "社長");
