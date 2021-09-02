package com.nisum.project.flightreservation.dto;
//(Data Transfer Object Package i.e D.T.O)

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class ReservationRequest {
	
	private Long flightId;
	@Size(min = 2, message = "SIZE must be greater then 2 characters ")
	@NotEmpty(message = "should not empty or null ")
	private String passengerfirstName;
	private String passengerLastName;
	private String passengerEmail;
	private String passengerPhone;
	private String passengerNameonCard;
	private String passengerCardNo;
	private String passengerCardExpiry;
	private String passengerSecurityCode;

	
}
