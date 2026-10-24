create table ACTIVITY_LOG(
 LogID int primary key,
 Actor varchar(100) not null,
 Action varchar(100) not null,
 Detail text,
 CreatedAt timestamp default current_timestamp not null
);
