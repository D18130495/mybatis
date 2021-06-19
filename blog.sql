drop table if exists blog;

create table blog (
	id varchar(50) primary key,
	title varchar(100) not null,
	author varchar(30) not null,
	create_time datetime not null,
	views int(30) not null
);