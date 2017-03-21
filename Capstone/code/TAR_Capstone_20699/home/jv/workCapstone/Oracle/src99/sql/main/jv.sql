
spool jv;

set echo on;
set serveroutput on;

doc
insert into ALERT values(21,1,1,1,1,'any');
commit;

exec ALERT_PKG.addAlertNext (1,1,25,450,'Some description');
commit;

select alertid, eventid, roleid, description from alert order by alertid;
#

doc
insert into Worktmp values(21,1,'company','imageurl','itemname','itemds');
commit;

exec WORKTMP_PKG.addNextWorktmp (21,1,'company','imageurl','itemname','itemds');
commit;
#

select id, barcodeid, itemid, company from worktmp order by id;

spool off;

