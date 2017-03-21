
create or replace package EMPLOYEE_PKG IS
	procedure addEmployee (p_employeeid IN EMPLOYEE.employeeid%TYPE,
					p_personid IN EMPLOYEE.personid%TYPE,
					p_locationid IN EMPLOYEE.locationid%TYPE,
					p_payrollid IN EMPLOYEE.payrollid%TYPE,
					p_comments IN EMPLOYEE.comments%TYPE);
	function addGenericEmployee return NUMBER;
	function getPersonId (p_employeeid IN EMPLOYEE.employeeid%TYPE) return NUMBER;
	function getLocationId (p_employeeid IN EMPLOYEE.employeeid%TYPE) return NUMBER;
	function getPayrollId (p_employeeid IN EMPLOYEE.employeeid%TYPE) return NUMBER;
	procedure deleteEmployee (p_employeeid IN EMPLOYEE.employeeid%TYPE);
	procedure showEmployee (p_employeeid IN EMPLOYEE.employeeid%TYPE);
END EMPLOYEE_PKG;

/
SHOW ERROR;

create or replace package body EMPLOYEE_PKG IS

	procedure addEmployee (p_employeeid IN EMPLOYEE.employeeid%TYPE,
					p_personid IN EMPLOYEE.personid%TYPE,
					p_locationid IN EMPLOYEE.locationid%TYPE,
					p_payrollid IN EMPLOYEE.payrollid%TYPE,
					p_comments IN EMPLOYEE.comments%TYPE) IS
	BEGIN
		insert into EMPLOYEE values (p_employeeid, p_personid, p_locationid, 
				p_payrollid, p_comments);
	END;

	function addGenericEmployee return NUMBER IS
		v_employeeid NUMBER;
		v_personid NUMBER;
		v_locationid NUMBER;
		v_payrollid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericEmployee');
		v_personid := PERSON_PKG.addGenericPerson;
		v_locationid := LOCATION_PKG.addGenericLocation;
		v_payrollid := PAYROLL_PKG.addGenericPayroll;
		select EMPLOYEE_SEQ.NEXTVAL into v_employeeid from dual;
		addEmployee (v_employeeid, v_personid, v_locationid, 
				v_payrollid, null);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericEmployee');
		return v_employeeid;
	END;

	function getPersonId (p_employeeid IN EMPLOYEE.employeeid%TYPE) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select PersonId into v_id from EMPLOYEE where employeeid = p_employeeid;
		return v_id;
	END;

	function getLocationId (p_employeeid IN EMPLOYEE.employeeid%TYPE) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select LocationId into v_id from EMPLOYEE where employeeid = p_employeeid;
		return v_id;
	END;

	function getPayrollId (p_employeeid IN EMPLOYEE.employeeid%TYPE) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select PayrollId into v_id from EMPLOYEE where employeeid = p_employeeid;
		return v_id;
	END;

	procedure deleteEmployee (p_employeeid IN EMPLOYEE.employeeid%TYPE) IS
		v_personid NUMBER;
		v_locationid NUMBER;
		v_payrollid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteEmployee; p_employeeid; '|| p_employeeid);
		v_personid := getPersonId (p_employeeid);
		v_locationid := getLocationId (p_employeeid);
		v_payrollid := getPayrollId (p_employeeid);
		delete from EMPLOYEE where employeeid = p_employeeid;
		PERSON_PKG.deletePerson (v_personid);
		LOCATION_PKG.deleteLocation (v_locationid);
		PAYROLL_PKG.deletePayroll (v_payrollid);
		DBMS_OUTPUT.PUT_LINE('<<< deleteEmployee; p_employeeid; '|| p_employeeid);
	END;

	procedure showEmployee (p_employeeid IN EMPLOYEE.employeeid%TYPE) IS
		v_personid NUMBER;
		v_locationid NUMBER;
		v_payrollid NUMBER;
		CURSOR v_cursor IS select * FROM EMPLOYEE where employeeid = p_employeeid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showEmployee');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Employee)' || v_str || v_row.employeeid);
			v_personid := getPersonId (p_employeeid);
			v_locationid := getLocationId (p_employeeid);
			v_payrollid := getPayrollId (p_employeeid);
			PERSON_PKG.showPerson (v_personid);
			LOCATION_PKG.showLocation (v_locationid);
			PAYROLL_PKG.showPayroll (v_payrollid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showEmployee');
	END;

END EMPLOYEE_PKG;

/
SHOW ERROR;

