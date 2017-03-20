
create or replace package SHIPPER_PKG IS
	procedure addShipper (p_shipperid IN SHIPPER.shipperid%TYPE,
						p_personid IN PERSON.personid%TYPE);
	function addGenericShipper return NUMBER;
	function getPersonId (p_shipperid IN SHIPPER.shipperid%TYPE) return NUMBER;
	procedure deleteShipper (p_shipperid IN SHIPPER.shipperid%TYPE);
	procedure showShipper (p_shipperid IN SHIPPER.shipperid%TYPE);
END SHIPPER_PKG;

/
SHOW ERROR;

create or replace package body SHIPPER_PKG IS

	procedure addShipper (p_shipperid IN SHIPPER.shipperid%TYPE,
						p_personid IN PERSON.personid%TYPE) IS
		v_webid NUMBER;
	BEGIN
		v_webid := WEBSERVICES_PKG.addWebservices;
		insert into SHIPPER values (p_shipperid, p_personid, v_webid);
	END;

	function addGenericShipper return NUMBER IS
		v_personid NUMBER;
		v_shipperid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericShipper');
		select SHIPPER_SEQ.NEXTVAL into v_shipperid from dual;
		v_personid := PERSON_PKG.addGenericPerson;
		addShipper (v_shipperid, v_personid);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericShipper');
		return v_shipperid;
	END;

	function getPersonId (p_shipperid IN SHIPPER.shipperid%TYPE) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select personid into v_id from SHIPPER where shipperid = p_shipperid;
		return v_id;
	END;

	function getWebServicesId (p_shipperid IN SHIPPER.shipperid%TYPE) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select webservicesid into v_id from SHIPPER where shipperid = p_shipperid;
		return v_id;
	END;

	procedure deleteShipper (p_shipperid IN SHIPPER.shipperid%TYPE) IS
		v_personid PERSON.personid%TYPE;
		v_webid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteShipper; p_shipperid; '||p_shipperid);
		v_personid := getPersonId (p_shipperid);
		v_webid := getWebServicesId (p_shipperid);
		delete from SHIPPER where shipperid = p_shipperid;
		WEBSERVICES_PKG.deleteWebservices(v_webid);
		PERSON_PKG.deletePerson(v_personid);
		DBMS_OUTPUT.PUT_LINE('<<< deleteShipper; p_shipperid; '||p_shipperid);
	END;

	procedure showShipper (p_shipperid IN SHIPPER.shipperid%TYPE) IS
		v_personid PERSON.personid%TYPE;
		v_webid WEBSERVICES.webservicesid%TYPE;
		CURSOR v_cursor IS select * from SHIPPER where shipperid = p_shipperid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showShipper');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Shipper)' || v_str || v_row.shipperid);
			v_personid := getPersonId (p_shipperid);
			v_webid := getWebServicesId (p_shipperid);
			PERSON_PKG.showPerson (v_personid);
			WEBSERVICES_PKG.showWebservices (v_webid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showShipper');
	END;

END SHIPPER_PKG;

/
SHOW ERROR;



