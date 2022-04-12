package com.transport.motor_transport.impl;

import com.transport.motor_transport.MotorTransport;
import com.transport.CityTransport;

public class Bus extends MotorTransport {
    final String TYPE_TRANSPORT = "bus";
    private String type_of_bus;
    private int num_of_floors;

    public Bus() {}

    public Bus(String name, String ticket_price, String weight, String type_of_city_transport, String length,
               String motor, String transmission, String type_of_bus, int num_of_floors) {
        super(name, ticket_price, weight, type_of_city_transport, length, motor, transmission);
        this.type_of_bus = type_of_bus;
        this.num_of_floors = num_of_floors;
    }

    @Override
    public String toString() { //function returns information about bus
        return "Name of transport: " + name + "," + " price of ticket: " + ticket_price + "," + " weight: " + weight + ","
                + " type of city transport: " + type_of_city_transport + "," + " length: " + length
                + " motor: " + motor + "," + " transmission: " + transmission + "," + " type of bus: " + type_of_bus + ","
                + " number of floors: " + num_of_floors + ".";
    }
    public void Drive() {
        System.out.println("Driving the " + TYPE_TRANSPORT + "!");
    }
    public void Go() {
        System.out.println("The " + TYPE_TRANSPORT + " is going!");
    }

}

