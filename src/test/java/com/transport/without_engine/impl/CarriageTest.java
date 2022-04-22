package com.transport.without_engine.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarriageTest {
    private Carriage carriage;

    @BeforeEach
    void setUp() throws Exception {
        carriage = new Carriage("carriage", "520", "6", 275, "private",
                "exist", "wood" ,"2", "1");
    }

    @Test
    void testAllArgsConstructor() {
        Assertions.assertEquals("carriage", carriage.getName());
        Assertions.assertEquals("520", carriage.getWeight());
        Assertions.assertEquals("6", carriage.getLength());
        Assertions.assertEquals(275, carriage.getTravel_price());
        Assertions.assertEquals("private", carriage.getType_of_city_transport());
        Assertions.assertEquals("exist", carriage.getPedal_exist());
        Assertions.assertEquals("wood", carriage.getCabin());
        Assertions.assertEquals("2", carriage.getNum_of_horses());
        Assertions.assertEquals("1", carriage.getCoachman());
    }
}