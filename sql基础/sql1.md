alter table author add (hobby varchar(20),address varchar(50));
alter table author modify address varchar(100);
alter table author change address addr varchar(60);
alter table author drop addr;
alter table author rename `authors`;
drop table if exists `user`;
desc authors;
