
spool test1;

set echo on;

select subsystemid from subsystem order by subsystemid;
select roleid, name, subsystemid from role order by roleid;
select id, roleid, value from userrole order by id;
select usersid, employeeid, securityid from users order by usersid;
select securityid, username, password from security order by securityid;
select employeeid, personid, locationid, payrollid from employee order by employeeid;
select locationid from location order by locationid;
select personid from person order by personid;
select personid, lvl, lastname from personlist order by personid;

spool off;

