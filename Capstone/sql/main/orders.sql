
create or replace package ORDERS_PKG IS
	procedure addOrders (p_ordersid IN ORDERS.ordersid%TYPE,
		p_supplierid IN ORDERS.supplierid%TYPE,
		p_shipmentid IN ORDERS.shipmentid%TYPE,
		p_usersid IN ORDERS.usersid%TYPE,
		p_statusid IN ORDERS.statusid%TYPE,
		p_alertid IN ORDERS.alertid%TYPE,
		p_supplierordersid IN ORDERS.supplierordersid%TYPE,
		p_shipdate IN ORDERS.shipdate%TYPE,
		p_orderdate IN ORDERS.orderdate%TYPE);
	function addGenericOrders return NUMBER;
	function getSupplierId (p_ordersid IN NUMBER) return NUMBER;
	function getShipmentId (p_ordersid IN NUMBER) return NUMBER;
	function getUsersId (p_ordersid IN NUMBER) return NUMBER;
	function getStatusId (p_ordersid IN NUMBER) return NUMBER;
	function getAlertId (p_ordersid IN NUMBER) return NUMBER;
	procedure deleteOrders (p_ordersid IN ORDERS.ordersid%TYPE);
	procedure showOrders (p_ordersid IN ORDERS.ordersid%TYPE);
END ORDERS_PKG;

/
SHOW ERROR;

create or replace package body ORDERS_PKG IS

	procedure addOrders (p_ordersid IN ORDERS.ordersid%TYPE,
		p_supplierid IN ORDERS.supplierid%TYPE,
		p_shipmentid IN ORDERS.shipmentid%TYPE,
		p_usersid IN ORDERS.usersid%TYPE,
		p_statusid IN ORDERS.statusid%TYPE,
		p_alertid IN ORDERS.alertid%TYPE,
		p_supplierordersid IN ORDERS.supplierordersid%TYPE,
		p_shipdate IN ORDERS.shipdate%TYPE,
		p_orderdate IN ORDERS.orderdate%TYPE) IS
	BEGIN
		insert into ORDERS values (p_ordersid, p_supplierid,
			p_shipmentid, p_usersid,
			p_statusid, p_alertid, p_supplierordersid,
			p_shipdate, p_orderdate);
	END;

	function addGenericOrders return NUMBER IS
		v_ordersid NUMBER;
		v_supplierid NUMBER;
		v_shipmentid NUMBER;
		v_usersid NUMBER;
		v_statusid NUMBER;
		v_alertid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericOrders');
		select ORDERS_SEQ.NEXTVAL into v_ordersid from dual;
		v_supplierid := SUPPLIER_PKG.addGenericSupplier;
		v_shipmentid := SHIPMENT_PKG.addGenericShipment;
		v_usersid := USERS_PKG.addGenericUsers;
		v_statusid := STATUS_PKG.addGenericStatus;
		v_alertid := ALERT_PKG.addGenericAlert;
		addOrders (v_ordersid, v_supplierid, v_shipmentid, v_usersid,
				v_statusid, v_alertid, 1, null, null);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericOrders');
		return v_ordersid;
	END;

	function getSupplierId (p_ordersid IN NUMBER) return NUMBER IS v_id NUMBER;
	BEGIN
		select supplierid into v_id from ORDERS where ordersid = p_ordersid;
		return v_id;
	END;

	function getShipmentId (p_ordersid IN NUMBER) return NUMBER IS v_id NUMBER;
	BEGIN
		select shipmentid into v_id from ORDERS where ordersid = p_ordersid;
		return v_id;
	END;

	function getUsersId (p_ordersid IN NUMBER) return NUMBER IS v_id NUMBER;
	BEGIN
		select usersid into v_id from ORDERS where ordersid = p_ordersid;
		return v_id;
	END;

	function getStatusId (p_ordersid IN NUMBER) return NUMBER IS v_id NUMBER;
	BEGIN
		select statusid into v_id from ORDERS where ordersid = p_ordersid;
		return v_id;
	END;

	function getAlertId (p_ordersid IN NUMBER) return NUMBER IS v_id NUMBER;
	BEGIN
		select alertid into v_id from ORDERS where ordersid = p_ordersid;
		return v_id;
	END;

	procedure deleteOrders (p_ordersid IN ORDERS.ordersid%TYPE) IS
		v_supplierid NUMBER;
		v_shipmentid NUMBER;
		v_usersid NUMBER;
		v_statusid NUMBER;
		v_alertid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteOrders; p_ordersid; '||p_ordersid);
		v_supplierid := getSupplierId (p_ordersid);
		v_shipmentid := getShipmentId (p_ordersid);
		v_usersid := getUsersId (p_ordersid);
		v_statusid := getStatusId (p_ordersid);
		v_alertid := getAlertId (p_ordersid);
		delete from ORDERS where ordersid = p_ordersid;
		SUPPLIER_PKG.deleteSupplier (v_supplierid);
		SHIPMENT_PKG.deleteShipment (v_shipmentid);
		USERS_PKG.deleteUsers (v_usersid);
		STATUS_PKG.deleteStatus (v_statusid);
		ALERT_PKG.deleteAlert (v_alertid);
		DBMS_OUTPUT.PUT_LINE('<<< deleteOrders; p_ordersid; '||p_ordersid);
	END;

	procedure showOrders (p_ordersid IN ORDERS.ordersid%TYPE) IS
		v_supplierid NUMBER;
		v_shipmentid NUMBER;
		v_usersid NUMBER;
		v_statusid NUMBER;
		v_alertid NUMBER;
		CURSOR v_cursor IS select * from ORDERS where ordersid = p_ordersid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showOrders');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Orders)' || v_str || 
				v_row.ordersid || v_str || v_row.supplierid || v_str || 
				v_row.shipmentid || v_str || v_row.usersid || v_str || 
				v_row.statusid || v_str || v_row.alertid);
			v_supplierid := getSupplierId (p_ordersid);
			v_shipmentid := getShipmentId (p_ordersid);
			v_usersid := getUsersId (p_ordersid);
			v_statusid := getStatusId (p_ordersid);
			v_alertid := getAlertId (p_ordersid);
			SUPPLIER_PKG.showSupplier (v_supplierid);
			SHIPMENT_PKG.showShipment (v_shipmentid);
			USERS_PKG.showUsers (v_usersid);
			STATUS_PKG.showStatus (v_statusid);
			ALERT_PKG.showAlert (v_alertid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showOrders');
	END;

END ORDERS_PKG;

/
SHOW ERROR;

