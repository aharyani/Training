package com.nisum.project.flightreservation.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name="Flights")
@Data
public class Flight extends AbstractClass {

    @Column(name = "flight_number")
    @NotEmpty(message = "Flight number should not be empty or null")
    private String flightNumber;

    @Column(name = "operating_airlines")
    @NotEmpty(message = "Operating Airline should not be empty or null")
    private String operatingAirlines;

    @Column(name = "departure_city")
    private String departureCity;

    @Column(name = "arrival_city")
    private String arrivalCity;

    @Column(name = "date_of_departure")
    @Pattern(regexp = "(\\d{2})/(\\d{2})/(\\d{4}) (\\d{2}):(\\d{2}):(\\d{2})",message = "Insert valid format of date")
    @NotEmpty()
    private Date dateOfDeparture;

}