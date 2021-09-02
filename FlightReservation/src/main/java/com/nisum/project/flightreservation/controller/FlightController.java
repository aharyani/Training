package com.nisum.project.flightreservation.controller;

import com.nisum.project.flightreservation.entities.Flight;
import com.nisum.project.flightreservation.exception.GeneralException;
import com.nisum.project.flightreservation.repository.FlightRepository;
import com.nisum.project.flightreservation.services.FlightService;
import com.nisum.project.flightreservation.services.FlightServices;
import jdk.jfr.internal.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;

	private FlightServices flightServices;

	@PostMapping(value = "/findFlight")
	public List<Flight> findflight(@Valid @RequestParam("from") String from, @Valid @RequestParam("to") String to, @Valid @RequestParam("depDate")@DateTimeFormat(pattern="MM/dd/yyyy")Date depDate) {

		List<Flight> flights = flightRepository.findFlights(from, to, depDate);

		return flights;

	}

	@RequestMapping(value="/addFlightdetail")
	public ResponseEntity<Flight> addFlightDetail(@Valid @RequestBody Flight flight) {
		return flightServices.addFlightDetail(flight);
	}
	
	
}
