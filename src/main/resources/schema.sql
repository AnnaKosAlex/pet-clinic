create table client_card(
client_id serial primary key,
client_name varchar(20),
phone varchar(250) not null,
email varchar(250)
);

create table doctor(
doctor_id serial not null primary key,
doctor_name varchar(20),
qualification varchar(100),
"age" int not null,
phone varchar(250) not null
);


create table pet_medical_card(
 pet_id SERIAL primary key,
 pet_name varchar(20) not null,
 pet_type varchar(250) not null,
 "age" varchar(250) not null,
 owner_id int not null references client_card (client_id),
 doctor_id int not null references doctor (doctor_id),
 diagnosis varchar(250) not null,
 appointment varchar(250) not null
);
);

create table price_list(
service_id serial primary key,
service varchar (250) not null,
priсe int not null
);

create table clinic(
clinic_id serial not null primary key,
address varchar(250) not null,
openning_hours time,
closing_hours time,
phone varchar(250) not null
);

create table "session"(
session_id serial primary key,
date_time date,
client_id int not null references client_card (client_id),
doctor_id int not null references doctor (doctor_id),
clinic_id int not null references clinic (clinic_id)
);

create table session_service (
session_service_id serial primary key,
session_id int not null references "session" (session_id),
service_id int not null references price_list (service_id)
);

create table timetable(
id serial primary key,
clinic_id int not null references clinic (clinic_id),
doctor_id int not null references doctor (doctor_id),
"date" date,
cabinet int not null
);

create table doctor_account(
account_id serial not null primary key,
login varchar(250),
password varchar(250),
doctor_id int not null references doctor (doctor_id)
)