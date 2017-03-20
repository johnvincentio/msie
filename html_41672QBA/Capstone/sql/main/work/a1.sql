
spool a1;
set echo on;

select a.alertid, a.eventid, a.roleid, a.alertlevel, 
	a.alertnumber, a.description 
from alert a, userrole ur
where a.roleid = ur.roleid and ur.usersid = 1 
order by alertid;

select collectionid, description from collection order by collectionid;

select b.barcodeid, b.itemid, b.supplierid, b.imageurl 
	from barcode b, collectionlist cl
	where cl.barcodeid = b.barcodeid
		and cl.collectionid = 1
	order by b.barcodeid;

select b.barcodeid, b.itemid, s.companyname, b.imageurl, i.name, i.description
	from barcode b, collectionlist cl, item i, supplier s
	where cl.barcodeid = b.barcodeid
		and b.itemid = i.itemid
		and b.supplierid = s.supplierid
		and cl.collectionid = 1
	order by b.barcodeid;

select name, description from item where itemid = 1;

select c.name, o.name, o.value
	from category c, options o, characteristic ch, barcode b
	where c.categoryid = o.categoryid
	and ch.optionsid = o.optionsid
	and ch.itemid = b.itemid
	and b.barcodeid = 1
	order by c.name, o.value;

select s.name, r.subsystemid, r.value
from subsystem s, role r, userrole ur 
where s.subsystemid = r.subsystemid and r.roleid = ur.roleid
and ur.usersid = 1
order by r.subsystemid;

select s.securityid, s.username, s.password, r.name, r.value, sb.subsystemid, sb.name
	from security s, users u, userrole ur, role r, subsystem sb
	where s.securityid = u.securityid
	and u.usersid = ur.usersid
	and ur.roleid = r.roleid
	and r.subsystemid = sb.subsystemid
	order by s.securityid;




