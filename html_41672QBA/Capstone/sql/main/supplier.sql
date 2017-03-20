
create or replace package SUPPLIER_PKG IS
	procedure addSupplier (p_supplierid IN SUPPLIER.supplierid%TYPE,
		p_person_id IN SUPPLIER.personid%TYPE,
		p_bank_id IN SUPPLIER.bankid%TYPE,
		p_shipper_id IN SUPPLIER.shipperid%TYPE,
		p_shipperreturns_id IN SUPPLIER.shipperreturnsid%TYPE,
		p_billingaccountid IN SUPPLIER.billingaccountid%TYPE,
		p_companyname IN SUPPLIER.companyname%TYPE,
		p_maxowed IN SUPPLIER.maxowed%TYPE,
		p_currentowed IN SUPPLIER.currentowed%TYPE,
		p_maxaccountsreceivable IN SUPPLIER.maxaccountsreceivable%TYPE,
		p_creditrating IN SUPPLIER.creditrating%TYPE,
		p_creditterms IN SUPPLIER.creditterms%TYPE,
		p_comments IN SUPPLIER.comments%TYPE);
	function addGenericSupplier return NUMBER;
	function getPersonId (p_supplierid IN NUMBER) return NUMBER;
	function getWebServicesId (p_supplierid IN NUMBER) return NUMBER;
	function getBankId (p_supplierid IN NUMBER) return NUMBER;
	function getShippingId (p_supplierid IN NUMBER) return NUMBER;
	function getShippingreturnsId (p_supplierid IN NUMBER) return NUMBER;
	procedure deleteSupplier (p_supplierid IN SUPPLIER.supplierid%TYPE);
	procedure showSupplier (p_supplierid IN SUPPLIER.supplierid%TYPE);
END SUPPLIER_PKG;

/
SHOW ERROR;

create or replace package body SUPPLIER_PKG IS

	procedure addSupplier (p_supplierid IN SUPPLIER.supplierid%TYPE,
		p_person_id IN SUPPLIER.personid%TYPE,
		p_bank_id IN SUPPLIER.bankid%TYPE,
		p_shipper_id IN SUPPLIER.shipperid%TYPE,
		p_shipperreturns_id IN SUPPLIER.shipperreturnsid%TYPE,
		p_billingaccountid IN SUPPLIER.billingaccountid%TYPE,
		p_companyname IN SUPPLIER.companyname%TYPE,
		p_maxowed IN SUPPLIER.maxowed%TYPE,
		p_currentowed IN SUPPLIER.currentowed%TYPE,
		p_maxaccountsreceivable IN SUPPLIER.maxaccountsreceivable%TYPE,
		p_creditrating IN SUPPLIER.creditrating%TYPE,
		p_creditterms IN SUPPLIER.creditterms%TYPE,
		p_comments IN SUPPLIER.comments%TYPE) IS
		v_web_id NUMBER;
	BEGIN
		v_web_id := WEBSERVICES_PKG.addWebservices;
		insert into SUPPLIER values (p_supplierid, p_person_id, v_web_id,
			p_bank_id, p_shipper_id, p_shipperreturns_id,
			p_billingaccountid, p_companyname, p_maxowed, p_currentowed,
			p_maxaccountsreceivable, p_creditrating,
			p_creditterms, p_comments);
	END;

	function addGenericSupplier return NUMBER IS
		v_supplierid NUMBER;
		v_person_id NUMBER;
		v_bank_id NUMBER;
		v_shipper_id NUMBER;
		v_shipperreturns_id NUMBER;
		v_base NUMBER;
		v_str VARCHAR2(30);
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> addGenericSupplier');
		v_person_id := PERSON_PKG.addGenericPerson;
		v_bank_id := BANK_PKG.addGenericBank;
		v_shipper_id := SHIPPER_PKG.addGenericShipper;
		v_shipperreturns_id := SHIPPER_PKG.addGenericShipper;

		select SUPPLIER_SEQ.NEXTVAL into v_supplierid from dual;
		v_base := 100 + v_supplierid;
		v_str := '_' || v_supplierid;
		addSupplier (v_supplierid, v_person_id, v_bank_id, v_shipper_id,
					v_shipperreturns_id,
					v_base+1, 'Company' || v_str,
					v_base+2, v_base+3, v_base+4, 
					'R' || v_str, 'CreditTerms' || v_str,
					'CreditComments' || v_str);
		DBMS_OUTPUT.PUT_LINE('<<< addGenericSupplier');
		return v_supplierid;
	END;

	function getPersonId (p_supplierid IN NUMBER) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select personid into v_id from SUPPLIER where supplierid = p_supplierid;
		return v_id;
	END;

	function getWebServicesId (p_supplierid IN NUMBER) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select webservicesid into v_id from SUPPLIER where supplierid = p_supplierid;
		return v_id;
	END;

	function getBankId (p_supplierid IN NUMBER) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select bankid into v_id from SUPPLIER where supplierid = p_supplierid;
		return v_id;
	END;

	function getShippingId (p_supplierid IN NUMBER) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select shipperid into v_id from SUPPLIER where supplierid = p_supplierid;
		return v_id;
	END;

	function getShippingreturnsId (p_supplierid IN NUMBER) return NUMBER IS
		v_id NUMBER;
	BEGIN
		select shipperreturnsid into v_id from SUPPLIER where supplierid = p_supplierid;
		return v_id;
	END;

	procedure deleteSupplier (p_supplierid IN SUPPLIER.supplierid%TYPE) IS
		v_person_id NUMBER;
		v_web_id NUMBER;
		v_bank_id NUMBER;
		v_shipper_id NUMBER;
		v_shipperreturns_id NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteSupplier; p_supplierid; '||p_supplierid);
		v_person_id := getPersonId (p_supplierid);
		v_web_id := getWebServicesId (p_supplierid);
		v_bank_id := getBankId (p_supplierid);
		v_shipper_id := getShippingId (p_supplierid);
		v_shipperreturns_id := getShippingreturnsId (p_supplierid);
		delete from SUPPLIER where supplierid = p_supplierid;
		WEBSERVICES_PKG.deleteWebservices(v_web_id);
		PERSON_PKG.deletePerson(v_person_id);
		BANK_PKG.deleteBank(v_bank_id);
		SHIPPER_PKG.deleteShipper(v_shipper_id);
		SHIPPER_PKG.deleteShipper(v_shipperreturns_id);
		DBMS_OUTPUT.PUT_LINE('<<< deleteSupplier; p_supplierid; '||p_supplierid);
	END;

	procedure showSupplier (p_supplierid IN SUPPLIER.supplierid%TYPE) IS
		v_person_id NUMBER;
		v_web_id NUMBER;
		v_bank_id NUMBER;
		v_shipper_id NUMBER;
		v_shipperreturns_id NUMBER;
		CURSOR v_cursor IS select * from SUPPLIER where supplierid = p_supplierid;
		v_row v_cursor%ROWTYPE;
		v_str VARCHAR2(1) := ':';
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showSupplier');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			DBMS_OUTPUT.PUT_LINE('(Supplier)' || v_str || v_row.supplierid);
			v_person_id := getPersonId (p_supplierid);
			v_web_id := getWebServicesId (p_supplierid);
			v_bank_id := getBankId (p_supplierid);
			v_shipper_id := getShippingId (p_supplierid);
			v_shipperreturns_id := getShippingreturnsId (p_supplierid);
			WEBSERVICES_PKG.showWebservices (v_web_id);
			PERSON_PKG.showPerson (v_person_id);
			BANK_PKG.showBank(v_bank_id);
			SHIPPER_PKG.showShipper(v_shipper_id);
			SHIPPER_PKG.showShipper(v_shipperreturns_id);
		END LOOP;
		CLOSE v_cursor;
		DBMS_OUTPUT.PUT_LINE('<<< showSupplier');
	END;

END SUPPLIER_PKG;

/
SHOW ERROR;

