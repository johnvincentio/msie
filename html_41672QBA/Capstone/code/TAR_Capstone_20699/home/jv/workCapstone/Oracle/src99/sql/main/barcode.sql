
create or replace package BARCODE_PKG IS
	procedure addBarcode (p_barcodeid IN BARCODE.barcodeid%TYPE,
		p_itemid IN BARCODE.itemid%TYPE,
		p_supplierid IN BARCODE.supplierid%TYPE,
		p_imageurl IN BARCODE.imageurl%TYPE,
		p_barcode IN BARCODE.barcode%TYPE);
	function addGenericBarcode return NUMBER;
	function getItemid (p_barcodeid IN NUMBER) return NUMBER;
	function getSupplierId (p_barcodeid IN NUMBER) return NUMBER;
	procedure deleteBarcode (p_barcodeid IN BARCODE.barcodeid%TYPE);
	procedure showBarcode (p_barcodeid IN BARCODE.barcodeid%TYPE);
END BARCODE_PKG;

/
SHOW ERROR;

create or replace package body BARCODE_PKG IS

	procedure addBarcode (p_barcodeid IN BARCODE.barcodeid%TYPE,
		p_itemid IN BARCODE.itemid%TYPE,
		p_supplierid IN BARCODE.supplierid%TYPE,
		p_imageurl IN BARCODE.imageurl%TYPE,
		p_barcode IN BARCODE.barcode%TYPE) IS
	BEGIN
		insert into BARCODE values (p_barcodeid, p_itemid, p_supplierid,
			p_imageurl, p_barcode);
	END;

	function addGenericBarcode return NUMBER IS
		v_barcodeid NUMBER;
		v_itemid NUMBER;
		v_supplierid NUMBER;
		v_base NUMBER;
		v_str VARCHAR2(30);
		v_url VARCHAR2(100);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericBarcode');
		select BARCODE_SEQ.NEXTVAL into v_barcodeid from dual;
		v_itemid := ITEM_PKG.addGenericItem;
		v_supplierid := SUPPLIER_PKG.addGenericSupplier;
		v_base := 100 + v_barcodeid;
		v_str := '_' || v_base;
		v_url := 'http://jv2:8080/Capstone/small/' || v_barcodeid || '.jpg';
		addBarcode (v_barcodeid, v_itemid, v_supplierid,
					v_url, 'Barcode' || v_str);
		COST_PKG.addGenericCost (v_barcodeid);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericBarcode');
		return v_barcodeid;
	END;

	function getItemid (p_barcodeid IN NUMBER) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select itemid into v_id from BARCODE where barcodeid = p_barcodeid;
		return v_id;
	END;

	function getSupplierId (p_barcodeid IN NUMBER) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select supplierid into v_id from BARCODE where barcodeid = p_barcodeid;
		return v_id;
	END;

	procedure deleteBarcode (p_barcodeid IN BARCODE.barcodeid%TYPE) IS
		v_itemid NUMBER;
		v_supplierid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteBarcode; p_barcodeid; '||p_barcodeid);
		v_itemid := getItemId (p_barcodeid);
		v_supplierid := getSupplierId (p_barcodeid);
		COST_PKG.deleteCost (p_barcodeid);
		delete from BARCODE where barcodeid = p_barcodeid;
		ITEM_PKG.deleteItem (v_itemid);
		SUPPLIER_PKG.deleteSupplier (v_supplierid);
		DBMS_OUTPUT.PUT_LINE('<<< deleteBarcode; p_barcodeid; '||p_barcodeid);
	END;

	procedure showBarcode (p_barcodeid IN BARCODE.barcodeid%TYPE) IS
		v_itemid NUMBER;
		v_supplierid NUMBER;
		CURSOR v_cursor IS select * from BARCODE where barcodeid = p_barcodeid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showBarcode');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Barcode)' || v_str || 
				v_row.barcodeid || v_str|| v_row.itemid || v_str ||
				v_row.supplierid || v_str || 
				v_row.imageurl || v_str|| v_row.barcode);
			v_itemid := getItemId (p_barcodeid);
			v_supplierid := getSupplierId (p_barcodeid);
			ITEM_PKG.showItem (v_itemid);
			SUPPLIER_PKG.showSupplier (v_supplierid);
			COST_PKG.showCost (p_barcodeid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showBarcode');
	END;

END BARCODE_PKG;

/
SHOW ERROR;

