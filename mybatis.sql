create table user (
	id int(20) primary key,
	name varchar(30) default null,
	pwd varchar(30) default null
);

insert into user (id, name, pwd) values (1, '张三', '123456789');
insert into user (id, name, pwd) values (2, '李四', '987654321');
insert into user (id, name, pwd) values (3, '王五', '456123789');