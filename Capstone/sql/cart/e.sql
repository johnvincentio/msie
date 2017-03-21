
spool e;

select * from cart where id=6;

update cart set quantity=3 where id=6;
commit;

select * from cart where id=6;

spool off;

