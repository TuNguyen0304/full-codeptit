create table SALE_TRANSACTION(
 TxnID int primary key,
 CustID int not null,
 foreign key (CustID) references CUSTOMER(CustID),
 ProductID int not null,
 foreign key (ProductID) references PRODUCT(ProductID),
 EmpID int not null,
 foreign key (EmpID) references EMPLOYEE(EmpID),
 TxnDate date not null,
 Quantity int not null,
 UnitPrice decimal(10, 2) not null,
 Discount decimal(5, 2) not null default 0,
 PaymentMethod ENUM('CASH','CARD','TRANSFER') not null,
 Notes VARCHAR(255)
);
