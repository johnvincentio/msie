
doc
create table items (
	item		number			Constraint pk_item primary key,
	catalog		number			Constraint fk_catalog References catalog(catalog) not null,
	sds			varchar2(100)	not null,
	lds			varchar2(500)	not null,
	price		number			not null
);
#

select item,catalog,sds,lds,price from items 
where catalog=1 order by catalog;
