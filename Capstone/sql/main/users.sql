
create or replace package USERS_PKG IS
	procedure addUsers (p_usersid IN USERS.usersid%TYPE,
					p_employeeid IN USERS.employeeid%TYPE,
					p_securityid IN USERS.securityid%TYPE,
					p_comments IN USERS.comments%TYPE);
	function addGenericUsers return NUMBER;
	function getEmployeeId (p_usersid IN USERS.usersid%TYPE) return NUMBER;
	function getSecurityId (p_usersid IN USERS.usersid%TYPE) return NUMBER;
	procedure deleteUsers (p_usersid IN USERS.usersid%TYPE);
	procedure showUsers (p_usersid IN USERS.usersid%TYPE);
END USERS_PKG;

/
SHOW ERROR;

create or replace package body USERS_PKG IS

	procedure addUsers (p_usersid IN USERS.usersid%TYPE,
					p_employeeid IN USERS.employeeid%TYPE,
					p_securityid IN USERS.securityid%TYPE,
					p_comments IN USERS.comments%TYPE) IS
	BEGIN
		insert into USERS values (p_usersid, p_employeeid, 
					p_securityid, p_comments);
	END;

	function addGenericUsers return NUMBER IS
		v_usersid NUMBER;
		v_employeeid NUMBER;
		v_securityid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericUsers');
		v_employeeid := EMPLOYEE_PKG.addGenericEmployee;
		v_securityid := SECURITY_PKG.addGenericSecurity;
		select USERS_SEQ.NEXTVAL into v_usersid from dual;
		addUsers (v_usersid, v_employeeid, v_securityid, null);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericUsers');
		return v_usersid;
	END;

	function getEmployeeId (p_usersid IN USERS.usersid%TYPE) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select EmployeeId into v_id from USERS where usersid = p_usersid;
		return v_id;
	END;

	function getSecurityId (p_usersid IN USERS.usersid%TYPE) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select SecurityId into v_id from USERS where usersid = p_usersid;
		return v_id;
	END;

	procedure deleteUsers (p_usersid IN USERS.usersid%TYPE) IS
		v_employeeid NUMBER;
		v_securityid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteUsers; p_usersid; '|| p_usersid);
		v_employeeid := getEmployeeId (p_usersid);
		v_securityid := getSecurityId (p_usersid);
		delete from USERS where usersid = p_usersid;
		EMPLOYEE_PKG.deleteEmployee (v_employeeid);
		SECURITY_PKG.deleteSecurity (v_securityid);
		DBMS_OUTPUT.PUT_LINE('<<< deleteUsers; p_usersid; '|| p_usersid);
	END;

	procedure showUsers (p_usersid IN USERS.usersid%TYPE) IS
		v_employeeid NUMBER;
		v_securityid NUMBER;
		CURSOR v_cursor IS select * FROM USERS where usersid = p_usersid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showUsers');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Users)' || v_str || v_row.usersid);
			v_employeeid := getEmployeeId (p_usersid);
			v_securityid := getSecurityId (p_usersid);
			EMPLOYEE_PKG.showEmployee (v_employeeid);
			SECURITY_PKG.showSecurity (v_securityid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showUsers');
	END;

END USERS_PKG;

/
SHOW ERROR;

