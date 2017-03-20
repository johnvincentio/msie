spool count;

set echo on;
set serveroutput on size 8000;

exec loaddata_pkg.countRecords;

spool off;
quit;

