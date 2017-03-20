
set echo on;
set serveroutput on;

create or replace package SECURITY_PKG IS

	procedure addSecurity (p_securityid IN SECURITY.securityid%TYPE,
			p_username IN SECURITY.username%TYPE,
			p_password IN SECURITY.password%TYPE,
			p_phrase IN SECURITY.phrase%TYPE,
			p_response IN SECURITY.response%TYPE,
			p_databaseobject IN SECURITY.databaseobject%TYPE,
			p_comments IN SECURITY.comments%TYPE);
	function addGenericSecurity return NUMBER;
	procedure deleteSecurity (p_securityid IN SECURITY.securityid%TYPE);
	procedure showSecurity (p_securityid IN SECURITY.securityid%TYPE);
END SECURITY_PKG;

/
SHOW ERROR;

create or replace package body SECURITY_PKG IS

	procedure addSecurity (p_securityid IN SECURITY.securityid%TYPE,
			p_username IN SECURITY.username%TYPE,
			p_password IN SECURITY.password%TYPE,
			p_phrase IN SECURITY.phrase%TYPE,
			p_response IN SECURITY.response%TYPE,
			p_databaseobject IN SECURITY.databaseobject%TYPE,
			p_comments IN SECURITY.comments%TYPE) IS
	BEGIN
		insert into SECURITY values (p_securityid, p_username, p_password,
			p_phrase, p_response, p_databaseobject, p_comments);
	END;

	function addGenericSecurity return NUMBER IS
		v_securityid NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericSecurity');
		select SECURITY_SEQ.NEXTVAL into v_securityid from dual;
		v_str := '_' || v_securityid;
		addSecurity (v_securityid, 'username' || v_str, 
			'password' || v_str, 'phrase' || v_str, 'response' || v_str, 
			'databaseobject' || v_str, 'comments' || v_str);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericSecurity');
		return v_securityid;
	END;

	procedure deleteSecurity (p_securityid IN SECURITY.securityid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteSecurity; p_securityid; '||p_securityid);
		delete from SECURITY where securityid = p_securityid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteSecurity; p_securityid; '||p_securityid);
	END;

	procedure showSecurity (p_securityid IN SECURITY.securityid%TYPE) IS
		CURSOR v_cursor IS
			select * FROM SECURITY where securityid = p_securityid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showSecurity');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Security)' || v_str || 
				v_row.securityid || v_str || v_row.username);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showSecurity');
	END;

END SECURITY_PKG;

/
SHOW ERROR;

