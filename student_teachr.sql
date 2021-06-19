Drop table if exists student;
Drop table if exists teacher;

create table teacher (
	id int(10) primary key,
	name varchar(30) default null
);

insert into teacher (id, name) values (1, '土匪丁');
insert into teacher (id, name) values (2, '炮灰己');

create table student (
	id int(10) primary key,
	name varchar(30) default null,
	tid int(10) default null,
	Constraint student_teacher_fk FOREIGN KEY (tid) REFERENCES teacher(id)
);

insert into student (id, name, tid) values (1, '张三', 1);
insert into student (id, name, tid) values (2, '李四', 1);
insert into student (id, name, tid) values (3, '王五', 2);
insert into student (id, name, tid) values (4, '路人甲', 2);
insert into student (id, name, tid) values (5, '流氓乙', 1);
