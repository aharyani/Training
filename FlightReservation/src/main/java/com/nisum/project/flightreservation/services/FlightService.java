package com.nisum.project.flightreservation.services;

import com.nisum.project.flightreservation.entities.Flight;
import org.springframework.http.ResponseEntity;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface FlightService {

     ResponseEntity<Flight> addFlightDetail(Flight flight);

     List<Flight> findFlighByDateAndCities(String from, String to, Date depDate);

     Optional<Flight> getFlightById(Long id);

     List<Flight> getAllFlightDetails();

     Flight updateRecord(Flight flight);

     void deleteRecordbyId(Long id);

}
