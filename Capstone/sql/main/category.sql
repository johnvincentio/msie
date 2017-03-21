
set echo on;
set serveroutput on;

create or replace package CATEGORY_PKG IS

	procedure addCategory (p_categoryid IN CATEGORY.categoryid%TYPE,
			p_name IN CATEGORY.name%TYPE);
	function addGenericCategory return NUMBER;
	procedure deleteCategory (p_categoryid IN CATEGORY.categoryid%TYPE);
	procedure showCategory (p_categoryid IN CATEGORY.categoryid%TYPE);
END CATEGORY_PKG;

/
SHOW ERROR;

create or replace package body CATEGORY_PKG IS

	procedure addCategory (p_categoryid IN CATEGORY.categoryid%TYPE,
			p_name IN CATEGORY.name%TYPE) IS
	BEGIN
		insert into CATEGORY values (p_categoryid, p_name);
	END;

	function addGenericCategory return NUMBER IS
		v_categoryid NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericCategory');
		select CATEGORY_SEQ.NEXTVAL into v_categoryid from dual;
		v_str := '_' || v_categoryid;
		addCategory (v_categoryid, 'name' || v_str);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericCategory');
		return v_categoryid;
	END;

	procedure deleteCategory (p_categoryid IN CATEGORY.categoryid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteCategory; p_categoryid; '||p_categoryid);
		delete from CATEGORY where categoryid = p_categoryid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteCategory; p_categoryid; '||p_categoryid);
	END;

	procedure showCategory (p_categoryid IN CATEGORY.categoryid%TYPE) IS
		CURSOR v_cursor IS
			select * FROM CATEGORY where categoryid = p_categoryid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showCategory');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Category)' || v_str || 
				v_row.categoryid || v_str || v_row.name);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showCategory');
	END;

END CATEGORY_PKG;

/
SHOW ERROR;

