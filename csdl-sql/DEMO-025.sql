create table REVIEW(
 ReviewID int primary key not null,
 CustID int not null unique,
 foreign key (CustID) references CUSTOMER(CustID),
 ProductID int not null unique,
 foreign key (ProductID) references PRODUCT(ProductID),
 Rating int not null check(Rating >= 1 and Rating <= 5),
 Comment varchar(500),
 CreatedAt datetime2 not null default sysdatetime()
);
