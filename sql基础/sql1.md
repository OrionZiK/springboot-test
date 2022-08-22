create  table authot(
	aut_id int primary key,
	aut_name varchar(50) not null,
  gender char(1) default '男',
	country varchar(50),
	birthday datetime
	-- primary key(aut_id)

);

create table if not exists `ydlclass`.`book`(
  `id` int primary key auto_increment,
	`name` varchar(50) not null,
	bar_code varchar(30) not null unique,
	aut_id int not null,
	foreign key(aut_id) references author(aut_id)
	

);
alter table author add (hobby varchar(20),address varchar(50));
alter table author modify address varchar(100);
alter table author change address addr varchar(60);
alter table author drop addr;
alter table author rename `authors`;
drop table if exists `user`;
desc authors;
