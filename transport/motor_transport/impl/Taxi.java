package com.transport.motor_transport.impl;

import com.transport.motor_transport.MotorTransport;

public class Taxi extends MotorTransport {
    final String TYPE_TRANSPORT = "taxi";
    private String car_model;
    private String existence_of_taximeter;

    public Taxi() {};

    public Taxi(String name, String ticket_price, String weight, String type_of_city_transport, String length, String motor,
                String transmission, String car_model, String existence_of_taximeter) {
        super(name, ticket_price, weight, type_of_city_transport, length, motor, transmission);
        this.car_model = car_model;
        this.existence_of_taximeter = existence_of_taximeter;
    }

    @Override
    public String toString() { //function returns information about taxi
        return "Name of transport: " + name + "," + " price of ticket: " + ticket_price + "," + " weight: " + weight + ","
                + " type of city transport: " + type_of_city_transport + "," + " length: " + length + "," + " motor: "
                + motor + "," + " transmission: " + transmission + "," + " car model: " + car_model + ","
                + " existence of taximeter: " + existence_of_taximeter + ".";
    }
    public void Drive() {
        System.out.println("Driving the " + TYPE_TRANSPORT + "!");
    }
    public void Go() {
        System.out.println("The " + TYPE_TRANSPORT + " is going!");
    }
}
