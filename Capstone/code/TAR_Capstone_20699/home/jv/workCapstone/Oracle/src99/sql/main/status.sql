
create or replace package STATUS_PKG IS
	procedure addStatus (p_statusid IN STATUS.statusid%TYPE,
				p_status IN STATUS.status%TYPE);
	function addGenericStatus return NUMBER;
	procedure deleteStatus (p_statusid IN STATUS.statusid%TYPE);
	procedure showStatus (p_statusid IN STATUS.statusid%TYPE);
END STATUS_PKG;

/
SHOW ERROR;

create or replace package body STATUS_PKG IS

	procedure addStatus (p_statusid IN STATUS.statusid%TYPE,
				p_status IN STATUS.status%TYPE) IS
	BEGIN
		insert into STATUS values (p_statusid, p_status);
	END;

	function addGenericStatus return NUMBER IS
		v_statusid NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericStatus');
		select STATUS_SEQ.NEXTVAL into v_statusid from dual;
		v_str := '_' || v_statusid;
		addStatus (v_statusid, 'Status' || v_str);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericStatus');
		return v_statusid;
	END;

	procedure deleteStatus (p_statusid IN STATUS.statusid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteStatus; p_statusid; '||p_statusid);
		delete from STATUS where statusid = p_statusid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteStatus; p_statusid; '||p_statusid);
	END;

	procedure showStatus (p_statusid IN STATUS.statusid%TYPE) IS
		CURSOR v_cursor IS SELECT * FROM STATUS where statusid = p_statusid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showStatus');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Status)' || v_str || 
				v_row.statusid || v_str || v_row.status);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showStatus');
	END;

END STATUS_PKG;

/
SHOW ERROR;

