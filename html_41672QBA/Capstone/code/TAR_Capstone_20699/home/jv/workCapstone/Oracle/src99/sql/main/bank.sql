
create or replace package BANK_PKG IS
	procedure addBank (p_bankid IN BANK.bankid%TYPE,
		p_personid IN BANK.personid%TYPE,
		p_routing IN BANK.routing%TYPE,
		p_accountno IN BANK.accountno%TYPE);
	function addGenericBank return NUMBER;
	function getPersonId (p_bankid IN BANK.bankid%TYPE) return NUMBER;
	procedure deleteBank (p_bankid IN BANK.bankid%TYPE);
	procedure showBank (p_bankid IN BANK.bankid%TYPE);
END BANK_PKG;

/
SHOW ERROR;

create or replace package body BANK_PKG IS

	procedure addBank (p_bankid IN BANK.bankid%TYPE,
		p_personid IN BANK.personid%TYPE,
		p_routing IN BANK.routing%TYPE,
		p_accountno IN BANK.accountno%TYPE) IS
	BEGIN
		insert into BANK values (p_bankid, p_personid, p_routing, p_accountno);
	END;

	function addGenericBank return NUMBER IS
		v_person_id NUMBER;
		v_bankid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericBank');
		select BANK_SEQ.NEXTVAL into v_bankid from dual;
		v_person_id := PERSON_PKG.addGenericPerson;
		addBank (v_bankid, v_person_id, 'Routing', 'AccountNo');
		DBMS_OUTPUT.PUT_LINE('<<< addGenericBank');
		return v_bankid;
	END;

	function getPersonId (p_bankid IN BANK.bankid%TYPE) return NUMBER IS
		v_person_id NUMBER;
	BEGIN
		select personid into v_person_id from BANK where bankid = p_bankid;
		return v_person_id;
	END;

	procedure deleteBank (p_bankid IN BANK.bankid%TYPE) IS
		v_person_id PERSON.personid%TYPE;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteBank; p_bankid; '||p_bankid);
		v_person_id := getPersonId (p_bankid);
		delete from BANK where bankid = p_bankid;
		PERSON_PKG.deletePerson(v_person_id);
		DBMS_OUTPUT.PUT_LINE('<<< deleteBank; p_bankid; '||p_bankid);
	END;

	procedure showBank (p_bankid IN BANK.bankid%TYPE) IS
		v_person_id PERSON.personid%TYPE;
		CURSOR v_cursor IS
			SELECT * FROM BANK where bankid = p_bankid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showBank');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Bank)' || v_str || v_row.bankid);
			v_person_id := getPersonId (p_bankid);
			PERSON_PKG.showPerson (v_person_id);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showBank');
	END;

END BANK_PKG;

/
SHOW ERROR;

