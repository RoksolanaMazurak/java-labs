package com.transport.motor_transport.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {
    private Bus bus;

    @BeforeEach
    void setUp() throws Exception {
        bus = new Bus("bus", "14000", "13", 10, "public", "OM 906LA",
                "mechanic", "school bus", 1);
    }

    @Test
    void testAllArgsConstructor() {
        Assertions.assertEquals("bus", bus.getName());
        Assertions.assertEquals("14000", bus.getWeight());
        Assertions.assertEquals("13", bus.getLength());
        Assertions.assertEquals(10, bus.getTravel_price());
        Assertions.assertEquals("public", bus.getType_of_city_transport());
        Assertions.assertEquals("OM 906LA", bus.getMotor());
        Assertions.assertEquals("mechanic", bus.getTransmission());
        Assertions.assertEquals("school bus", bus.getType_of_bus());
        Assertions.assertEquals(1, bus.getNum_of_floors());
    }

}