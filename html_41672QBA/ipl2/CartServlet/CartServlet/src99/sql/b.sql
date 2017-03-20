
spool b;

select i.item,c.ds from items i, catalog c
where i.catalog = c.catalog
order by i.item;

select id,item,userid,quantity from cart order by id;

select t.id, c.ds, i.sds, t.quantity, u.email, i.price 
from cart t, users u, catalog c, items i 
where t.userid=3 and 
i.catalog = c.catalog and 
t.item = i.item and t.userid = u.id
order by t.id;

spool off;

