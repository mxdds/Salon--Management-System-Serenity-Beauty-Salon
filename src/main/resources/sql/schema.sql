drop database if exists salon_management_system;
create database if not exists salon_management_system;
use salon_management_system;
CREATE TABLE User (
                      user_id VARCHAR(50) PRIMARY KEY,
                      name VARCHAR(50),
                      password VARCHAR(50)
);


CREATE TABLE Employee (
                          employee_id VARCHAR(50) PRIMARY KEY,
                          name VARCHAR(50),
                          contact VARCHAR(50),
                          role VARCHAR(50),
                          user_id VARCHAR(50),
                          foreign key(user_id) references User(user_id) on update cascade on delete cascade
);

CREATE TABLE Customer (
                          cus_id VARCHAR(50) PRIMARY KEY,
                          name VARCHAR(50),
                          contact VARCHAR(50),
                          user_id VARCHAR(50),
                          foreign key(user_id) references User(user_id) on update cascade on delete cascade
);


CREATE TABLE Equipment (
                           equipment_id VARCHAR(50) PRIMARY KEY,
                           equipment_name VARCHAR(50),
                           purchase_date DATE,
                           maintain_history VARCHAR(50)
);


CREATE TABLE Service (
                         service_id VARCHAR(50) PRIMARY KEY,
                         title VARCHAR(50),
                         date DATE,
                         description VARCHAR(50),
                         cus_id VARCHAR(50),
                         foreign key(cus_id) references Customer(cus_id) on update cascade on delete cascade
);




CREATE TABLE Salary (
                        salary_id VARCHAR(50) PRIMARY KEY,
                        employee_id VARCHAR(50),
                        amount DECIMAL(10,2),
                        date DATE,
                        foreign key(employee_id) references Employee(employee_id) on update cascade on delete cascade
);


CREATE TABLE Booking (
                         booking_id VARCHAR(50) PRIMARY KEY,
                         user_id VARCHAR(50),
                         cus_id VARCHAR(50),
                         employee_id VARCHAR(50),
                         date DATE,
                         time TIME,
                         location VARCHAR(50),
                         foreign key(user_id) references User(user_id) on update cascade on delete cascade,
                         foreign key(cus_id) references Customer(cus_id) on update cascade on delete cascade,
                         foreign key(employee_id) references Employee(employee_id) on update cascade on delete cascade
);


CREATE TABLE Payment (
                         payment_id VARCHAR(50) PRIMARY KEY,
                         cus_id VARCHAR(50),
                         booking_id VARCHAR(50),
                         amount DECIMAL(10,2),
                         date DATE,
                         foreign key(cus_id) references Customer(cus_id) on update cascade on delete cascade,
                         foreign key(booking_id) references Booking(booking_id) on update cascade on delete cascade
);


CREATE TABLE Package (
                         package_id VARCHAR(50) PRIMARY KEY,
                         package_name VARCHAR(50),
                         booking_id VARCHAR(50),
                         foreign key(booking_id) references Booking(booking_id) on update cascade on delete cascade
);


CREATE TABLE service_Details (
                                 cus_id VARCHAR(50),
                                 service_id VARCHAR(50),
                                 foreign key(service_id) references Service(service_id) on update cascade on delete cascade,
                                 foreign key(cus_id) references Customer(cus_id) on update cascade on delete cascade
);


CREATE TABLE Equipment_Details (
                                   user_id VARCHAR(50),
                                   equipment_id VARCHAR(50),
                                   foreign key(user_id) references User(user_id) on update cascade on delete cascade,
                                   foreign key(equipment_id) references Equipment(equipment_id) on update cascade on delete cascade
);