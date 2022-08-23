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

select * from authors;
insert into `authors` (aut_name,gender,country,birthday,hobby) values('罗曼罗兰2','女','漂亮国','1969-1-14','旅游'),('齐泽克','男','英国','1999-10-11','看书');

update `authors` set aut_name = '吴军';

update `authors` set aut_name = '马化腾',country = '中国'where aut_id = 7;

update `authors` set aut_name = '张三',country = '日本'where aut_id > 7;
