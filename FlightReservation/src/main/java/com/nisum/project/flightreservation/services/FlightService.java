package com.nisum.project.flightreservation.services;

import com.nisum.project.flightreservation.entities.Flight;

import java.util.List;


public interface FlightService {

    Flight insertFlightDetail(Flight flight);
    List<Flight> findByDateAndCities(String from, String to, String depDate);
    Flight findById(Long id);
    List<Flight> findByFlightNumber(String flightNumber);
    List<Flight> getAll();
    Flight updatetDetail(Flight flight);
    void deletetbyId(Long id);

}
