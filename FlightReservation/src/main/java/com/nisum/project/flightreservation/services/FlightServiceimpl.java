package com.nisum.project.flightreservation.services;

import com.nisum.project.flightreservation.entities.Flight;
import com.nisum.project.flightreservation.exception.GeneralException;
import com.nisum.project.flightreservation.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceimpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<Flight> getAll() {
        return flightRepository.findAll();
    }

    @Override
    public Flight findById(Long id) {
        return flightRepository.findById(id).orElseThrow(() -> new GeneralException("flight is not available", HttpStatus.BAD_REQUEST));
    }

    @Override
    public List<Flight> findByFlightNumber(String flightNumber) {
        return flightRepository.findByFlightNumber(flightNumber);
    }

    @Override
    public List<Flight> findByDateAndCities(String from, String to, String depDate) {
        return flightRepository.findFlights(from, to, depDate);
    }

    @Override
    public Flight insertFlightDetail(Flight flight) {
        return Optional.of(flightRepository.save(flight)).orElseThrow(() -> new GeneralException("Something went wrong", HttpStatus.BAD_REQUEST));
    }

    @Override
    public Flight updatetDetail(Flight flight) {
        return Optional.of(flightRepository.save(flight)).orElseThrow(() -> new GeneralException("Somehting Went Wrong ", HttpStatus.BAD_REQUEST));
    }

    @Override
    public void deletetbyId(Long id) {
        flightRepository.deleteById(id);
    }


}
