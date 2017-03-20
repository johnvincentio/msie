
spool all;
set echo on;

--
-- I like a clean slate. Make it so.
--
--
-- Must first remove the referential constraints
--

alter table Alert drop Constraint FK_Alert1;
alter table Alert drop Constraint FK_Alert2;

alter table Bank drop Constraint FK_Bank;

alter table Barcode drop Constraint FK_Barcode1;
alter table Barcode drop Constraint FK_Barcode2;

alter table BidRequest drop Constraint FK_BidRequest1;
alter table BidRequest drop Constraint FK_BidRequest2;
alter table BidRequest drop Constraint FK_BidRequest3;
alter table BidRequest drop Constraint FK_BidRequest4;

alter table BidOffered drop Constraint FK_BidOffered1;
alter table BidOffered drop Constraint FK_BidOffered2;
alter table BidOffered drop Constraint FK_BidOffered3;

alter table Characteristic drop Constraint FK_Characteristic1;
alter table Characteristic drop Constraint FK_Characteristic2;

alter table CollectionList drop Constraint FK_CollectionList1;
alter table CollectionList drop Constraint FK_CollectionList2;

alter table Container drop Constraint FK_Container1;
alter table Container drop Constraint FK_Container2;

alter table Cost drop Constraint FK_Cost;

alter table Customer drop Constraint FK_Customer1;
alter table Customer drop Constraint FK_Customer2;
alter table Customer drop Constraint FK_Customer3;

alter table CustomerOrderList drop Constraint FK_CustomerOrderList1;
alter table CustomerOrderList drop Constraint FK_CustomerOrderList2;

alter table CustomerOrder drop Constraint FK_CustomerOrder1;
alter table CustomerOrder drop Constraint FK_CustomerOrder2;
alter table CustomerOrder drop Constraint FK_CustomerOrder3;

alter table Employee drop Constraint FK_Employee1;
alter table Employee drop Constraint FK_Employee2;
alter table Employee drop Constraint FK_Employee3;

alter table InstalledSystem drop Constraint FK_InstalledSystem1;
alter table InstalledSystem drop Constraint FK_InstalledSystem2;

alter table Inventory drop Constraint FK_Inventory1;
alter table Inventory drop Constraint FK_Inventory2;

alter table Invoice drop Constraint FK_Invoice;

alter table InvoiceList drop Constraint FK_InvoiceList1;
alter table InvoiceList drop Constraint FK_InvoiceList2;
alter table InvoiceList drop Constraint FK_InvoiceList3;
alter table InvoiceList drop Constraint FK_InvoiceList4;
alter table InvoiceList drop Constraint FK_InvoiceList5;

alter table Options drop Constraint FK_Options;

alter table Orders drop Constraint FK_Orders1;
alter table Orders drop Constraint FK_Orders2;
alter table Orders drop Constraint FK_Orders3;
alter table Orders drop Constraint FK_Orders4;
alter table Orders drop Constraint FK_Orders5;

alter table PersonList drop Constraint FK_PersonList;

alter table Role drop Constraint FK_Role;

alter table Shipment drop Constraint FK_Shipment1;
alter table Shipment drop Constraint FK_Shipment2;
alter table Shipment drop Constraint FK_Shipment3;
alter table Shipment drop Constraint FK_Shipment4;

alter table Shipper drop Constraint FK_Shipper1;
alter table Shipper drop Constraint FK_Shipper2;

alter table Supplier drop Constraint FK_Supplier1;
alter table Supplier drop Constraint FK_Supplier2;
alter table Supplier drop Constraint FK_Supplier3;
alter table Supplier drop Constraint FK_Supplier4;
alter table Supplier drop Constraint FK_Supplier5;

alter table SupplierOrder drop Constraint FK_SupplierOrder1;
alter table SupplierOrder drop Constraint FK_SupplierOrder2;
alter table SupplierOrder drop Constraint FK_SupplierOrder3;
alter table SupplierOrder drop Constraint FK_SupplierOrder4;
alter table SupplierOrder drop Constraint FK_SupplierOrder5;
alter table SupplierOrder drop Constraint FK_SupplierOrder6;

alter table UserRole drop Constraint FK_UserRole1;
alter table UserRole drop Constraint FK_UserRole2;

alter table Users drop Constraint FK_Users1;
alter table Users drop Constraint FK_Users2;

--
-- Drop all indexes
--

drop index BidRequest1;
drop index BidOffered1;
drop index Employee1;
drop index Orders1;
drop index SupplierOrder1;

--
-- Drop Sequences / Triggers
--

drop sequence Alert_seq;
drop sequence Bank_seq;
drop sequence Barcode_seq;
drop sequence Category_seq;
drop sequence Collection_seq;
drop sequence Container_seq;

drop trigger Customer_trigger;
drop sequence Customer_seq;

drop trigger CustomerOrder_trigger;
drop sequence CustomerOrder_seq;

drop sequence Employee_seq;
drop sequence Event_seq;
drop sequence Item_seq;

drop trigger Invoice_trigger;
drop sequence Invoice_seq;

drop trigger InvoiceList_trigger;
drop sequence InvoiceList_seq;

drop sequence Location_seq;

drop trigger Manufacturing_trigger;
drop sequence Manufacturing_seq;

drop trigger ManufacturingProcess_trigger;
drop sequence ManufacturingProcess_seq;

drop sequence Options_seq;
drop sequence Orders_seq;

drop trigger Payment_trigger;
drop sequence Payment_seq;

drop sequence Payroll_seq;
drop sequence Person_seq;
drop sequence Role_seq;
drop sequence Security_seq;
drop sequence Shipment_seq;
drop sequence Shipper_seq;
drop sequence Status_seq;
drop sequence Subsystem_seq;
drop sequence Supplier_seq;

drop trigger SupplierOrder_trigger;
drop sequence SupplierOrder_seq;

drop sequence Users_seq;

drop sequence Tracking_seq;
drop sequence WebServices_seq;

drop sequence Worktmp_seq;

--
-- Now drop all tables
--

drop table Alert;
drop table Bank;
drop table Barcode;
drop table BidOffered;
drop table BidRequest;
drop table Category;
drop table Characteristic;
drop table Collection;
drop table CollectionList;
drop table CommentsList;
drop table Container;
drop table Cost;
drop table CustomerOrderList;
drop table CustomerOrder;
drop table Customer;
drop table Employee;
drop table Event;
drop table InstalledSystem;
drop table Inventory;
drop table Invoice;
drop table InvoiceList;
drop table Item;
drop table Location;
drop table Manufacturing;
drop table ManufacturingProcess;
drop table Options;
drop table Orders;
drop table Payment;
drop table Payroll;
drop table Person;
drop table PersonList;
drop table Role;
drop table Security;
drop table Shipment;
drop table Shipper;
drop table Status;
drop table Subsystem;
drop table Supplier;
drop table SupplierOrder;
drop table Tracking;
drop table UserRole;
drop table Users;
drop table WebServices;
drop table Worktmp;

select table_name from user_tables order by table_name;
select table_name,index_name from user_indexes order by table_name,index_name;
select sequence_name from user_sequences order by sequence_name;
select trigger_name from user_triggers order by trigger_name;

--quit;

--
-- Define some hard to define tables - will become clearer in due course
--

create table WebServices (
	WebservicesId			number,
		Constraint PK_WebServices Primary Key(WebservicesId)
);

create table Manufacturing (
	Id			number,
		Constraint PK_Manufacturing Primary Key(Id)
);

create table ManufacturingProcess (
	Id			number,
		Constraint PK_ManufacturingProcess Primary Key(Id)
);

create table Payroll (
	PayrollId			number,
		Constraint PK_Payroll Primary Key(PayrollId)
);

create table Payment (
	Id				number,
	PaymentType		number,
	PaymentNumber	number,
	AccountingID	number,
		Constraint PK_Payment Primary Key(Id)
);

--
-- The following may be useful, may even become necessary
--

create table CommentsList (
	Id			number,
	Lvl			number,
	Comments	varchar2(255),
		Constraint PK_CommentsList Primary Key (Id, Lvl)
);

--
-- Define System Status
--

create table Status (
	StatusId	number,
	Status		varchar2(20),
		Constraint PK_Status Primary Key (StatusId)
);

--
-- Define a person entity, which has multiple profiles
--

create table Person (
	PersonId			number,
		Constraint PK_Person Primary Key(PersonId)
);

create table PersonList (
	PersonId	number,
	Lvl			number,
	FirstName	varchar2(255),
	MiddleName	varchar2(255),
	LastName	varchar2(255),
	Line1		varchar2(255)	not null,
	Line2		varchar2(255),
	Line3		varchar2(255),
	Line4		varchar2(255),
	Line5		varchar2(255),
	Phone1		varchar2(30),
	Phone2		varchar2(30),
	Phone3		varchar2(30),
	Email		varchar2(30),
	Fax			varchar2(30),
	Comments	varchar2(255),
		Constraint PK_PersonList Primary Key (PersonId, Lvl)
);

--
-- Items have costs and prices, which can vary over time and may depend
-- on who is asking. This is implemented through the use of cost profiles.
--

create table Cost (
	BarcodeId		number			not null,
	Cost			number(20,2)	not null,
	StockValue 		number(20,2)	not null,
	WholesalePrice	number(20,2)	not null,
	DiscountPrice1	number(20,2),
	DiscountPrice2	number(20,2),
	DiscountPrice3	number(20,2),
	DiscountPrice4	number(20,2),
	DiscountPrice5	number(20,2),
		Constraint PK_Cost Primary Key (BarcodeId)
);

--
-- Define a Bank, from the perspective of a business
--

create table Bank (
	BankId		number,
	PersonId	number,
	Routing		varchar2(100),
	AccountNo	varchar2(100),
		Constraint PK_Bank Primary Key(BankId)
);

--
-- Define Business Location
--

create table Location (
	LocationId			number			not null,
	Description			varchar2(255),
		Constraint PK_Location Primary Key(LocationId)
);

--
-- Define Shipper Companies and Shipment Tracking Objects
--

create table Shipper (
	ShipperId	number,
	PersonId	number,
	WebServicesId	number,
		Constraint PK_Shipper Primary Key(ShipperId)
);

create table Tracking (
	TrackingId				number,
	TrackingObject			varchar2(255),
		Constraint PK_Tracking Primary Key(TrackingId)
);

--
-- Define a Supplier
--

create table Supplier (
	SupplierId				number,
	PersonId				number				not null,
	WebServicesId			number				not null,
	BankId					number				not null,
	ShipperId				number				not null,
	ShipperReturnsId		number,
	BillingAccountId		number				not null,
	CompanyName				varchar2(30),
	MaxOwed					number				not null,
	CurrentOwed				number(20,2)		not null,
	MaxAccountsReceivable	number				not null,
	CreditRating			varchar2(10)		not null,
	CreditTerms				varchar2(255),
	Comments				varchar2(255),
		Constraint PK_Supplier Primary Key(SupplierId)
);

--
-- This section refers to Items.
-- An item is something that needs to be tracked, it has value, characteristics, costs
-- and hopefully, in the fullness of time, a buyer.
--
-- A barcode is an Id that identifies an item, a supplier and a cost profile
-- The item has characteristics, whose values are options that match possible values
-- in Category, matched by level (CategoryId).
--
-- A collection is a CollectionList, which consists of barcodes.
--
-- Every Product is basically a barcode
--

create table Options (
	OptionsId	number,
	CategoryId	number			not null,
	Name		varchar2(100)	not null,
	Value		varchar2(255)	not null,
		Constraint PK_options Primary Key(OptionsId)
);

create table Category (
	CategoryId			number,
	Name				varchar2(255)	not null,
		Constraint PK_category Primary Key(CategoryId)
);

create table Characteristic (
	ItemId		number not null,
	OptionsId	number not null,
		Constraint PK_Characteristic Primary Key (ItemId, OptionsId)
);

create table Item (
	ItemId		number,
	Name		varchar2(100)	not null,
	Description	varchar2(255),
		Constraint PK_Item Primary Key(ItemId)
);

create table Barcode (
	BarcodeId	number,
	ItemId		number		not null,
	SupplierId	number		not null,
	ImageURL	varchar2(255),
	Barcode		varchar2(255),
		Constraint PK_Barcode Primary Key(BarcodeId)
);

create table Collection (
	CollectionId	number,
	Description		varchar2(255)	not null,
		Constraint PK_Collection Primary Key(CollectionId)
);

create table CollectionList (
	CollectionId	number,
	BarcodeId		number			not null,
	Constraint PK_CollectionList Primary Key (CollectionId, BarcodeId)
);

--
-- Inventory consists of barcodes. There may be many physical locations.
-- A barcode may physically be in storage (available) or not.
-- If unavailable, a barcode may be in manufacturing, or maybe at a client site,
-- subject to buyer approval. Such a barcode is not technically in the inventory,
-- but it needs to stay in the inventory until someone actually pays for it AND
-- it is shipped.
--
-- Each inventory has a target quantity for each barcode
--

create table Inventory (
	LocationId					number				not null,
	BarcodeId					number				not null,
	Quantity					number				not null,
	MinQty						number				not null,
	MaxQty						number				not null,
	MaintainMinQty				number				not null,
	MaintainMaxQty				number				not null,
	Comments					varchar2(255),
		Constraint PK_Inventory Primary Key(LocationId, BarcodeId)
);

--
-- Define an Employee
--

create table Employee (
	EmployeeId					number				not null,
	PersonId					number				not null,
	LocationId					number				not null,
	PayrollId					number				not null,
	Comments					varchar2(255),
		Constraint PK_Employee Primary Key(EmployeeId)
);

--
-- Define the Installed InstalledSystem
--

create table InstalledSystem (
	PersonId			number,
	LocationId			number,
	SecurityObject		varchar2(255),
	Description			varchar2(255),
	Comments			varchar2(255),
		Constraint PK_InstalledSystem Primary Key(PersonId,LocationId)
);

--
-- Define the Subsystems and Role Types
--

create table Subsystem (
	SubsystemId			number,
	Name				varchar2(255),
	Description			varchar2(255),
		Constraint PK_Subsystem Primary Key(SubsystemId)
);

create table Role (
	RoleId				number,
	Name				varchar2(20),
	Description			varchar2(255),
	SubsystemId			number,
	Value				number,
	Comments			varchar2(255),
		Constraint PK_Role Primary Key(RoleId)
);

--
-- Define a User, System Security and the User's Roles
--

create table Security (
	SecurityId		number,
	UserName		varchar2(30)	unique,
	Password		varchar2(30)	not null,
	Phrase			varchar2(255)	not null,
	Response		varchar2(255),
	DatabaseObject	varchar2(255),
	Comments		varchar2(255),
		Constraint PK_Security Primary Key(SecurityId)
);

create table UserRole (
	UsersId				number,
	RoleId				number,
		Constraint PK_UserRole Primary Key(UsersId,RoleId)
);

create table Users (
	UsersId						number,
	EmployeeId					number				not null,
	SecurityId					number				not null,
	Comments					varchar2(255),
		Constraint PK_Users Primary Key(UsersId)
);

--
-- Define the Objects in the Alerts Subsystem
--

create table Event (
	EventId					number,
	SQLObject				varchar2(255),
	URLObject				varchar2(255),
	JavaRefObject			varchar2(255),
		Constraint PK_Event Primary Key(EventId)
);

create table Alert (
	AlertId					number,
	EventId					number,
	RoleId					number,
	AlertLevel				number,
	AlertNumber				number,
	Description				varchar2(2500),
		Constraint PK_Alert Primary Key(AlertId)
);

--
-- Define tables for the Contracts Bidding Subsystem
--

create table BidRequest (
	Id						number,
	SupplierId				number,
	AlertId					number,
	LocationId				number,
	ShipmentId				number,
	UsersId					number,
	DateExpires				date,
	ArrivalDate				date,
	RequestDate				date,
		Constraint PK_BidRequest Primary Key(Id,SupplierId)
);

create table BidOffered (
	Id						number,
	BidRequestId			number,
	UsersId					number,
	StatusId				number,
	AlertId					number,
	SupplierOfferId			number,
	DateExpires				date,
	Price					number(20,2),
	ArrivalDate				date,
	OfferDate				date,
		Constraint PK_BidOffered Primary Key(Id)
);

--
-- Define Order from Supplier
--

create table Orders (
	OrdersId				number,
	SupplierId				number,
	ShipmentId				number,
	UsersId					number,
	StatusId				number,
	AlertId					number,
	SupplierOrdersId		number,
	ShipDate				date,
	OrderDate				date,
		Constraint PK_Orders Primary Key(OrdersId)
);

create table SupplierOrder (
	Id						number,
	SupplierId				number,
	ShipmentId				number,
	LocationId				number,
	UsersId					number,
	StatusId				number,
	AlertId					number,
	SupplierOrdersId		number,
	ShipDate				date,
	ArrivalDate				date,
	ExpiresDate				date,
	OrderDate				date,
		Constraint PK_SupplierOrder Primary Key(Id)
);

--
-- Define a Shipment
--

create table Container (
	ContainerId		number,
	BarcodeId		number,
	Quantity		number,
	OrdersId		number,
		Constraint PK_Container Primary Key(ContainerId,BarcodeId)
);

create table Shipment (
	ShipmentId		number,
	ShipperId		number,
	PersonId		number,
	TrackingId		number,
	StatusId		number,
		Constraint PK_Shipment Primary Key(ShipmentId)
);

--
-- Define an Invoice
--

create table InvoiceList (
	Id				number,
	ShipperId		number,
	PersonId		number,
	LocationId		number,
	TrackingId		number,
	ContainerId		number,
	StatusId		number,
		Constraint PK_InvoiceList Primary Key(Id)
);

create table Invoice (
	Id				number,
	ListId			number,
		Constraint PK_Invoice Primary Key(Id)
);

--
-- Define a Customer Order
--

create table CustomerOrderList (
	Id				number,
	BarcodeId		number,
	Quantity		number,
		Constraint PK_CustomerOrderList Primary Key(Id,BarcodeId)
);

create table CustomerOrder (
	Id				number,
	CustomerId		number,
	StatusId		number,
	InvoiceId		number,
	OrderDate		date,
	ExpiresDate		date,
		Constraint PK_CustomerOrder Primary Key(Id)
);

--
-- Define a Customer (a Buyer)
--

create table Customer (
	Id				number,
	PersonId		number,
	SecurityId		number,
	PaymentId		number,
		Constraint PK_Customer Primary Key(Id)
);

--
-- Define a work table
--

create table Worktmp (
	Id				number,
	Barcodeid		number,
	Itemid			number,
	Company			varchar2(255),
	Imageurl		varchar2(255),
	Itemname		varchar2(255),
	Itemds			varchar2(255),
		Constraint PK_Worktmp Primary Key(Id)
);

--
-- Create the Foreign Keys
--

alter table Alert add Constraint FK_Alert1 Foreign Key(RoleId) References Role(RoleId);
alter table Alert add Constraint FK_Alert2 Foreign Key(EventId) References Event(EventId);

alter table Bank add Constraint FK_Bank Foreign Key(PersonId) References Person(PersonId);

alter table Barcode add Constraint FK_Barcode1 Foreign Key(ItemId) References Item(ItemId);
alter table Barcode add Constraint FK_Barcode2 Foreign Key(SupplierId) References Supplier(SupplierId);

alter table BidOffered add Constraint FK_BidOffered1 Foreign Key(UsersId) References Users(UsersId);
alter table BidOffered add Constraint FK_BidOffered2 Foreign Key(StatusId) References Status(StatusId);
alter table BidOffered add Constraint FK_BidOffered3 Foreign Key(AlertId) References Alert(AlertId);

alter table BidRequest add Constraint FK_BidRequest1 Foreign Key(SupplierId) References Supplier(SupplierId);
alter table BidRequest add Constraint FK_BidRequest2 Foreign Key(AlertId) References Alert(AlertId);
alter table BidRequest add Constraint FK_BidRequest3 Foreign Key(LocationId) References Location(LocationId);
alter table BidRequest add Constraint FK_BidRequest4 Foreign Key(UsersId) References Users(UsersId);

alter table Characteristic add Constraint FK_Characteristic1 Foreign Key(OptionsId) References Options(OptionsId);
alter table Characteristic add Constraint FK_Characteristic2 Foreign Key(ItemId) References Item(ItemId);

alter table CollectionList add Constraint FK_CollectionList1 Foreign Key(CollectionId) References Collection(CollectionId);
alter table CollectionList add Constraint FK_CollectionList2 Foreign Key(BarcodeId) References Barcode(BarcodeId);

alter table Container add Constraint FK_Container1 Foreign Key(BarcodeId) References Barcode(BarcodeId);
alter table Container add Constraint FK_Container2 Foreign Key(OrdersId) References Orders(OrdersId);

alter table Cost add Constraint FK_Cost Foreign Key(BarcodeId) References Barcode(BarcodeId);

alter table CustomerOrderList add Constraint FK_CustomerOrderList1 Foreign Key(Id) References CustomerOrder(Id);
alter table CustomerOrderList add Constraint FK_CustomerOrderList2 Foreign Key(BarcodeId) References Barcode(BarcodeId);

alter table CustomerOrder add Constraint FK_CustomerOrder1 Foreign Key(CustomerId) References Customer(Id);
alter table CustomerOrder add Constraint FK_CustomerOrder2 Foreign Key(StatusId) References Status(StatusId);
alter table CustomerOrder add Constraint FK_CustomerOrder3 Foreign Key(InvoiceId) References Invoice(Id);

alter table Customer add Constraint FK_Customer1 Foreign Key(PersonId) References Person(PersonId);
alter table Customer add Constraint FK_Customer2 Foreign Key(SecurityId) References Security(SecurityId);
alter table Customer add Constraint FK_Customer3 Foreign Key(PaymentId) References Payment(Id);

alter table Employee add Constraint FK_Employee1 Foreign Key(PersonId) References Person(PersonId);
alter table Employee add Constraint FK_Employee2 Foreign Key(LocationId) References Location(LocationId);
alter table Employee add Constraint FK_Employee3 Foreign Key(PayrollId) References Payroll(PayrollId);

alter table InstalledSystem add Constraint FK_InstalledSystem1 Foreign Key(PersonId) References Person(PersonId);
alter table InstalledSystem add Constraint FK_InstalledSystem2 Foreign Key(LocationId) References Location(LocationId);

alter table Inventory add Constraint FK_Inventory1 Foreign Key(LocationId) References Location(LocationId);
alter table Inventory add Constraint FK_Inventory2 Foreign Key(Barcodeid) References Barcode(Barcodeid);

alter table Invoice add Constraint FK_Invoice Foreign Key(ListId) References InvoiceList(Id);

alter table InvoiceList add Constraint FK_InvoiceList1 Foreign Key(ShipperId) References Shipper(ShipperId);
alter table InvoiceList add Constraint FK_InvoiceList2 Foreign Key(PersonId) References Person(PersonId);
alter table InvoiceList add Constraint FK_InvoiceList3 Foreign Key(LocationId) References Location(LocationId);
alter table InvoiceList add Constraint FK_InvoiceList4 Foreign Key(TrackingId) References Tracking(TrackingId);
alter table InvoiceList add Constraint FK_InvoiceList5 Foreign Key(StatusId) References Status(StatusId);

alter table Options add Constraint FK_Options Foreign Key(CategoryId) References Category(CategoryId);

alter table Orders add Constraint FK_Orders1 Foreign Key(SupplierId) References Supplier(SupplierId);
alter table Orders add Constraint FK_Orders2 Foreign Key(ShipmentId) References Shipment(ShipmentId);
alter table Orders add Constraint FK_Orders3 Foreign Key(UsersId) References Users(UsersId);
alter table Orders add Constraint FK_Orders4 Foreign Key(StatusId) References Status(StatusId);
alter table Orders add Constraint FK_Orders5 Foreign Key(AlertId) References Alert(AlertId);

alter table PersonList add Constraint FK_PersonList Foreign Key(PersonId) References Person(PersonId);

alter table Role add Constraint FK_Role Foreign Key(SubsystemId) References Subsystem(SubsystemId);

alter table Shipment add Constraint FK_Shipment1 Foreign Key(ShipperId) References Shipper(ShipperId);
alter table Shipment add Constraint FK_Shipment2 Foreign Key(PersonId) References Person(PersonId);
alter table Shipment add Constraint FK_Shipment3 Foreign Key(TrackingId) References Tracking(TrackingId);
alter table Shipment add Constraint FK_Shipment4 Foreign Key(StatusId) References Status(StatusId);

alter table Shipper add Constraint FK_Shipper1 Foreign Key(PersonId) References Person(PersonId);
alter table Shipper add Constraint FK_Shipper2 Foreign Key(WebServicesId) References WebServices(WebservicesId);

alter table Supplier add Constraint FK_Supplier1 Foreign Key(PersonId) References Person(PersonId);
alter table Supplier add Constraint FK_Supplier2 Foreign Key(WebServicesId) References WebServices(WebservicesId);
alter table Supplier add Constraint FK_Supplier3 Foreign Key(BankId) References Bank(BankId);
alter table Supplier add Constraint FK_Supplier4 Foreign Key(ShipperId) References Shipper(ShipperId);
alter table Supplier add Constraint FK_Supplier5 Foreign Key(ShipperReturnsId) References Shipper(ShipperId);

alter table SupplierOrder add Constraint FK_SupplierOrder1 Foreign Key(SupplierId) References Supplier(SupplierId);
alter table SupplierOrder add Constraint FK_SupplierOrder2 Foreign Key(ShipmentId) References Shipment(ShipmentId);
alter table SupplierOrder add Constraint FK_SupplierOrder3 Foreign Key(LocationId) References Location(LocationId);
alter table SupplierOrder add Constraint FK_SupplierOrder4 Foreign Key(UsersId) References Users(UsersId);
alter table SupplierOrder add Constraint FK_SupplierOrder5 Foreign Key(StatusId) References Status(StatusId);
alter table SupplierOrder add Constraint FK_SupplierOrder6 Foreign Key(AlertId) References Alert(AlertId);

alter table UserRole add Constraint FK_UserRole1 Foreign Key(UsersId) References Users(UsersId);
alter table UserRole add Constraint FK_UserRole2 Foreign Key(RoleId) References Role(RoleId);

alter table Users add Constraint FK_Users1 Foreign Key(EmployeeId) References Employee(EmployeeId);
alter table Users add Constraint FK_Users2 Foreign Key(SecurityId) References Security(SecurityId);

--
--  Create Indexes - create a few obvious ones for now
--

create unique index BidRequest1 on BidRequest(SupplierId,Id);

create unique index BidOffered1 on BidOffered(BidRequestId,Id);

create unique index Employee1 on Employee(LocationId,EmployeeId);

create unique index Orders1 on Orders(SupplierId,OrdersId);

create unique index SupplierOrder1 on SupplierOrder(SupplierId,Id);

--
-- Create Sequences/Triggers - create a few for now
--

create sequence Alert_seq start with 1 increment by 1;
create sequence Bank_seq start with 1 increment by 1;
create sequence Barcode_seq start with 1 increment by 1;
create sequence Category_seq start with 1 increment by 1;
create sequence Collection_seq start with 1 increment by 1;
create sequence Container_seq start with 1 increment by 1;

create sequence Customer_seq start with 1 increment by 1;
create trigger Customer_trigger before insert on Customer 
for each row
begin
	select Customer_seq.nextval into :new.Id from dual;
end;
/

create sequence CustomerOrder_seq start with 1 increment by 1;
create trigger CustomerOrder_trigger before insert on CustomerOrder 
for each row
begin
	select CustomerOrder_seq.nextval into :new.Id from dual;
end;
/

create sequence Employee_seq start with 1 increment by 1;
create sequence Event_seq start with 1 increment by 1;
create sequence Item_seq start with 1 increment by 1;

create sequence Invoice_seq start with 1 increment by 1;
create trigger Invoice_trigger before insert on Invoice 
for each row
begin
	select Invoice_seq.nextval into :new.Id from dual;
end;
/

create sequence InvoiceList_seq start with 1 increment by 1;
create trigger InvoiceList_trigger before insert on InvoiceList 
for each row
begin
	select InvoiceList_seq.nextval into :new.Id from dual;
end;
/

create sequence Location_seq start with 1 increment by 1;

create sequence Manufacturing_seq start with 1 increment by 1;
create trigger Manufacturing_trigger before insert on Manufacturing 
for each row
begin
	select Manufacturing_seq.nextval into :new.Id from dual;
end;
/

create sequence ManufacturingProcess_seq start with 1 increment by 1;
create trigger ManufacturingProcess_trigger before insert on ManufacturingProcess 
for each row
begin
	select ManufacturingProcess_seq.nextval into :new.Id from dual;
end;
/

create sequence Options_seq start with 1 increment by 1;
create sequence Orders_seq start with 1 increment by 1;

create sequence Payment_seq start with 1 increment by 1;
create trigger Payment_trigger before insert on Payment 
for each row
begin
	select Payment_seq.nextval into :new.Id from dual;
end;
/

create sequence Payroll_seq start with 1 increment by 1;
create sequence Person_seq start with 1 increment by 1;
create sequence Role_seq start with 1 increment by 1;
create sequence Security_seq start with 1 increment by 1;
create sequence Shipment_seq start with 1 increment by 1;
create sequence Shipper_seq start with 1 increment by 1;
create sequence Status_seq start with 1 increment by 1;
create sequence Subsystem_seq start with 1 increment by 1;
create sequence Supplier_seq start with 1 increment by 1;

create sequence SupplierOrder_seq start with 1 increment by 1;
create trigger SupplierOrder_trigger before insert on SupplierOrder
for each row
begin
	select SupplierOrder_seq.nextval into :new.Id from dual;
end;
/

create sequence Users_seq start with 1 increment by 1;

create sequence Tracking_seq start with 1 increment by 1;
create sequence WebServices_seq start with 1 increment by 1;

create sequence Worktmp_seq start with 1 increment by 1;

Show Errors;

--
-- Cascading Deletes - triggers
--

--
-- Create Views
--

--
-- Insert Test Data
--



--
-- Select the created objects
--

select table_name from user_tables order by table_name;
select table_name,index_name from user_indexes order by table_name,index_name;
select sequence_name from user_sequences order by sequence_name;
select trigger_name from user_triggers order by trigger_name;

commit;

spool off;

quit;

