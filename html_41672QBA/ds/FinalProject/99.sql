
spool all;
set echo on;

--
-- I like a clean slate. Make it so.
--
--
-- Must first remove the referential constraints
--

alter table AlertObject drop Constraint FK_AlertObject1;
alter table AlertObject drop Constraint FK_AlertObject2;

alter table Bank drop Constraint FK_Bank;

alter table Barcode drop Constraint FK_Barcode1;
alter table Barcode drop Constraint FK_Barcode2;
alter table Barcode drop Constraint FK_Barcode3;

alter table BidRequest drop Constraint FK_BidRequest1;
alter table BidRequest drop Constraint FK_BidRequest2;
alter table BidRequest drop Constraint FK_BidRequest3;
alter table BidRequest drop Constraint FK_BidRequest4;

alter table BidOffered drop Constraint FK_BidOffered1;
alter table BidOffered drop Constraint FK_BidOffered2;
alter table BidOffered drop Constraint FK_BidOffered3;

alter table Characteristic drop Constraint FK_Characteristic1;
alter table Characteristic drop Constraint FK_Characteristic2;
alter table Characteristic drop Constraint FK_Characteristic3;

alter table CollectionList drop Constraint FK_CollectionList1;
alter table CollectionList drop Constraint FK_CollectionList2;

alter table Container drop Constraint FK_Container1;
alter table Container drop Constraint FK_Container2;

alter table CostProfile drop Constraint FK_CostProfile;

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
alter table Inventory drop Constraint FK_Inventory3;
alter table Inventory drop Constraint FK_Inventory4;
alter table Inventory drop Constraint FK_Inventory5;

alter table InventoryTarget drop Constraint FK_InventoryTarget;

alter table Invoice drop Constraint FK_Invoice;

alter table InvoiceList drop Constraint FK_InvoiceList1;
alter table InvoiceList drop Constraint FK_InvoiceList2;
alter table InvoiceList drop Constraint FK_InvoiceList3;
alter table InvoiceList drop Constraint FK_InvoiceList4;
alter table InvoiceList drop Constraint FK_InvoiceList5;
alter table InvoiceList drop Constraint FK_InvoiceList6;

alter table Location drop Constraint FK_Location;

alter table Orders drop Constraint FK_Orders1;
alter table Orders drop Constraint FK_Orders2;
alter table Orders drop Constraint FK_Orders3;
alter table Orders drop Constraint FK_Orders4;
alter table Orders drop Constraint FK_Orders5;

alter table Package drop Constraint FK_Package;

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

alter table Tracking drop Constraint FK_Tracking;

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

drop trigger AlertObject_trigger;
drop sequence AlertObject_seq;

drop trigger Bank_trigger;
drop sequence Bank_seq;

drop trigger Barcode_trigger;
drop sequence Barcode_seq;

drop trigger Collection_trigger;
drop sequence Collection_seq;

drop trigger CollectionList_trigger;
drop sequence CollectionList_seq;

drop trigger Cost_trigger;
drop sequence Cost_seq;

drop trigger Customer_trigger;
drop sequence Customer_seq;

drop trigger CustomerOrder_trigger;
drop sequence CustomerOrder_seq;

drop trigger Employee_trigger;
drop sequence Employee_seq;

drop trigger EventObject_trigger;
drop sequence EventObject_seq;

drop trigger Items_trigger;
drop sequence Items_seq;

drop trigger Invoice_trigger;
drop sequence Invoice_seq;

drop trigger InvoiceList_trigger;
drop sequence InvoiceList_seq;

drop trigger Location_trigger;
drop sequence Location_seq;

drop trigger Manufacturing_trigger;
drop sequence Manufacturing_seq;

drop trigger ManufacturingProcess_trigger;
drop sequence ManufacturingProcess_seq;

drop trigger Options_trigger;
drop sequence Options_seq;

drop trigger Orders_trigger;
drop sequence Orders_seq;

drop trigger Package_trigger;
drop sequence Package_seq;

drop trigger Payment_trigger;
drop sequence Payment_seq;

drop trigger Payroll_trigger;
drop sequence Payroll_seq;

drop trigger Person_trigger;
drop sequence Person_seq;

drop trigger Role_trigger;
drop sequence Role_seq;

drop trigger Shipper_trigger;
drop sequence Shipper_seq;

drop trigger Status_trigger;
drop sequence Status_seq;

drop trigger Supplier_trigger;
drop sequence Supplier_seq;

drop trigger SupplierOrder_trigger;
drop sequence SupplierOrder_seq;

drop trigger Users_trigger;
drop sequence Users_seq;

drop trigger UserRole_trigger;
drop sequence UserRole_seq;

drop trigger Tracking_trigger;
drop sequence Tracking_seq;

drop trigger WebServices_trigger;
drop sequence WebServices_seq;

--
-- Now drop all tables
--

drop table AlertObject;
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
drop table CostProfile;
drop table CustomerOrderList;
drop table CustomerOrder;
drop table Customer;
drop table Employee;
drop table EventObject;
drop table InstalledSystem;
drop table Inventory;
drop table InventoryTarget;
drop table Invoice;
drop table InvoiceList;
drop table Items;
drop table Location;
drop table Manufacturing;
drop table ManufacturingProcess;
drop table Options;
drop table Orders;
drop table Package;
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

select table_name from user_tables order by table_name;
select table_name,index_name from user_indexes order by table_name,index_name;
select sequence_name from user_sequences order by sequence_name;
select trigger_name from user_triggers order by trigger_name;

--quit;

--
-- Define some hard to define tables - will become clearer in due course
--

create table WebServices (
	Id			number,
		Constraint PK_WebServices Primary Key(Id)
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
	Id			number,
		Constraint PK_Payroll Primary Key(Id)
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
	Id			number,
	Status		varchar2(20),
		Constraint PK_Status Primary Key (Id)
);

--
-- Define a person entity, which has multiple profiles
--

create table Person (
	Id			number,
	ListId		number,
		Constraint PK_Person Primary Key(Id)
);

create table PersonList (
	Id			number,
	Lvl			number,
	FirstName	varchar2(255),
	MiddleName	varchar2(255),
	ListName	varchar2(255),
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
		Constraint PK_PersonList Primary Key (Id, Lvl)
);

--
-- Items have costs and prices, which can vary over time and may depend
-- on who is asking. This is implemented through the use of cost profiles.
--

create table Cost (
	Id			number,
	Description	varchar2(255)	not null,
		Constraint PK_costs Primary Key(Id)
);

create table CostProfile (
	Id				number			not null,
	CostProfileId	number			not null,
	Cost			number(20,2)	not null,
	StockValue 		number(20,2)	not null,
	WholesalePrice	number(20,2)	not null,
	DiscountPrice1	number(20,2),
	DiscountPrice2	number(20,2),
	Discountprice3	number(20,2),
	Discountprice4	number(20,2),
	Discountprice5	number(20,2),
		Constraint PK_CostProfile Primary Key (Id, CostProfileId)
);

--
-- Define a Bank, from the perspective of a business
--

create table Bank (
	Id			number,
	PersonId	number,
	Routing		varchar2(100),
	AccountNo	varchar2(100),
		Constraint PK_Bank Primary Key(Id)
);

--
-- Define Business Location
--

create table Location (
	Id			number			not null,
	PersonId	number,
	Description	varchar2(255),
		Constraint PK_Location Primary Key(Id)
);

--
-- Define Shipper Companies and Shipment Tracking Objects
--

create table Shipper (
	Id			number,
	PersonId	number,
	WebServicesId	number,
		Constraint PK_Shipper Primary Key(Id)
);

create table Tracking (
	Id				number,
	TrackingObject	varchar2(255),
		Constraint PK_Tracking Primary Key(Id)
);

--
-- Define a Supplier
--

create table Supplier (
	Id						number,
	PersonId				number				not null,
	WebServicesId			number				not null,
	BankId					number				not null,
	ShippingId				number				not null,
	ShippingReturnsId		number,
	BillingAccountId		number				not null,
	MaxOwed					number				not null,
	CurrentOwed				number(20,2)		not null,
	MaxAccountsReceivable	number				not null,
	CreditRating			varchar2(10)		not null,
	CreditTerms				varchar2(255),
	Comments				varchar2(255),
		Constraint PK_Supplier Primary Key(Id)
);

--
-- This section refers to Items.
-- An item is something that needs to be tracked, it has value, characteristics, costs
-- and hopefully, in the fullness of time, a buyer.
--
-- A barcode is an Id that identifies an item, a supplier and a cost profile
-- The item has characteristics, whose values are options that match possible values
-- in Category, matched by level (lvl).
--
-- A collection is a CollectionList, which consists of barcodes.
--
-- Every Product is basically a barcode
--

create table Options (
	Id		number,
	Name	varchar2(100)	not null,
	Value	varchar2(255)	not null,
		Constraint PK_options Primary Key(Id)
);

create table Category (
	Lvl			number,
	Name		varchar2(255)	not null,
		Constraint PK_category Primary Key(Lvl)
);

create table Characteristic (
	Id			number not null,
	Lvl			number not null,
	OptionId	number not null,
		Constraint PK_Characteristic Primary Key (Id, Lvl)
);

create table Items (
	Id			number,
	Name		varchar2(100)	not null,
	Description	varchar2(255),
		Constraint PK_Items Primary Key(Id)
);

create table Barcode (
	Id			number,
	ItemId		number		not null,
	SupplierId	number		not null,
	CostId		number		not null,
	ImageURL	varchar2(255),
	Barcode		varchar2(255),
		Constraint PK_Barcode Primary Key(Id)
);

create table Collection (
	Id				number,
	Description		varchar2(255)	not null,
	ListId			number,
		Constraint PK_Collection Primary Key(Id)
);

create table CollectionList (
	Id				number,
	CollectionId	number,
	BarcodeId		number			not null,
	Constraint PK_CollectionList Primary Key (Id)
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
	BarcodeId					number				not null,
	LocationId					number				not null,
	Quantity					number				not null,
	StatusId					number				not null,
	ShipmentId					number				not null,
	ManufacturingId				number				not null,
	ManufacturingProcessId		number				not null,
	ExpectedReturnDate			date,
	Comments					varchar2(255),
		Constraint PK_Inventory Primary Key(BarcodeId,LocationId)
);

create table InventoryTarget (
	BarcodeId					number				not null,
	LocationId					number				not null,
	Quantity					number				not null,
	MinQty						number				not null,
	MaxQty						number				not null,
	MaintainMinQty				number				not null,
	MaintainMaxQty				number				not null,
	Comments					varchar2(255),
		Constraint PK_InventoryTarget Primary Key(BarcodeId,LocationId)
);

--
-- Define an Employee
--

create table Employee (
	Id							number				not null,
	PersonId					number				not null,
	LocationId					number				not null,
	PayrollId					number				not null,
	Comments					varchar2(255),
		Constraint PK_Employee Primary Key(Id)
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
	Id					number,
	Name				varchar2(255),
	Description			varchar2(255),
		Constraint PK_Subsystem Primary Key(Id)
);

create table Role (
	Id					number,
	Name				varchar2(20),
	Description			varchar2(255),
	SubsystemId			number,
	Value				number,
	Comments			varchar2(255),
		Constraint PK_Role Primary Key(Id)
);

--
-- Define a User, System Security and the User's Roles
--

create table Security (
	Id				number,
	UserName		varchar2(30)	unique,
	Password		varchar2(30)	not null,
	Phrase			varchar2(255)	not null,
	Response		varchar2(255),
	DatabaseObject	varchar2(255),
	Comments		varchar2(255),
		Constraint PK_Security Primary Key(Id)
);

create table UserRole (
	Id					number,
	RoleId				number,
	Value				number,
		Constraint PK_UserRole Primary Key(Id,RoleId)
);

create table Users (
	Id							number,
	EmployeeId					number				not null,
	SecurityId					number				not null,
	Comments					varchar2(255),
		Constraint PK_Users Primary Key(Id)
);

--
-- Define the Objects in the Alerts Subsystem
--

create table EventObject (
	Id						number,
	SQLObject				varchar2(255),
	URLObject				varchar2(255),
	JavaRefObject			varchar2(255),
		Constraint PK_EventObject Primary Key(Id)
);

create table AlertObject (
	Id						number,
	EventObjectId			number,
	RoleId					number,
	AlertLevel				number,
	AlertNumber				number,
	Description				varchar2(255),
		Constraint PK_AlertObject Primary Key(Id)
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
	UserId					number,
	DateExpires				date,
	ArrivalDate				date,
	RequestDate				date,
		Constraint PK_BidRequest Primary Key(Id,SupplierId)
);

create table BidOffered (
	Id						number,
	BidRequestId			number,
	UserId					number,
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
	Id						number,
	SupplierId				number,
	ShipmentId				number,
	UserId					number,
	StatusId				number,
	AlertId					number,
	SupplierOrderId			number,
	ShipDate				date,
	OrderDate				date,
		Constraint PK_Orders Primary Key(Id)
);

create table SupplierOrder (
	Id						number,
	SupplierId				number,
	ShipmentId				number,
	LocationId				number,
	UserId					number,
	StatusId				number,
	AlertId					number,
	SupplierOrderId			number,
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
	Id				number,
	BarcodeId		number,
	Quantity		number,
	OrderId			number,
		Constraint PK_Container Primary Key(Id,BarcodeId)
);

create table Shipment (
	Id				number,
	ShipperId		number,
	PersonId		number,
	ContainerId		number,
	TrackingId		number,
	StatusId		number,
		Constraint PK_Shipment Primary Key(Id)
);

--
-- Define a Package - it is what gets sent to a customer
--

create table Package (
	Id				number,
	BarcodeId		number,
	Quantity		number,
		Constraint PK_Package Primary Key(Id)
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
	PackageId		number,
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
-- Create the Foreign Keys
--

alter table AlertObject add Constraint FK_AlertObject1 Foreign Key(RoleId) References Role(Id);
alter table AlertObject add Constraint FK_AlertObject2 Foreign Key(EventObjectId) References EventObject(Id);

alter table Bank add Constraint FK_Bank Foreign Key(PersonId) References Person(Id);

alter table Barcode add Constraint FK_Barcode1 Foreign Key(ItemId) References Items(Id);
alter table Barcode add Constraint FK_Barcode2 Foreign Key(SupplierId) References Supplier(Id);
alter table Barcode add Constraint FK_Barcode3 Foreign Key(CostId) References Cost(Id);

alter table BidOffered add Constraint FK_BidOffered1 Foreign Key(UserId) References Users(Id);
alter table BidOffered add Constraint FK_BidOffered2 Foreign Key(StatusId) References Status(Id);
alter table BidOffered add Constraint FK_BidOffered3 Foreign Key(AlertId) References AlertObject(Id);

alter table BidRequest add Constraint FK_BidRequest1 Foreign Key(SupplierId) References Supplier(Id);
alter table BidRequest add Constraint FK_BidRequest2 Foreign Key(AlertId) References AlertObject(Id);
alter table BidRequest add Constraint FK_BidRequest3 Foreign Key(LocationId) References Location(Id);
alter table BidRequest add Constraint FK_BidRequest4 Foreign Key(UserId) References Users(Id);

alter table Characteristic add Constraint FK_Characteristic1 Foreign Key(Lvl) References Category(Lvl);
alter table Characteristic add Constraint FK_Characteristic2 Foreign Key(OptionId) References Options(Id);
alter table Characteristic add Constraint FK_Characteristic3 Foreign Key(Id) References Items(Id);

alter table CollectionList add Constraint FK_CollectionList1 Foreign Key(CollectionId) References Collection(Id);
alter table CollectionList add Constraint FK_CollectionList2 Foreign Key(BarcodeId) References Barcode(Id);

alter table Container add Constraint FK_Container1 Foreign Key(BarcodeId) References Barcode(Id);
alter table Container add Constraint FK_Container2 Foreign Key(OrderId) References Orders(Id);

alter table CostProfile add Constraint FK_CostProfile Foreign Key(Id) References Cost(Id);

alter table CustomerOrderList add Constraint FK_CustomerOrderList1 Foreign Key(Id) References CustomerOrder(Id);
alter table CustomerOrderList add Constraint FK_CustomerOrderList2 Foreign Key(BarcodeId) References Barcode(Id);

alter table CustomerOrder add Constraint FK_CustomerOrder1 Foreign Key(CustomerId) References Customer(Id);
alter table CustomerOrder add Constraint FK_CustomerOrder2 Foreign Key(StatusId) References Status(Id);
alter table CustomerOrder add Constraint FK_CustomerOrder3 Foreign Key(InvoiceId) References Invoice(Id);

alter table Customer add Constraint FK_Customer1 Foreign Key(PersonId) References Person(Id);
alter table Customer add Constraint FK_Customer2 Foreign Key(SecurityId) References Security(Id);
alter table Customer add Constraint FK_Customer3 Foreign Key(PaymentId) References Payment(Id);

alter table Employee add Constraint FK_Employee1 Foreign Key(PersonId) References Person(Id);
alter table Employee add Constraint FK_Employee2 Foreign Key(LocationId) References Location(Id);
alter table Employee add Constraint FK_Employee3 Foreign Key(PayrollId) References Payroll(Id);

alter table InstalledSystem add Constraint FK_InstalledSystem1 Foreign Key(PersonId) References Person(Id);
alter table InstalledSystem add Constraint FK_InstalledSystem2 Foreign Key(LocationId) References Location(Id);

alter table Inventory add Constraint FK_Inventory1 Foreign Key(LocationId) References Location(Id);
alter table Inventory add Constraint FK_Inventory2 Foreign Key(StatusId) References Status(Id);
alter table Inventory add Constraint FK_Inventory3 Foreign Key(ShipmentId) References Shipment(Id);
alter table Inventory add Constraint FK_Inventory4 Foreign Key(ManufacturingId) References Manufacturing(Id);
alter table Inventory add Constraint FK_Inventory5 Foreign Key(ManufacturingProcessId) References ManufacturingProcess(Id);

alter table InventoryTarget add Constraint FK_InventoryTarget Foreign Key(LocationId) References Location(Id);

alter table Invoice add Constraint FK_Invoice Foreign Key(ListId) References InvoiceList(Id);

alter table InvoiceList add Constraint FK_InvoiceList1 Foreign Key(ShipperId) References Shipper(Id);
alter table InvoiceList add Constraint FK_InvoiceList2 Foreign Key(PersonId) References Person(Id);
alter table InvoiceList add Constraint FK_InvoiceList3 Foreign Key(LocationId) References Location(Id);
alter table InvoiceList add Constraint FK_InvoiceList4 Foreign Key(TrackingId) References Tracking(Id);
alter table InvoiceList add Constraint FK_InvoiceList5 Foreign Key(PackageId) References Package(Id);
alter table InvoiceList add Constraint FK_InvoiceList6 Foreign Key(StatusId) References Status(Id);

alter table Location add Constraint FK_Location Foreign Key(PersonId) References Person(Id);

alter table Orders add Constraint FK_Orders1 Foreign Key(SupplierId) References Supplier(Id);
alter table Orders add Constraint FK_Orders2 Foreign Key(ShipmentId) References Shipment(Id);
alter table Orders add Constraint FK_Orders3 Foreign Key(UserId) References Users(Id);
alter table Orders add Constraint FK_Orders4 Foreign Key(StatusId) References Status(Id);
alter table Orders add Constraint FK_Orders5 Foreign Key(AlertId) References AlertObject(Id);

alter table Package add Constraint FK_Package Foreign Key(BarcodeId) References Barcode(Id);

alter table PersonList add Constraint FK_PersonList Foreign Key(Id) References Person(Id);

alter table Role add Constraint FK_Role Foreign Key(SubsystemId) References Subsystem(Id);

alter table Shipment add Constraint FK_Shipment1 Foreign Key(ShipperId) References Shipper(Id);
alter table Shipment add Constraint FK_Shipment2 Foreign Key(PersonId) References Person(Id);
alter table Shipment add Constraint FK_Shipment3 Foreign Key(TrackingId) References Tracking(Id);
alter table Shipment add Constraint FK_Shipment4 Foreign Key(StatusId) References Status(Id);

alter table Shipper add Constraint FK_Shipper1 Foreign Key(PersonId) References Person(Id);
alter table Shipper add Constraint FK_Shipper2 Foreign Key(WebServicesId) References WebServices(Id);

alter table Supplier add Constraint FK_Supplier1 Foreign Key(PersonId) References Person(Id);
alter table Supplier add Constraint FK_Supplier2 Foreign Key(WebServicesId) References WebServices(Id);
alter table Supplier add Constraint FK_Supplier3 Foreign Key(BankId) References Bank(Id);
alter table Supplier add Constraint FK_Supplier4 Foreign Key(ShippingId) References Person(Id);
alter table Supplier add Constraint FK_Supplier5 Foreign Key(ShippingReturnsId) References Person(Id);

alter table SupplierOrder add Constraint FK_SupplierOrder1 Foreign Key(SupplierId) References Supplier(Id);
alter table SupplierOrder add Constraint FK_SupplierOrder2 Foreign Key(ShipmentId) References Shipment(Id);
alter table SupplierOrder add Constraint FK_SupplierOrder3 Foreign Key(LocationId) References Location(Id);
alter table SupplierOrder add Constraint FK_SupplierOrder4 Foreign Key(UserId) References Users(Id);
alter table SupplierOrder add Constraint FK_SupplierOrder5 Foreign Key(StatusId) References Status(Id);
alter table SupplierOrder add Constraint FK_SupplierOrder6 Foreign Key(AlertId) References AlertObject(Id);

alter table Tracking add Constraint FK_Tracking Foreign Key(Id) References Shipment(Id);

alter table UserRole add Constraint FK_UserRole1 Foreign Key(Id) References Users(Id);
alter table UserRole add Constraint FK_UserRole2 Foreign Key(RoleId) References Role(Id);

alter table Users add Constraint FK_Users1 Foreign Key(EmployeeId) References Employee(Id);
alter table Users add Constraint FK_Users2 Foreign Key(SecurityId) References Security(Id);

--
--  Create Indexes - create a few obvious ones for now
--

create unique index BidRequest1 on BidRequest(SupplierId,Id);

create unique index BidOffered1 on BidOffered(BidRequestId,Id);

create unique index Employee1 on Employee(LocationId,Id);

create unique index Orders1 on Orders(SupplierId,Id);

create unique index SupplierOrder1 on SupplierOrder(SupplierId,Id);

--
-- Create Sequences/Triggers - create a few for now
--

create sequence AlertObject_seq start with 1 increment by 1;
create trigger AlertObject_trigger before insert on AlertObject 
for each row
begin
	select AlertObject_seq.nextval into :new.Id from dual;
end;
/

create sequence Bank_seq start with 1 increment by 1;
create trigger Bank_trigger before insert on Bank
for each row
begin
	select Bank_seq.nextval into :new.Id from dual;
end;
/

create sequence Barcode_seq start with 1 increment by 1;
create trigger Barcode_trigger before insert on Barcode 
for each row
begin
	select Barcode_seq.nextval into :new.Id from dual;
end;
/

create sequence Collection_seq start with 1 increment by 1;
create trigger Collection_trigger before insert on Collection
for each row
begin
	select Collection_seq.nextval into :new.Id from dual;
end;
/

create sequence CollectionList_seq start with 1 increment by 1;
create trigger CollectionList_trigger before insert on CollectionList
for each row
begin
	select CollectionList_seq.nextval into :new.Id from dual;
end;
/

create sequence Cost_seq start with 1 increment by 1;
create trigger Cost_trigger before insert on Cost
for each row
begin
	select Cost_seq.nextval into :new.Id from dual;
end;
/

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
create trigger Employee_trigger before insert on Employee 
for each row
begin
	select Employee_seq.nextval into :new.Id from dual;
end;
/

create sequence EventObject_seq start with 1 increment by 1;
create trigger EventObject_trigger before insert on EventObject 
for each row
begin
	select EventObject_seq.nextval into :new.Id from dual;
end;
/

create sequence Items_seq start with 1 increment by 1;
create trigger Items_trigger before insert on Items
for each row
begin
	select Items_seq.nextval into :new.Id from dual;
end;
/

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
create trigger Location_trigger before insert on Location
for each row
begin
	select Location_seq.nextval into :new.Id from dual;
end;
/

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
create trigger Options_trigger before insert on Options
for each row
begin
	select Options_seq.nextval into :new.Id from dual;
end;
/

create sequence Orders_seq start with 1 increment by 1;
create trigger Orders_trigger before insert on Orders 
for each row
begin
	select Orders_seq.nextval into :new.Id from dual;
end;
/

create sequence Package_seq start with 1 increment by 1;
create trigger Package_trigger before insert on Package 
for each row
begin
	select Package_seq.nextval into :new.Id from dual;
end;
/

create sequence Payment_seq start with 1 increment by 1;
create trigger Payment_trigger before insert on Payment 
for each row
begin
	select Payment_seq.nextval into :new.Id from dual;
end;
/

create sequence Payroll_seq start with 1 increment by 1;
create trigger Payroll_trigger before insert on Payroll 
for each row
begin
	select Payroll_seq.nextval into :new.Id from dual;
end;
/

create sequence Person_seq start with 1 increment by 1;
create trigger Person_trigger before insert on Person
for each row
begin
	select Person_seq.nextval into :new.Id from dual;
end;
/

create sequence Role_seq start with 1 increment by 1;
create trigger Role_trigger before insert on Role 
for each row
begin
	select Role_seq.nextval into :new.Id from dual;
end;
/

create sequence Shipper_seq start with 1 increment by 1;
create trigger Shipper_trigger before insert on Shipper
for each row
begin
	select Shipper_seq.nextval into :new.Id from dual;
end;
/

create sequence Status_seq start with 1 increment by 1;
create trigger Status_trigger before insert on Status 
for each row
begin
	select Status_seq.nextval into :new.Id from dual;
end;
/

create sequence Supplier_seq start with 1 increment by 1;
create trigger Supplier_trigger before insert on Supplier
for each row
begin
	select Supplier_seq.nextval into :new.Id from dual;
end;
/

create sequence SupplierOrder_seq start with 1 increment by 1;
create trigger SupplierOrder_trigger before insert on SupplierOrder
for each row
begin
	select SupplierOrder_seq.nextval into :new.Id from dual;
end;
/

create sequence Users_seq start with 1 increment by 1;
create trigger Users_trigger before insert on Users 
for each row
begin
	select Users_seq.nextval into :new.Id from dual;
end;
/

create sequence UserRole_seq start with 1 increment by 1;
create trigger UserRole_trigger before insert on UserRole 
for each row
begin
	select UserRole_seq.nextval into :new.Id from dual;
end;
/

create sequence Tracking_seq start with 1 increment by 1;
create trigger Tracking_trigger before insert on Tracking 
for each row
begin
	select Tracking_seq.nextval into :new.Id from dual;
end;
/

create sequence WebServices_seq start with 1 increment by 1;
create trigger WebServices_trigger before insert on WebServices
for each row
begin
	select WebServices_seq.nextval into :new.Id from dual;
end;
/

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

