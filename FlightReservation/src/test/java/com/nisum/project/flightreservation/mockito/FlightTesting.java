package com.nisum.project.flightreservation.mockito;
import com.nisum.project.flightreservation.entities.Flight;
import com.nisum.project.flightreservation.repository.FlightRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class FlightTesting {

    @Mock
    FlightRepository flightRepository;

    @Test
    void getAllFlight() {

        List<Flight> flightList = new ArrayList<>();
        Flight flight = new Flight();
        flight.setId(1L);
        flight.setArrivalCity("Karachi");
        flight.setDepartureCity("Islamabad");
        flight.setOperatingAirlines("Pakistan International Airline");
        flight.setFlightNumber("PIA12345");
        flight.setDateOfDeparture("12/11/2021 20:25");

        Flight flight1 = new Flight();
        flight1.setId(2L);
        flight1.setArrivalCity("Islamabad");
        flight1.setDepartureCity("Karachi");
        flight1.setOperatingAirlines("Emirates");
        flight1.setFlightNumber("E12345");
        flight1.setDateOfDeparture("12/11/2021 22:25");



        flightList.add(flight);
        flightList.add(flight1);

        when(flightRepository.findAll()).thenReturn(flightList);
        assertEquals(2, flightList.size());
    }

    @Test
    void saveFlightDetail(){
        Flight flight = new Flight();
        flight.setId(1L);
        flight.setArrivalCity("Karachi");
        flight.setDepartureCity("Islamabad");
        flight.setOperatingAirlines("Pakistan International Airline");
        flight.setFlightNumber("PIA12345");
        flight.setDateOfDeparture("12/11/2021 20:25");

        when(flightRepository.save(flight)).thenReturn(flight);

        assertEquals(1,flight.getId());
        assertEquals("PIA12345",flight.getFlightNumber());
        assertEquals("Karachi",flight.getArrivalCity());
        assertEquals("12/11/2021 20:25",flight.getDateOfDeparture());
        assertEquals("Islamabad",flight.getDepartureCity());
        assertEquals("Pakistan International Airline",flight.getOperatingAirlines());
    }

    @Test
    void findByFlightNumber(){
        List<Flight> flightList = new ArrayList<>();
        Flight flight = new Flight();
        flight.setId(1L);
        flight.setArrivalCity("Karachi");
        flight.setDepartureCity("Islamabad");
        flight.setOperatingAirlines("Pakistan International Airline");
        flight.setFlightNumber("PIA12345");
        flight.setDateOfDeparture("12/11/2021 20:25");

        Flight flight1 = new Flight();
        flight1.setId(2L);
        flight1.setArrivalCity("Islamabad");
        flight1.setDepartureCity("Karachi");
        flight1.setOperatingAirlines("Emirates");
        flight1.setFlightNumber("PIA12345");
        flight1.setDateOfDeparture("12/11/2021 22:25");

        flightList.add(flight);
        flightList.add(flight1);

        when(flightRepository.findByFlightNumber("PIA12345")).thenReturn(flightList);
        assertEquals(2, flightList.size());

    }

    @Test
    void findById(){
        Flight flight = new Flight();
        flight.setId(1L);
        flight.setArrivalCity("Karachi");
        flight.setDepartureCity("Islamabad");
        flight.setOperatingAirlines("Pakistan International Airline");
        flight.setFlightNumber("PIA12345");
        flight.setDateOfDeparture("12/11/2021 20:25");

        when(flightRepository.findById(1L)).thenReturn(Optional.of(flight));

        assertEquals(Optional.of(1L),Optional.of(flight.getId()));
        assertEquals(Optional.of("Pakistan International Airline"),Optional.of(flight.getOperatingAirlines()));

    }



}