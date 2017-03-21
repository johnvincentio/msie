
spool jvdata;
set echo on;

insert into subsystem values (subsystem_seq.nextval,'Contracts','Contracts Department');
insert into subsystem values (subsystem_seq.nextval,'Products','Product Management');
insert into subsystem values (subsystem_seq.nextval,'Shipping','Shipping Department');

insert into role values (role_seq.nextval,'Contracts','Contract Management',1,7,'');
insert into role values (role_seq.nextval,'Products','Product Management',2,7,'');
insert into role values (role_seq.nextval,'Shipping','Shipping Management',3,7,'');

insert into security values (security_seq.nextval,'all','allpwd','phrase',
	'response','yuk','yuk');

insert into security values (security_seq.nextval,'contracts','allpwd','phrase',
	'response','yuk','yuk');

insert into security values (security_seq.nextval,'products','allpwd','phrase',
	'response','yuk','yuk');

insert into security values (security_seq.nextval,'shipping','allpwd','phrase',
	'response','yuk','yuk');

insert into userrole values (1,1,7);

commit;

spool off;

