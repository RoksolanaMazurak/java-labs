package com.transport.motor_transport.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiTest {
    private Taxi taxi;

    @BeforeEach
    void setUp() throws Exception {
        taxi = new Taxi("taxi", "945", "8", 250, "private",
                "Geely MK", "automatic", "Skoda", "exists");
    }

    @Test
    void testAllArgsConstructor() {
        Assertions.assertEquals("taxi", taxi.getName());
        Assertions.assertEquals("945", taxi.getWeight());
        Assertions.assertEquals("8", taxi.getLength());
        Assertions.assertEquals(250, taxi.getTravel_price());
        Assertions.assertEquals("private", taxi.getType_of_city_transport());
        Assertions.assertEquals("Geely MK", taxi.getMotor());
        Assertions.assertEquals("automatic", taxi.getTransmission());
        Assertions.assertEquals("Skoda", taxi.getCar_model());
        Assertions.assertEquals("exists", taxi.getExistence_of_taximeter());
    }

}