
create or replace package USERROLE_PKG IS
	procedure addUserrole (p_usersid IN USERROLE.usersid%TYPE,
					p_roleid IN USERROLE.roleid%TYPE);
END USERROLE_PKG;

/
SHOW ERROR;

create or replace package body USERROLE_PKG IS

	procedure addUserrole (p_usersid IN USERROLE.usersid%TYPE,
					p_roleid IN USERROLE.roleid%TYPE) IS
	BEGIN
		insert into USERROLE values (p_usersid, p_roleid);
	END;

END USERROLE_PKG;

/
SHOW ERROR;

