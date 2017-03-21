
create or replace package ALERT_PKG IS
	procedure addAlert (p_alertid IN ALERT.alertid%TYPE,
					p_eventid IN ALERT.eventid%TYPE,
					p_roleid IN ALERT.roleid%TYPE,
					p_alertlevel IN ALERT.alertlevel%TYPE,
					p_alertnumber IN ALERT.alertnumber%TYPE,
					p_description IN ALERT.description%TYPE);
	procedure addAlertNext (p_eventid IN ALERT.eventid%TYPE,
					p_roleid IN ALERT.roleid%TYPE,
					p_alertlevel IN ALERT.alertlevel%TYPE,
					p_alertnumber IN ALERT.alertnumber%TYPE,
					p_description IN ALERT.description%TYPE);
	function addGenericAlert return NUMBER;
	function getEventId (p_alertid IN ALERT.alertid%TYPE) return NUMBER;
	procedure deleteAlert (p_alertid IN ALERT.alertid%TYPE);
	procedure showAlert (p_alertid IN ALERT.alertid%TYPE);
END ALERT_PKG;

/
SHOW ERROR;

create or replace package body ALERT_PKG IS

	procedure addAlert (p_alertid IN ALERT.alertid%TYPE,
					p_eventid IN ALERT.eventid%TYPE,
					p_roleid IN ALERT.roleid%TYPE,
					p_alertlevel IN ALERT.alertlevel%TYPE,
					p_alertnumber IN ALERT.alertnumber%TYPE,
					p_description IN ALERT.description%TYPE) IS
	BEGIN
		insert into ALERT values (p_alertid, p_eventid, p_roleid, 
				p_alertlevel, p_alertnumber, p_description);
	END;

	procedure addAlertNext (p_eventid IN ALERT.eventid%TYPE,
					p_roleid IN ALERT.roleid%TYPE,
					p_alertlevel IN ALERT.alertlevel%TYPE,
					p_alertnumber IN ALERT.alertnumber%TYPE,
					p_description IN ALERT.description%TYPE) IS
		v_alertid NUMBER;
	BEGIN
		select ALERT_SEQ.NEXTVAL into v_alertid from dual;
		addAlert (v_alertid, p_eventid, p_roleid, p_alertlevel,
						p_alertnumber, p_description);
	END;

	function addGenericAlert return NUMBER IS
		v_eventid NUMBER;
		v_alertid NUMBER;
		v_roleid NUMBER;
		v_base NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericAlert');
		v_eventid := EVENT_PKG.addGenericEvent;
		v_roleid := ROLE_PKG.addGenericRole;
		select ALERT_SEQ.NEXTVAL into v_alertid from dual;
		v_base := v_alertid + 100;
		addAlert (v_alertid, v_eventid, v_roleid, v_base+1, v_base+2, null);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericAlert');
		return v_alertid;
	END;

	function getEventId (p_alertid IN ALERT.alertid%TYPE) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select EventId into v_id from ALERT where alertid = p_alertid;
		return v_id;
	END;

	function getRoleId (p_alertid IN ALERT.alertid%TYPE) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select RoleId into v_id from ALERT where alertid = p_alertid;
		return v_id;
	END;

	procedure deleteAlert (p_alertid IN ALERT.alertid%TYPE) IS
		v_eventid ALERT.eventid%TYPE;
		v_roleid ALERT.roleid%TYPE;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteAlert; p_alertid; '|| p_alertid);
		v_eventid := getEventId (p_alertid);
		v_roleid := getRoleId (p_alertid);
		delete from ALERT where alertid = p_alertid;
		EVENT_PKG.deleteEvent (v_eventid);
		ROLE_PKG.deleteRole (v_roleid);
		DBMS_OUTPUT.PUT_LINE('<<< deleteAlert; p_alertid; '|| p_alertid);
	END;

	procedure showAlert (p_alertid IN ALERT.alertid%TYPE) IS
		v_eventid ALERT.eventid%TYPE;
		v_roleid ALERT.roleid%TYPE;
		CURSOR v_cursor IS select * FROM ALERT where alertid = p_alertid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showAlert');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Alert)' || v_str || v_row.alertid);
			v_eventid := getEventId (p_alertid);
			v_roleid := getRoleId (p_alertid);
			EVENT_PKG.showEvent (v_eventid);
			ROLE_PKG.showRole (v_roleid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showAlert');
	END;

END ALERT_PKG;

/
SHOW ERROR;

