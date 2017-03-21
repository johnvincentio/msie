
spool a;

select t.id, c.ds, i.sds, t.quantity, u.email, i.price 
from cart t, users u, catalog c, items i 
where t.id=2 and 
i.catalog = c.catalog and 
t.item = i.item and t.userid = u.id;

spool off;
