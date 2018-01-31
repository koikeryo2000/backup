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
wallet int,
insert_date datetime,
updated_date datetime
);

drop table if exists item_info_transaction;

create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(50) unique,
item_price int,
item_stock int,
image MEDIUMBLOB,
Category varchar(30),
Description varchar(200),
user_master_id varchar(16),
insert_date datetime,
update_date datetime
);

create table Item_info(
id int not null primary key auto_increment,
item_name varchar(50) unique,
item_price int,
item_stock int,
image varchar(250),
product varchar(250),
Category varchar(30),
Description varchar(200),
user_master_id varchar(16),
insert_date datetime,
update_date datetime
);

create table Manager_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
year varchar(5),
position varchar(16),
user_master_id varchar(16),
insert_date datetime,
update_date datetime
);

create table net_money(
id int not null primary key auto_increment,
net_money_code varchar(16),
price int,
used varchar(10),
user_master_id varchar(16),
Manager_master_id varchar(16),
insert_date datetime,
used_date datetime
);

create table Unsubscribe(
id int not null primary key auto_increment,
user_master_id varchar(16),
why varchar(100),
reason varchar(250),
insert_date datetime
);

 CREATE TABLE image_upload (
  id INT(5) not null primary key auto_increment,
  name VARCHAR(20),
  image MEDIUMBLOB
 ) ;

 create table shopping_cart(
id int not null primary key auto_increment,
item_name varchar(50),
price int,
stock int,
total int,
image varchar(200),
user_master_id varchar(16),
insert_date datetime
);

create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
item_name varchar(50),
price int,
stock int,
total_price int,
user_total_price int,
pay varchar(30),
image varchar(200),
situation varchar(30),
user_master_id varchar(16),
insert_date datetime,
delete_date datetime
);

create table user_review(
id int not null primary key auto_increment,
Review varchar(200),
item_name varchar(50),
rank int,
flag varchar(10),
user_master_id varchar(16),
insert_date datetime,
delete_date datetime
);



INSERT INTO item_info_transaction(item_name, item_price, item_stock, Category, Description, user_master_id) VALUES("ブラックジャックによろしく", 500, 1,"漫画", "藪医者物語","テスト");
INSERT INTO Manager_transaction(login_id, login_pass, user_name, year, position, user_master_id) VALUES("test", "1234", "テスト","58", "社長","テスト");
