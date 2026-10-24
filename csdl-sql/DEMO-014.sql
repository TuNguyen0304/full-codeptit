create table TXN(
 TxnID int primary key,
 AccountID int not null,
 Amount decimal(12, 2) not null check(Amount > 0),
 Type ENUM('DEPOSIT','WITHDRAW') not null,
 TxnTime timestamp default current_timestamp not null,
 foreign key (AccountID) references ACCOUNT(AccountID)
);
