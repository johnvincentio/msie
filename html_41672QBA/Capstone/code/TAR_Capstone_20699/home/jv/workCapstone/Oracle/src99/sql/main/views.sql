spool all;
set echo on;

set linesize 200;
--
-- I like a clean slate. Make it so.
--

--
-- Drop all views
--

--drop view Container;

--select user_name from user_views order by views_name;

--quit;

--
-- Create Views
--

/*
column "Statistic"       format a27 trunc;
column "Per Transaction" heading "Per Transact";
column ((start_users+end_users)/2) heading "((START_USER"
set numwidth 12;
Rem The total is the total value of the statistic between the time
Rem bstat was run and the time estat was run.  Note that the estat
Rem script logs on to the instance so the per_logon statistics will
Rem always be based on at least one logon.
select 'Users connected at ',to_char(start_time, 'dd-mon-yy hh24:mi:ss'),':',start_users from stats$dates;
select 'Users connected at ',to_char(end_time, 'dd-mon-yy hh24:mi:ss'),':',end_users from stats$dates;
select 'avg # of connections: ',((start_users+end_users)/2) from stats$dates;

select n1.name "Statistic", 
       n1.change "Total", 
*/    

/*

*/

column "containerid" heading "cid" format 999;
column "barcodeid" heading "bid" format 999;
column "barcode" heading "barcode" format a10;
column "quantity" heading "qty" format 999;

column "ordersid" heading "oid" format 999;
column "itemid" heading "iid" format 999;

column "shipid" heading "shid" format 999;
column "usersid" heading "uid" format 999;
column "supplierid" heading "sid" format 999;
column "personid" heading "sid" format 999;

column "itemname" heading "itemname" format a10;
column "optionsid" heading "optid" format 999;
column "optionsname" heading "optname" format a10;
column "optionsvalue" heading "optval" format a10;
column "categoryid" heading "catid" format 999;
column "categoryname" heading "catname" format a10;

select c.containerid "containerid",
		b.barcodeid "barcodeid", b.barcode "barcode",
		c.quantity "quantity",
		c.ordersid "ordersid",
		b.itemid "itemid", i.name "itemname",
		ch.optionsid "optionsid",
		opt.name "optionsname", opt.value "optionsvalue",
		cat.categoryid "categoryid", cat.name "categoryname",
		o.shipmentid "shipid", o.usersid "usersid",
		s.supplierid "supplierid", s.personid "personid"
	from container c, barcode b, orders o, supplier s, item i,
		characteristic ch, options opt, category cat
	where c.barcodeid = b.barcodeid and
		c.ordersid = o.ordersid and
		o.supplierid = s.supplierid and
		b.itemid = i.itemid and
		i.itemid = ch.itemid and
		ch.optionsid = opt.optionsid and
		opt.categoryid = cat.categoryid
	order by c.containerid, c.barcodeid;

create or replace view vw_container AS 
select c.containerid "containerid",
		b.barcodeid "barcodeid", b.barcode "barcode",
		c.quantity "quantity",
		c.ordersid "ordersid",
		b.itemid "itemid", i.name "itemname",
		ch.optionsid "optionsid",
		opt.name "optionsname", opt.value "optionsvalue",
		cat.categoryid "categoryid", cat.name "categoryname",
		o.shipmentid "shipid", o.usersid "usersid",
		s.supplierid "supplierid", s.personid "personid"
	from container c, barcode b, orders o, supplier s, item i,
		characteristic ch, options opt, category cat
	where c.barcodeid = b.barcodeid and
		c.ordersid = o.ordersid and
		o.supplierid = s.supplierid and
		b.itemid = i.itemid and
		i.itemid = ch.itemid and
		ch.optionsid = opt.optionsid and
		opt.categoryid = cat.categoryid
	order by c.containerid, c.barcodeid;
spool off;

select * from vw_container;

quit;

