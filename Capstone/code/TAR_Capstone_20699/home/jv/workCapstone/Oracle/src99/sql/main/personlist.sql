set echo on;
set serveroutput on;

create or replace package PERSONLIST_PKG IS

	procedure addPersonList (p_personid IN PERSONLIST.personid%TYPE,
		p_lvl IN PERSONLIST.lvl%TYPE,
		p_firstname IN PERSONLIST.firstname%TYPE,
		p_middlename IN PERSONLIST.middlename%TYPE,
		p_lastname IN PERSONLIST.lastname%TYPE,
		p_line1 IN PERSONLIST.line1%TYPE,
		p_line2 IN PERSONLIST.line2%TYPE,
		p_line3 IN PERSONLIST.line3%TYPE,
		p_line4 IN PERSONLIST.line4%TYPE,
		p_line5 IN PERSONLIST.line5%TYPE,
		p_phone1 IN PERSONLIST.phone1%TYPE,
		p_phone2 IN PERSONLIST.phone2%TYPE,
		p_phone3 IN PERSONLIST.phone3%TYPE,
		p_email IN PERSONLIST.email%TYPE,
		p_fax IN PERSONLIST.fax%TYPE,
		p_comments IN PERSONLIST.comments%TYPE);

	procedure addGenericPersonList (p_personid IN PERSONLIST.personid%TYPE);
	procedure deletePersonList (p_personid IN PERSONLIST.personid%TYPE);
	procedure showPersonList (p_personid IN PERSONLIST.personid%TYPE);
END PERSONLIST_PKG;

/
SHOW ERROR;

create or replace package body PERSONLIST_PKG IS

	procedure addPersonList (p_personid IN PERSONLIST.personid%TYPE,
			p_lvl IN PERSONLIST.lvl%TYPE,
			p_firstname IN PERSONLIST.firstname%TYPE,
			p_middlename IN PERSONLIST.middlename%TYPE,
			p_lastname IN PERSONLIST.lastname%TYPE,
			p_line1 IN PERSONLIST.line1%TYPE,
			p_line2 IN PERSONLIST.line2%TYPE,
			p_line3 IN PERSONLIST.line3%TYPE,
			p_line4 IN PERSONLIST.line4%TYPE,
			p_line5 IN PERSONLIST.line5%TYPE,
			p_phone1 IN PERSONLIST.phone1%TYPE,
			p_phone2 IN PERSONLIST.phone2%TYPE,
			p_phone3 IN PERSONLIST.phone3%TYPE,
			p_email IN PERSONLIST.email%TYPE,
			p_fax IN PERSONLIST.fax%TYPE,
			p_comments IN PERSONLIST.comments%TYPE) Is
	BEGIN
		insert into PERSONLIST values (p_personid, p_lvl, p_firstname,
			p_middlename, p_lastname, p_line1, p_line2, p_line3,
			p_line4, p_line5, p_phone1, p_phone2, p_phone3,
			p_email, p_fax, p_comments);
	END;

	procedure addGenericPersonList (p_personid IN PERSONLIST.personid%TYPE) IS
		v_personid NUMBER;
		v_str VARCHAR2(30);
		v_lvl NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericPersonList');
		v_personid := p_personid;
		v_lvl := 1;
		v_str := '_' || v_personid || '_' || v_lvl;
		addPersonList (v_personid, v_lvl,
			'first'||v_str, 'middle'||v_str, 'last'||v_str,
			'line1'||v_str, 'line2'||v_str, 'line3'||v_str, 
			'line4'||v_str, 'line5'||v_str, 
			'phone1'||v_str, 'phone2'||v_str, 'phone3'||v_str, 
			'email'||v_str, 'fax'||v_str, 'comments'||v_str);
		v_lvl := 2;
		v_str := '_' || v_personid || '_' || v_lvl;
		addPersonList (v_personid, v_lvl,
			'first'||v_str, 'middle'||v_str, 'last'||v_str,
			'line1'||v_str, 'line2'||v_str, 'line3'||v_str, 
			'line4'||v_str, 'line5'||v_str, 
			'phone1'||v_str, 'phone2'||v_str, 'phone3'||v_str, 
			'email'||v_str, 'fax'||v_str, 'comments'||v_str);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericPersonList');
	END;

	procedure deletePersonList (p_personid IN PERSONLIST.personid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deletePersonList; p_personid; '||p_personid);
		delete from PERSONLIST where personid = p_personid;
		DBMS_OUTPUT.PUT_LINE('<<< deletePersonList; p_personid; '||p_personid);
	END;

	procedure showPersonList (p_personid IN PERSONLIST.personid%TYPE) IS
		CURSOR v_cursor IS select * FROM PERSONLIST where personid = p_personid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showPersonList');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(PersonList)' ||v_str || 
				v_row.personid || v_str || v_row.lvl || v_str ||
				v_row.firstname || v_str || v_row.middlename || v_str || 
				v_row.lastname || v_str ||
				v_row.line1 || v_str || v_row.line2 || v_str || 
				v_row.line3 || v_str || v_row.line4 || v_str || 
				v_row.line5 || v_str || 
				v_row.phone1 || v_str || v_row.phone2 || v_str || 
				v_row.phone3 || v_str || 
				v_row.email || v_str || v_row.fax || v_str || v_row.comments);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showPersonList');
	END;

END PERSONLIST_PKG;

/
SHOW ERROR;

