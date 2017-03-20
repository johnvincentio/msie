
create or replace package SUBSYSTEM_PKG IS
	procedure addSubsystem (p_subsystemid IN SUBSYSTEM.subsystemid%TYPE,
				p_name IN SUBSYSTEM.name%TYPE,
				p_description IN SUBSYSTEM.description%TYPE);
	function addGenericSubsystem return NUMBER;
	procedure deleteSubsystem (p_subsystemid IN SUBSYSTEM.subsystemid%TYPE);
	procedure showSubsystem (p_subsystemid IN SUBSYSTEM.subsystemid%TYPE);
END SUBSYSTEM_PKG;

/
SHOW ERROR;

create or replace package body SUBSYSTEM_PKG IS

	procedure addSubsystem (p_subsystemid IN SUBSYSTEM.subsystemid%TYPE,
				p_name IN SUBSYSTEM.name%TYPE,
				p_description IN SUBSYSTEM.description%TYPE) IS
	BEGIN
		insert into SUBSYSTEM values (p_subsystemid, p_name, p_description);
	END;

	function addGenericSubsystem return NUMBER IS
		v_subsystemid NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericSubsystem');
		select SUBSYSTEM_SEQ.NEXTVAL into v_subsystemid from dual;
		v_str := '_' || v_subsystemid;
		addSubsystem (v_subsystemid, 'Name' || v_str, 'Ds' || v_str);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericSubsystem');
		return v_subsystemid;
	END;

	procedure deleteSubsystem (p_subsystemid IN SUBSYSTEM.subsystemid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteSubsystem; p_subsystemid; '||p_subsystemid);
		delete from SUBSYSTEM where subsystemid = p_subsystemid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteSubsystem; p_subsystemid; '||p_subsystemid);
	END;

	procedure showSubsystem (p_subsystemid IN SUBSYSTEM.subsystemid%TYPE) IS
		CURSOR v_cursor IS SELECT * FROM SUBSYSTEM where subsystemid = p_subsystemid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showSubsystem');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Subsystem)' || v_str || v_row.subsystemid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showSubsystem');
	END;

END SUBSYSTEM_PKG;

/
SHOW ERROR;

