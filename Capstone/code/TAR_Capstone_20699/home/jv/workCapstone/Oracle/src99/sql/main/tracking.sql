
create or replace package TRACKING_PKG IS
	procedure addTracking (p_trackingid IN TRACKING.trackingid%TYPE,
				p_trackingobject IN TRACKING.trackingobject%TYPE);
	function addGenericTracking return NUMBER;
	procedure deleteTracking (p_trackingid IN TRACKING.trackingid%TYPE);
	procedure showTracking (p_trackingid IN TRACKING.trackingid%TYPE);
END TRACKING_PKG;

/
SHOW ERROR;

create or replace package body TRACKING_PKG IS

	procedure addTracking (p_trackingid IN TRACKING.trackingid%TYPE,
				p_trackingobject IN TRACKING.trackingobject%TYPE) IS
	BEGIN
		insert into TRACKING values (p_trackingid, p_trackingobject);
	END;

	function addGenericTracking return NUMBER IS
		v_trackingid NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericTracking');
		select TRACKING_SEQ.NEXTVAL into v_trackingid from dual;
		v_str := '_' || v_trackingid;
		addTracking (v_trackingid, 'Tracking' || v_str);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericTracking');
		return v_trackingid;
	END;

	procedure deleteTracking (p_trackingid IN TRACKING.trackingid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteTracking; p_trackingid; '||p_trackingid);
		delete from TRACKING where trackingid = p_trackingid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteTracking; p_trackingid; '||p_trackingid);
	END;

	procedure showTracking (p_trackingid IN TRACKING.trackingid%TYPE) IS
		CURSOR v_cursor IS SELECT * FROM TRACKING where trackingid = p_trackingid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showTracking');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Tracking)' || v_str || v_row.trackingid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showTracking');
	END;

END TRACKING_PKG;

/
SHOW ERROR;

