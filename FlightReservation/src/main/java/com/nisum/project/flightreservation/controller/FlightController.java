package com.nisum.project.flightreservation.controller;

import com.nisum.project.flightreservation.entities.Flight;
import com.nisum.project.flightreservation.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public ResponseEntity<List<Flight>> getAll() {
        return new ResponseEntity<>(flightService.getAll(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> gettById(@PathVariable long id) {
        return new ResponseEntity<>(flightService.findById(id), HttpStatus.FOUND);
    }

    @PostMapping("/insert")
    public ResponseEntity<Flight> insertNew(@Valid @RequestBody Flight flight) {
        return new ResponseEntity<>(flightService.insertFlightDetail(flight), HttpStatus.CREATED);
    }

    @GetMapping("/flightNumber/{flightNumber}")
    public ResponseEntity<List<Flight>> getByFlightNumber(@PathVariable String flightNumber) {
        return new ResponseEntity<>(flightService.findByFlightNumber(flightNumber), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<List<Flight>> findflight(@RequestParam("from") String from, @RequestParam("to") String to, @Valid @RequestParam("depDate") String depDate) {
        return new ResponseEntity<>(flightService.findByDateAndCities(from, to, depDate), HttpStatus.FOUND);
    }

    @PutMapping
    public ResponseEntity<Flight> updateDetail(@Valid @RequestBody Flight flight) {
        return new ResponseEntity<>(flightService.updatetDetail(flight), HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        flightService.deletetbyId(id);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
