

set echo on;
set serveroutput on;

create or replace package EVENT_PKG IS

	procedure addEvent (p_eventid IN EVENT.eventid%TYPE,
			p_sqlobject IN EVENT.sqlobject%TYPE,
			p_urlobject IN EVENT.urlobject%TYPE,
			p_javarefobject IN EVENT.javarefobject%TYPE);
	function addGenericEvent return NUMBER;
	procedure deleteEvent (p_eventid IN EVENT.eventid%TYPE);
	procedure showEvent (p_eventid IN EVENT.eventid%TYPE);
END EVENT_PKG;

/
SHOW ERROR;

create or replace package body EVENT_PKG IS

	procedure addEvent (p_eventid IN EVENT.eventid%TYPE,
			p_sqlobject IN EVENT.sqlobject%TYPE,
			p_urlobject IN EVENT.urlobject%TYPE,
			p_javarefobject IN EVENT.javarefobject%TYPE) IS
	BEGIN
		insert into EVENT values (p_eventid, p_sqlobject, p_urlobject,
					p_javarefobject);
	END;

	function addGenericEvent return NUMBER IS
		v_eventid NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericEvent');
		select EVENT_SEQ.NEXTVAL into v_eventid from dual;
		v_str := '_' || v_eventid;
		addEvent (v_eventid, 'sqlobject' || v_str, 
			'urlobject' || v_str, 'javarefobject' || v_str);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericEvent');
		return v_eventid;
	END;

	procedure deleteEvent (p_eventid IN EVENT.eventid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteEvent; p_eventid; '||p_eventid);
		delete from EVENT where eventid = p_eventid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteEvent; p_eventid; '||p_eventid);
	END;

	procedure showEvent (p_eventid IN EVENT.eventid%TYPE) IS
		CURSOR v_cursor IS
			select * FROM EVENT where eventid = p_eventid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showEvent');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Event)' || v_str || v_row.eventid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showEvent');
	END;

END EVENT_PKG;

/
SHOW ERROR;

