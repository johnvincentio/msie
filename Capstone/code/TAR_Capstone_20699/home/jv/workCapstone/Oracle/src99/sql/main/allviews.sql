spool allviews;
set echo on;

create or replace view all_app_alerts as
	select a.alertid, a.eventid, a.roleid, a.alertlevel, 
				a.alertnumber, a.description 
		from alert a, userrole ur
		where a.roleid = ur.roleid and ur.usersid = 1;

create or replace view all_app_barcodes1 as
	select b.barcodeid, b.itemid, b.supplierid, b.imageurl 
		from barcode b, collectionlist cl
		where cl.barcodeid = b.barcodeid
			and cl.collectionid = 1;

create or replace view all_app_barcodes2 as
	select b.barcodeid, b.itemid, s.companyname, b.imageurl, 
					i.name, i.description
		from barcode b, collectionlist cl, item i, supplier s
		where cl.barcodeid = b.barcodeid
			and b.itemid = i.itemid
			and b.supplierid = s.supplierid
			and cl.collectionid = 1;

create or replace view all_app_characteristics as
	select c.name catname, o.name, o.value
		from category c, options o, characteristic ch, barcode b
		where c.categoryid = o.categoryid
			and ch.optionsid = o.optionsid
			and ch.itemid = b.itemid
			and b.barcodeid = 1;

create or replace view all_app_subsystems as
	select s.name, r.subsystemid, r.value
		from subsystem s, role r, userrole ur 
		where s.subsystemid = r.subsystemid and r.roleid = ur.roleid
		and ur.usersid = 1;

create or replace view all_app_users as 
	select s.securityid, s.username, s.password, r.name, 
			r.value, sb.subsystemid, sb.name sbname
	from security s, users u, userrole ur, role r, subsystem sb
	where s.securityid = u.securityid
	and u.usersid = ur.usersid
	and ur.roleid = r.roleid
	and r.subsystemid = sb.subsystemid;

spool off;

