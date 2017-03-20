
set echo on;
set serveroutput on;

create or replace package COLLECTIONLIST_PKG IS

	procedure addCollectionList (p_collectionid IN COLLECTIONLIST.collectionid%TYPE,
			p_barcodeid IN COLLECTIONLIST.barcodeid%TYPE);
	procedure addGenericCollectionList (p_collectionid IN COLLECTIONLIST.collectionid%TYPE,
					p_count IN NUMBER);
	procedure deleteCollectionList (p_collectionid IN COLLECTIONLIST.collectionid%TYPE);
	procedure showCollectionList (p_collectionid IN COLLECTIONLIST.collectionid%TYPE);
END COLLECTIONLIST_PKG;

/
SHOW ERROR;

create or replace package body COLLECTIONLIST_PKG IS

	procedure addCollectionList (p_collectionid in COLLECTIONLIST.collectionid%type,
				p_barcodeid IN COLLECTIONLIST.barcodeid%TYPE) IS
	BEGIN
		insert into COLLECTIONLIST values (p_collectionid, p_barcodeid);
	END;

	procedure addGenericCollectionList (p_collectionid IN COLLECTIONLIST.collectionid%TYPE,
					p_count IN NUMBER) IS
		v_barcodeid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericCollectionList');
		FOR cntr in 1 ..p_count 
		LOOP
			v_barcodeid := BARCODE_PKG.addGenericBarcode;
			addCollectionList (p_collectionid, v_barcodeid);
		END LOOP;
		DBMS_OUTPUT.PUT_LINE('<<< addGenericCollectionList');
	END;

	procedure deleteCollectionList (p_collectionid IN COLLECTIONLIST.collectionid%TYPE) IS
		CURSOR v_cursor IS select * from COLLECTIONLIST where collectionid = p_collectionid;
		v_row v_cursor%ROWTYPE;
		v_barcodeid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteCollectionList; p_collectionid; '||p_collectionid);
		OPEN v_cursor;
		delete from COLLECTIONLIST where collectionid = p_collectionid;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			v_barcodeid := v_row.barcodeid;
			BARCODE_PKG.deleteBarcode (v_barcodeid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< deleteCollectionList; p_collectionid; '||p_collectionid);
	END;

	procedure showCollectionList (p_collectionid IN COLLECTIONLIST.collectionid%TYPE) IS
		CURSOR v_cursor IS select * from COLLECTIONLIST where collectionid = p_collectionid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
		v_barcodeid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showCollectionList');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(CollectionList)' ||v_str || 
				v_row.collectionid || v_str || v_row.barcodeid);
			v_barcodeid := v_row.barcodeid;
			BARCODE_PKG.showBarcode (v_barcodeid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showCollectionList');
	END;

END COLLECTIONLIST_PKG;

/
SHOW ERROR;

