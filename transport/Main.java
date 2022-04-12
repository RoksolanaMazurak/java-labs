package com.transport;

import com.transport.dealer.Dealer;
import com.transport.motor_transport.impl.Bus;
import com.transport.motor_transport.impl.Taxi;
import com.transport.without_engine.impl.Carriage;
import com.transport.without_engine.impl.Rickshaw;

public class Main {

    public static void main(String[] args) {
       CityTransport[] transports = new CityTransport[4];

       transports[0] = new Bus("bus", "10", "7", "public", "13", "diesel",
                "mechanic","school bus", 1);
        System.out.println(transports[0]);

        transports[1] = new Taxi("taxi", "100", "2", "private", "4", "diesel",
                "automatic", "Lanus", "exists");
        System.out.println(transports[1]);

        transports[2] = new Carriage("carriage", "250", "1", "private", "1",
                "none", "exist", 3, "exists");
        System.out.println(transports[2]);

        transports[3] = new Rickshaw("rickshaw", "35", "1", "private", "2",
                "none", "exist", "two-wheeled", "none");
        System.out.println(transports[3]);
        Dealer dealer = new Dealer();
        System.out.println(dealer.findByLength("2"));

        /*bus.Drive();
        taxi.Drive();
        carriage.Ride();
        rickshaw.Ride();
        bus.Go();
        taxi.Go();
        carriage.Go();
        rickshaw.Go();*/


    }
}
