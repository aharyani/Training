package com.nisum.project.flightreservation.controller;

import com.ammar.flightreservation.dto.ReservationUpdateRequest;
import com.ammar.flightreservation.entities.Reservation;
import com.ammar.flightreservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ReservationRestController {

	@Autowired
	ReservationRepository reservationRepository;

	@RequestMapping(value = "/reservation/{id}")
	public Optional<Reservation> findReservation(@PathVariable("id") Long id) {
		 return reservationRepository.findById(id);

	}
	
	
	@RequestMapping(value="/reservation")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Optional<Reservation> option = reservationRepository.findById(request.getId());
		if (option.isPresent()) { 
			Reservation reserved = option.get();
			reserved.setCheckedIn(request.getCheckedIn());
			reserved.setNumberOfBags(request.getNumberOfBags());
			return reservationRepository.save(reserved);
		} else {
			
			return null;
		}
		
	}

}
