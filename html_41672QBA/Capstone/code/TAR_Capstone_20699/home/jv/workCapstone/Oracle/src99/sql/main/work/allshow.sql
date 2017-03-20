
spool allshow;
set echo on;

doc
select alertid, eventid, roleid, alertlevel from alert order by alertid;
select bankid, personid from bank order by bankid;
#

select subsystemid, name from subsystem order by subsystemid;
select roleid, name from role order by roleid;
select securityid, username, password from security order by securityid;
select employeeid, personid, locationid, payrollid from employee order by employeeid;
select usersid, employeeid, securityid from users order by usersid;
select usersid, roleid, value from userrole order by usersid;

commit;

spool off;

