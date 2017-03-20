
set echo on;
set serveroutput on;

create or replace package COLLECTION_PKG IS

	procedure addCollection (p_collectionid IN COLLECTION.collectionid%TYPE,
		p_description IN COLLECTION.description%TYPE);
	function addGenericCollection (p_count IN NUMBER) return NUMBER;
	procedure deleteCollection (p_collectionid IN COLLECTION.collectionid%TYPE);
	procedure showCollection (p_collectionid IN COLLECTION.collectionid%TYPE);
END COLLECTION_PKG;

/
SHOW ERROR;

create or replace package body COLLECTION_PKG IS

	procedure addCollection (p_collectionid IN COLLECTION.collectionid%TYPE,
		p_description IN COLLECTION.description%TYPE) IS
	BEGIN
		insert into COLLECTION values (p_collectionid, p_description);
	END;

	function addGenericCollection (p_count NUMBER) return NUMBER IS
		v_collectionid NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericCollection; count '||p_count);
		select COLLECTION_SEQ.NEXTVAL into v_collectionid from dual;
		v_str := '_' || v_collectionid;
		addCollection (v_collectionid, 'Description' || v_str);
		COLLECTIONLIST_PKG.addGenericCollectionList (v_collectionid, p_count);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericCollection');
		return v_collectionid;
	END;

	procedure deleteCollection (p_collectionid IN COLLECTION.collectionid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteCollection; p_collectionid; '||p_collectionid);
		COLLECTIONLIST_PKG.deleteCollectionList (p_collectionid);
		delete from COLLECTION where collectionid = p_collectionid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteCollection; p_collectionid; '||p_collectionid);
	END;

	procedure showCollection (p_collectionid IN COLLECTION.collectionid%TYPE) IS
		CURSOR v_cursor IS select * from COLLECTION where collectionid = p_collectionid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showCollection');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Collection)' ||v_str || 
				v_row.collectionid || v_str || v_row.description);
			COLLECTIONLIST_PKG.showCollectionList (p_collectionid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showCollection');
	END;

END COLLECTION_PKG;

/
SHOW ERROR;

