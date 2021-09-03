package com.nisum.project.flightreservation.dto;
//(Data Transfer Object Package i.e D.T.O)

import lombok.Data;


@Data
public class ReservationRequest {

    private Long flightId;
    private String passengerfirstName;
    private String passengerLastName;
    private String passengerEmail;
    private String passengerPhone;
    private String passengerNameonCard;
    private String passengerCardNo;
    private String passengerCardExpiry;
    private String passengerSecurityCode;


}
