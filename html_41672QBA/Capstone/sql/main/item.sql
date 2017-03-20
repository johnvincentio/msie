
set echo on;
set serveroutput on;

create or replace package ITEM_PKG IS
	procedure addItem (p_itemid IN ITEM.itemid%TYPE,
					p_name IN ITEM.name%TYPE,
					p_description IN ITEM.description%TYPE);
	function addGenericItem return NUMBER;
	procedure deleteItem (p_itemid IN ITEM.itemid%TYPE);
	procedure showItem (p_itemid IN ITEM.itemid%TYPE);
END ITEM_PKG;

/
SHOW ERROR;

create or replace package body ITEM_PKG IS

	procedure addItem (p_itemid IN ITEM.itemid%TYPE,
			p_name IN ITEM.name%TYPE,
			p_description IN ITEM.description%TYPE) IS
	BEGIN
		insert into ITEM values (p_itemid, p_name, p_description);
	END;

	function addGenericItem return NUMBER IS
		v_itemid NUMBER;
		v_tmp NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericItem');
		select ITEM_SEQ.NEXTVAL into v_itemid from dual;
		v_str := '_' || v_itemid;
		addItem (v_itemid, 'name' || v_str, 'description' || v_str);
		CHARACTERISTIC_PKG.addGenericCharacteristic (v_itemid);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericItem');
		return v_itemid;
	END;

	procedure deleteItem (p_itemid IN ITEM.itemid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteItem; p_itemid; '||p_itemid);
		CHARACTERISTIC_PKG.deleteCharacteristic (p_itemid);
		delete from ITEM where itemid = p_itemid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteItem; p_itemid; '||p_itemid);
	END;

	procedure showItem (p_itemid IN ITEM.itemid%TYPE) IS
		CURSOR v_cursor IS
			select * FROM ITEM where itemid = p_itemid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showItem');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Item)' || v_str || 
				v_row.itemid || v_str || v_row.name || v_str || 
				v_row.description);
			CHARACTERISTIC_PKG.showCharacteristic (p_itemid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showItem');
	END;

END ITEM_PKG;

/
SHOW ERROR;

