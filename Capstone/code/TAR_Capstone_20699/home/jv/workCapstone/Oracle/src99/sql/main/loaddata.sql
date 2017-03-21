set echo on;
set serveroutput on;

create or replace package LOADDATA_PKG IS
	function createCollection (p_count IN NUMBER) return NUMBER;
	procedure showCollection (p_id IN NUMBER);
	procedure deleteCollection (p_id IN NUMBER);
	procedure createMyCollection;
	procedure testCollection;

	function createContainer (p_count1 IN NUMBER, p_count2 IN NUMBER)
		return NUMBER;
	procedure showContainer (p_id IN NUMBER);
	procedure deleteContainer (p_id IN NUMBER);
	procedure test1Container;
	procedure createMyContainer;

	procedure createInventory (p_count1 IN NUMBER, p_count2 IN NUMBER);
	procedure showInventory;
	procedure deleteInventory;
	procedure testInventory;

	procedure countRecords;
	function countTable (p_name IN VARCHAR2) return NUMBER;
	procedure test1;

	procedure createUsers;
END LOADDATA_PKG;

/
SHOW ERROR;

create or replace package body LOADDATA_PKG IS

----------------------------
--		Users
----------------------------

	procedure createUsers is
		v_id NUMBER;
		v_empid NUMBER;
		v_eventid NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> createUsers');

		DBMS_OUTPUT.PUT_LINE('create Subsystem');
		select subsystem_seq.nextval into v_id from dual;
		SUBSYSTEM_PKG.addSubsystem(v_id,'Contracts','Contracts Department');
		select subsystem_seq.nextval into v_id from dual;
		SUBSYSTEM_PKG.addSubsystem(v_id,'Products','Products Department');
		select subsystem_seq.nextval into v_id from dual;
		SUBSYSTEM_PKG.addSubsystem(v_id,'Shipping','Shipping Department');

		DBMS_OUTPUT.PUT_LINE('create role');
		select role_seq.nextval into v_id from dual;
		ROLE_PKG.addRole(v_id,'Contracts','Contracts Management',1,7,'');
		select role_seq.nextval into v_id from dual;
		ROLE_PKG.addRole(v_id,'Products','Product Management',2,7,'');
		select role_seq.nextval into v_id from dual;
		ROLE_PKG.addRole(v_id,'Shipping','Shipping Management',3,7,'');

		DBMS_OUTPUT.PUT_LINE('create Security');
		select security_seq.nextval into v_id from dual;
		SECURITY_PKG.addSecurity(v_id,'all','pwd','a','b','c','d');
		select security_seq.nextval into v_id from dual;
		SECURITY_PKG.addSecurity(v_id,'contracts','pwd','a','b','c','d');
		select security_seq.nextval into v_id from dual;
		SECURITY_PKG.addSecurity(v_id,'products','pwd','a','b','c','d');
		select security_seq.nextval into v_id from dual;
		SECURITY_PKG.addSecurity(v_id,'shipping','pwd','a','b','c','d');

		DBMS_OUTPUT.PUT_LINE('create Employee/Users');
		v_empid := EMPLOYEE_PKG.addGenericEmployee;
		select users_seq.nextval into v_id from dual;
		USERS_PKG.addUsers(v_id,v_empid,1,'All');
		v_empid := EMPLOYEE_PKG.addGenericEmployee;
		select users_seq.nextval into v_id from dual;
		USERS_PKG.addUsers(v_id,v_empid,2,'Contracts');
		v_empid := EMPLOYEE_PKG.addGenericEmployee;
		select users_seq.nextval into v_id from dual;
		USERS_PKG.addUsers(v_id,v_empid,3,'Products');
		v_empid := EMPLOYEE_PKG.addGenericEmployee;
		select users_seq.nextval into v_id from dual;
		USERS_PKG.addUsers(v_id,v_empid,4,'Shipping');

		DBMS_OUTPUT.PUT_LINE('create Userrole');
		USERROLE_PKG.addUserrole(1,1);
		USERROLE_PKG.addUserrole(1,2);
		USERROLE_PKG.addUserrole(1,3);

		USERROLE_PKG.addUserrole(2,1);
		USERROLE_PKG.addUserrole(3,2);
		USERROLE_PKG.addUserrole(4,3);

		DBMS_OUTPUT.PUT_LINE('create Alert/Event');
		v_eventid := EVENT_PKG.addGenericEvent;
		select alert_seq.nextval into v_id from dual;
		ALERT_PKG.addAlert(v_id,v_eventid,1,1,2,'Alert 1');
		v_eventid := EVENT_PKG.addGenericEvent;
		select alert_seq.nextval into v_id from dual;
		ALERT_PKG.addAlert(v_id,v_eventid,2,4,6,'Alert 2');

		DBMS_OUTPUT.PUT_LINE('<<< createUsers');
		commit;
	END;

----------------------------
--		Collection
----------------------------

	function createCollection (p_count NUMBER) return NUMBER IS
		v_id NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> createCollection');
		v_id := COLLECTION_PKG.addGenericCollection (p_count);
		DBMS_OUTPUT.PUT_LINE('v_id '|| v_id);
		commit;
		return v_id;
	END;

	procedure showCollection (p_id IN NUMBER) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> showCollection');
		COLLECTION_PKG.showCollection (p_id);
		DBMS_OUTPUT.PUT_LINE('<<< showCollection');
		commit;
	END;

	procedure deleteCollection (p_id IN NUMBER) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> deleteCollection');
		COLLECTION_PKG.deleteCollection(p_id);
		DBMS_OUTPUT.PUT_LINE('<<< deleteCollection');
		commit;
	END;

	procedure testCollection IS
		v_id NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> testCollection');
		v_id := createCollection(5);
		showCollection (v_id);
		deleteCollection(v_id);
		countRecords;
		DBMS_OUTPUT.PUT_LINE('<<< testCollection');
		commit;
	END;

	procedure createMyCollection IS
		v_id NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> createMyCollection');
		v_id := createCollection(5);
		showCollection (v_id);
		countRecords;
		DBMS_OUTPUT.PUT_LINE('<<< createMyCollection');
		commit;
	END;

----------------------------
--		Container
----------------------------

	function createContainer (p_count1 NUMBER, p_count2 NUMBER)
			return NUMBER IS
		v_id NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> createContainer');
		v_id := CONTAINER_PKG.addGenericContainer (p_count1, p_count2);
		DBMS_OUTPUT.PUT_LINE('v_id '|| v_id);
		commit;
		DBMS_OUTPUT.PUT_LINE('<<< createContainer');
		return v_id;
	END;

	procedure showContainer (p_id IN NUMBER) IS
	BEGIN
		CONTAINER_PKG.showContainer (p_id);
		commit;
	END;

	procedure deleteContainer (p_id IN NUMBER) IS
	BEGIN
		CONTAINER_PKG.deleteContainer(p_id);
		commit;
	END;

	procedure test1Container IS
		v_id NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> test1Container');
		v_id := createContainer(3,5);
		showContainer (v_id);
		countRecords;
		deleteContainer(v_id);
		countRecords;
		DBMS_OUTPUT.PUT_LINE('<<< test1Container');
		commit;
	END;

	procedure createMyContainer IS
		v_id NUMBER;
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> createMyContainer');
		v_id := createContainer(3,5);
		showContainer (v_id);
		countRecords;
		DBMS_OUTPUT.PUT_LINE('<<< createMyContainer');
		commit;
	END;

----------------------------
--		Inventory
----------------------------

	procedure createInventory (p_count1 NUMBER, p_count2 NUMBER) IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> createInventory');
		INVENTORY_PKG.addGenericInventory (p_count1, p_count2);
		commit;
		DBMS_OUTPUT.PUT_LINE('<<< createInventory');
	END;

	procedure showInventory IS
	BEGIN
		INVENTORY_PKG.showInventory;
		commit;
	END;

	procedure deleteInventory IS
	BEGIN
		INVENTORY_PKG.deleteInventory;
		commit;
	END;

	procedure testInventory IS
	BEGIN
		DBMS_OUTPUT.PUT_LINE('>>> testInventory');
		createInventory(3, 5);
		showInventory;
		countRecords;
		deleteInventory;
		countRecords;
		DBMS_OUTPUT.PUT_LINE('<<< testInventory');
		commit;
	END;

---------------
--		helpers
---------------

	procedure countRecords IS
		CURSOR v_cursor IS 
			select table_name from user_tables order by table_name;
		v_row v_cursor%ROWTYPE;
		v_count NUMBER;
	BEGIN
--		DBMS_OUTPUT.PUT_LINE('>>> countRecords');
		OPEN v_cursor;
		LOOP
			FETCH v_cursor into v_row;
			EXIT WHEN v_cursor%NOTFOUND;
			v_count := countTable (v_row.table_name);
			DBMS_OUTPUT.PUT_LINE('(' || v_row.table_name || ') ' || v_count);
		END LOOP;
		CLOSE v_cursor;
--		DBMS_OUTPUT.PUT_LINE('<<< countRecords');
	END;

	function countTable (p_name IN VARCHAR2) return NUMBER IS
		TYPE cv_typ IS REF CURSOR;
		v_cursor cv_typ;
		v_count NUMBER;
	BEGIN
--		DBMS_OUTPUT.PUT_LINE('>>> countTable');
		OPEN v_cursor for 'select count(*) from ' || p_name;
		LOOP
			FETCH v_cursor into v_count;
			EXIT WHEN v_cursor%NOTFOUND;
		END LOOP;
		CLOSE v_cursor;
--		DBMS_OUTPUT.PUT_LINE('<<< countTable');
		return v_count;
	END;

---------------
-- generic test
---------------

	procedure test1 IS
		v_id NUMBER;
		v_id1 NUMBER;

	BEGIN
		DBMS_OUTPUT.PUT_LINE('Starting');
		DBMS_OUTPUT.PUT_LINE('Finished');
	END;

---------------
-- old stuff in here
---------------

/* did not work
		EXECUTE IMMEDIATE 
			'select count(*) into :v_id from ' || p_name;
*/

END LOADDATA_PKG;

/
SHOW ERROR;

