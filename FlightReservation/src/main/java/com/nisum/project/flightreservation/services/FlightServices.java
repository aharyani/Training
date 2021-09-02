package com.nisum.project.flightreservation.services;

import com.nisum.project.flightreservation.entities.Flight;
import com.nisum.project.flightreservation.exception.GeneralException;
import com.nisum.project.flightreservation.repository.FlightRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public class FlightServices implements FlightService {

    FlightRepository flightRepository;

    public ResponseEntity<Flight> addFlightDetail(Flight flight) {
        return new ResponseEntity<>(flightRepository.save(flight), HttpStatus.CREATED);
    }

    @Override
    public List<Flight> findFlighByDateAndCities(String from, String to, Date depDate) {
        return Optional.of(flightRepository.findFlights(from,to,depDate)).orElseThrow(()-> new GeneralException("flight is not available",HttpStatus.BAD_REQUEST));
    }

    @Override
    public Optional<Flight> getFlightById(Long id) {
        return Optional.of(flightRepository.findById(id)).orElseThrow(()-> new GeneralException("flight is not available",HttpStatus.BAD_REQUEST));

    }

    @Override
    public List<Flight> getAllFlightDetails() {
        return Optional.of(flightRepository.findAll()).orElseThrow(()->new GeneralException("No Flights Record Existed",HttpStatus.BAD_REQUEST));
    }

    @Override
    public Flight updateRecord(Flight flight) {
        return Optional.of(flightRepository.save(flight)).orElseThrow(()->new GeneralException("Somehting Went Wrong",HttpStatus.BAD_REQUEST));
    }

    @Override
    public void deleteRecordbyId(Long id) {
       // Optional.of(flightRepository.deleteById(id));
    }


}
