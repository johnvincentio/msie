
create or replace package WEBSERVICES_PKG IS
	function addWebservices return NUMBER;
	procedure deleteWebservices (p_webservicesid IN WEBSERVICES.webservicesid%TYPE);
	procedure showWebservices (p_webservicesid IN WEBSERVICES.webservicesid%TYPE);
END WEBSERVICES_PKG;

/
SHOW ERROR;

create or replace package body WEBSERVICES_PKG IS

	function addWebservices return NUMBER IS
		v_webservicesid NUMBER;
	BEGIN
		select WEBSERVICES_SEQ.NEXTVAL into v_webservicesid from dual;
		insert into WEBSERVICES values (v_webservicesid);
		return v_webservicesid;
	END;

	procedure deleteWebservices (p_webservicesid IN WEBSERVICES.webservicesid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteWebservices; p_webservicesid; '||p_webservicesid);
		delete from WEBSERVICES where webservicesid = p_webservicesid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteWebservices; p_webservicesid; '||p_webservicesid);
	END;

	procedure showWebservices (p_webservicesid IN WEBSERVICES.webservicesid%TYPE) IS
		CURSOR v_cursor IS SELECT * FROM WEBSERVICES where webservicesid = p_webservicesid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showWebservices');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Webservices)' || v_str || v_row.webservicesid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showWebservices');
	END;

END WEBSERVICES_PKG;

/
SHOW ERROR;


