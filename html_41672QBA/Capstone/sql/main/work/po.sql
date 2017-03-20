
spool po;
set echo on;
set serveroutput on size 800000;

@loaddata;
commit;

--alter session set SQL_TRACE=TRUE;
exec LOADDATA_PKG.testUsers;
--alter session set SQL_TRACE=FALSE;
commit;

spool off;

