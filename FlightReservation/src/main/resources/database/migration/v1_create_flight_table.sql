CREATE TABLE flights(
                           id bigint NOT NULL AUTO_INCREMENT,
                           arrival_city varchar(255) DEFAULT NULL,
                           date_of_departure varchar(255) DEFAULT NULL,
                           departure_city varchar(255) DEFAULT NULL,
                           flight_number varchar(255) DEFAULT NULL,
                           operating_airlines varchar(255) DEFAULT NULL,
                           PRIMARY KEY (`id`)
)