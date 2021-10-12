package com.nisum.project.flightreservation.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.github.javafaker.Faker;
import com.nisum.project.flightreservation.FlightReservationApplication;
import com.nisum.project.flightreservation.entities.Flight;
import com.nisum.project.flightreservation.repository.FlightRepository;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(SpringExtension.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = FlightReservationApplication.class
)
@AutoConfigureMockMvc
//@TestPropertySource(locations = "classpath:posTestingProperties.properties") First approach
//@ActiveProfiles("testApplication
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //for manage orders in junit5 tests
public class FlightControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;


    private static FlightRepository flightRepository;

    static long id;

    @Autowired
     FlightControllerTest(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }


    @ParameterizedTest
    @MethodSource("insertData")
    @Order(1)
    public void insertFlightDetail(Flight flight) throws Exception {

        MvcResult result = mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .post("/flight/v1/insert")
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(flight))
                )
                .andExpect(MockMvcResultMatchers.status().isCreated())

                .andExpect(
                        MockMvcResultMatchers
                                .content()
                                .contentTypeCompatibleWith(MediaType.APPLICATION_JSON)
                )
                .andExpect(
                        MockMvcResultMatchers.jsonPath("$.flightNumber", is("PIA12345"))
                )
                .andReturn();
        System.out.println(new JSONObject(result.getResponse().getContentAsString()).get("id"));
        id = (Integer) new JSONObject(result.getResponse().getContentAsString()).get("id");

    }

    static Stream<Arguments> insertData() {
        Flight flight = new Flight();
        flight.setId(1L);
        flight.setArrivalCity("Karachi");
        flight.setDepartureCity("Islamabad");
        flight.setOperatingAirlines("Pakistan International Airline");
        flight.setFlightNumber("PIA12345");
        flight.setDateOfDeparture("12/11/2021 20:25");
        return Stream.of(
                arguments(flight)
        );
    }

    @ParameterizedTest
    @MethodSource("updateDetail")
    @Order(2)
    public void updateFlightDetail(Flight flight) throws Exception {
        MvcResult result = mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .put("/flight/v1/")
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(flight))
                )
                .andExpect(MockMvcResultMatchers.status().isAccepted())

                .andExpect(
                        MockMvcResultMatchers
                                .content()
                                .contentTypeCompatibleWith(MediaType.APPLICATION_JSON)
                )
                .andExpect(
                        MockMvcResultMatchers.jsonPath("$.flightNumber", is("EM12345"))
                )
                .andExpect(
                        MockMvcResultMatchers.jsonPath("$.operatingAirlines", is("Emirates"))
                )
                .andReturn();
        System.out.println(new JSONObject(result.getResponse().getContentAsString()));
    }

    static Stream<Arguments> updateDetail() {
        Flight flight = new Flight();
        flight.setId(id);
        flight.setArrivalCity("Karachi");
        flight.setDepartureCity("Islamabad");
        flight.setOperatingAirlines("Emirates");
        flight.setFlightNumber("EM12345");
        flight.setDateOfDeparture("12/12/2021 20:25");
        return Stream.of(
                arguments(flight)
        );
    }

    @Test
    @Order(3)
    public void getFlightById() throws Exception {

        MvcResult result = mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .get("/flight/v1/{id}",String.valueOf(id))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                )
                .andExpect(MockMvcResultMatchers.status().isFound())

                .andExpect(
                        MockMvcResultMatchers
                                .content()
                                .contentTypeCompatibleWith(MediaType.APPLICATION_JSON)
                )
                .andExpect(
                        MockMvcResultMatchers.jsonPath("$.flightNumber", is("EM12345"))
                )
                .andReturn();
        System.out.println(new JSONObject(result.getResponse().getContentAsString()));


    }


    @ParameterizedTest
    @MethodSource("flightNumberProvider")
    @Order(4)
    public void getByFlightNumber(String flightNumber) throws Exception {

        MvcResult result = mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .get("/flight/v1/flightNumber/{flightNumber}",flightNumber)
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                )
                .andExpect(MockMvcResultMatchers.status().isFound())

                .andExpect(
                        MockMvcResultMatchers
                                .content()
                                .contentTypeCompatibleWith(MediaType.APPLICATION_JSON)
                )
                .andExpect(
                        MockMvcResultMatchers.jsonPath("$", hasSize(Math.toIntExact(totalFlightInRepository())))
                )
                .andReturn();
        System.out.println(new JSONObject(result.getResponse().getContentAsString()));


    }

// ParameterizedTest method always take argument as Stream Argument
    public static Stream<Arguments> flightNumberProvider() {
        return Stream.of(
                arguments("AFG-12345")
        );
    }


    @Test
    @Order(4)
    public void getAllFlights() throws Exception {

        MvcResult result = mockMvc
                .perform(
                        MockMvcRequestBuilders
                                .get("/flight/v1/")
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON)
                )
                .andExpect(MockMvcResultMatchers.status().isFound())

                .andExpect(
                        MockMvcResultMatchers
                                .content()
                                .contentTypeCompatibleWith(MediaType.APPLICATION_JSON)
                )
                .andExpect(
                        MockMvcResultMatchers.jsonPath("$", hasSize(Math.toIntExact(totalFlightInRepository())))
                )
                .andDo(print())
                .andReturn();


    }

    public static long totalFlightInRepository() {
        return flightRepository.count();
    }




}
