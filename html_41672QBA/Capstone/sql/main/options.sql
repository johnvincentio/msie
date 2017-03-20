
create or replace package OPTIONS_PKG IS
	procedure addOptions (p_optionsid IN OPTIONS.optionsid%TYPE,
					p_categoryid IN OPTIONS.categoryid%TYPE,
					p_name IN OPTIONS.name%TYPE,
					p_value IN OPTIONS.value%TYPE);
	function addGenericOptions return NUMBER;
	function getCategoryId (p_optionsid IN OPTIONS.optionsid%TYPE) return NUMBER;
	procedure deleteOptions (p_optionsid IN OPTIONS.optionsid%TYPE);
	procedure showOptions (p_optionsid IN OPTIONS.optionsid%TYPE);
END OPTIONS_PKG;

/
SHOW ERROR;

create or replace package body OPTIONS_PKG IS

	procedure addOptions (p_optionsid IN OPTIONS.optionsid%TYPE,
					p_categoryid IN OPTIONS.categoryid%TYPE,
					p_name IN OPTIONS.name%TYPE,
					p_value IN OPTIONS.value%TYPE) IS
	BEGIN
		insert into OPTIONS values (p_optionsid, p_categoryid, p_name, p_value);
	END;

	function addGenericOptions return NUMBER IS
		v_category_id NUMBER;
		v_optionsid NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericOptions');
		v_category_id := CATEGORY_PKG.addGenericCategory;
		FOR cntr in 1 .. 5
		LOOP
			select OPTIONS_SEQ.NEXTVAL into v_optionsid from dual;
			v_str := '_' || v_optionsid;
			addOptions (v_optionsid, v_category_id, 'Name' || v_str ,
						 'Value' || v_str);
		END LOOP;
		DBMS_OUTPUT.PUT_LINE('<<< addGenericOptions');
		return v_optionsid;
	END;

	function getCategoryId (p_optionsid IN OPTIONS.optionsid%TYPE) return NUMBER IS
		v_category_id NUMBER;
	BEGIN
		select categoryid into v_category_id from OPTIONS where optionsid = p_optionsid;
		return v_category_id;
	END;

	procedure deleteOptions (p_optionsid IN OPTIONS.optionsid%TYPE) IS
		v_category_id OPTIONS.categoryid%TYPE;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteOptions; p_optionsid; '||p_optionsid);
		v_category_id := getCategoryId (p_optionsid);
		delete from OPTIONS where optionsid = p_optionsid;
		CATEGORY_PKG.deleteCategory (v_category_id);
		DBMS_OUTPUT.PUT_LINE('<<< deleteOptions; p_optionsid; '||p_optionsid);
	END;

	procedure showOptions (p_optionsid IN OPTIONS.optionsid%TYPE) IS
		v_category_id OPTIONS.categoryid%TYPE;
		CURSOR v_cursor IS select * FROM OPTIONS where optionsid = p_optionsid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showOptions');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Options)' || v_str || v_row.optionsid);
			v_category_id := getCategoryId (p_optionsid);
			CATEGORY_PKG.showCategory (v_category_id);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showOptions');
	END;

END OPTIONS_PKG;

/
SHOW ERROR;

