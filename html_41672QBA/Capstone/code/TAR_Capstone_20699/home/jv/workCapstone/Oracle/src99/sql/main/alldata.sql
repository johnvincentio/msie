spool alldata;

set echo on;
set serveroutput on size 800000;

--alter session set SQL_TRACE=TRUE;

delete from PersonList;
delete from Person;
delete from Bank;

delete from Cost;

commit;

drop package loaddata_pkg;

drop package alert_pkg;
drop package bank_pkg;
drop package barcode_pkg;
drop package category_pkg;
drop package characteristic_pkg;
drop package collectionlist_pkg;
drop package collection_pkg;
drop package container_pkg;
drop package cost_pkg;
drop package employee_pkg;
drop package event_pkg;
drop package inventory_pkg;
drop package item_pkg;
drop package location_pkg;
drop package options_pkg;
drop package orders_pkg;
drop package payroll_pkg;
drop package person_pkg;
drop package personlist_pkg;
drop package role_pkg;
drop package security_pkg;
drop package shipment_pkg;
drop package shipper_pkg;
drop package status_pkg;
drop package subsystem_pkg;
drop package supplier_pkg;
drop package tracking_pkg;
drop package users_pkg;
drop package userrole_pkg;
drop package webservices_pkg;
drop package worktmp_pkg;
commit;

--quit;

@worktmp;
@security;
@subsystem;
@payroll;
@location;
@tracking;
@status;
@webservices;
@role;
@event;
@alert;
@personlist;
@person;
@bank;

@employee;
@users;
@userrole;

@cost;
@category;
@options;
@characteristic;
@item;

@shipper;
@shipment;
@supplier;
@orders;

@barcode;

@collectionlist;
@collection;

@container;
@inventory;
commit;

--quit;

@loaddata;
commit;

alter session set SQL_TRACE=TRUE;
exec LOADDATA_PKG.createUsers;
exec LOADDATA_PKG.createMyCollection;
exec LOADDATA_PKG.createMyContainer;

--exec LOADDATA_PKG.testCollection;
--exec LOADDATA_PKG.test1Container;
--exec LOADDATA_PKG.test1Inventory;
alter session set SQL_TRACE=FALSE;
commit;

spool off;

doc
Create views and run the selects
#

@allviews;
@allshow;

quit;

