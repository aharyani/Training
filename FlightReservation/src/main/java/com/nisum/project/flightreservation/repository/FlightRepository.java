package com.nisum.project.flightreservation.repository;


import com.nisum.project.flightreservation.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {

    // JPQL (Java Persistance Query Language)
    @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture ")
    List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to, @Param("dateOfDeparture") String depDate);

    @Query("from Flight where flightNumber=:flightNumber")
    List<Flight> findByFlightNumber(@Param("flightNumber") String flightNumber);

}
