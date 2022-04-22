package com.transport;

import com.transport.motor_transport.impl.Bus;
import com.transport.dealer.impl.Dealer;
import com.transport.motor_transport.impl.Taxi;
import com.transport.without_engine.impl.Carriage;
import com.transport.without_engine.impl.Rickshaw;

import java.util.*;

public class Main {

    public static void main(String[] args) {

     List<CityTransport> cityTransports = new LinkedList<>();

        cityTransports.add(new Bus("bus", "14000", "13", 10, "public", "OM 906LA",
                "mechanic", "school bus", 1));
        cityTransports.add(new Taxi("taxi", "945", "8", 250, "private",
                "Geely MK", "automatic", "Skoda", "exists"));
        cityTransports.add(new Rickshaw("rickshaw","100", "2", 50,"private",
                "exist", "wood", "two-wheeled", "none"));
        cityTransports.add(new Carriage("carriage", "520", "6", 275, "private",
                "exist", "wood" ,"2", "1"));

        Dealer dealer = new Dealer();

        System.out.println("Sort by descending price: ");
        System.out.println(dealer.sorted(cityTransports, true));
        System.out.println("Sort by increasing price: ");
        System.out.println(dealer.sorted(cityTransports, false));
        System.out.println("Find by weight: ");
        System.out.println(dealer.findByWeight("100", cityTransports));
        System.out.println("Find by length: ");
        System.out.println(dealer.findByLength("13", cityTransports));

    }
}
