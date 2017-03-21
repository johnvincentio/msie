
create or replace package PERSON_PKG IS
	procedure addPerson (p_personid IN PERSON.personid%TYPE);
	function addGenericPerson return NUMBER;
	procedure deletePerson (p_personid IN PERSON.personid%TYPE);
	procedure showPerson (p_personid IN PERSON.personid%TYPE);
END PERSON_PKG;

/
SHOW ERROR;

create or replace package body PERSON_PKG IS

	procedure addPerson (p_personid IN PERSON.personid%TYPE) is
	BEGIN
		insert into PERSON values (p_personid);
	END;

	function addGenericPerson return NUMBER IS
		v_personid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericPerson');
		select PERSON_SEQ.NEXTVAL into v_personid from dual;
		addPerson (v_personid);
		PERSONLIST_PKG.addGenericPersonList (v_personid);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericPerson');
		return v_personid;
	END;

	procedure deletePerson (p_personid IN PERSON.personid%TYPE) is
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deletePerson; p_personid; '||p_personid);
		PERSONLIST_PKG.deletePersonList (p_personid);
		delete from PERSON where personid = p_personid;
		DBMS_OUTPUT.PUT_LINE('<<< deletePerson; p_personid; '||p_personid);
	END;

	procedure showPerson (p_personid IN PERSON.personid%TYPE) IS
		CURSOR v_cursor IS select * FROM PERSON where personid = p_personid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showPerson');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Person)' || v_str || v_row.personid);
			PERSONLIST_PKG.showPersonList (p_personid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showPerson');
	END;

END PERSON_PKG;

/
SHOW ERROR;


