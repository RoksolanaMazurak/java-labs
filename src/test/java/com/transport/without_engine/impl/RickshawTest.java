package com.transport.without_engine.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RickshawTest {
    private Rickshaw rickshaw;

    @BeforeEach
    void setUp() throws Exception {
        rickshaw = new Rickshaw("rickshaw","100", "2", 50,"private",
                "exist", "wood", "two-wheeled", "none");
    }

    @Test
    void testAllArgsConstructor() {
        Assertions.assertEquals("rickshaw", rickshaw.getName());
        Assertions.assertEquals("100", rickshaw.getWeight());
        Assertions.assertEquals("2", rickshaw.getLength());
        Assertions.assertEquals(50, rickshaw.getTravel_price());
        Assertions.assertEquals("private", rickshaw.getType_of_city_transport());
        Assertions.assertEquals("exist", rickshaw.getPedal_exist());
        Assertions.assertEquals("wood", rickshaw.getCabin());
        Assertions.assertEquals("two-wheeled", rickshaw.getType_of_rickshaw());
        Assertions.assertEquals("none", rickshaw.getVisor());
    }
}