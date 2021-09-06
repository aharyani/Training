package com.nisum.project.flightreservation.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = GeneralException.class)
    public ResponseEntity serviceNullPointer(GeneralException generalException) {
        return new ResponseEntity(generalException.getMessage(), generalException.getStatus());
    }
}
