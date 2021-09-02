package com.nisum.project.flightreservation.controller;

import com.nisum.project.flightreservation.dto.ReservationRequest;
import com.nisum.project.flightreservation.entities.Flight;
import com.nisum.project.flightreservation.entities.Reservation;
import com.nisum.project.flightreservation.repository.FlightRepository;
import com.nisum.project.flightreservation.services.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightrepository;
	
	
	@Autowired
	ReservationServices reservationServices;

	
	@RequestMapping(value="/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long id,ModelMap modelMap) {

		Optional<Flight> optional = flightrepository.findById(id);
		if (optional.isPresent()){
		    Flight flight = optional.get();
			modelMap.addAttribute("flight",flight);
		}
			return "reservation/completeReservation";	
	}
	
	
	
	@RequestMapping(value="/completeReservationAction", method = RequestMethod.POST)
	public String reservationRequest(@Valid @RequestBody ReservationRequest request) {

		return "reservation/reservationConfirmation";
	}
	



	
	
}
