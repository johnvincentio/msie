set echo on;
set serveroutput on;

create or replace package COST_PKG IS

	procedure addCost (p_barcodeid IN COST.barcodeid%TYPE,
		p_cost IN COST.cost%TYPE,
		p_stockvalue IN COST.stockvalue%TYPE,
		p_wholesaleprice IN COST.wholesaleprice%TYPE,
		p_discountprice1 IN COST.discountprice1%TYPE,
		p_discountprice2 IN COST.discountprice2%TYPE,
		p_discountprice3 IN COST.discountprice3%TYPE,
		p_discountprice4 IN COST.discountprice4%TYPE,
		p_discountprice5 IN COST.discountprice5%TYPE);
	procedure addGenericCost (p_barcodeid IN COST.barcodeid%TYPE);
	procedure deleteCost (p_barcodeid IN COST.barcodeid%TYPE);
	procedure showCost (p_barcodeid IN COST.barcodeid%TYPE);
END COST_PKG;

/
SHOW ERROR;

create or replace package body COST_PKG IS

	procedure addCost (p_barcodeid IN COST.barcodeid%TYPE,
		p_cost IN COST.cost%TYPE,
		p_stockvalue IN COST.stockvalue%TYPE,
		p_wholesaleprice IN COST.wholesaleprice%TYPE,
		p_discountprice1 IN COST.discountprice1%TYPE,
		p_discountprice2 IN COST.discountprice2%TYPE,
		p_discountprice3 IN COST.discountprice3%TYPE,
		p_discountprice4 IN COST.discountprice4%TYPE,
		p_discountprice5 IN COST.discountprice5%TYPE) IS
	BEGIN
		insert into Cost values (p_barcodeid, p_cost, p_stockvalue,
			p_wholesaleprice, p_discountprice1, p_discountprice2, 
			p_discountprice3, p_discountprice4, p_discountprice5);
	END;

	procedure addGenericCost (p_barcodeid IN COST.barcodeid%TYPE) IS
		v_base NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericCost');
		v_base := p_barcodeid + 100;
		addCost (p_barcodeid, 
			v_base+1, v_base+2, v_base+3, v_base+4, 
			v_base+5, v_base+6, v_base+7, v_base+8 );
		DBMS_OUTPUT.PUT_LINE('<<< addGenericCost');
	END;

	procedure deleteCost (p_barcodeid IN COST.barcodeid%TYPE) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteCost; p_barcodeid; '||p_barcodeid);
		delete from COST where barcodeid = p_barcodeid;
		DBMS_OUTPUT.PUT_LINE('<<< deleteCost; p_barcodeid; '||p_barcodeid);
	END;

	procedure showCost (p_barcodeid IN COST.barcodeid%TYPE) IS
		CURSOR v_cursor IS select * from COST where barcodeid = p_barcodeid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showCost');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Cost)' ||v_str || 
				v_row.barcodeid || v_str || 
				v_row.cost || v_str || v_row.stockvalue || v_str || 
				v_row.wholesaleprice || v_str ||
				v_row.discountprice1 || v_str || v_row.discountprice2 || v_str || 
				v_row.discountprice3 || v_str || v_row.discountprice4 || v_str || 
				v_row.discountprice5);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showCost');
	END;

END COST_PKG;

/
SHOW ERROR;

