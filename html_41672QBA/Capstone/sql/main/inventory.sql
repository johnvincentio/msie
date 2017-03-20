
set echo on;
set serveroutput on;

create or replace package INVENTORY_PKG IS

	procedure addInventory (p_locationid IN INVENTORY.locationid%TYPE,
			p_barcodeid IN INVENTORY.barcodeid%TYPE,
			p_quantity IN INVENTORY.quantity%TYPE,
			p_minqty IN INVENTORY.minqty%TYPE,
			p_maxqty IN INVENTORY.maxqty%TYPE,
			p_maintainminqty IN INVENTORY.maintainminqty%TYPE,
			p_maintainmaxqty IN INVENTORY.maintainmaxqty%TYPE,
			p_comments IN INVENTORY.comments%TYPE);
	procedure addGenericInventory (p_count1 IN NUMBER, p_count2 IN NUMBER);
	procedure deleteInventory;
	procedure showInventory;
END INVENTORY_PKG;

/
SHOW ERROR;

create or replace package body INVENTORY_PKG IS

	procedure addInventory (p_locationid IN INVENTORY.locationid%TYPE,
			p_barcodeid IN INVENTORY.barcodeid%TYPE,
			p_quantity IN INVENTORY.quantity%TYPE,
			p_minqty IN INVENTORY.minqty%TYPE,
			p_maxqty IN INVENTORY.maxqty%TYPE,
			p_maintainminqty IN INVENTORY.maintainminqty%TYPE,
			p_maintainmaxqty IN INVENTORY.maintainmaxqty%TYPE,
			p_comments IN INVENTORY.comments%TYPE) IS
	BEGIN
		insert into INVENTORY values (p_locationid, p_barcodeid,
			p_quantity, p_minqty, p_maxqty, p_maintainminqty,
			p_maintainmaxqty, p_comments);
	END;

	procedure addGenericInventory (p_count1 NUMBER, p_count2 NUMBER) IS
		v_locationid NUMBER;
		v_barcodeid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericInventory; counts ' ||
			p_count1 || ',' || p_count2);
		FOR cntr1 in 1 ..p_count1
		LOOP
			v_locationid := LOCATION_PKG.addGenericLocation;
			FOR cntr2 in 1 ..p_count2
			LOOP
				v_barcodeid := BARCODE_PKG.addGenericBarcode;
				addInventory (v_locationid, v_barcodeid,
					1, 3, 100, 5, 25, null);
			END LOOP;
		END LOOP;
		DBMS_OUTPUT.PUT_LINE('<<< addGenericInventory');
	END;

	procedure deleteInventory IS
		CURSOR v_cursor IS select * from INVENTORY order by locationid, barcodeid;
		v_row v_cursor%ROWTYPE;
		v_locationid NUMBER;
		v_barcodeid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteInventory');
		OPEN v_cursor;
		delete from INVENTORY;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			v_locationid := v_row.locationid;
			LOCATION_PKG.deleteLocation (v_locationid);
			v_barcodeid := v_row.barcodeid;
			BARCODE_PKG.deleteBarcode (v_barcodeid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< deleteInventory');
	END;

	procedure showInventory IS
		CURSOR v_cursor IS select * from INVENTORY order by locationid, barcodeid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
		v_locationid NUMBER;
		v_barcodeid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showInventory');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Inventory)' || v_str || 
				v_row.locationid || v_str || v_row.barcodeid || v_str ||
				v_row.quantity);
			v_locationid := v_row.locationid;
			v_barcodeid := v_row.barcodeid;
			LOCATION_PKG.showLocation (v_locationid);
			BARCODE_PKG.showBarcode (v_barcodeid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showInventory');
	END;

END INVENTORY_PKG;

/
SHOW ERROR;

