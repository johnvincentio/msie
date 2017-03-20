spool allshow;
set echo on;

select * from all_app_alerts order by alertid;
select * from all_app_barcodes1 order by barcodeid;
select * from all_app_barcodes2 order by barcodeid;
select * from all_app_characteristics order by name, value;
select * from all_app_subsystems order by subsystemid;
select * from all_app_users order by securityid;

spool off;

