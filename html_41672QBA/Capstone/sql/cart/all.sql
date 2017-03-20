
spool all;

drop trigger user_trigger;
drop sequence user_seq;

drop trigger cart_trigger;
drop sequence cart_seq;

drop table cart;

drop table items;
drop table catalog;

drop table users;

create table users (
	userid		number			primary key,
	email		varchar2(25)	unique not null,
	password	varchar2(12)	not null,
	firstname	varchar2(25)	not null,
	middle		varchar2(1)		not null,
	lastname	varchar2(25)	not null,
	faddress	varchar2(25)	not null,
	laddress	varchar2(25)	not null,
	city		varchar2(25)	not null,
	state		varchar2(2)		not null,
	zip			varchar2(5)		not null,
	phone		varchar2(11)	not null
);

create sequence user_seq start with 1 increment by 1;
create trigger user_trigger before insert on users 
for each row
begin
	select user_seq.nextval into :new.userid from dual;
end;
/

select table_name from user_tables;
select sequence_name from user_sequences;
select trigger_name from user_triggers;

insert into users (email,password,firstname,middle,lastname,
	faddress,laddress,city,state,zip,phone) 
values ('email1@pop.com','password1','first1','1','last2',
	'address1','address1','city1','s1','zip1','phone1');

insert into users (email,password,firstname,middle,lastname,
	faddress,laddress,city,state,zip,phone) 
values ('email2@pop.com','password2','first2','2','last2',
	'address2','address2','city2','s2','zip2','phone2');

insert into users (email,password,firstname,middle,lastname,
	faddress,laddress,city,state,zip,phone) 
values ('jv2351@hotpop.com','password3','first3','3','last2',
	'address3','address3','city3','s3','zip3','phone3');

insert into users (email,password,firstname,middle,lastname,
	faddress,laddress,city,state,zip,phone) 
values ('email4@pop.com','password4','first4','4','last2',
	'address4','address4','city4','s4','zip4','phone4');

insert into users (email,password,firstname,middle,lastname,
	faddress,laddress,city,state,zip,phone) 
values ('email5@pop.com','password5','first5','5','last2',
	'address5','address5','city5','s5','zip5','phone5');

commit;

select * from users order by userid;

create table catalog (
	catalogid	number			Constraint pk_catalog primary key,
	ds			varchar2(100)	not null
);

insert into catalog values (1,'Computer Books');
insert into catalog values (2,'Children''s Books');
commit;

select * from catalog order by catalogid;

create table items (
	itemid		number			Constraint pk_item primary key,
	catalogid	number			Constraint fk_catalog References catalog(catalogid) not null,
	sds			varchar2(100)	not null,
	lds			varchar2(500)	not null,
	price		number			not null
);

insert into items values (1,1,
	'<I>Core Servlets and JavaServer Pages 2nd Edition</I> (Volume 1) by Marty Hall and Larry Brown',
	'The definitive reference on servlets and JSP from Prentice Hall and Sun Microsystems Press.<P>Nominated for the Nobel Prize in Literature.',
	39.95);

insert into items values (2,1,
	'<I>Core Web Programming, 2nd Edition</I> by Marty Hall and Larry Brown',
	'One stop shopping for the Web programmer. Topics include <UL><LI>Thorough coverage of Java 2; including Threads, Networking, Swing, Java 2D, RMI, JDBC, and Collections<LI>A fast introduction to HTML 4.01, including frames, style sheets, and layers.<LI>A fast introduction to HTTP 1.1, servlets, and JavaServer Pages.<LI>A quick overview of JavaScript 1.2</UL>', 49.99);

insert into items values (3,2,
	'<I>The Chronicles of Narnia</I> by C.S. Lewis',
	'The classic children''s adventure pitting Aslan the Great Lion and his followers against the White Witch and the forces of evil. Dragons, magicians, quests, and talking animals wound around a deep spiritual allegory. Series includes<I>The Magician''s Nephew</I>,<I>The Lion, the Witch and the Wardrobe</I>,<I>The Horse and His Boy</I>,<I>Prince Caspian</I>,<I>The Voyage of the Dawn Treader</I>,<I>The Silver Chair</I>, and <I>The Last Battle</I>.',
	19.95);

insert into items values (4,2,
	'<I>The Prydain Series</I> by Lloyd Alexander',
	'Humble pig-keeper Taran joins mighty Lord Gwydion in his battle against Arawn the Lord of Annuvin. Joined by his loyal friends the beautiful princess Eilonwy, wannabe bard Fflewddur Fflam, and furry half-man Gurgi, Taran discovers courage, nobility, and other values along the way. Series includes<I>The Book of Three</I>,<I>The Black Cauldron</I>,<I>The Castle of Llyr</I>,<I>Taran Wanderer</I>, and<I>The High King</I>.',
	19.95);

insert into items values (5,2,
	'<I>The Harry Potter Series</I> by J.K. Rowling',
	'The first five of the popular stories about wizard-in-training Harry Potter topped both the adult and children''s best-seller lists. Series includes<I>Harry Potter and the Sorcerer''s Stone</I>,<I>Harry Potter and the Chamber of Secrets</I>,<I>Harry Potter and the Prisoner of Azkaban</I>, "<I>Harry Potter and the Goblet of Fire</I>, and<I>Harry Potter and the Order of the Phoenix</I>.',
	59.95);

commit;

select * from items order by catalogid;

create table cart (
	cartid		number		Constraint pk_id primary key,
	itemid		number		Constraint fk_item References items(itemid) not null,
	userid		number		Constraint fk_userid References users(userid) not null,
	quantity	number		not null
);

create sequence cart_seq start with 1 increment by 1;
create trigger cart_trigger before insert on cart 
for each row
begin
	select cart_seq.nextval into :new.cartid from dual;
end;
/

insert into cart (itemid,userid,quantity) values (1,3,4);
insert into cart (itemid,userid,quantity) values (3,3,1);
insert into cart (itemid,userid,quantity) values (5,3,2);
insert into cart (itemid,userid,quantity) values (2,1,1);
insert into cart (itemid,userid,quantity) values (3,1,2);
insert into cart (itemid,userid,quantity) values (5,1,7);
insert into cart (itemid,userid,quantity) values (1,5,1);
insert into cart (itemid,userid,quantity) values (3,5,3);
insert into cart (itemid,userid,quantity) values (4,5,2);

commit;

select * from cart order by cartid;

spool off;

