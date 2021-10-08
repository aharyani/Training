package com.nisum.project.flightreservation.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Reservations")
@Data
public class Reservation extends AbstractClass {

    @Column(name = "checked_in")
    private Boolean checkedIn;

    @Column(name = "number_of_bag")
    private int numberOfBags;

    //Defining Relationship
    @OneToOne
    private Passenger passenger;


    //Defining Relationship
    @OneToOne
    private Flight flight;
}
