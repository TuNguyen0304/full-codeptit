create table RESERVATION(
 ReservationID int primary key,
 GuestID int not null,
 foreign key (GuestID) references GUEST(GuestID),
 RoomID int not null,
 foreign key (RoomID) references ROOM(RoomID),
 CheckIn date not null,
 CheckOut date not null,
 BookingDate date not null,
 NumGuests int not null,
 Status varchar(20) not null,
 Notes varchar(255)
);
