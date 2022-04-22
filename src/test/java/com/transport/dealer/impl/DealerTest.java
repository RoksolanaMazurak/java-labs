package com.transport.dealer.impl;

import com.transport.CityTransport;
import com.transport.motor_transport.impl.Bus;
import com.transport.motor_transport.impl.Taxi;
import com.transport.without_engine.impl.Carriage;
import com.transport.without_engine.impl.Rickshaw;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class DealerTest {
    private Dealer dealer;
    private List<CityTransport> cityTransports;

    @BeforeEach
    void setUp() throws Exception {
        dealer = new Dealer();
        cityTransports.add(new Bus("bus", "14000", "13", 10,
                "public", "OM 906LA", "mechanic","school bus", 1));
        cityTransports.add(new Taxi("taxi", "945", "8", 250, "private",
                "Geely MK", "automatic", "Skoda", "exists"));
        cityTransports.add(new Rickshaw("rickshaw","100", "2", 50,"private",
                "exist", "wood", "two-wheeled", "none"));
        cityTransports.add(new Carriage("carriage", "520", "6", 275, "private",
                "exist", "wood" ,"2", "1"));
    }

    @Test
    void testFindByWeight() {
        var results = dealer.findByWeight("8", cityTransports);
        Assertions.assertEquals("8", results.get(0).getWeight());
    }

    @Test
    void testFindByLength() {
        var results = dealer.findByLength("1400", cityTransports);
        Assertions.assertEquals("1400", results.get(0).getWeight());
    }

    @Test
    void nullResultWeight()
    {
        var results = dealer.findByWeight("0", cityTransports);
        Assertions.assertNull(results);
    }

    @Test
    void nullResultLength()
    {
        var results = dealer.findByLength("0", cityTransports);
        Assertions.assertNull(results);
    }

    @Test
    void sortByDescending() {
        dealer.sorted(cityTransports, true);
    }
    @Test
    void sortByIncreasing() {
        dealer.sorted(cityTransports, false);
    }

}