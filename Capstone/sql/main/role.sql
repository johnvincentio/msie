
create or replace package ROLE_PKG IS
	procedure addRole (p_roleid IN ROLE.roleid%TYPE,
					p_name IN ROLE.name%TYPE,
					p_description IN ROLE.description%TYPE,
					p_subsystemid IN ROLE.subsystemid%TYPE,
					p_value IN ROLE.value%TYPE,
					p_comments IN ROLE.comments%TYPE);
	function addGenericRole return NUMBER;
	function getSubsystemId (p_roleid IN ROLE.roleid%TYPE) return NUMBER;
	procedure deleteRole (p_roleid IN ROLE.roleid%TYPE);
	procedure showRole (p_roleid IN ROLE.roleid%TYPE);
END ROLE_PKG;

/
SHOW ERROR;

create or replace package body ROLE_PKG IS

	procedure addRole (p_roleid IN ROLE.roleid%TYPE,
					p_name IN ROLE.name%TYPE,
					p_description IN ROLE.description%TYPE,
					p_subsystemid IN ROLE.subsystemid%TYPE,
					p_value IN ROLE.value%TYPE,
					p_comments IN ROLE.comments%TYPE) IS
	BEGIN
		insert into ROLE values (p_roleid, p_name, p_description,
				p_subsystemid, p_value, p_comments);
	END;

	function addGenericRole return NUMBER IS
		v_subsystemid NUMBER;
		v_roleid NUMBER;
		v_str VARCHAR2(30);
		v_base NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericRole');
		v_subsystemid := SUBSYSTEM_PKG.addGenericSubsystem;
		select ROLE_SEQ.NEXTVAL into v_roleid from dual;
		v_str := '_' || v_roleid;
		v_base := v_roleid + 100;
		addRole (v_roleid, 'Name' || v_str , 'Ds' || v_str ,
			v_subsystemid, v_base, 'Comments');
		DBMS_OUTPUT.PUT_LINE('<<< addGenericRole');
		return v_roleid;
	END;

	function getSubsystemId (p_roleid IN ROLE.roleid%TYPE) return NUMBER IS
		v_subsystemid NUMBER;
	BEGIN
		select SubsystemId into v_subsystemid from ROLE where roleid = p_roleid;
		return v_subsystemid;
	END;

	procedure deleteRole (p_roleid IN ROLE.roleid%TYPE) IS
		v_subsystemid ROLE.subsystemid%TYPE;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteRole; p_roleid; '||p_roleid);
		v_subsystemid := getSubsystemId (p_roleid);
		delete from ROLE where roleid = p_roleid;
		SUBSYSTEM_PKG.deleteSubsystem (v_subsystemid);
		DBMS_OUTPUT.PUT_LINE('<<< deleteRole; p_roleid; '||p_roleid);
	END;

	procedure showRole (p_roleid IN ROLE.roleid%TYPE) IS
		v_subsystemid ROLE.subsystemid%TYPE;
		CURSOR v_cursor IS select * FROM ROLE where roleid = p_roleid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showRole');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Role)' || v_str || v_row.roleid);
			v_subsystemid := getSubsystemId (p_roleid);
			SUBSYSTEM_PKG.showSubsystem (v_subsystemid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showRole');
	END;

END ROLE_PKG;

/
SHOW ERROR;

