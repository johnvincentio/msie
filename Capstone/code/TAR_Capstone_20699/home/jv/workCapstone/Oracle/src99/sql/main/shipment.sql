
create or replace package SHIPMENT_PKG IS
	procedure addShipment (p_shipmentid IN SHIPMENT.shipmentid%TYPE,
		p_shipperid IN SHIPMENT.shipperid%TYPE,
		p_personid IN SHIPMENT.personid%TYPE,
		p_trackingid IN SHIPMENT.trackingid%TYPE,
		p_statusid IN SHIPMENT.statusid%TYPE);
	function addGenericShipment return NUMBER;
	function getShipperId (p_shipmentid IN NUMBER) return NUMBER;
	function getPersonid (p_shipmentid IN NUMBER) return NUMBER;
	function getTrackingId (p_shipmentid IN NUMBER) return NUMBER;
	function getStatusId (p_shipmentid IN NUMBER) return NUMBER;
	procedure deleteShipment (p_shipmentid IN SHIPMENT.shipmentid%TYPE);
	procedure showShipment (p_shipmentid IN SHIPMENT.shipmentid%TYPE);
END SHIPMENT_PKG;

/
SHOW ERROR;

create or replace package body SHIPMENT_PKG IS

	procedure addShipment (p_shipmentid IN SHIPMENT.shipmentid%TYPE,
		p_shipperid IN SHIPMENT.shipperid%TYPE,
		p_personid IN SHIPMENT.personid%TYPE,
		p_trackingid IN SHIPMENT.trackingid%TYPE,
		p_statusid IN SHIPMENT.statusid%TYPE) IS
	BEGIN
		insert into SHIPMENT values (p_shipmentid, p_shipperid, p_personid,
			p_trackingid, p_statusid);
	END;

	function addGenericShipment return NUMBER IS
		v_shipmentid NUMBER;
		v_shipperid NUMBER;
		v_personid NUMBER;
		v_trackingid NUMBER;
		v_statusid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericShipment');
		select SHIPMENT_SEQ.NEXTVAL into v_shipmentid from dual;
		v_shipperid := SHIPPER_PKG.addGenericShipper;
		v_personid := PERSON_PKG.addGenericPerson;
		v_trackingid := TRACKING_PKG.addGenericTracking;
		v_statusid := STATUS_PKG.addGenericStatus;
		addShipment (v_shipmentid, v_shipperid, v_personid, v_trackingid,
						v_statusid);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericShipment');
		return v_shipmentid;
	END;

	function getShipperId (p_shipmentid IN NUMBER) return NUMBER IS v_id NUMBER;
	BEGIN
		select ShipperId into v_id from SHIPMENT where shipmentid = p_shipmentid;
		return v_id;
	END;

	function getPersonid (p_shipmentid IN NUMBER) return NUMBER IS v_id NUMBER;
	BEGIN
		select Personid into v_id from SHIPMENT where shipmentid = p_shipmentid;
		return v_id;
	END;

	function getTrackingId (p_shipmentid IN NUMBER) return NUMBER IS v_id NUMBER;
	BEGIN
		select trackingid into v_id from SHIPMENT where shipmentid = p_shipmentid;
		return v_id;
	END;

	function getStatusId (p_shipmentid IN NUMBER) return NUMBER IS v_id NUMBER;
	BEGIN
		select statusid into v_id from SHIPMENT where shipmentid = p_shipmentid;
		return v_id;
	END;

	procedure deleteShipment (p_shipmentid IN SHIPMENT.shipmentid%TYPE) IS
		v_shipmentid NUMBER;
		v_shipperid NUMBER;
		v_personid NUMBER;
		v_trackingid NUMBER;
		v_statusid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteShipment; p_shipmentid; '||p_shipmentid);
		v_shipperid := getShipperId (p_shipmentid);
		v_personid := getPersonId (p_shipmentid);
		v_trackingid := getTrackingId (p_shipmentid);
		v_statusid := getStatusId (p_shipmentid);
		delete from SHIPMENT where shipmentid = p_shipmentid;
		SHIPPER_PKG.deleteShipper (v_shipperid);
		PERSON_PKG.deletePerson (v_personid);
		TRACKING_PKG.deleteTracking (v_trackingid);
		STATUS_PKG.deleteStatus (v_statusid);
		DBMS_OUTPUT.PUT_LINE('<<< deleteShipment; p_shipmentid; '||p_shipmentid);
	END;

	procedure showShipment (p_shipmentid IN SHIPMENT.shipmentid%TYPE) IS
		v_shipperid NUMBER;
		v_personid NUMBER;
		v_trackingid NUMBER;
		v_statusid NUMBER;
		CURSOR v_cursor IS select * from SHIPMENT where shipmentid = p_shipmentid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showShipment');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Shipment)' || v_str || 
				v_row.shipmentid || v_str || v_row.shipperid || v_str || 
				v_row.personid || v_str || v_row.trackingid || v_str || 
				v_row.statusid);
			v_shipperid := getShipperId (p_shipmentid);
			v_personid := getPersonId (p_shipmentid);
			v_trackingid := getTrackingId (p_shipmentid);
			v_statusid := getStatusId (p_shipmentid);
			SHIPPER_PKG.showShipper (v_shipperid);
			PERSON_PKG.showPerson (v_personid);
			TRACKING_PKG.showTracking (v_trackingid);
			STATUS_PKG.showStatus (v_statusid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showShipment');
	END;

END SHIPMENT_PKG;

/
SHOW ERROR;

