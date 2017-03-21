
create or replace package PAYROLL_PKG IS
	procedure addPayroll (p_payrollid IN PAYROLL.payrollid%TYPE);
	function addGenericPayroll return NUMBER;
	procedure deletePayroll (p_payrollid IN PAYROLL.payrollid%TYPE);
	procedure showPayroll (p_payrollid IN PAYROLL.payrollid%TYPE);
END PAYROLL_PKG;

/
SHOW ERROR;

create or replace package body PAYROLL_PKG IS

	procedure addPayroll (p_payrollid IN PAYROLL.payrollid%TYPE) IS
	BEGIN
		insert into PAYROLL values (p_payrollid);
	END;

	function addGenericPayroll return NUMBER IS
		v_payrollid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericPayroll');
		select PAYROLL_SEQ.NEXTVAL into v_payrollid from dual;
		addPayroll (v_payrollid);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericPayroll');
		return v_payrollid;
	END;

	procedure deletePayroll (p_payrollid IN PAYROLL.payrollid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deletePayroll; p_payrollid; '||p_payrollid);
		delete from PAYROLL where payrollid = p_payrollid;
		DBMS_OUTPUT.PUT_LINE('<<< deletePayroll; p_payrollid; '||p_payrollid);
	END;

	procedure showPayroll (p_payrollid IN PAYROLL.payrollid%TYPE) IS
		CURSOR v_cursor IS SELECT * FROM PAYROLL where payrollid = p_payrollid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showPayroll');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Payroll)' || v_str || v_row.payrollid);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showPayroll');
	END;

END PAYROLL_PKG;

/
SHOW ERROR;

