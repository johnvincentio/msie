
create or replace package CHARACTERISTIC_PKG IS
	procedure addCharacteristic (p_itemid IN CHARACTERISTIC.itemid%TYPE,
				p_optionsid IN CHARACTERISTIC.optionsid%TYPE);
	procedure addGenericCharacteristic (p_itemid IN CHARACTERISTIC.itemid%TYPE);
	procedure deleteCharacteristic (p_itemid IN CHARACTERISTIC.itemid%TYPE);
	procedure showCharacteristic (p_itemid IN CHARACTERISTIC.itemid%TYPE);
END CHARACTERISTIC_PKG;

/
SHOW ERROR;

create or replace package body CHARACTERISTIC_PKG IS

	procedure addCharacteristic (p_itemid IN CHARACTERISTIC.itemid%TYPE,
				p_optionsid IN CHARACTERISTIC.optionsid%TYPE) IS
	BEGIN
		insert into CHARACTERISTIC values (p_itemid, p_optionsid);
	END;

	procedure addGenericCharacteristic (p_itemid IN CHARACTERISTIC.itemid%TYPE) IS
		v_options_id NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericCharacteristic');
		FOR cntr in 1 .. 3
		LOOP
			v_options_id := OPTIONS_PKG.addGenericOptions;
			addCharacteristic (p_itemid, v_options_id);
		END LOOP;
		DBMS_OUTPUT.PUT_LINE('<<< addGenericCharacteristic');
	END;

	procedure deleteCharacteristic (p_itemid IN CHARACTERISTIC.itemid%TYPE) is
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteCharacteristic; p_itemid; '||p_itemid);
--		OPTIONS_PKG.deleteOptions (p_itemid);
		delete from CHARACTERISTIC where itemid = p_itemid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteCharacteristic; p_itemid; '||p_itemid);
	END;

	procedure showCharacteristic (p_itemid IN CHARACTERISTIC.itemid%TYPE) IS
		CURSOR v_cursor IS select * FROM CHARACTERISTIC where itemid = p_itemid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showCharacteristic');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Characteristic)' || v_str || v_row.itemid);
			OPTIONS_PKG.showOptions (p_itemid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showCharacteristic');
	END;

END CHARACTERISTIC_PKG;

/
SHOW ERROR;


