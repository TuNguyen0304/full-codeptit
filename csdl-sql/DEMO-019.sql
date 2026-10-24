create table LOAN(
 LoanID int primary key,
 MemberID int not null,
 foreign key (MemberID) references MEMBER(MemberID),
 BookID int not null,
 foreign key (BookID) references BOOK(BookID),
 LoanDate date not null,
 DueDate date not null,
 ReturnDate date,
 Status ENUM('BORROWED','RETURNED','OVERDUE') not null default 'BORROWED',
 Fine decimal(8, 2) not null default 0
);
