
set echo on;
set serveroutput on;

create or replace package CONTAINER_PKG IS

	procedure addContainer (p_containerid IN CONTAINER.containerid%TYPE,
			p_barcodeid IN CONTAINER.barcodeid%TYPE,
			p_quantity IN CONTAINER.quantity%TYPE,
			p_ordersid IN CONTAINER.ordersid%TYPE);
	function addGenericContainer (p_count1 IN NUMBER, p_count2 IN NUMBER)
		return NUMBER;
	procedure deleteContainer (p_containerid IN CONTAINER.containerid%TYPE);
	procedure showContainer (p_containerid IN CONTAINER.containerid%TYPE);
	function getOrdersId (p_containerid IN NUMBER) return NUMBER;
END CONTAINER_PKG;

/
SHOW ERROR;

create or replace package body CONTAINER_PKG IS

	procedure addContainer (p_containerid IN CONTAINER.containerid%TYPE,
			p_barcodeid IN CONTAINER.barcodeid%TYPE,
			p_quantity IN CONTAINER.quantity%TYPE,
			p_ordersid IN CONTAINER.ordersid%TYPE) IS
	BEGIN
		insert into CONTAINER values (p_containerid, p_barcodeid,
			p_quantity, p_ordersid);
	END;

	function addGenericContainer (p_count1 NUMBER, p_count2 NUMBER)
			return NUMBER IS
		v_containerid NUMBER;
		v_barcodeid NUMBER;
		v_quantity NUMBER;
		v_ordersid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericContainer; counts '||
			p_count1 || ',' || p_count2);
		v_quantity := 1;
		FOR cntr1 in 1 ..p_count1
		LOOP
			select CONTAINER_SEQ.NEXTVAL into v_containerid from dual;
			v_ordersid := ORDERS_PKG.addGenericOrders;
			FOR cntr2 in 1 ..p_count2
			LOOP
				v_barcodeid := BARCODE_PKG.addGenericBarcode;
				addContainer (v_containerid, v_barcodeid ,v_quantity, v_ordersid);
			END LOOP;
		END LOOP;
		DBMS_OUTPUT.PUT_LINE('<<< addGenericContainer');
		return v_containerid;
	END;

	procedure deleteContainer (p_containerid IN CONTAINER.containerid%TYPE) IS
		CURSOR v_cursor IS select * from CONTAINER where containerid = p_containerid;
		v_row v_cursor%ROWTYPE;
		v_barcodeid NUMBER;
		v_ordersid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteContainer; p_containerid; '||p_containerid);
		OPEN v_cursor;
		delete from CONTAINER where containerid = p_containerid;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			v_barcodeid := v_row.barcodeid;
			BARCODE_PKG.deleteBarcode (v_barcodeid);
			v_ordersid := v_row.ordersid;
		END LOOP;
		CLOSE v_cursor;
		ORDERS_PKG.deleteOrders(v_ordersid);
		DBMS_OUTPUT.PUT_LINE('<<< deleteContainer; p_containerid; '||p_containerid);
	END;

	procedure showContainer (p_containerid IN CONTAINER.containerid%TYPE) IS
		CURSOR v_cursor IS select * from CONTAINER where containerid = p_containerid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
		v_barcodeid NUMBER;
		v_ordersid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showContainer');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Container)' || v_str || 
				v_row.containerid || v_str || v_row.barcodeid || v_str ||
				v_row.quantity || v_str || v_row.ordersid);
			v_barcodeid := v_row.barcodeid;
			BARCODE_PKG.showBarcode (v_barcodeid);
			v_ordersid := v_row.ordersid;
			ORDERS_PKG.showOrders (v_ordersid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showContainer');
	END;

	function getOrdersId (p_containerid IN NUMBER) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select OrdersId into v_id from CONTAINER where containerid = p_containerid;
		return v_id;
	END;

END CONTAINER_PKG;

/
SHOW ERROR;

