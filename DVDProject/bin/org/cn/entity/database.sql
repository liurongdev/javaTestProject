create table user(
	id 	int  primary key   auto_increment ,
	uname  varchar(20) not null ,
	upass varchar(20)  not null
);

alter table user add type int ;
insert int user(uname,upass) values('admin','admin');
update user(
create table dvd(
	id int primary key auto_increment ,
	dname varchar(20) not null ,
	dcount varchar(20) not null ,
	status 	int  not null
);


create table record(
	id int primary key auto_increment ,
	uid int ,
	did int ,
	lendTime varchar(20)  not null ,
	returnTime varchar(20) not null ,
	constraint fk_uid  foreign key(uid) 
			references user(id) ,
	constraint fk_did foreign key(did) 
			references dvd(id) 
);