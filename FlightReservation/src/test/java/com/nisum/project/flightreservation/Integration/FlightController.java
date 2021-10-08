package com.nisum.project.flightreservation.Integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nisum.project.flightreservation.FlightReservationApplication;
import com.nisum.project.flightreservation.repository.FlightRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = FlightReservationApplication.class
)
@AutoConfigureMockMvc
//@TestPropertySource(locations = "classpath:posTestingProperties.properties")//first approch
@ActiveProfiles("testingApplication")  // Second approach
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //for manage orders in junit5 tests
public class FlightController {

    @Autowired
    ObjectMapper objectMapper;

    private FlightRepository flightRepository;


    @Autowired
    FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }
}
