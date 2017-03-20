
create or replace package LOCATION_PKG IS
	procedure addLocation (p_locationid IN LOCATION.locationid%TYPE,
				p_description IN LOCATION.description%TYPE);
	function addGenericLocation return NUMBER;
	procedure deleteLocation (p_locationid IN LOCATION.locationid%TYPE);
	procedure showLocation (p_locationid IN LOCATION.locationid%TYPE);
END LOCATION_PKG;

/
SHOW ERROR;

create or replace package body LOCATION_PKG IS

	procedure addLocation (p_locationid IN LOCATION.locationid%TYPE,
				p_description IN LOCATION.description%TYPE) IS
	BEGIN
		insert into LOCATION values (p_locationid, p_description);
	END;

	function addGenericLocation return NUMBER IS
		v_locationid NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericLocation');
		select LOCATION_SEQ.NEXTVAL into v_locationid from dual;
		v_str := '_' || v_locationid;
		addLocation (v_locationid, 'Location' || v_str);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericLocation');
		return v_locationid;
	END;

	procedure deleteLocation (p_locationid IN LOCATION.locationid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteLocation; p_locationid; '||p_locationid);
		delete from LOCATION where locationid = p_locationid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteLocation; p_locationid; '||p_locationid);
	END;

	procedure showLocation (p_locationid IN LOCATION.locationid%TYPE) IS
		CURSOR v_cursor IS SELECT * FROM LOCATION where locationid = p_locationid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showLocation');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Location)' || v_str || v_row.locationid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showLocation');
	END;

END LOCATION_PKG;

/
SHOW ERROR;

